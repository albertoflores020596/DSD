
package Servidor;

import java.rmi.server.UnicastRemoteObject;
import RMI.rmi;
public class Implementos extends UnicastRemoteObject implements rmi {
    
    
    public Implementos() throws Exception {
        super();
        
    }
    
    @Override
    
    public double suma (double sumando1, double sumando2) throws Exception { return sumando1 + sumando2;}
    public double resta (double minuendo, double sustraendo) throws Exception { return minuendo -sustraendo;}
    public double multiplicacion (double multiplicando , double multiplicador ) throws Exception { return multiplicando * multiplicador ;}
    public double divicion (double dividendo, double divisor ) throws Exception { return  dividendo/divisor;}
    
      
}
