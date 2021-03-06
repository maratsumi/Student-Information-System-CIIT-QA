/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.information.system;

import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author maraa
 */
public class AdminAddCourse extends javax.swing.JFrame {

    /**
     * Creates new form AdminAddCourse
     */
    public AdminAddCourse() {
        initComponents();
        initializeComboBoxTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        schoolTitle = new javax.swing.JLabel();
        studentRegisterLabel = new javax.swing.JLabel();
        submitInfoButton = new javax.swing.JButton();
        startHourLabel = new javax.swing.JLabel();
        startHourChoice = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        startMinutesLabel = new javax.swing.JLabel();
        startMinutesChoice = new javax.swing.JComboBox<>();
        courseCodeLabel = new javax.swing.JLabel();
        teacherNameLabel = new javax.swing.JLabel();
        teacherNameField = new javax.swing.JTextField();
        courseNameLabel = new javax.swing.JLabel();
        courseNameField = new javax.swing.JTextField();
        timeStartLabel = new javax.swing.JLabel();
        endHourLabel = new javax.swing.JLabel();
        timeEndLabel = new javax.swing.JLabel();
        endHourChoice = new javax.swing.JComboBox<>();
        endMinutesLabel = new javax.swing.JLabel();
        endMinutesChoice = new javax.swing.JComboBox<>();
        courseCodeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 360));
        setResizable(false);

        schoolTitle.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        schoolTitle.setText("XY Senior High School");

        studentRegisterLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        studentRegisterLabel.setText("Course Registration");

        submitInfoButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        submitInfoButton.setText("Submit");
        submitInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitInfoButtonActionPerformed(evt);
            }
        });

        startHourLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        startHourLabel.setText("Hour");

        backButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        startMinutesLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        startMinutesLabel.setText("Minutes");

        courseCodeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        courseCodeLabel.setText("Course Code");

        teacherNameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        teacherNameLabel.setText("Teacher");

        courseNameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        courseNameLabel.setText("Course Name");

        timeStartLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        timeStartLabel.setText("Time Start");

        endHourLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        endHourLabel.setText("Hour");

        timeEndLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        timeEndLabel.setText("Time End");

        endMinutesLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        endMinutesLabel.setText("Minutes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(schoolTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(studentRegisterLabel)
                                .addGap(59, 59, 59)))
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitInfoButton)
                        .addGap(18, 18, 18)
                        .addComponent(backButton)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teacherNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(teacherNameLabel)
                            .addComponent(courseCodeLabel)
                            .addComponent(courseCodeField))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseNameLabel)
                                    .addComponent(courseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeStartLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startHourChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(startHourLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startMinutesLabel)
                                            .addComponent(startMinutesChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeEndLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(endHourChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(endHourLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(endMinutesLabel)
                                            .addComponent(endMinutesChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(schoolTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentRegisterLabel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseCodeLabel)
                            .addComponent(courseNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(courseCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(teacherNameLabel)
                        .addGap(3, 3, 3)
                        .addComponent(teacherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeStartLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(startHourLabel)
                                    .addGap(3, 3, 3)
                                    .addComponent(startHourChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(timeEndLabel)
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(endHourLabel)
                                            .addGap(3, 3, 3)
                                            .addComponent(endHourChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(startMinutesLabel)
                                                .addGap(25, 25, 25))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(startMinutesChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(endMinutesLabel)
                                    .addGap(3, 3, 3)
                                    .addComponent(endMinutesChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitInfoButton)
                            .addComponent(backButton))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitInfoButtonActionPerformed
        String courseCode = courseCodeField.getText();
        String courseName = courseNameField.getText();
        String teacherName = teacherNameField.getText();
        
        int startHour = startHourChoice.getSelectedIndex();
        int startMinutes = startMinutesChoice.getSelectedIndex();
        int endHour = endHourChoice.getSelectedIndex();
        int endMinutes = endMinutesChoice.getSelectedIndex();
        
        if (courseCode.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Course Code cannot be blank.");
            return;
        }
        
        if (courseName.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Course Name cannot be blank.");
            return;
        }
        
        if (teacherName.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Teacher Name cannot be blank.");
            return;
        }
        
        DataHandler.Students.CreateSubjects(courseCode, courseName, teacherName, LocalTime.of(startHour, startMinutes), LocalTime.of(endHour, endMinutes));
        
        this.setVisible(false);
        new AdminUI().setVisible(true);
    }//GEN-LAST:event_submitInfoButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminUI().setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddCourse().setVisible(true);
            }
        });
    }
    
    public void initializeComboBoxTime(){
        for(int i = 0; i < 24; i++){
            startHourChoice.addItem(Integer.toString(i));
            endHourChoice.addItem(Integer.toString(i));
        }
        for(int i = 0; i < 61; i++){
            startMinutesChoice.addItem(Integer.toString(i));
            endMinutesChoice.addItem(Integer.toString(i));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField courseCodeField;
    private javax.swing.JLabel courseCodeLabel;
    private javax.swing.JTextField courseNameField;
    private javax.swing.JLabel courseNameLabel;
    private javax.swing.JComboBox<String> endHourChoice;
    private javax.swing.JLabel endHourLabel;
    private javax.swing.JComboBox<String> endMinutesChoice;
    private javax.swing.JLabel endMinutesLabel;
    private javax.swing.JLabel schoolTitle;
    private javax.swing.JComboBox<String> startHourChoice;
    private javax.swing.JLabel startHourLabel;
    private javax.swing.JComboBox<String> startMinutesChoice;
    private javax.swing.JLabel startMinutesLabel;
    private javax.swing.JLabel studentRegisterLabel;
    private javax.swing.JButton submitInfoButton;
    private javax.swing.JTextField teacherNameField;
    private javax.swing.JLabel teacherNameLabel;
    private javax.swing.JLabel timeEndLabel;
    private javax.swing.JLabel timeStartLabel;
    // End of variables declaration//GEN-END:variables
}
