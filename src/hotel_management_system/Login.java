/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

/**
 *
 * @author LENOVO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public Login() {
        initComponents();
        this.setSize(780, 500);
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Urdu Typesetting", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 204, 255));
        jLabel7.setText(".HOTEL RESERVATION SYSTEM.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(26, 16, 705, 68);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 204, 255));
        jLabel8.setText("Username:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(99, 176, 101, 47);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 204, 255));
        jLabel9.setText("Password:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(99, 273, 101, 47);

        uname.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname);
        uname.setBounds(231, 183, 400, 33);

        password.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(231, 280, 400, 33);

        btn_login.setBackground(new java.awt.Color(153, 204, 255));
        btn_login.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        btn_login.setText("Login");
        btn_login.setAlignmentY(0.0F);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(329, 393, 103, 40);

        jLabel10.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 204, 255));
        jLabel10.setText("LOGIN..");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(15, 0, 80, 41);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo1702643600.jpeg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 766, 486);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed

    }//GEN-LAST:event_unameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        char[] passwordChars = password.getPassword();
        String a = new String(passwordChars);
        String b = uname.getText();
        if(a.equals(b) && a.equals("admin")){
            this.dispose();
            new options().setVisible(true);
        }
        else {
            uname.setText(""); 
            password.setText("");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
