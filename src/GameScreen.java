
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.Timer;

public class GameScreen extends javax.swing.JFrame {

    private Timer timer;
    String currentStartTime;
     int score;
    int[] choosenSettings;
    List<int[]> questions;
    List<int[]> questionsForFile;
    static Object[] rowData;
    Questions q = new Questions();

    int[] givenAnswers;
    int index = 0;
    ChildrenInfo currentChild;
    int prevTime = 0;
    List<Integer> timeOfQuestions;
    int seconds = 0;
    static List<Questions> exerciseList;
            
    public GameScreen(Object[] rowData, List<Questions> exerciseList) {
        initComponents();
        currentChild = LoginPage.currentChild;
        this.rowData = rowData;
        this.exerciseList = exerciseList;
        
        timeOfQuestions = new ArrayList<>();

        lBoardButton.setVisible(false);
        logoutBTN.setVisible(false);
        newGameButton.setVisible(false);

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
        startButton = new javax.swing.JButton();
        lBoardButton = new javax.swing.JButton();
        newGameButton = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();

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

        timerField.setEditable(false);
        timerField.setBackground(new java.awt.Color(157, 241, 223));
        timerField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        timerField.setForeground(new java.awt.Color(163, 26, 203));
        timerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timerField.setBorder(null);

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

        lBoardButton.setBackground(new java.awt.Color(163, 26, 203));
        lBoardButton.setFont(new java.awt.Font("Press Start 2P", 0, 15)); // NOI18N
        lBoardButton.setForeground(new java.awt.Color(255, 255, 255));
        lBoardButton.setText("LEADERBOARD");
        lBoardButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lBoardButton.setBorderPainted(false);
        lBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lBoardButtonActionPerformed(evt);
            }
        });

        newGameButton.setBackground(new java.awt.Color(163, 26, 203));
        newGameButton.setFont(new java.awt.Font("Press Start 2P", 0, 15)); // NOI18N
        newGameButton.setForeground(new java.awt.Color(255, 255, 255));
        newGameButton.setText("NEW GAME");
        newGameButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newGameButton.setBorderPainted(false);
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        logoutBTN.setBackground(new java.awt.Color(163, 26, 203));
        logoutBTN.setFont(new java.awt.Font("Press Start 2P", 0, 15)); // NOI18N
        logoutBTN.setForeground(new java.awt.Color(255, 255, 255));
        logoutBTN.setText("LOGOUT");
        logoutBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBTN.setBorderPainted(false);
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameScreenPanelLayout = new javax.swing.GroupLayout(gameScreenPanel);
        gameScreenPanel.setLayout(gameScreenPanelLayout);
        gameScreenPanelLayout.setHorizontalGroup(
            gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameScreenPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameScreenPanelLayout.createSequentialGroup()
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
                                .addGap(36, 36, 36)
                                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(gameScreenPanelLayout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(205, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timerField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(gameScreenPanelLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(gameScreenPanelLayout.createSequentialGroup()
                            .addGap(399, 399, 399)
                            .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gameScreenPanelLayout.createSequentialGroup()
                            .addComponent(lBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(153, 153, 153)))
                    .addGroup(gameScreenPanelLayout.createSequentialGroup()
                        .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(379, 379, 379)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gameScreenPanelLayout.setVerticalGroup(
            gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameScreenPanelLayout.createSequentialGroup()
                .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameScreenPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(timerField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameScreenPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
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
                .addGap(18, 18, 18)
                .addComponent(answerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addGroup(gameScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

        int tmp = seconds - prevTime;
        timeOfQuestions.add(tmp);
        prevTime = seconds;

        if (!questions.isEmpty()) {

            int[] elements = questions.get(0);
            String tmp1 = String.valueOf(elements[0]);
            firstNumberGSField.setText(tmp1);

            String tmp2 = String.valueOf(elements[1]);
            secondNumberGSField.setText(tmp2);

            givenAnswers[index] = Integer.parseInt(answerField.getText());
            index++;

            questions.remove(0); // sorulari listeden kaldır
        } else {

            givenAnswers[index] = Integer.parseInt(answerField.getText());
            index = 0;
            timer.stop();

            int gameTime = Integer.parseInt(timerField.getText());

            answerBtn.enableInputMethods(true);

            String[] rowDataString = new String[6];
            for (int i = 0; i < rowData.length; i++) {
                rowDataString[i] = rowData[i].toString();
            }

            int trueAns = 0;
            int falseAns = 0;
            for (int i = 0; i < givenAnswers.length; i++) {
                if (questionsForFile.get(i)[2] == givenAnswers[i]) {

                    trueAns++;
                    questionsForFile.get(i)[3] = 1;

                } else {
                    falseAns++;

                }

            }

            String reportGeneral = currentChild.getChildUsername() + ","
                    + rowDataString[5] + ","
                    + rowDataString[0] + "-"
                    + rowDataString[1] + "-"
                    + rowDataString[2] + "-"
                    + rowDataString[3] + "-"
                    + rowDataString[4] + ","
                    + currentStartTime + ","
                    + String.valueOf(gameTime) + ","
                    + String.valueOf(trueAns) + "T" + "/"
                    + String.valueOf(falseAns) + "F";

            for (int i = 0; i < questionsForFile.size(); i++) {
                String reportSpecial = currentChild.getChildUsername() + ","
                       
                        + rowDataString[5] + ","
                        + questionsForFile.get(i)[0] + "x" + questionsForFile.get(i)[1] + ","
                        + givenAnswers[i] + ","
                        + ((questionsForFile.get(i)[3] == 1) ? "T" : "F") + ","
                        + timeOfQuestions.get(i);

                try {
                    FileOp.writeReportToFile("SpecialReport.csv", reportSpecial);
                } catch (IOException ex) {
                    Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println(reportSpecial);
            }

            System.out.println(reportGeneral);

            try {
                FileOp.writeReportToFile("GeneralReport.csv", reportGeneral);
            } catch (IOException ex) {
                Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

            score = 0;
            for (int i = 0; i < questionsForFile.size(); i++) {

                if (questionsForFile.get(i)[2] == givenAnswers[i]) {

                    score += questionsForFile.get(i)[3] * 1000 / timeOfQuestions.get(i);

                } else {
                    score -= questionsForFile.get(i)[3] * 250 / timeOfQuestions.get(i);
                }
            }
            System.out.println("score:" + score);
          
            String message = "Time to finish the game: " + gameTime + " sec. Your score: " + score ;
            
            JOptionPane.showMessageDialog(this, message, "GAME OVER", INFORMATION_MESSAGE);
            
            lBoardButton.setVisible(true);
            logoutBTN.setVisible(true);
            newGameButton.setVisible(true);
            answerBtn.setEnabled(false);
            answerField.setEditable(false);

        }
        answerField.setText("");
        answerField.requestFocus();
    }//GEN-LAST:event_answerBtnActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        answerField.requestFocus();
        timer = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                seconds++;
                timerField.setText(String.valueOf(seconds));
            }
        });
        timer.start();

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        currentStartTime = currentDate.format(formatter);

        choosenSettings = new int[rowData.length];

        for (int i = 0; i < rowData.length; i++) {
            choosenSettings[i] = (int) rowData[i];
            //System.out.println(choosenSettings[i]);
        }

        questions = q.randomQuestion(choosenSettings[0], choosenSettings[1], choosenSettings[2], choosenSettings[3], choosenSettings[4]);
        questionsForFile = new ArrayList<>(questions);

        givenAnswers = new int[questions.size()];

        int[] elements = questions.get(0);
        String tmp1 = String.valueOf(elements[0]);
        firstNumberGSField.setText(tmp1);

        String tmp2 = String.valueOf(elements[1]);
        secondNumberGSField.setText(tmp2);

        questions.remove(0);
        startButton.setVisible(false);

    }//GEN-LAST:event_startButtonActionPerformed

    private void lBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lBoardButtonActionPerformed
        dispose();
        new Leaderboard(rowData, score).setVisible(true);
    }//GEN-LAST:event_lBoardButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        dispose();
        new GameChoice().setVisible(true);
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed

        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

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
            GameScreen gameScreen = new GameScreen(rowData, exerciseList);

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
    private javax.swing.JPanel gameScreenPanel;
    private javax.swing.JButton lBoardButton;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton newGameButton;
    private javax.swing.JTextField secondNumberGSField;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField timerField;
    private javax.swing.JLabel xGSLabel;
    // End of variables declaration//GEN-END:variables
}
