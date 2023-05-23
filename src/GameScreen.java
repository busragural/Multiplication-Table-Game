
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class GameScreen extends javax.swing.JFrame {

   private Timer timer;
   
    GameMode gameMode;
    List<int[]> questions;
 
    
    public GameScreen() {
        initComponents();
        gameMode = new GameMode();
        //questions = gameMode.questions;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameScreenPanel = new javax.swing.JPanel();
        answerField = new javax.swing.JTextField();
        firstNumberGSField = new javax.swing.JTextField();
        xGSLabel = new javax.swing.JLabel();
        secondNumberGSField = new javax.swing.JTextField();
        equalsLabel = new javax.swing.JLabel();
        answerBtn = new javax.swing.JButton();
        timerField = new javax.swing.JTextField();
        gameGSLabel = new javax.swing.JLabel();
        gameNumberField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameScreenPanel.setBackground(new java.awt.Color(141, 203, 230));

        answerField.setBackground(new java.awt.Color(157, 241, 223));
        answerField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        answerField.setForeground(new java.awt.Color(163, 26, 203));
        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.setBorder(null);

        firstNumberGSField.setEditable(false);
        firstNumberGSField.setBackground(new java.awt.Color(157, 241, 223));
        firstNumberGSField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        firstNumberGSField.setForeground(new java.awt.Color(163, 26, 203));
        firstNumberGSField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNumberGSField.setBorder(null);

        xGSLabel.setBackground(new java.awt.Color(163, 26, 203));
        xGSLabel.setFont(new java.awt.Font("Press Start 2P", 0, 48)); // NOI18N
        xGSLabel.setForeground(new java.awt.Color(163, 26, 203));
        xGSLabel.setText("X");

        secondNumberGSField.setEditable(false);
        secondNumberGSField.setBackground(new java.awt.Color(157, 241, 223));
        secondNumberGSField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        secondNumberGSField.setForeground(new java.awt.Color(163, 26, 203));
        secondNumberGSField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondNumberGSField.setBorder(null);

        equalsLabel.setBackground(new java.awt.Color(163, 26, 203));
        equalsLabel.setFont(new java.awt.Font("Press Start 2P", 0, 48)); // NOI18N
        equalsLabel.setForeground(new java.awt.Color(163, 26, 203));
        equalsLabel.setText("=");

        answerBtn.setBackground(new java.awt.Color(163, 26, 203));
        answerBtn.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        answerBtn.setForeground(new java.awt.Color(255, 255, 255));
        answerBtn.setText("ANSWER");
        answerBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        answerBtn.setBorderPainted(false);
        answerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerBtnActionPerformed(evt);
            }
        });

        timerField.setBackground(new java.awt.Color(157, 241, 223));
        timerField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timerField.setForeground(new java.awt.Color(163, 26, 203));
        timerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timerField.setBorder(null);

        gameGSLabel.setFont(new java.awt.Font("Press Start 2P", 0, 36)); // NOI18N
        gameGSLabel.setForeground(new java.awt.Color(163, 26, 203));
        gameGSLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameGSLabel.setText("GAME");

        gameNumberField.setBackground(new java.awt.Color(141, 203, 230));
        gameNumberField.setFont(new java.awt.Font("Press Start 2P", 0, 36)); // NOI18N
        gameNumberField.setForeground(new java.awt.Color(163, 26, 203));
        gameNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gameNumberField.setText("1");
        gameNumberField.setBorder(null);
        gameNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameNumberFieldActionPerformed(evt);
            }
        });

        startButton.setBackground(new java.awt.Color(163, 26, 203));
        startButton.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("START");
        startButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        startButton.setBorderPainted(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameScreenPanelLayout = new javax.swing.GroupLayout(gameScreenPanel);
        gameScreenPanel.setLayout(gameScreenPanelLayout);
        gameScreenPanelLayout.setHorizontalGroup(
            gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameScreenPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(gameGSLabel)
                .addGap(18, 18, 18)
                .addComponent(gameNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 609, Short.MAX_VALUE)
                .addComponent(timerField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(gameScreenPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(firstNumberGSField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(xGSLabel)
                .addGap(37, 37, 37)
                .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gameScreenPanelLayout.createSequentialGroup()
                        .addComponent(secondNumberGSField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(equalsLabel)
                        .addGap(28, 28, 28)
                        .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gameScreenPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gameScreenPanelLayout.setVerticalGroup(
            gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameScreenPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gameGSLabel)
                        .addComponent(gameNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timerField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondNumberGSField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(gameScreenPanelLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(xGSLabel)
                                .addComponent(equalsLabel))))
                    .addComponent(firstNumberGSField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerBtnActionPerformed
      
        
        if (!questions.isEmpty()) {
            int[] elements = questions.get(0);
            String tmp1 = String.valueOf(elements[0]);
            firstNumberGSField.setText(tmp1);

            String tmp2 = String.valueOf(elements[1]);
            secondNumberGSField.setText(tmp2);

            questions.remove(0); // sorulari listeden kaldır
        } 
        else {
            timer.stop();
            int gameTime = Integer.parseInt(timerField.getText());
            String message="Time to finish the game: " + gameTime + " sec.";
            JOptionPane.showMessageDialog(this, message);
            
        }
        
  
    }//GEN-LAST:event_answerBtnActionPerformed

    private void gameNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gameNumberFieldActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
  
        ////timer ltfn silme////
        timer = new Timer(1000, new ActionListener() {
        int seconds = 0;

        public void actionPerformed(ActionEvent e) {
            seconds++;
            timerField.setText(String.valueOf(seconds));
        }
        });
         timer.start();
        //////////////////
         
        //questions = FileOp.readQuestionFromFile("Questions.ser");
        
        
        
        
        
         
        int[] elements =questions.get(0);
        String tmp1 = String.valueOf(elements[0]);
        firstNumberGSField.setText(tmp1);
        
        String tmp2 = String.valueOf(elements[1]);
        secondNumberGSField.setText(tmp2);
        questions.remove(0);
        startButton.setVisible(false);
        
    }//GEN-LAST:event_startButtonActionPerformed

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
            GameScreen gameScreen= new GameScreen();
            
            gameScreen.setSize(1000, 500);
            gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameScreen.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerBtn;
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel equalsLabel;
    private javax.swing.JTextField firstNumberGSField;
    private javax.swing.JLabel gameGSLabel;
    private javax.swing.JTextField gameNumberField;
    private javax.swing.JPanel gameScreenPanel;
    private javax.swing.JTextField secondNumberGSField;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField timerField;
    private javax.swing.JLabel xGSLabel;
    // End of variables declaration//GEN-END:variables
}
