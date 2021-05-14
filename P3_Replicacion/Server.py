import os
import socket
import random
import threading

HOST="192.168.0.18"
PORT=54321
databases=["./basePokemon1/","./basePokemon2/"]
bufferSize = 1024
listaConexiones =[]


def  SeleccionarIMG():

    database= random.choice(databases)
    imgName = random.choice(os.listdir(database))
    imgB= b''

    try:
        file= open(database+imgName,'rb')
        imgB=file.read()
    except:
        print('error{}'.format(database+imgName)) 
    else:
         file.close()
         return imgB,imgName     



def servirPorSiempre (sockt,listaconeciones):

    try:

        while True:
            client_conn,client_addr=sockt.accept()
            listaconeciones.append(client_conn)
            print("Nuevo Cliente :",client_addr)
            threads =threading.Thread(name="Cliente"+str(client_addr[1]), target=Atender_Cliente , args=[client_conn,client_addr])
            threads.start();
    except Exception as e:
        print(e)        




def Atender_Cliente (con,addr):

    con.send(str("Hola,ahora estas conectado, en que puedo servirte?").encode('utf-8'))

    try:

        while True:
            peticion= con.recv(bufferSize);
            if "pokemon" in peticion.decode('utf-8'):
                      img,imgName = SeleccionarIMG()
                      con.send('{}|{}'.format(len(img),imgName).encode('utf-8'))                   
                      reply =con.recv(bufferSize)
                      if 'ok'== reply.decode():

                         go=0
                         total=len(img)

                         while go < total:
                             date_to_send = img[go:go+bufferSize]
                             con.send(date_to_send)
                             go +=len(date_to_send)
                      reply= con.recv(bufferSize)

                      if 'copy' == reply.decode():
                         print("Envio completado a -",addr[1])
    except Exception as e:
        print(e)                        









UDPServerSocket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
UDPServerSocket.bind((HOST,PORT))
UDPServerSocket.listen(5)
print("El servidor esta disponible y en espera de solicitudes")
servirPorSiempre (UDPServerSocket,listaConexiones)
UDPServerSocket.close()