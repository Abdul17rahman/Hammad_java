
package Myfiles;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Search2 extends javax.swing.JFrame {

    Connection conn;
    ResultSet rst ;
    PreparedStatement pst;
    String w = Admin.SEARCH2.getText();
    String p = "Below Are Results of "+w;
    public Search2() {
        initComponents();
        conn = javaconnect.connectdb();
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        this.setResizable(false);
        Dimension size = toolKit.getScreenSize();
        this.setLocation(size.width/2-this.getWidth()/2,size.height/2-this.getHeight()/2);
        this.setDefaultCloseOperation(Search2.DISPOSE_ON_CLOSE);
        S1.setText(p);
        Update_table();
    }
    private void Update_table(){
        try {
            if(w.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter User ID or Name as Required");
            }
            else{
                String sql = "select * from Users where Name='"+w+"'"; 
                pst = conn.prepareStatement(sql);
                rst = pst.executeQuery();
                sTable.setModel(DbUtils.resultSetToTableModel(rst));
            }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
                rst.close();
                pst.close();}
            catch(Exception e){}
	}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        S1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        S1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        sTable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Designation", "Email", "Contact", "Address", "Answer"
            }
        ));
        jScrollPane1.setViewportView(sTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 629, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel S1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sTable;
    // End of variables declaration//GEN-END:variables
}
