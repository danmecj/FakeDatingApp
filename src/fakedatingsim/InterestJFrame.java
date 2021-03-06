/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakedatingsim;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class InterestJFrame extends javax.swing.JFrame {
    ArrayList<String> realUser = new ArrayList<String>();
    FriendZoneUser user;
    /**
     * Creates new form InterestJFrame
     */
    public InterestJFrame() {
       
        initComponents();
        
        UndoButton.setVisible(false);
        invisible();
        
    }
    
    public InterestJFrame(FriendZoneUser user) {
        this.user = user;
        initComponents();
        getContentPane().setBackground(Color.PINK);
        UndoButton.setVisible(false);
        invisible();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Interest1stInstruction = new javax.swing.JLabel();
        ArtsNBooksButton = new javax.swing.JButton();
        AnimalsNNatureButton = new javax.swing.JButton();
        EntertainmentButton = new javax.swing.JButton();
        SportsButton = new javax.swing.JButton();
        HobbyButton = new javax.swing.JButton();
        Interest2ndInstruction = new javax.swing.JLabel();
        FirstInterestButton = new javax.swing.JButton();
        ThirdInterestButton = new javax.swing.JButton();
        SecondInterestButton = new javax.swing.JButton();
        FifthInterestButton = new javax.swing.JButton();
        FourthInterestButton = new javax.swing.JButton();
        UndoButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        InterestListLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Interest1stInstruction.setText("Choose your interests category");

        ArtsNBooksButton.setText("Arts & Books");
        ArtsNBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtsNBooksButtonActionPerformed(evt);
            }
        });

        AnimalsNNatureButton.setText("Animals & Nature");
        AnimalsNNatureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalsNNatureButtonActionPerformed(evt);
            }
        });

        EntertainmentButton.setText("Entertainment");
        EntertainmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntertainmentButtonActionPerformed(evt);
            }
        });

        SportsButton.setText("Sports");
        SportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsButtonActionPerformed(evt);
            }
        });

        HobbyButton.setText("Hobby");
        HobbyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HobbyButtonActionPerformed(evt);
            }
        });

        FirstInterestButton.setDefaultCapable(false);
        FirstInterestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstInterestButtonActionPerformed(evt);
            }
        });

        ThirdInterestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdInterestButtonActionPerformed(evt);
            }
        });

        SecondInterestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondInterestButtonActionPerformed(evt);
            }
        });

        FifthInterestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FifthInterestButtonActionPerformed(evt);
            }
        });

        FourthInterestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthInterestButtonActionPerformed(evt);
            }
        });

        UndoButton.setText("Undo");
        UndoButton.setToolTipText("");
        UndoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");

        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Choose 5");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove Latest Interest");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(FirstInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SecondInterestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ThirdInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ArtsNBooksButton)
                        .addGap(18, 18, 18)
                        .addComponent(AnimalsNNatureButton)
                        .addGap(18, 18, 18)
                        .addComponent(EntertainmentButton)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Interest2ndInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BackButton)
                                .addGap(88, 88, 88)
                                .addComponent(Interest1stInstruction))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(SportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(HobbyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(FourthInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(FifthInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InterestListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Interest1stInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArtsNBooksButton)
                    .addComponent(AnimalsNNatureButton)
                    .addComponent(EntertainmentButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SportsButton)
                    .addComponent(HobbyButton))
                .addGap(18, 18, 18)
                .addComponent(Interest2ndInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThirdInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecondInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FourthInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FifthInterestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InterestListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UndoButton)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(RemoveButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArtsNBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtsNBooksButtonActionPerformed
        Interest2ndInstruction.setText("Choose an Arts & Books interest.");
        disables();
        visible();
        FirstInterestButton.setText("Digital Arts");
        ThirdInterestButton.setText("Painting");
        SecondInterestButton.setText("Sculpture");
        FifthInterestButton.setText("Poetry");
        FourthInterestButton.setText("Literature");
        UndoButton.setEnabled(true);
        
    }//GEN-LAST:event_ArtsNBooksButtonActionPerformed

    private void AnimalsNNatureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalsNNatureButtonActionPerformed
        Interest2ndInstruction.setText("Choose an Animals & Nature interest.");
       disables();
        UndoButton.setEnabled(true);
        visible();
        FirstInterestButton.setText("Pets");
        ThirdInterestButton.setText("Farm");
        SecondInterestButton.setText("Landscape");
        FifthInterestButton.setText("Plants");
        FourthInterestButton.setText("Environment");
    }//GEN-LAST:event_AnimalsNNatureButtonActionPerformed

    private void SportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsButtonActionPerformed
        Interest2ndInstruction.setText("Choose a Sports interest.");
        disables();
        UndoButton.setEnabled(true);
        visible();
        FirstInterestButton.setText("Basketball");
        ThirdInterestButton.setText("Hockey");
        SecondInterestButton.setText("Soccer");
        FifthInterestButton.setText("Tennis");
        FourthInterestButton.setText("Volleyball");
    }//GEN-LAST:event_SportsButtonActionPerformed

    private void EntertainmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntertainmentButtonActionPerformed
       Interest2ndInstruction.setText("Choose an Entertainment interest.");
       disables();
       UndoButton.setEnabled(true);
       visible();
        FirstInterestButton.setText("K-Pop");
        ThirdInterestButton.setText("Anime");
        SecondInterestButton.setText("Movies");
        FifthInterestButton.setText("Music");
        FourthInterestButton.setText("Television");
    }//GEN-LAST:event_EntertainmentButtonActionPerformed

    private void HobbyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HobbyButtonActionPerformed
        Interest2ndInstruction.setText("Choose a Hobby interest.");
        disables();
        UndoButton.setEnabled(true);  
        visible();
        FirstInterestButton.setText("Photography");
        ThirdInterestButton.setText("Gaming");
        SecondInterestButton.setText("Reading");
        FifthInterestButton.setText("Cycling");
        FourthInterestButton.setText("Travelling");
    }//GEN-LAST:event_HobbyButtonActionPerformed

    private void FirstInterestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstInterestButtonActionPerformed
             if(!realUser.contains(FirstInterestButton.getText()))
       {
       realUser.add(FirstInterestButton.getText());
       InterestListLabel.setText("User's interest:" + realUser);
       }
            Interest2ndInstruction.setText("");
            invisible();
             if(realUser.size()==5)
       {
           jLabel1.setText("You have chosen 5 interests. Press save or remove the latest interest.");
           disables();
       }
       else
           enables();
            //enables();
            }//GEN-LAST:event_FirstInterestButtonActionPerformed

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoButtonActionPerformed
        UndoButton.setEnabled(false);
        if(realUser.size()==5)
       {
           disables();
       }
       else
           enables();       
        Interest2ndInstruction.setText("");
        invisible();
    }//GEN-LAST:event_UndoButtonActionPerformed

    private void SecondInterestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondInterestButtonActionPerformed
         if(!realUser.contains(SecondInterestButton.getText()))
       {
       realUser.add(SecondInterestButton.getText());
       InterestListLabel.setText("User's interest:" + realUser);
       }
        Interest2ndInstruction.setText("");
        invisible();
        if(realUser.size()==5)
       {
           jLabel1.setText("You have chosen 5 interests. Press save or remove the latest interest.");
           disables();
       }
       else
           enables();
    }//GEN-LAST:event_SecondInterestButtonActionPerformed

    private void ThirdInterestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdInterestButtonActionPerformed
         if(!realUser.contains(ThirdInterestButton.getText()))
       {
       realUser.add(ThirdInterestButton.getText());
       InterestListLabel.setText("User's interest:" + realUser);
       }
        Interest2ndInstruction.setText("");
        invisible();
        if(realUser.size()==5)
       {
           jLabel1.setText("You have chosen 5 interests. Press save or remove the latest interest.");
           disables();
       }
       else
           enables();
    }//GEN-LAST:event_ThirdInterestButtonActionPerformed

    private void FourthInterestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthInterestButtonActionPerformed
         if(!realUser.contains(FourthInterestButton.getText()))
       {
       realUser.add(FourthInterestButton.getText());
       InterestListLabel.setText("User's interest:" + realUser);
       }
        Interest2ndInstruction.setText("");
        invisible();
       if(realUser.size()==5)
       {
           jLabel1.setText("You have chosen 5 interests. Press save or remove the latest interest.");
           disables();
       }
       else
           enables();
    }//GEN-LAST:event_FourthInterestButtonActionPerformed

    private void FifthInterestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FifthInterestButtonActionPerformed
       if(!realUser.contains(FifthInterestButton.getText()))
       {
       realUser.add(FifthInterestButton.getText());
       InterestListLabel.setText("User's interest:" + realUser);
       }
       
       Interest2ndInstruction.setText("");
       if(realUser.size()==5)
       {
           jLabel1.setText("You have chosen 5 interests. Press save or remove the latest interest.");
           disables();
       }
       else
           enables();
       invisible();
               
    }//GEN-LAST:event_FifthInterestButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
    
        if(realUser.size()>0)
           realUser.remove(realUser.size()-1);
        
    InterestListLabel.setText("User's interest:" + realUser);
    jLabel1.setText("");
    enables();
    invisible();
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if(realUser.size() == 5){
            user.setInterest(realUser);
            saveProfile();
            Login l = new Login();
            l.setVisible(true);
            dispose();
        }    
    }//GEN-LAST:event_SaveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new InterestJFrame().setVisible(true);
            }
        });
    }
    
    private void enables()
    {
        AnimalsNNatureButton.setEnabled(true);
        EntertainmentButton.setEnabled(true);
        SportsButton.setEnabled(true);
        ArtsNBooksButton.setEnabled(true);
        HobbyButton.setEnabled(true);
    }
    
    private void disables()
    {
        AnimalsNNatureButton.setEnabled(false);
        EntertainmentButton.setEnabled(false);
        SportsButton.setEnabled(false);
        ArtsNBooksButton.setEnabled(false);
        HobbyButton.setEnabled(false);
    }
    private void visible()
    {
        FirstInterestButton.setVisible(true);
        ThirdInterestButton.setVisible(true);
        SecondInterestButton.setVisible(true);
        FifthInterestButton.setVisible(true);
        FourthInterestButton.setVisible(true);
        UndoButton.setVisible(true);
    }
    
    private void invisible()
    {
        FirstInterestButton.setVisible(false);
        ThirdInterestButton.setVisible(false);
        SecondInterestButton.setVisible(false);
        FifthInterestButton.setVisible(false);
        FourthInterestButton.setVisible(false);
        UndoButton.setVisible(false);
    }
    
    public void saveProfile(){

        File userDataFile = new File("FriendZoneUserData.txt");

        if (!userDataFile.exists()) {
            try {
                userDataFile.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(InterestJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    

        try {
            FileWriter fWrite = new FileWriter(userDataFile, true);
            BufferedWriter bWrite = new BufferedWriter(fWrite);
            bWrite.write(user.toString());
            bWrite.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnimalsNNatureButton;
    private javax.swing.JButton ArtsNBooksButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton EntertainmentButton;
    private javax.swing.JButton FifthInterestButton;
    private javax.swing.JButton FirstInterestButton;
    private javax.swing.JButton FourthInterestButton;
    private javax.swing.JButton HobbyButton;
    private javax.swing.JLabel Interest1stInstruction;
    private javax.swing.JLabel Interest2ndInstruction;
    private javax.swing.JLabel InterestListLabel;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SecondInterestButton;
    private javax.swing.JButton SportsButton;
    private javax.swing.JButton ThirdInterestButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton UndoButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
