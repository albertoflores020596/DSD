
package Cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import RMI.rmi;
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sum = new javax.swing.JButton();
        res = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        Num2 = new javax.swing.JTextField();
        Res = new javax.swing.JLabel();
        Num1 = new javax.swing.JTextField();
        op = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sum.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        sum.setText("+");
        sum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickSum(evt);
            }
        });

        res.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        res.setText("-");
        res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLickRes(evt);
            }
        });

        mul.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        mul.setText("*");
        mul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLickMul(evt);
            }
        });

        div.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        div.setText("/");
        div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickDiv(evt);
            }
        });

        Num2.setText("0");

        Res.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Res.setText("???");

        Num1.setText("0");

        op.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        op.setText("?");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("=");

        jLabel1.setText("Calculadora Basica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Num1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(op)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Num2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op)
                    .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClickSum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickSum
       try{
          Registry registro = LocateRegistry.getRegistry ("192.168.0.13",1912);
          rmi x= (rmi) registro.lookup("Calculadora");
          
         op.setText("+");
         Res.setText(""+ x.suma(Double.parseDouble(Num1.getText()),Double.parseDouble(Num2.getText())));
       
       }
       catch (Exception e) 
       {
        System.out.println(e.getMessage());
        e.printStackTrace();
       }
    }//GEN-LAST:event_ClickSum

    private void CLickRes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLickRes
        try{
          Registry registro = LocateRegistry.getRegistry ("192.168.0.13",1912);
          rmi x= (rmi) registro.lookup("Calculadora");
          
         op.setText("-");
         Res.setText(""+ x.resta(Double.parseDouble(Num1.getText()),Double.parseDouble(Num2.getText())));
       
       }
       catch (Exception e) 
       {
        System.out.println(e.getMessage());
        e.printStackTrace();
       }
    }//GEN-LAST:event_CLickRes

    private void CLickMul(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLickMul
        try{
          Registry registro = LocateRegistry.getRegistry ("192.168.0.13",1912);
          rmi x= (rmi) registro.lookup("Calculadora");
          
         op.setText("*");
         Res.setText(""+ x.multiplicacion(Double.parseDouble(Num1.getText()),Double.parseDouble(Num2.getText())));
       
       }
       catch (Exception e) 
       {
        System.out.println(e.getMessage());
        e.printStackTrace();
       }
    }//GEN-LAST:event_CLickMul

    private void ClickDiv(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickDiv
        try{
          Registry registro = LocateRegistry.getRegistry ("192.168.0.13",1912);
          rmi x= (rmi) registro.lookup("Calculadora");
          
         op.setText("/");
         Res.setText(""+ x.divicion(Double.parseDouble(Num1.getText()),Double.parseDouble(Num2.getText())));
       
       }
       catch (Exception e) 
       {
        System.out.println(e.getMessage());
        e.printStackTrace();
       }
    }//GEN-LAST:event_ClickDiv

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JLabel Res;
    private javax.swing.JButton div;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mul;
    private javax.swing.JLabel op;
    private javax.swing.JButton res;
    private javax.swing.JButton sum;
    // End of variables declaration//GEN-END:variables
}
