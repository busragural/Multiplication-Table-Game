
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Report extends javax.swing.JFrame {

    Object[] rowData;
    private List<Object[]> reportForTable;
    DefaultTableModel table;
    
    public Report() {
        initComponents();
        
        reportForTable = FileOp.readReportFromFile("GeneralReport.csv");
        
        table = (DefaultTableModel) generalTable.getModel();
        rowData = new Object[5];
        Object[] row = new Object[5];
        
        for (Object[] str : reportForTable) {
            row[0] = str[0];
            row[1] = str[1];
            row[2] = str[2];
            row[3] = str[3];
            row[4] = str[4];
            
            table.addRow(row);            
        }
        
        reportForTable = FileOp.readReportFromFile("SpecialReport.csv");
        table = (DefaultTableModel) specialTable.getModel();
        rowData = new Object[6];
        row = new Object[6];
        
        for (Object[] str : reportForTable) {
            row[0] = str[0];
            row[1] = str[1];
            row[2] = str[2];
            row[3] = str[3];
            row[4] = str[4];
            row[5] = str[5];
            
            table.addRow(row);            
        }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        specialTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        generalTable = new javax.swing.JTable();
        logoutButtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reportPanel.setBackground(new java.awt.Color(141, 203, 230));

        specialTable.setBackground(new java.awt.Color(163, 26, 203));
        specialTable.setForeground(new java.awt.Color(255, 255, 255));
        specialTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "a-a-b-b-#", "Question", "Given Answer", "T/F", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        specialTable.setSelectionBackground(new java.awt.Color(157, 241, 223));
        jScrollPane1.setViewportView(specialTable);

        generalTable.setBackground(new java.awt.Color(163, 26, 203));
        generalTable.setForeground(new java.awt.Color(255, 255, 255));
        generalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "a-a-b-b-#", "Start Time", "Total Time", "Truth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        generalTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        generalTable.setSelectionBackground(new java.awt.Color(157, 241, 223));
        generalTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(generalTable);

        logoutButtn.setBackground(new java.awt.Color(157, 241, 223));
        logoutButtn.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        logoutButtn.setForeground(new java.awt.Color(163, 26, 203));
        logoutButtn.setText("LOGOUT");
        logoutButtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutButtn.setBorderPainted(false);
        logoutButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtnActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(157, 241, 223));
        backButton.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(163, 26, 203));
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addComponent(logoutButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtnActionPerformed
        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logoutButtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new GameMode().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Report report = new Report();
            
            report.setSize(1000, 500);
            report.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            report.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable generalTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutButtn;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JTable specialTable;
    // End of variables declaration//GEN-END:variables
}
