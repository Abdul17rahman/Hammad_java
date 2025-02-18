
package Myfiles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class Access extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rst = null;
    PreparedStatement pst = null;
    public Access() {
        initComponents();
        conn = javaconnect.connectdb();
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        this.setResizable(false);
        Dimension size = toolKit.getScreenSize();
        this.setLocation(size.width/2-this.getWidth()/2,size.height/2-this.getHeight()/2);
        this.setDefaultCloseOperation(Access.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accessoption = new javax.swing.JComboBox<>();
        grant = new javax.swing.JButton();
        deny = new javax.swing.JButton();
        userfirst = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Users Access Grant Form");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User First Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Access Page");

        accessoption.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        accessoption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounts", "AddStudent", "Library", "Access", "Saccounts", "Performance", "AddUser" }));

        grant.setBackground(new java.awt.Color(0, 102, 51));
        grant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        grant.setText("GRANT");
        grant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grantActionPerformed(evt);
            }
        });

        deny.setBackground(new java.awt.Color(204, 0, 51));
        deny.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deny.setText("DELETE");
        deny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(grant, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(accessoption, 0, 164, Short.MAX_VALUE)
                                .addComponent(deny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userid))
                            .addComponent(userfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accessoption, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grant, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(deny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grantActionPerformed
        // TODO add your handling code here:
        
            if (((userfirst.getText()).equals("")) || ((userid.getText()).equals(""))){
                JOptionPane.showMessageDialog(null, "Both fields Must be Filled!");
            }
            else{
                String check = "select * from Users where UserId=? and Name=?";
                String a = userfirst.getText();
                String b = userid.getText();
                try{ 
                    pst = conn.prepareStatement(check);
                    pst.setString(1, b);
                    pst.setString(2, a);
                    rst = pst.executeQuery();
                    if(rst.next()){
                        String userf = rst.getString("UserId").trim();
                        String useri = rst.getString("Name").trim();
                        if((b.equals(userf)) && (a.equals(useri))){
                            try{
                                String sql= "Insert into Access (UserId,AccessPage) values(?,?)";
                                pst= conn.prepareStatement(sql);
                                pst.setString(1,userid.getText());
                                pst.setString(2,accessoption.getSelectedItem().toString());
                                pst.execute();
                                JOptionPane.showMessageDialog(null, "Access to "+accessoption.getSelectedItem().toString()+" page has been granted to "+a);
                                pst.close();
                                rst.close();
                                userfirst.setText("");
                                userid.setText("");
                            }
                            catch(Exception e){
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Your Credentials do not match"+useri+userf);
                            userfirst.setText("");
                            userid.setText("");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "The userfirst or Id you entered do not match");
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                finally{
                    try{
                        rst.close();
                        pst.close();
                    }
                    catch(Exception e){} 
                }
            }

        
    }//GEN-LAST:event_grantActionPerformed

    private void denyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyActionPerformed
        // TODO add your handling code here:
        
        if (((userfirst.getText()).equals("")) || ((userid.getText()).equals(""))){
                JOptionPane.showMessageDialog(null, "Both fields Must be Filled!");
            }
            else{
                String check = "select * from Users where UserId=? and Name=?";
                String a = userfirst.getText();
                String b = userid.getText();
                try{ 
                    pst = conn.prepareStatement(check);
                    pst.setString(1, b);
                    pst.setString(2, a);
                    rst = pst.executeQuery();
                    if(rst.next()){
                        String userf = rst.getString("UserId").trim();
                        String useri = rst.getString("Name").trim();
                        if((b.equals(userf)) && (a.equals(useri))){
                            try{
                                String sql= "Delete from Access where UserId=? and AccessPage=?";
                                pst= conn.prepareStatement(sql);
                                pst.setString(1,userid.getText());
                                pst.setString(2,accessoption.getSelectedItem().toString());
                                pst.execute();
                                JOptionPane.showMessageDialog(null, "Access to "+accessoption.getSelectedItem().toString()+" page has been deactivated from "+a);
                                pst.close();
                                rst.close();
                                userfirst.setText("");
                                userid.setText("");
                            }
                            catch(Exception e){
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Your Credentials do not match"+useri+userf);
                            userfirst.setText("");
                            userid.setText("");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "The userfirst or Id you entered do not match");
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                finally{
                    try{
                        rst.close();
                        pst.close();
                    }
                    catch(Exception e){} 
                }
            }
        
    }//GEN-LAST:event_denyActionPerformed

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
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Access().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accessoption;
    private javax.swing.JButton deny;
    private javax.swing.JButton grant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField userfirst;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
