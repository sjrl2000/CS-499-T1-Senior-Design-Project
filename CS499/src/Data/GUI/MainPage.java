
package Data.GUI;

import Data.PersonalData;
import static Data.PersonalData.printPeople;
import java.util.ArrayList;
import java.util.List;

public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public MainPage() {
        initComponents();
        model = new ModelGUI();
        incorrectPassword.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userNameInput = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        userPasswordInput = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        incorrectPassword = new javax.swing.JLabel();
        createNewUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameInputActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        incorrectPassword.setForeground(new java.awt.Color(255, 51, 51));
        incorrectPassword.setText("Try again");

        createNewUser.setText("Create New User");
        createNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(incorrectPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(submitButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userPasswordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(userNameInput))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(createNewUser)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(incorrectPassword))
                .addGap(18, 18, 18)
                .addComponent(createNewUser)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        model.setUserNameGUI(userNameInput.getText());
        model.setUserPasswordGUI(userPasswordInput.getText());
        temp = Ruler.verifyLogin(model.getUserNameGUI(), model.getUserPasswordGUI(), allPeople);
        
        if(temp >= 0){
            incorrectPassword.setVisible(false);
            //Ruler.printPeople(allPeople.get(temp));
            LoginSuccess t = new LoginSuccess();
            t.show();
            dispose();
        }
        else{
            incorrectPassword.setVisible(true);
            userNameInput.setText("");
            userPasswordInput.setText("");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void userNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameInputActionPerformed

    private void createNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewUserActionPerformed
        // TODO add your handling code here:
        NewUser newPage = new NewUser();
        allPeople = newPage.updateList();
        newPage.show();
        dispose();
    }//GEN-LAST:event_createNewUserActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
        
        allPeople.add(new PersonalData("admin", "admin", 6, "admin", "admin"));
        allPeople.add(new PersonalData("nathan", "eheart", 6, "nathan", "eheart"));
        allPeople.add(new PersonalData("sebastian", "leal", 6, "sebastian", "leal"));
        allPeople.add(new PersonalData("xander", "voigt", 6, "xander", "voigt"));
        allPeople.add(new PersonalData("scott", "weir", 6, "scott", "weir"));
        allPeople.add(new PersonalData("chris", "gardner", 6, "chris", "gardner"));
        allPeople.add(new PersonalData("john", "smith", 5, "john", "smith123"));
        allPeople.add(new PersonalData("fake", "person", 4, "fake", "password123"));
        allPeople.add(new PersonalData("lebron", "james", 3, "lebron", "james123"));
        allPeople.add(new PersonalData("betty", "white", 2, "betty", "white123"));
        
        //allPeople.add(new PersonalData("t", "t", 5, "", ""));
        
//        for(int i = 0; i < allPeople.size(); i++)
//        {
//            Ruler.printPeople(allPeople.get(i));
//        }
       
        
    }
    
   
    public List returnAllUsers(){
        return allPeople;
    }
    
    
    
    static List<PersonalData> allPeople = new ArrayList<PersonalData>();
    static PersonalData Ruler = new PersonalData(null, null, -1, null, null);
    static int temp;
    ModelGUI model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewUser;
    private javax.swing.JLabel incorrectPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField userNameInput;
    private javax.swing.JPasswordField userPasswordInput;
    // End of variables declaration//GEN-END:variables
}
