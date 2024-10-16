
package Myfiles;

import static Myfiles.AddStudent.searching;
import java.awt.*;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;



public class Library extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rst = null;
    PreparedStatement pst = null;
    String Identity = login.useridentity.getText();
    String na = login.userName.getText();
    String N = login.Designation.getSelectedItem().toString();
    public Library() {
        initComponents();
        conn = javaconnect.connectdb();
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        this.setResizable(false);
        Dimension size = toolKit.getScreenSize();
        this.setLocation(size.width/2-this.getWidth()/2,size.height/2-this.getHeight()/2);
        this.setDefaultCloseOperation(Library.DISPOSE_ON_CLOSE);
        String N = login.Designation.getSelectedItem().toString();
        NAME.setText(N+"!");
        lib.setFocusPainted(true);
    }
    
    public void CurrentDate(){
        Thread clock;     
        clock = new Thread(){     
            @Override
            public void run(){
                for(;;){
                    Calendar cal = new GregorianCalendar();
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int Month = cal.get(Calendar.MONTH)+1;
                    int Year = cal.get(Calendar.YEAR);
                    Datel.setText("Date: "+day+"/"+Month+"/"+Year);
                    int hours = cal.get(Calendar.HOUR)+12;
                    int Minutes = cal.get(Calendar.MINUTE);
                    int Secs = cal.get(Calendar.SECOND);
                    Timel.setText("Time: "+hours+":"+Minutes+":"+Secs+"hrs");
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        clock.start();
    }
    
    public void clearal(){
        bid1.setText("");
        author.setText("");
        Bkname.setText("");
        Datead.setText(""); 
    }
    public void clearall(){
        bid2.setText("");
        StNo1.setText("");
        bName2.setText("");
        Datetkn.setText(""); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Student = new javax.swing.JButton();
        Accounts = new javax.swing.JButton();
        lib = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bid1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        subj = new javax.swing.JComboBox<>();
        AddBook = new javax.swing.JButton();
        DELETEBOOK = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Datead = new javax.swing.JTextField();
        Bkname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bName2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bid2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Datetkn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        subject1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        StNo1 = new javax.swing.JTextField();
        SAVE1 = new javax.swing.JButton();
        UpdateTkn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        bookide = new javax.swing.JTextField();
        Returned = new javax.swing.JButton();
        searchBook = new javax.swing.JTextField();
        SearchBk = new javax.swing.JButton();
        ViewBooks = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        adduser = new javax.swing.JButton();
        NAME = new javax.swing.JLabel();
        Datel = new javax.swing.JLabel();
        Timel = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Myfiles/Resources/yellow-light-and-red-student-badge.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO THE ADMINISTRATION PORTAL OF HAMAD INTERNATIONAL SCHOOL");

        Student.setText("REGISTER STUDENT");
        Student.setFocusPainted(false);
        Student.setFocusable(false);
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });

        Accounts.setText("ACCOUNTS");
        Accounts.setFocusPainted(false);
        Accounts.setFocusable(false);
        Accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsActionPerformed(evt);
            }
        });

        lib.setText("LIBRARY");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Logged in As:");

        LOGOUT.setText("LOG OUT");
        LOGOUT.setFocusPainted(false);
        LOGOUT.setFocusable(false);
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BOOKS INFOMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("NEW BOOK"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOK ID");

        bid1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AUTHOR:");

        author.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DATE ADDED");

        subj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATH", "SST", "ENGLISH", "SCIENCE" }));

        AddBook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AddBook.setText("ADD BOOK");
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });

        DELETEBOOK.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DELETEBOOK.setText("DELETE BOOK");
        DELETEBOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEBOOKActionPerformed(evt);
            }
        });

        jLabel5.setText("SUBJECT:");

        Datead.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Bkname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("BOOK NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bid1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Datead, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Bkname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(DELETEBOOK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(subj, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bid1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bkname, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DELETEBOOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Datead, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("BOOKS TAKEN"));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BOOK NAME:");

        bName2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BOOK ID\n");

        bid2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DATE TAKEN:");

        Datetkn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SUBJECT:");

        subject1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subject1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATH", "SST", "ENGLISH", "SCIENCE" }));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("STUDENT'S NUMBER:");

        StNo1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        SAVE1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SAVE1.setText("SAVE");
        SAVE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE1ActionPerformed(evt);
            }
        });

        UpdateTkn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        UpdateTkn.setText("UPDATE");
        UpdateTkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTknActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StNo1)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateTkn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(SAVE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bName2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Datetkn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subject1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bid2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bName2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bid2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Datetkn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subject1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateTkn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SAVE1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("BOOKS RETURNED"));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("BOOK ID");

        bookide.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        Returned.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Returned.setText("UPDATE");
        Returned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bookide, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Returned, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookide, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Returned, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        searchBook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        SearchBk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SearchBk.setText("SEARCH BOOK");
        SearchBk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBkActionPerformed(evt);
            }
        });

        ViewBooks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ViewBooks.setText("VIEW AVAILABLE BOOKS");
        ViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBooksActionPerformed(evt);
            }
        });

        jLabel18.setText("Enter The Book Name to Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchBk, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        adduser.setText("ADD USER");
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });

        NAME.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NAME.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Datel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Timel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Student)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Accounts, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lib, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(LOGOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Datel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Timel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Datel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Timel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(NAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lib, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Accounts, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Student, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        // TODO add your handling code here:
        String checking = "select * from Access where UserId=? and AccessPage=?";
        String Pagename ="AddStudent";
        //String N = login.Designation.getSelectedItem().toString();
        if (("Admin".equals(N)) || ("Head Teacher".equals(N)) || ("Principle".equals(N)) || ("Accountant".equals(N)) || ("Class Teacher".equals(N)) || ("DOS".equals(N))){
            dispose();
            AddStudent a = new AddStudent();
            a.setVisible(true);
        }
        else{
        //String N = login.Designation.getSelectedItem().toString();
            try{
                pst = conn.prepareStatement(checking);
                pst.setString(1, Identity);
                pst.setString(2, Pagename);
                rst = pst.executeQuery();
                if(rst.next()){
                    String resid = rst.getString("UserId").trim();
                    String resPage = rst.getString("AccessPage").trim();
                    if((resid.equals(Identity)) && (resPage.equals(Pagename))){
                        dispose();
                        AddStudent a = new AddStudent();
                        a.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, na+", You do not have rights to Access this Page!");
                    }
                    rst.close();
                    pst.close();
                }
                else{
                    JOptionPane.showMessageDialog(null, na+", You have no rights to this Page");
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
    }//GEN-LAST:event_StudentActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void AccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsActionPerformed
        // TODO add your handling code here:
        String checking = "select * from Access where UserId=? and AccessPage=?";
        String Pagename ="Accounts";
        String N = login.Designation.getSelectedItem().toString();
        if (("Admin".equals(N)) || ("Head Teacher".equals(N)) || ("Principle".equals(N)) || ("Accountant".equals(N))){
            dispose();
            Accounts a = new Accounts();
            a.setVisible(true);
        }
        else{
        //String N = login.Designation.getSelectedItem().toString();
            try{
                pst = conn.prepareStatement(checking);
                pst.setString(1, Identity);
                pst.setString(2, Pagename);
                rst = pst.executeQuery();
                if(rst.next()){
                    String resid = rst.getString("UserId").trim();
                    String resPage = rst.getString("AccessPage").trim();
                    if((resid.equals(Identity)) && (resPage.equals(Pagename))){
                        dispose();
                        AddStudent a = new AddStudent();
                        a.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, na+", You do not have rights to Access this Page!");
                    }
                    rst.close();
                    pst.close();
                }
                else{
                    JOptionPane.showMessageDialog(null, na+", You have no rights to this Page");
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
    }//GEN-LAST:event_AccountsActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        // TODO add your handling code here:
        String checking = "select * from Access where UserId=? and AccessPage=?";
        String Pagename ="Admin";
        String N = login.Designation.getSelectedItem().toString();
        if (("Admin".equals(N)) || ("Head Teacher".equals(N)) || ("Principle".equals(N)) ){
            dispose();
            Admin a = new Admin();
            a.setVisible(true);
        }
        else{
        //String N = login.Designation.getSelectedItem().toString();
            try{
                pst = conn.prepareStatement(checking);
                pst.setString(1, Identity);
                pst.setString(2, Pagename);
                rst = pst.executeQuery();
                if(rst.next()){
                    String resid = rst.getString("UserId").trim();
                    String resPage = rst.getString("AccessPage").trim();
                    if((resid.equals(Identity)) && (resPage.equals(Pagename))){
                        dispose();
                        AddStudent a = new AddStudent();
                        a.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, na+", You do not have rights to Access this Page!");
                    }
                    rst.close();
                    pst.close();
                }
                else{
                    JOptionPane.showMessageDialog(null, na+", You have no rights to this Page");
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
    }//GEN-LAST:event_adduserActionPerformed

    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        // TODO add your handling code here:
        String BID = bid1.getText();
        String auth = author.getText();
        String BookN = Bkname.getText();
        String Datea = Datead.getText();
        String Sub = subj.getSelectedItem().toString();
        String Stat1 = "Available";
        String Stat2 = "Taken";
        if((bid1.getText().equals("")) || (author.getText().equals("")) || (Bkname.getText().equals("")) || (Datead.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Enter Book Information to Proceed!");
            clearal();
        }
        else{
            try{
                String sql= "Insert into Books (BookID,BookName,Author,DateAdded,Subject,Status) values(?,?,?,?,?,?)";
                pst= conn.prepareStatement(sql);
                pst.setString(1,BID);
                pst.setString(2,BookN);
                pst.setString(3,auth);
                pst.setString(4,Datea);
                pst.setString(5,Sub);
                pst.setString(6, Stat1);
                pst.execute();
                JOptionPane.showMessageDialog(null,BookN+" has been Added Successfully");
                clearal();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_AddBookActionPerformed

    private void DELETEBOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEBOOKActionPerformed
        // TODO add your handling code here:
        if(bid1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "You need to Enter the ID of the Book!");
        }
        else{
            //DELETE HAS A LOGICAL ERROR!
            int answr = JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want to Delete this Book?");
            if(answr == JOptionPane.YES_OPTION){
                try{
                    String sql= "Delete from Books where BookID=?";
                    pst= conn.prepareStatement(sql);
                    pst.setString(1,bid1.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Deleted!");
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            if (answr == JOptionPane.NO_OPTION){
                clearal();
            }
            else{
                clearal();
            } 
        }
    }//GEN-LAST:event_DELETEBOOKActionPerformed

    private void SAVE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE1ActionPerformed
        // TODO add your handling code here:
        String BID = bid2.getText();
        String BookN = bName2.getText();
        String DateTakn = Datetkn.getText();
        String StNo = StNo1.getText();
        String Sub = subject1.getSelectedItem().toString();
        if((bid2.getText().equals("")) || (StNo1.getText().equals("")) || (bName2.getText().equals("")) || (Datetkn.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please Enter Book Information to Proceed!");
            clearall();
        }
        else{
            try{
                String sql= "Insert into TakenBks (BookID,BookName,StudentId,DateTaken,Subject) values(?,?,?,?,?)";
                pst= conn.prepareStatement(sql);
                pst.setString(1,BID);
                pst.setString(2,BookN);
                pst.setString(3,StNo);
                pst.setString(4,DateTakn);
                pst.setString(5,Sub);
                pst.execute();
                JOptionPane.showMessageDialog(null,BookN+" has been Added Successfully");
                clearall();
                Cardbk cd = new Cardbk();
                cd.setVisible(true);
                String value1 = "Taken";
                String upd= "update Books set Status = '"+value1+"' where BookID='"+BID+"' ";          
                pst= conn.prepareStatement(upd);
                pst.execute();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_SAVE1ActionPerformed

    private void UpdateTknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTknActionPerformed
        // TODO add your handling code here:
        try{
            String value1 = bid2.getText();
            String value2 = bName2.getText();
            String value3 = Datetkn.getText();
            String value4 = StNo1.getText();
            String value5 = subj.getSelectedItem().toString();
            String sql= "update tblEmployee set ID = '"+value1+"', FName ='"+value2+"', LName='"+value3+"' where ID='"+value1+"' ";          
            pst= conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Update");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_UpdateTknActionPerformed

    private void ReturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnedActionPerformed
        // TODO add your handling code here:
        if(bookide.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Book Information to Proceed!");
            bookide.setText("");
        }
        else{
            try{
                String BID = bookide.getText();
                String sql= "Delete from TakenBks where BookID=?";
                pst= conn.prepareStatement(sql); 
                 pst.setString(1,BID);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Records Successfully Updated!");
                clearall();
                String value1 = "Available";
                String upd= "update Books set Status = '"+value1+"' where BookID='"+BID+"' ";          
                pst= conn.prepareStatement(upd);
                pst.execute();
                bookide.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                bookide.setText("");
            }
        }
    }//GEN-LAST:event_ReturnedActionPerformed

    private void ViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBooksActionPerformed
        // TODO add your handling code here:
        
        try {
                JasperDesign jd  = JRXmlLoader.load("C:\\Users\\user\\Documents\\NetBeansProjects\\App1\\src\\Reports\\AvailableBks.jrxml");
                JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\user\\Documents\\NetBeansProjects\\App1\\src\\Reports\\AvailableBks.jrxml");
                JasperPrint  jp = JasperFillManager.fillReport(jr, null,conn);
                JasperViewer.viewReport(jp, false);  
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_ViewBooksActionPerformed

    private void SearchBkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBkActionPerformed
        // TODO add your handling code here:
        HashMap params;
        params = new HashMap<String, Object>();
        params.put("BookName", searchBook.getText());
        if((searchBook.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter the Book Name!");
        }
        else{
            try {
                JasperDesign jd  = JRXmlLoader.load("C:\\Users\\user\\Documents\\NetBeansProjects\\App1\\src\\Reports\\SearchedBk.jrxml");
                JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\user\\Documents\\NetBeansProjects\\App1\\src\\Reports\\SearchedBk.jrxml");
                JasperPrint  jp = JasperFillManager.fillReport(jr, params,conn);
                JasperViewer.viewReport(jp, false);
                
                searchBook.setText("");
            
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
        
    }//GEN-LAST:event_SearchBkActionPerformed

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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accounts;
    private javax.swing.JButton AddBook;
    private javax.swing.JTextField Bkname;
    private javax.swing.JButton DELETEBOOK;
    private javax.swing.JTextField Datead;
    private javax.swing.JLabel Datel;
    public static javax.swing.JTextField Datetkn;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JLabel NAME;
    private javax.swing.JButton Returned;
    private javax.swing.JButton SAVE1;
    private javax.swing.JButton SearchBk;
    public static javax.swing.JTextField StNo1;
    private javax.swing.JButton Student;
    private javax.swing.JLabel Timel;
    private javax.swing.JButton UpdateTkn;
    private javax.swing.JButton ViewBooks;
    private javax.swing.JButton adduser;
    private javax.swing.JTextField author;
    public static javax.swing.JTextField bName2;
    private javax.swing.JTextField bid1;
    public static javax.swing.JTextField bid2;
    private javax.swing.JTextField bookide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton lib;
    private javax.swing.JTextField searchBook;
    private javax.swing.JComboBox<String> subj;
    public static javax.swing.JComboBox<String> subject1;
    // End of variables declaration//GEN-END:variables
}
