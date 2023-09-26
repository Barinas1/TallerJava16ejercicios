
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */

/**
 *
 * @author DanielFernandoCarden
 */
public class frm09 extends javax.swing.JFrame {

    /**
     * Creates new form frm09
     */
    public frm09() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        bnt = new javax.swing.JButton();
        lblRe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ejercicio 09 ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 20, 160, 23);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Verificar El Mes según el numero ingresado");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 60, 290, 50);

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese Numero:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 90, 150, 30);

        txtNum.setBackground(new java.awt.Color(255, 255, 255));
        txtNum.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        txtNum.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtNum);
        txtNum.setBounds(40, 120, 90, 30);

        bnt.setBackground(new java.awt.Color(255, 255, 255));
        bnt.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        bnt.setForeground(new java.awt.Color(0, 0, 0));
        bnt.setText("Verificar ");
        bnt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        bnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntActionPerformed(evt);
            }
        });
        jPanel1.add(bnt);
        bnt.setBounds(180, 260, 120, 40);

        lblRe.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        lblRe.setForeground(new java.awt.Color(255, 255, 255));
        lblRe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(lblRe);
        lblRe.setBounds(110, 210, 290, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/21 (Phone).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -80, 480, 490);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void bntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActionPerformed
        // TODO add your handling code here:
        mes();
    }//GEN-LAST:event_bntActionPerformed
     private void txtNumKeyPressed(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            mes();
        }
    }  
    public boolean isNumber(String numero) {
        try {
            int Number = Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(this,
                    "El texto " + numero + " no es un numero valido",
                    "Numero Invalido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
     
       public void mes(){
           if (isNumber(txtNum.getText())) {
            int mes = Integer.parseInt(txtNum.getText());
            switch (mes) {
                case 1:
                    lblRe.setText("El mes es Enero");
                    break;
                case 2:
                    lblRe.setText("El mes es Febrero");
                    break;
                case 3:
                    lblRe.setText("El mes es Marzo");
                    break;
                case 4:
                    lblRe.setText("El mes es Abril");
                    break;
                case 5:
                    lblRe.setText("El mes es Mayo");
                    break;
                case 6:
                    lblRe.setText("El mes es Junio");
                    break;
                case 7:
                    lblRe.setText("El mes es Julio");
                    break;
                case 8:
                    lblRe.setText("El mes es Agosto");
                    break;
                case 9:
                    lblRe.setText("El mes es Septiembre");
                    break;
                case 10:
                    lblRe.setText("El mes es Octubre");
                    break;
                case 11:
                    lblRe.setText("El mes es Noviembre");
                    break;
                case 12:
                    lblRe.setText("El mes es Diciembre");
                    break;
                default:
                   JOptionPane.showMessageDialog(this,
                            "El texto " + mes + " no es un numero valido",
                            "Numero Invalido", JOptionPane.ERROR_MESSAGE);
            }
        }
       }
    
    


       
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
            java.util.logging.Logger.getLogger(frm09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm09().setVisible(true);
            }
        });
       }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton bnt;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRe;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables

}
