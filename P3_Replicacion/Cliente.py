import socket
from PIL import Image
Host= "192.168.0.17"
Port =54321
bufferSize=1024;


UDPClientSocket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
UDPClientSocket.connect((Host,Port))
Saludo =UDPClientSocket.recv(bufferSize)
print(Saludo.decode('utf-8'))

op=1


try:
        while op==1:
             peticion= input(".. ")
             if "pokemon" in peticion:
                 UDPClientSocket.send(peticion.encode('utf-8'))
                 info = UDPClientSocket.recv(bufferSize)
                 length,file_name=info.decode().split('|')
                 if length and file_name:
                     newfile=open(file_name,"wb")
                     UDPClientSocket.send(b'ok')
                     file=b''
                     go=0
                     total=int(length)
                     get=0
                     while get <total:
                         data=UDPClientSocket.recv(bufferSize)
                         file +=data
                         get=get+len(data)
                     if file:
                         newfile.write(file[:])
                         newfile.close()
                         UDPClientSocket.send(b'copy') 

                 try:
                      imagen =Image.open(file_name)
                      imagen.show()
                 except:
                     print("No ha sido posible cargar la imagen") 
             else:
                op=0
except Exception as e:
     print(e)                        



