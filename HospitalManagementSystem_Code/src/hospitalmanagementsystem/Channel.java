/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer
 */
public class Channel extends javax.swing.JFrame {

    /**
     * Creates new form Channel
     */
    public Channel() {
        initComponents();
        SelectHospital();
    }

    Connection Conn = null;
    Statement St = null;
    ResultSet Rs = null;
    java.util.Date ChannelDate;
    java.sql.Date ChaDate;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPaneldoctor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDoName = new javax.swing.JTextField();
        txtPaName = new javax.swing.JTextField();
        txtChNumber = new javax.swing.JTextField();
        txtPaID = new javax.swing.JTextField();
        txtRoNumber = new javax.swing.JTextField();
        txtDoID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CaDaChannel = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        add = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChannelTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaneldoctor.setBackground(new java.awt.Color(21, 144, 186));
        jPaneldoctor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Channels", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPaneldoctor.setMaximumSize(new java.awt.Dimension(327, 327));
        jPaneldoctor.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patient Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Channel Number");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Doctor ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Doctor Name");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Patient ID");

        txtDoName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoNameActionPerformed(evt);
            }
        });

        txtPaName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaNameActionPerformed(evt);
            }
        });

        txtChNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtChNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChNumberActionPerformed(evt);
            }
        });

        txtPaID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaIDActionPerformed(evt);
            }
        });

        txtRoNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRoNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoNumberActionPerformed(evt);
            }
        });

        txtDoID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoIDActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Room Number");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Channel Date");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Search");

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPaneldoctorLayout = new javax.swing.GroupLayout(jPaneldoctor);
        jPaneldoctor.setLayout(jPaneldoctorLayout);
        jPaneldoctorLayout.setHorizontalGroup(
            jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneldoctorLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDoID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldoctorLayout.createSequentialGroup()
                        .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPaneldoctorLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))
                        .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneldoctorLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(txtPaName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtChNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPaneldoctorLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDoName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldoctorLayout.createSequentialGroup()
                        .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRoNumber)
                            .addComponent(CaDaChannel, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldoctorLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61)
                        .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPaneldoctorLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtsearch))
                            .addComponent(txtPaID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPaneldoctorLayout.setVerticalGroup(
            jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldoctorLayout.createSequentialGroup()
                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPaneldoctorLayout.createSequentialGroup()
                        .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneldoctorLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtChNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPaneldoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneldoctorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaneldoctorLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(CaDaChannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(85, 85, 85))
        );

        getContentPane().add(jPaneldoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 37, -1, 550));

        jPanel2.setBackground(new java.awt.Color(21, 144, 186));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        exit1.setBackground(new java.awt.Color(255, 255, 255));
        exit1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit1.setText("Exit");
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        ChannelTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChannelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Channel Number", "Doctor ID", "Docter Name", "Room Number", "Channel Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ChannelTable.setSelectionBackground(new java.awt.Color(21, 144, 186));
        ChannelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChannelTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ChannelTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 820, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/ChannBg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectHospital()
    {
        try{
        String connectionURL = "jdbc:derby://localhost:1527/HospitalManagementSystem";
        Conn = DriverManager.getConnection(connectionURL, "User1", "1234");
        St = Conn.createStatement();
        Rs = St.executeQuery("Select * from User1.MANAGECHANNELS" );
        ChannelTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e)
        {
           e.printStackTrace();
        }
    }
    private void txtDoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoNameActionPerformed

    private void txtPaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaNameActionPerformed

    private void txtChNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChNumberActionPerformed

    private void txtPaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaIDActionPerformed

    private void txtRoNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoNumberActionPerformed

    private void txtDoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoIDActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exit1ActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    ChannelDate = CaDaChannel.getDate();
    ChaDate = new java.sql.Date(ChannelDate.getTime());
    
    
         String connectionURL = "jdbc:derby://localhost:1527/HospitalManagementSystem";
        //ConnectionURL, username and password should be specified in getConnection()
        try {
            Conn = DriverManager.getConnection(connectionURL, "User1", "1234");
            PreparedStatement add = Conn.prepareStatement("insert into MANAGECHANNELS values(?,?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(txtPaID.getText()));
            add.setString(2, txtPaName.getText());
            add.setInt(3, Integer.valueOf(txtChNumber.getText()));
            add.setInt(4, Integer.valueOf(txtDoID.getText()));
            add.setString(5, txtDoName.getText());
            add.setInt(6, Integer.valueOf(txtRoNumber.getText()));
            add.setDate(7,ChaDate);
   
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Channel Successfully added");
            Conn.close();
            SelectHospital();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
        txtPaID.setText("");
        txtPaName.setText("");
        txtChNumber.setText("");
        txtDoID.setText("");
        txtDoName.setText("");
        txtRoNumber.setText("");
    }//GEN-LAST:event_ClearMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        if(txtPaID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the Patient ID to be Deleted");
        }
        else{
            String connectionURL = "jdbc:derby://localhost:1527/HospitalManagementSystem";
            try{
               Conn = DriverManager.getConnection(connectionURL, "User1", "1234");
               String PaId = txtPaID.getText();
               String Query = "Delete from User1.MANAGECHANNELS where PATIENTID="+PaId;
               Statement Add = Conn.createStatement();
               Add.executeUpdate(Query);
               SelectHospital();
                JOptionPane.showMessageDialog(this, "Channel Deleted Successfully");
            }catch(SQLException e)
            {
              e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        if(txtPaID.getText().isEmpty() ||txtPaName.getText().isEmpty() ||txtChNumber.getText().isEmpty() ||txtDoID.getText().isEmpty() ||txtDoName.getText().isEmpty()||txtRoNumber.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Add missing Channel"); 
        }
        else
        {
            String connectionURL = "jdbc:derby://localhost:1527/HospitalManagementSystem";
            try{   
                    ChannelDate = CaDaChannel.getDate();
                    ChaDate = new java.sql.Date(ChannelDate.getTime());
     
                Conn = DriverManager.getConnection(connectionURL, "User1", "1234");
    String UpdateQuery = "Update User1.MANAGECHANNELS set PATIENTNAME = '"+txtPaName.getText()+"'"+",CHANNELNUMBER ="+txtChNumber.getText()+""+",DOCTORID ="+txtDoID.getText()+""+",DOCTORNAME = '"+txtDoName.getText()+"'"+",ROOMNUMBER = "+txtRoNumber.getText()+""+",CHANNELDATE ='"+ChaDate+"'"+" where PATIENTID = "+txtPaID.getText();
                Statement Add = Conn.createStatement();
                Add.executeUpdate(UpdateQuery);
         JOptionPane.showMessageDialog(this, "Channel Updated Successfully");
                
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
            SelectHospital();
        }
    }//GEN-LAST:event_updateMouseClicked

    private void ChannelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChannelTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)ChannelTable.getModel();
        int Myindex = ChannelTable.getSelectedRow();
        txtPaID.setText(model.getValueAt(Myindex, 0).toString());
        txtPaName.setText(model.getValueAt(Myindex, 1).toString());
        txtChNumber.setText(model.getValueAt(Myindex, 2).toString());
        txtDoID.setText(model.getValueAt(Myindex, 3).toString());
        txtDoName.setText(model.getValueAt(Myindex, 4).toString());
        txtRoNumber.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_ChannelTableMouseClicked

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit", "Select",JOptionPane.YES_NO_OPTION );
        if(a == 0){
            this.setVisible(false);
            
        }else{
            this.setVisible(true);
        }
    }//GEN-LAST:event_exit1MouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:

        try{

            String sql = "select * from MANAGECHANNELS where PATIENTNAME = ?" ;

            PreparedStatement add = Conn.prepareStatement(sql);
            add.setString(1, txtsearch.getText());

            Rs = add.executeQuery();
            if(Rs.next()){
                String add1 = Rs.getString("PATIENTID");
                txtPaID.setText(add1);
                String add2 = Rs.getString("PATIENTNAME");
                txtPaName.setText(add2);
                String add3 = Rs.getString("CHANNELNUMBER");
                txtChNumber.setText(add3);
                String add4 = Rs.getString("DOCTORID");
                txtDoID.setText(add4);
                String add5 = Rs.getString("DOCTORNAME");
                txtDoName.setText(add5);
                String add6 = Rs.getString("ROOMNUMBER");
                txtRoNumber.setText(add6);
                CaDaChannel.setDate(Rs.getDate("CHANNELDATE"));
            }

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

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
            java.util.logging.Logger.getLogger(Channel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Channel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Channel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Channel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Channel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CaDaChannel;
    private javax.swing.JTable ChannelTable;
    private javax.swing.JButton Clear;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPaneldoctor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtChNumber;
    private javax.swing.JTextField txtDoID;
    private javax.swing.JTextField txtDoName;
    private javax.swing.JTextField txtPaID;
    private javax.swing.JTextField txtPaName;
    private javax.swing.JTextField txtRoNumber;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
