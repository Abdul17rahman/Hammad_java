package Myfiles;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;
public class login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public login() {
        initComponents();
        conn = javaconnect.connectdb();
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        this.setResizable(false);
        Dimension size = toolKit.getScreenSize();
        this.setLocation(size.width/2-this.getWidth()/2,size.height/2-this.getHeight()/2);
        
    }
    public void clearme(){
        userName.setText("");
        Password.setText("");
        useridentity.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        LOGIN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FORGOT = new javax.swing.JButton();
        Designation = new javax.swing.JComboBox<>();
        useridentity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("PASSWORD");

        userName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userName.setDisabledTextColor(new java.awt.Color(255, 255, 102));

        LOGIN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("WELCCOME TO HAMAD INTERNATIONAL  SCHOOL");

        Password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Administration Login portal");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Myfiles/Resources/yellow-light-and-red-student-badge.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("LOG IN AS");

        FORGOT.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        FORGOT.setForeground(new java.awt.Color(204, 0, 0));
        FORGOT.setText("FORGOT PASSWORD");
        FORGOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FORGOTActionPerformed(evt);
            }
        });

        Designation.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Head Teacher", "Principle", "DOS", "Class Teacher", "Accountant", "Librarian" }));

        useridentity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        useridentity.setDisabledTextColor(new java.awt.Color(255, 255, 102));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("USER ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(useridentity, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FORGOT, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Designation, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useridentity, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Designation, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(FORGOT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        setBounds(0, 0, 770, 713);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        String sql ="select*from Users where Name=? and Password =? and UserId=?";
        String Na = userName.getText();
        String pas = Arrays.toString(Password.getPassword());
        String myid = useridentity.getText();
        if((Na.equals("")) || (pas.equals("")) || (myid.equals(""))){
            JOptionPane.showMessageDialog(null, "Please Enter User's ID, Name and Password!");
            clearme();
        }    
        else{
           try{
                pst = conn.prepareStatement(sql);
                pst.setString(1,userName.getText());
                pst.setString(2, Arrays.toString(Password.getPassword()));
                pst.setString(3, myid);
                rs = pst.executeQuery();
                if(rs.next()){
                    String Des = Designation.getSelectedItem().toString();
                    String Dees = rs.getString("Designation").trim();
                    if(Des.equals(Dees)){
                            switch (Dees) {
                            case "Admin":
                                JOptionPane.showMessageDialog(null,"Your Welcome "+Na);
                                rs.close();
                                pst.close();
                                Admin a = new Admin();
                                a.setVisible(true);
                                dispose();
                                break;
                            case "Head Teacher":
                                JOptionPane.showMessageDialog(null,"Your Welcome "+Na);
                                rs.close();
                                pst.close();
                                Admin b = new Admin();
                                b.setVisible(true); 
                                dispose();
                                break;
                            case "Principle":
                                JOptionPane.showMessageDialog(null,"Your Welcome "+Na);
                                rs.close();
                                pst.close();
                                Admin c = new Admin();
                                c.setVisible(true);
                                dispose();
                                break;
                            case "DOS":
                                JOptionPane.showMessageDialog(null,"Your Welcome "+Na);
                                rs.close();
                                pst.close();
                                AddStudent d = new AddStudent();
                                d.setVisible(true); 
                                dispose();
                                break;
                            case "Class Teacher":
                                JOptionPane.showMessageDialog(null,"Your Welcome "+Na);
                                rs.close();
                                pst.close();
                                AddStudent e = new AddStudent();
                                e.setVisible(true); 
                                dispose();
                                break;
                            case "Accountant":
                                JOptionPane.showMessageDialog(null,"Your Welcome "+Na);
                                rs.close();
                                pst.close();
                                Accounts f = new Accounts();
                                f.setVisible(true); 
                                dispose();
                                break;
                            case "Librarian":
                                JOptionPane.showMessageDialog(null,"Your Welcome "+Na);
                                rs.close();
                                pst.close();
                                Library g = new Library();
                                g.setVisible(true); 
                                dispose();
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Your Credentials do not Match!");
                                clearme();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Your Credentials do not Match!");
                        clearme();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "USERNAME, PASSWORD or ID are INCORRECT!");
                    clearme();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){} 
            }              
    }                             
    }//GEN-LAST:event_LOGINActionPerformed

    private void FORGOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FORGOTActionPerformed
        // TODO add your handling code here:
        Reset r = new Reset();
        r.setVisible(true);
    }//GEN-LAST:event_FORGOTActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> Designation;
    private javax.swing.JButton FORGOT;
    private javax.swing.JButton LOGIN;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JTextField userName;
    public static javax.swing.JTextField useridentity;
    // End of variables declaration//GEN-END:variables
}
