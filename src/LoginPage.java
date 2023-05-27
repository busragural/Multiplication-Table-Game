
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    public static ChildrenInfo currentChild = new ChildrenInfo();
    
    public LoginPage() {
        initComponents();
        currentChild = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        mtgLabel = new javax.swing.JLabel();
        goRegisterBtn = new javax.swing.JButton();
        mtgLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backgroundPanel.setBackground(new java.awt.Color(141, 203, 230));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(820, 450));

        passwordField.setBackground(new java.awt.Color(141, 203, 230));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(227, 246, 255), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(227, 246, 255))); // NOI18N

        usernameField.setBackground(new java.awt.Color(141, 203, 230));
        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(227, 246, 255), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(227, 246, 255))); // NOI18N

        loginButton.setBackground(new java.awt.Color(163, 26, 203));
        loginButton.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        mtgLabel.setFont(new java.awt.Font("Press Start 2P", 0, 33)); // NOI18N
        mtgLabel.setForeground(new java.awt.Color(255, 255, 255));
        mtgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mtgLabel.setText("MULTIPLICATION TABLE GAME");

        goRegisterBtn.setBackground(new java.awt.Color(141, 203, 230));
        goRegisterBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        goRegisterBtn.setForeground(new java.awt.Color(163, 26, 203));
        goRegisterBtn.setText("Register Now");
        goRegisterBtn.setBorder(null);
        goRegisterBtn.setBorderPainted(false);
        goRegisterBtn.setContentAreaFilled(false);
        goRegisterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goRegisterBtn.setFocusPainted(false);
        goRegisterBtn.setFocusable(false);
        goRegisterBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRegisterBtnActionPerformed(evt);
            }
        });

        mtgLabel1.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        mtgLabel1.setForeground(new java.awt.Color(255, 255, 255));
        mtgLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mtgLabel1.setText("How to play");

        jButton1.setBackground(new java.awt.Color(141, 203, 230));
        jButton1.setFont(new java.awt.Font("Press Start 2P", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(157, 241, 223));
        jButton1.setText("?");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(mtgLabel)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(goRegisterBtn)
                        .addGap(425, 425, 425))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(passwordField)
                            .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(mtgLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(mtgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goRegisterBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(mtgLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if ("par".equals(username) && "123".equals(password)) {

            String message = "Parent login.";
            JOptionPane.showMessageDialog(this, message);
            dispose();
            new GameMode().setVisible(true);
        } else {

            ChildrenInfo isThereChild = new ChildrenInfo(username, password);

            List<ChildrenInfo> childInfo = FileOp.readChildFromFile("ChildrenInfo.ser");

            System.out.println(childInfo);

            boolean isChildFound = false;
            for (ChildrenInfo child : childInfo) {

                if (child.equals(isThereChild)) {

                    isChildFound = true;
                }
            }
            if (isChildFound) {
                
                currentChild = new ChildrenInfo(username, password);
                currentChild.setChildUsername(username);

                String message = "Child login";
                JOptionPane.showMessageDialog(this, message);
                dispose();
                new GameChoice().setVisible(true);
            } else {

                String message = "Invalid user.";
                JOptionPane.showMessageDialog(this, message);

            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void goRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRegisterBtnActionPerformed
        new Register().setVisible(true);
    }//GEN-LAST:event_goRegisterBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HowToPlay().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            LoginPage loginPage = new LoginPage();

            loginPage.setSize(1000, 500);
            loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginPage.setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton goRegisterBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel mtgLabel;
    private javax.swing.JLabel mtgLabel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
