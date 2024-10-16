
package Myfiles;

import java.awt.*;

import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

public class Performace extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rst = null;
    PreparedStatement pst = null;
    public Performace() {
        initComponents();
        conn = javaconnect.connectdb();
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        this.setResizable(false);
        Dimension size = toolKit.getScreenSize();
        this.setLocation(size.width/2-this.getWidth()/2,size.height/2-this.getHeight()/2);
        this.setDefaultCloseOperation(Performace.DISPOSE_ON_CLOSE);
    }
    public void clr(){
        stdid.setText("");
        term11.setText("");
        trm1.setText("");
        class11.setText("");
    }
    public void cleara(){
        Examid.setText("");
        Sno11.setText("");
        stream.setText("");
        y11.setText("");
        t11.setText("");
        math.setText("");
        sst.setText("");
        english.setText("");
        science.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Examid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        y11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Sno11 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        stream = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        seaching2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Psearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stdid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        term11 = new javax.swing.JTextField();
        trm1 = new javax.swing.JTextField();
        Report = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        class11 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        math = new javax.swing.JTextField();
        sst = new javax.swing.JTextField();
        english = new javax.swing.JTextField();
        science = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        savemarks = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        exam = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERFORMANCE RECORDS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EXAM ID");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("YEAR:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("STUDENT ID:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CLASS/STREAM:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TERM");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH RECORDS"));

        jLabel1.setText("ENTER STUDENT'S SURNAME:");

        Psearch.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Psearch.setText("SEARCH");
        Psearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(seaching2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Psearch, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Psearch, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(seaching2))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRINT STUDENT'S REPORT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("STUDENT'S NO.");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TERM:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("YEAR:");

        Report.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Report.setText("GENERATE REPORT");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CLASS/STREAM:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(class11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Report))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(stdid))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(term11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trm1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trm1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(term11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(Report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(class11))
                .addGap(0, 0, 0))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD STUDENT'S MARKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MATH ");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("SST");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("SCIENCE");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ENGLISH");

        math.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sst.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        english.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        science.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Exam");

        savemarks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        savemarks.setText("SAVE MARKS");
        savemarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savemarksActionPerformed(evt);
            }
        });

        UPDATE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UPDATE.setText("UPDATE MARKS");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        exam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOT", "MID TERM", "EOT" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(math)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(sst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(english))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(science))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(exam, 0, 127, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savemarks, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(UPDATE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sst)
                    .addComponent(math)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(science, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(exam))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savemarks, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Sno11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(stream, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Examid, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(t11)))
                                .addGap(63, 63, 63)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Examid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sno11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stream, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PsearchActionPerformed

    @SuppressWarnings("empty-statement")
    private void savemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savemarksActionPerformed
        // TODO add your handling code here:
        String Exam = exam.getSelectedItem().toString();
        if((Sno11.getText().equals("")) || (Examid.getText().equals("")) || (y11.getText().equals("")) || (stream.getText().equals("")) ||(t11.getText().equals("")) || (math.getText().equals("")) ||(sst.getText().equals("")) || (english.getText().equals("")) || (science.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Fill all Fields!");
            cleara();
        }
        else{
            switch (Exam){
                case "BOT":
                    try{
                        String sql= "Insert into BotMarks (ExamID,StudentId,ExamY,ExamT,Class,Math,SST,Eng,Sci) values(?,?,?,?,?,?,?,?,?)";
                        pst= conn.prepareStatement(sql);
                        pst.setInt(1,Integer.parseInt(Examid.getText()));
                        pst.setString(2,Sno11.getText());
                        pst.setString(3,y11.getText());
                        pst.setString(4,t11.getText());
                        pst.setString(5,stream.getText());                       
                        pst.setString(6,math.getText());
                        pst.setString(7,sst.getText());
                        pst.setString(8,english.getText());
                        pst.setString(9,science.getText());
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"Marks for "+Exam+" Are Successfully Added!");
                        cleara();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    break;
                case "MID TERM":
                    try{
                        String sql= "Insert into MidMarks (ExamID,StudentId,ExamY,ExamT,Class,Math,SST,Eng,Sci) values(?,?,?,?,?,?,?,?,?)";
                        pst= conn.prepareStatement(sql);
                        pst.setInt(1,Integer.parseInt(Examid.getText()));
                        pst.setString(2,Sno11.getText());
                        pst.setString(3,y11.getText());
                        pst.setString(4,t11.getText());
                        pst.setString(5,stream.getText());                       
                        pst.setString(6,math.getText());
                        pst.setString(7,sst.getText());
                        pst.setString(8,english.getText());
                        pst.setString(9,science.getText());
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"Marks for "+Exam+" Are Successfully Added!");
                        cleara();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    break;
                case "EOT":
                    //Inserting data into the End of term table
                    try{
                        String sql= "Insert into EndMarks (ExamID,StudentId,ExamY,ExamT,Class,Math,SST,Eng,Sci) values(?,?,?,?,?,?,?,?,?)";
                        pst= conn.prepareStatement(sql);
                        pst.setInt(1,Integer.parseInt(Examid.getText()));
                        pst.setString(2,Sno11.getText());
                        pst.setString(3,y11.getText());
                        pst.setString(4,t11.getText());
                        pst.setString(5,stream.getText());                       
                        pst.setString(6,math.getText());
                        pst.setString(7,sst.getText());
                        pst.setString(8,english.getText());
                        pst.setString(9,science.getText());
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"Marks for "+Exam+" Are Successfully Added!");
                        cleara();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Cant Save Marks!");
            }     
        }
    }//GEN-LAST:event_savemarksActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
        String Exam = exam.getSelectedItem().toString();
        if((Sno11.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Enter the Student's ID to Update Marks!");
            cleara();
        }
        else if((math.getText().equals("")) || (sst.getText().equals("")) || (english.getText().equals("")) || (science.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Enter New Marks for all Subjects!");
        }
        else{
            switch (Exam){
                case "BOT":
                    try{
                        String Sid = Sno11.getText();
                        String value1 = math.getText();
                        String value2 = sst.getText();
                        String value3 = english.getText();
                        String value4 = science.getText();
                        String sql= "update BotMarks set Math = '"+value1+"', SST ='"+value2+"', Eng='"+value3+"', Sci='"+value4+"' where StudentId='"+Sid+"' ";          
                        pst= conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"Marks for "+Exam+" have been succesfully Updated!");
                        cleara();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    break;
                case "MID TERM":
                    try{
                        String Sid = Sno11.getText();
                        String value1 = math.getText();
                        String value2 = sst.getText();
                        String value3 = english.getText();
                        String value4 = science.getText();
                        String sql= "update MidMarks set Math = '"+value1+"', SST ='"+value2+"', Eng='"+value3+"', Sci='"+value4+"' where StudentId='"+Sid+"' ";          
                        pst= conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"Marks for "+Exam+" have been Succesfully Updated!");
                        cleara();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    break;
                case "EOT":
                    try{
                        String Sid = Sno11.getText();
                        String value1 = math.getText();
                        String value2 = sst.getText();
                        String value3 = english.getText();
                        String value4 = science.getText();
                        String sql= "update EndMarks set Math = '"+value1+"', SST ='"+value2+"', Eng='"+value3+"', Sci='"+value4+"' where StudentId='"+Sid+"' ";          
                        pst= conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"Marks for "+Exam+" have been Succesfully Updated!");
                        cleara();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Cant Save Marks!");
            }     
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
        
        String sendId = stdid.getText();
        String sendTer= term11.getText();
        String sendYr = trm1.getText();
        String sendClass = class11.getText();
        String [] TotalMarks = new String[4];
        String [] Aggrgate = new String[4];
        String [] Comments = new String[4];
        
        if((sendId.equals("")) || (sendTer.equals("")) || (sendYr.equals("")) || (sendClass.equals("")) ){
            JOptionPane.showMessageDialog(null, "Please Fill all the fields to Generate Report");
            clr();
        }
        else{
            methods m = new methods();
            try{
                String Mathbot = null;
                String Engbot = null;
                String Scibot = null;
                String Sstbot = null;

                String Mathmid = null;
                String Engmid = null;
                String Scimid = null;
                String Sstmid = null;

                String Mathend = null;
                String Engend = null;
                String Sciend = null;
                String Sstend = null;
                String queryBot = "select * from BotMarks where StudentId=? and ExamT=?";
                String queryMid = "select * from MidMarks where StudentId=? and ExamT=?";
                String queryEnd = "select * from EndMarks where StudentId=? and ExamT=?";
                            //Querrying marks from the Bot table
                pst = conn.prepareStatement(queryBot);
                pst.setString(1, stdid.getText());
                pst.setString(2, term11.getText());
                rst = pst.executeQuery();
                if(rst.next()){
                    Mathbot = rst.getString("Math").trim();
                    Engbot = rst.getString("Eng").trim();
                    Scibot = rst.getString("Sci").trim();
                    Sstbot = rst.getString("SST").trim();
                }
                            //Querrying Marks from the Mid table

                pst = conn.prepareStatement(queryMid);
                pst.setString(1, stdid.getText());
                pst.setString(2, term11.getText());
                rst = pst.executeQuery();
                if(rst.next()){
                    Mathmid = rst.getString("Math").trim();
                    Engmid = rst.getString("Eng").trim();
                    Scimid = rst.getString("Sci").trim();
                    Sstmid = rst.getString("SST").trim();
                }
                            //Getting End resulst from the text feilds

                pst = conn.prepareStatement(queryEnd);
                pst.setString(1, stdid.getText());
                pst.setString(2, term11.getText());
                rst = pst.executeQuery();
                if(rst.next()){
                    Mathend = rst.getString("Math").trim();
                    Engend = rst.getString("Eng").trim();
                    Sciend = rst.getString("Sci").trim();
                    Sstend = rst.getString("SST").trim();
                }

                int MathTotal = m.addmarks(Integer.parseInt(Mathbot), Integer.parseInt(Mathmid), Integer.parseInt(Mathend));
                int EngTotal = m.addmarks(Integer.parseInt(Engbot), Integer.parseInt(Engmid), Integer.parseInt(Engend));
                int SciTotal = m.addmarks(Integer.parseInt(Scibot), Integer.parseInt(Scimid), Integer.parseInt(Sciend));
                int SstTotal = m.addmarks(Integer.parseInt(Sstbot), Integer.parseInt(Sstmid), Integer.parseInt(Sstend));
                            //Storing the marks into an Array
                TotalMarks[0] = Integer.toString(MathTotal);
                TotalMarks[1] = Integer.toString(EngTotal);
                TotalMarks[2] = Integer.toString(SciTotal);
                TotalMarks[3] = Integer.toString(SstTotal);

                            //Storing the Aggregates into an Array

                Aggrgate[0] = m.aggreagates(MathTotal);
                Aggrgate[1] = m.aggreagates(EngTotal);
                Aggrgate[2] = m.aggreagates(SciTotal);
                Aggrgate[3] = m.aggreagates(SstTotal);

                            //Storing Comments

                Comments[0] = m.Comments(Aggrgate[0]);
                Comments[1] = m.Comments(Aggrgate[1]);
                Comments[2] = m.Comments(Aggrgate[2]);
                Comments[3] = m.Comments(Aggrgate[3]);

                            //Insert the Total Aggregate and Division into the End Table

                int MathAggVal = m.getAggr(Aggrgate[0]);
                int EngAggVal = m.getAggr(Aggrgate[1]);
                int SciAggVal = m.getAggr(Aggrgate[2]);
                int SstAggVal = m.getAggr(Aggrgate[3]);

                int Totalagg = m.CalAggr(MathAggVal, EngAggVal, SciAggVal, SstAggVal);
                String Tota = Integer.toString(Totalagg);
                String Division = m.Div(Totalagg);


                //NEW
                 HashMap params;
                params = new HashMap<String, Object>();
                params.put("StudntId", sendId);
                params.put("termb", sendTer);
                params.put("yearb", sendYr);
                params.put("termm", sendTer);
                params.put("yearm", sendYr);
                params.put("terme", sendTer);
                params.put("yeare", sendYr);
                params.put("Class", sendClass);
                params.put("TotalMath", TotalMarks[0]);
                params.put("TotalEng", TotalMarks[1]);
                params.put("TotalSci", TotalMarks[2]);
                params.put("TotalSst", TotalMarks[3]);
                params.put("MathAggr", Aggrgate[0]);
                params.put("EngAggr", Aggrgate[1]);
                params.put("SciAggr", Aggrgate[2]);
                params.put("SstAggr", Aggrgate[3]);
                params.put("MathCom", Comments[0]);
                params.put("EngCom", Comments[1]);
                params.put("SciCom", Comments[2]);
                params.put("SstCom", Comments[3]);
                params.put("TotalAggr", Tota);
                params.put("Div", Division);

                //GENERATING REPORT

                JasperDesign jd  = JRXmlLoader.load("C:\\Users\\user\\Documents\\NetBeansProjects\\App1\\src\\Reports\\StudentReport.jrxml");
                JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\user\\Documents\\NetBeansProjects\\App1\\src\\Reports\\StudentReport.jrxml");
                JasperPrint  jp = JasperFillManager.fillReport(jr, params,conn);
                JasperViewer.viewReport(jp, false);

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                clr();
        }
        
        //Insert the total, aggreagates into the end table
        
        
    }//GEN-LAST:event_ReportActionPerformed

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
            java.util.logging.Logger.getLogger(Performace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Performace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Performace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Performace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Performace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Examid;
    private javax.swing.JButton Psearch;
    private javax.swing.JButton Report;
    private javax.swing.JTextField Sno11;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField class11;
    private javax.swing.JTextField english;
    private javax.swing.JComboBox<String> exam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField math;
    private javax.swing.JButton savemarks;
    private javax.swing.JTextField science;
    private javax.swing.JTextField seaching2;
    private javax.swing.JTextField sst;
    private javax.swing.JTextField stdid;
    private javax.swing.JTextField stream;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField term11;
    private javax.swing.JTextField trm1;
    private javax.swing.JTextField y11;
    // End of variables declaration//GEN-END:variables
}
