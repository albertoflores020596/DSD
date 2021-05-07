
package RMI;

import java.rmi.Remote;

public interface rmi extends Remote {
    
    public double suma (double sumando1, double sumando2) throws Exception;
    public double resta (double minuendo, double sustraendo) throws Exception;
    public double multiplicacion (double multiplicando , double multiplicador) throws Exception;
    public double divicion (double dividendo, double divisor ) throws Exception;
       
}
