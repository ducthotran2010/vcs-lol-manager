/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import dbo.AccessSQL;
import dbo.ListPlayer;
import dbo.ListTeam;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ThoDT
 */
public class ManagerProgram extends javax.swing.JFrame {
    
    AccessSQL mySQL = new AccessSQL();
    ListPlayer myListPlayer = new ListPlayer();
    ListTeam myListTeam = new ListTeam();
    
    public ManagerProgram() {
        initComponents();
        myListPlayer.loadFromSQL(mySQL);
        myListTeam.loadFromSQL(mySQL);
        ViewPlayers();
        ViewTeam();
    }
    
    public void ViewTeam() {
        Vector<String> Header = new Vector();
        Header.add("Tên tuyển thủ");
        Header.add("Rank hiện tại");
        Header.add("Đội tuyển");
        Header.add("Vị trí chính");
        try {
            Vector<Vector<String>> list = myListPlayer.getListPlayerVector();
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setDataVector(list, Header);
            tbPlayer.setModel(tableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void ViewPlayers() {
        Vector<String> Header = new Vector();
        Header.add("Tên đội tuyển");
        Header.add("Thứ hạng");
        Header.add("Năm thành lập");
        Header.add("Khu vực");
        try {
            Vector<Vector<String>> list = myListTeam.getListPlayerVector();
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setDataVector(list, Header);
            tbTeam.setModel(tableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlayer = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtPlayerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPlayerRank = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlayerTeam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPlayerRole = new javax.swing.JTextField();
        btnAddPlayer = new javax.swing.JButton();
        btnUpdatePlayer = new javax.swing.JButton();
        btnDeletePlayer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTeam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Program");

        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        tbPlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên tuyển thủ", "Rank hiện tại", "Đội tuyển", "Vị trí chính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPlayerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPlayer);
        if (tbPlayer.getColumnModel().getColumnCount() > 0) {
            tbPlayer.getColumnModel().getColumn(0).setResizable(false);
            tbPlayer.getColumnModel().getColumn(1).setResizable(false);
            tbPlayer.getColumnModel().getColumn(2).setResizable(false);
            tbPlayer.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Tìm kiếm:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tuyển thủ"));

        jLabel2.setText("Tên tuyển thủ:");

        jLabel3.setText("Rank hiện tại:");

        jLabel4.setText("Đội tuyển:");

        jLabel5.setText("Vị trí:");

        btnAddPlayer.setText("Thêm");
        btnAddPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlayerActionPerformed(evt);
            }
        });

        btnUpdatePlayer.setText("Cập Nhật");

        btnDeletePlayer.setText("Xóa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlayerRank)
                            .addComponent(txtPlayerName))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlayerTeam)
                            .addComponent(txtPlayerRole)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeletePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlayerName)
                    .addComponent(jLabel2)
                    .addComponent(txtPlayerTeam)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlayerRank)
                    .addComponent(jLabel3)
                    .addComponent(txtPlayerRole)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnUpdatePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tuyển thủ", jPanel1);

        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });

        tbTeam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đội tuyển", "Thứ hạng", "Năm thành lập", "Khu vực"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbTeam);
        if (tbTeam.getColumnModel().getColumnCount() > 0) {
            tbTeam.getColumnModel().getColumn(0).setResizable(false);
            tbTeam.getColumnModel().getColumn(1).setResizable(false);
            tbTeam.getColumnModel().getColumn(2).setResizable(false);
            tbTeam.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Đội tuyển", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
       
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
    }//GEN-LAST:event_jPanel2FocusGained

    private void tbPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPlayerMouseClicked
        int rowIndex = tbPlayer.getSelectedRow();
        txtPlayerName.setText(tbPlayer.getValueAt(rowIndex, 0).toString());
        txtPlayerRank.setText(tbPlayer.getValueAt(rowIndex, 1).toString());
        txtPlayerTeam.setText(tbPlayer.getValueAt(rowIndex, 2).toString());
        txtPlayerRole.setText(tbPlayer.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_tbPlayerMouseClicked

    private void btnAddPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlayerActionPerformed
        // 
        System.out.println("CHUA BUILD");
    }//GEN-LAST:event_btnAddPlayerActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        JOptionPane.showMessageDialog(null, "TAO CHAY ROI NGHE");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManagerProgram myGUI = new ManagerProgram();
                myGUI.setLocationRelativeTo(myGUI);
                myGUI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlayer;
    private javax.swing.JButton btnDeletePlayer;
    private javax.swing.JButton btnUpdatePlayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbPlayer;
    private javax.swing.JTable tbTeam;
    private javax.swing.JTextField txtPlayerName;
    private javax.swing.JTextField txtPlayerRank;
    private javax.swing.JTextField txtPlayerRole;
    private javax.swing.JTextField txtPlayerTeam;
    // End of variables declaration//GEN-END:variables

}