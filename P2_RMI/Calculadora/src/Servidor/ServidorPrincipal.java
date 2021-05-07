
package Servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import static javax.swing.JOptionPane.showMessageDialog;

public class ServidorPrincipal {

   
    public static void main(String[] args) {
        
        try {
            
            Registry registro =LocateRegistry.createRegistry(1912);
            registro.rebind("Calculadora",new Implementos ());
            javax.swing.JOptionPane.showMessageDialog(null,"Servidor Conectado!!");
            
        }
        catch (Exception e)
        { System.out.println(e.getMessage()); }
        
        
    }
    
}
