/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakedatingsim;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Rais
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        invalidLabel.setVisible(false);
        getContentPane().setBackground(Color.PINK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameArea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loginTinder = new javax.swing.JButton();
        loginTantan = new javax.swing.JButton();
        passwordArea = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        invalidLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(400, 330));

        usernameArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameAreaActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("No account? Click here to signup");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        loginTinder.setText("Tinder Login");
        loginTinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTinderActionPerformed(evt);
            }
        });

        loginTantan.setText("Tantan Login");
        loginTantan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTantanActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakedatingsim/fz company.png"))); // NOI18N

        invalidLabel.setForeground(new java.awt.Color(255, 51, 51));
        invalidLabel.setText("Invalid login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(loginTantan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(loginTinder))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addComponent(usernameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(invalidLabel)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginTantan)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginTinder)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(usernameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton)
                            .addComponent(invalidLabel)))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameAreaActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        verifyLoginFriendZone();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        SignUp s = new SignUp();
        s.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void loginTinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTinderActionPerformed
        verifyLoginTinder();
    }//GEN-LAST:event_loginTinderActionPerformed

    private void loginTantanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTantanActionPerformed
        verifyLoginTantan();
    }//GEN-LAST:event_loginTantanActionPerformed

    public void verifyLoginFriendZone() {

        String tempUsername, tempPassword, lineNumber;
        String pass = new String(passwordArea.getPassword());

        try
        {
            FileReader fileRead = new FileReader(new File("FriendZoneUserData.txt"));
            BufferedReader br = new BufferedReader(fileRead);

            while ((lineNumber = br.readLine()) != null)
            {
                tempUsername = lineNumber; //1st Line
                tempPassword = br.readLine(); //2nd Line

                if (usernameArea.getText().equals(tempUsername) && pass.equals(tempPassword))
                {
                    String firstName = br.readLine();
                    String lastName = br.readLine();
                    int age = Integer.parseInt(br.readLine());
                    String gender = br.readLine();
                    ArrayList<String> interest = new ArrayList<String>(Arrays.asList(br.readLine().split(","))); 
                    String city = br.readLine();
                    FriendZoneUser user = new FriendZoneUser(usernameArea.getText(), passwordArea.getText(), firstName, lastName, age, gender, interest, city);
                    MainMenu m = new MainMenu(user);
                    m.setVisible(true);
                    dispose();

                }
                else
                {
                    for (int i = 0; i < 6; i++)
                        lineNumber = br.readLine();
                }
            }
            br.close();
            invalidLabel.setVisible(true);
        }
        catch (Exception e)
        {
            System.out.println("The data file is not found.");
            System.out.println(e.getMessage());
        }

    }
    
    public void verifyLoginTantan() {

        String tempUsername, tempPassword, lineNumber;
        String pass = new String(passwordArea.getPassword());

        try
        {
            FileReader fileRead = new FileReader(new File("TantanUserData.txt"));
            BufferedReader br = new BufferedReader(fileRead);

            while ((lineNumber = br.readLine()) != null)
            {
                tempUsername = lineNumber; //1st Line
                tempPassword = br.readLine(); //2nd Line

                if (usernameArea.getText().equals(tempUsername) && pass.equals(tempPassword))
                {
                    String firstName = br.readLine();
                    String lastName = br.readLine();
                    int age = Integer.parseInt(br.readLine());
                    String gender = br.readLine();
                    ArrayList<String> interest = new ArrayList<String>(Arrays.asList(br.readLine().split(","))); 
                    String city = br.readLine();
                    TantanUser tanUser = new TantanUser(usernameArea.getText(), passwordArea.getText(), firstName, lastName, age, gender, interest, city);
                    AdapterClass adapt = new AdapterClass();
                    FriendZoneUser user = adapt.fromTantan(tanUser);
                    MainMenu m = new MainMenu(user);
                    m.setVisible(true);
                    dispose();

                }
                else
                {
                    for (int i = 0; i < 6; i++)
                        lineNumber = br.readLine();
                }
            }
            br.close(); 
            invalidLabel.setVisible(true);
        }
        catch (Exception e)
        {
            System.out.println("The data file is not found.");
            System.out.println(e.getMessage());
        }

    }
    
    public void verifyLoginTinder() {

        String tempUsername, tempPassword, lineNumber;
        String pass = new String(passwordArea.getPassword());

        try
        {
            FileReader fileRead = new FileReader(new File("TinderUserData.txt"));
            BufferedReader br = new BufferedReader(fileRead);

            while ((lineNumber = br.readLine()) != null)
            {
                tempUsername = lineNumber; //1st Line
                tempPassword = br.readLine(); //2nd Line

                if (usernameArea.getText().equals(tempUsername) && pass.equals(tempPassword))
                {
                    String firstName = br.readLine();
                    String lastName = br.readLine();
                    int age = Integer.parseInt(br.readLine());
                    String gender = br.readLine();
                    ArrayList<String> interest = new ArrayList<String>(Arrays.asList(br.readLine().split(","))); 
                    String city = br.readLine();
                    TinderUser tinUser = new TinderUser(usernameArea.getText(), passwordArea.getText(), firstName, lastName, age, gender, interest, city);
                    AdapterClass adapt = new AdapterClass();
                    FriendZoneUser user = adapt.fromTinder(tinUser);
                    MainMenu m = new MainMenu(user);
                    m.setVisible(true);
                    dispose();

                }
                else
                {
                    for (int i = 0; i < 6; i++)
                        lineNumber = br.readLine();
                }
            }
            br.close(); 
            invalidLabel.setVisible(true);
        }
        catch (Exception e)
        {
            System.out.println("The data file is not found.");
            System.out.println(e.getMessage());
        }

    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginTantan;
    private javax.swing.JButton loginTinder;
    private javax.swing.JPasswordField passwordArea;
    private javax.swing.JTextField usernameArea;
    // End of variables declaration//GEN-END:variables
}
