
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author BusraGural
 */
public class GameChoice extends javax.swing.JFrame {
    
    DefaultTableModel table;
    Object[] rowData;
    private List<Questions> exerciseList;
    ChildrenInfo currentChild;
    
    public GameChoice() {
        initComponents();
        
        currentChild = LoginPage.currentChild;
        
        exerciseList = new ArrayList<>();
        exerciseList = FileOp.readQuestionFromFile("Settings.ser");
        table  = (DefaultTableModel) gameListTable1.getModel();
        rowData = new Object[5];
        Object[] row = new Object[5];
        
        for (Questions questions : exerciseList) {
            row[0] = questions.settings[0];
            row[1] = questions.settings[1];
            row[2] = questions.settings[2];
            row[3] = questions.settings[3];
            row[4] = questions.settings[4];
            table.addRow(row);
        }     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameCoicePanel = new javax.swing.JPanel();
        start2Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gameListTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameCoicePanel.setBackground(new java.awt.Color(157, 241, 223));

        start2Button.setBackground(new java.awt.Color(163, 26, 203));
        start2Button.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        start2Button.setForeground(new java.awt.Color(255, 255, 255));
        start2Button.setText("START");
        start2Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        start2Button.setBorderPainted(false);
        start2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start2ButtonActionPerformed(evt);
            }
        });

        gameListTable1.setBackground(new java.awt.Color(141, 203, 230));
        gameListTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "a(min)", "a(max)", "b(min)", "b(max)T", "exercises number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gameListTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gameListTable1.setSelectionBackground(new java.awt.Color(163, 26, 203));
        gameListTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(gameListTable1);
        gameListTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        backBtn.setBackground(new java.awt.Color(163, 26, 203));
        backBtn.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameCoicePanelLayout = new javax.swing.GroupLayout(gameCoicePanel);
        gameCoicePanel.setLayout(gameCoicePanelLayout);
        gameCoicePanelLayout.setHorizontalGroup(
            gameCoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameCoicePanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(gameCoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start2Button, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        gameCoicePanelLayout.setVerticalGroup(
            gameCoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameCoicePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(start2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(gameCoicePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameCoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameCoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void start2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start2ButtonActionPerformed
        
        int selectedRow = gameListTable1.getSelectedRow(); 
        if (selectedRow != -1) { 
            rowData = new Object[table.getColumnCount()]; 

            for (int i = 0; i < rowData.length; i++) {
                rowData[i] = table.getValueAt(selectedRow, i); 
                System.out.println(rowData[i]);
            }
        }
        
        dispose();
        GameScreen gameScreen = new GameScreen(rowData); // Seçilen değerleri GameScreen sınıfına aktarın
        gameScreen.setVisible(true);
 
    }//GEN-LAST:event_start2ButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        new GameMode().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameChoice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel gameCoicePanel;
    private javax.swing.JTable gameListTable1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton start2Button;
    // End of variables declaration//GEN-END:variables


}
