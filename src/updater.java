/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Matias
 */
import frames.logs;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import packages.StringUtils;
import packages.RealPath;
import packages.Lua;
import packages.Config;
import packages.Console;
import packages.SourcePackage;
import packages.Envoriment;

import javax.swing.JOptionPane; // import javax packages

public class updater extends javax.swing.JFrame {

    /**
     * Creates new form hello
     */
    public updater() {
        initComponents();
        setIcon();
        setVariables(new Envoriment());
    }

    private Boolean Log = false;
    private final Lua lua = new Lua();
    private final RealPath path = new RealPath();
    private final logs logsPrivate = new logs();
    private final String[] PathsSelected = new String[]{"", ""};
    private StringBuilder LuaSelected = new StringBuilder("");
    private Object Variables;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Convert = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        LogBox = new javax.swing.JCheckBox();
        ExportFolder = new javax.swing.JButton();
        SourceFolder = new javax.swing.JButton();
        LuaFile = new javax.swing.JButton();
        GenConfig = new javax.swing.JCheckBox();
        VersionInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Naruto Updater JAVA");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Convert.setBackground(new java.awt.Color(255, 51, 102));
        Convert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Convert.setForeground(new java.awt.Color(255, 255, 255));
        Convert.setText("CONVERTER");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("1.0.2");

        LogBox.setText("Window Log");
        LogBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogBoxActionPerformed(evt);
            }
        });

        ExportFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Up-72x.png"))); // NOI18N
        ExportFolder.setText("Export Folder");
        ExportFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportFolderActionPerformed(evt);
            }
        });

        SourceFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Down-72x.png"))); // NOI18N
        SourceFolder.setText("Source Folder");
        SourceFolder.setToolTipText("");
        SourceFolder.setIconTextGap(5);
        SourceFolder.setInheritsPopupMenu(true);
        SourceFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceFolderActionPerformed(evt);
            }
        });

        LuaFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Others-72x.png"))); // NOI18N
        LuaFile.setText("OLD Lua");
        LuaFile.setToolTipText("");
        LuaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuaFileActionPerformed(evt);
            }
        });

        GenConfig.setText("GenConfig");
        GenConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenConfigActionPerformed(evt);
            }
        });

        VersionInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VersionInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VersionInputKeyPressed(evt);
            }
        });

        jLabel1.setText("Version");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GenConfig)
                                .addGap(18, 18, 18)
                                .addComponent(VersionInput)
                                .addGap(18, 18, 18)
                                .addComponent(LogBox))
                            .addComponent(SourceFolder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LuaFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExportFolder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 160, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 159, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SourceFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LuaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogBox)
                    .addComponent(GenConfig)
                    .addComponent(VersionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 265, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 266, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(333, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setVariables(Object Env) {
        Variables = Env;
    }

    private void actionsEffect(String type) {
        if ("disable".equals(type)) {
            Convert.setEnabled(false);
            SourceFolder.setEnabled(false);
            LuaFile.setEnabled(false);
            LuaFile.setEnabled(false);
            GenConfig.setEnabled(false);
            LogBox.setEnabled(false);
            VersionInput.setEnabled(false);
        } else {
            Convert.setEnabled(true);
            SourceFolder.setEnabled(true);
            LuaFile.setEnabled(true);
            LuaFile.setEnabled(true);
            GenConfig.setEnabled(true);
            LogBox.setEnabled(true);
            VersionInput.setEnabled(true);
        }
    }

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed

        String version = VersionInput.getText();
        String folderPathSource = PathsSelected[0];
        String folderPathExport = PathsSelected[1];

        if (version.equals("") || !StringUtils.isNumeric(version)) {
            JOptionPane.showMessageDialog(null, "Put a valid version");
            return;
        }

        if (folderPathSource.equals("")) {
            JOptionPane.showMessageDialog(null, "Put a valid path source");
            return;
        }

        if (folderPathExport.equals("")) {
            JOptionPane.showMessageDialog(null, "Put a valid path export");
            return;
        }

        //Path p1 = Paths.get(strPath);
        try {

            Boolean CheckedGen = GenConfig.isSelected();
            if (CheckedGen) {
                Config config = new Config();
                if (Log) {
                    config.Create(Integer.parseInt(version), folderPathExport, logsPrivate);
                }
            }
            //Console.log("XXXXX");

            JFrame frame = new JFrame();
            JOptionPane Quewstions = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Processing!", "Alert", JOptionPane.INFORMATION_MESSAGE);
            frame.setContentPane(Quewstions);
            frame.setVisible(true);

            actionsEffect("disable");
            Thread.sleep(3000);
            List<Object> FilesEffected = SourcePackage.Execute(folderPathSource, folderPathExport, version);

            int i = 0;
            for (Object affected : FilesEffected) {
                i++;
                if (Log) {
                    logsPrivate.setLog("[Effected]: " + affected.toString());
                }
                if (i == FilesEffected.size()) {
                    lua.createLuaAlone(folderPathExport, FilesEffected);
                    JOptionPane.showMessageDialog(null, "Done!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    if (Log) {
                        logsPrivate.setLog("[DONE]");
                        actionsEffect("enabled");
                    }

                }
            }

            //for(Object filex: FilesEffected){
            //    Console.log("Arquivo afetado:" + filex);
            //}
            // logs s = new logs();
            //s.setVisible(true);
            //logs.getTextAreaLog().append("asd");
            //SourcePackage.Convert(version, StringUtils.toPath(folderPathSource), ProgressBar, s);
            //} catch (IOException ex) {
            //Logger.getLogger(updater.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Console.log(ex);
        }

//      
//       
//     
//        ProgressBar.setStringPainted(true);
//        //for(int i = 0; i< 100; i++){
//        //    ProgressBar.setStringPainted(true);
//        //    ProgressBar.setValue(i);
//        //}
//        // TODO add your handling code here:

    }//GEN-LAST:event_ConvertActionPerformed

    private void LogBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogBoxActionPerformed
        Boolean Checked = LogBox.isSelected();
        Log = false;
        if (Checked && !Log) {
            Log = true;
            logsPrivate.setVisible(true);
        }
        if (!Checked) {
            Log = false;
            logsPrivate.setVisible(false);
            logsPrivate.dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_LogBoxActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //ImageIcon icon = new ImageIcon("res/Down-72x.png");
        //setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void GenConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenConfigActionPerformed

//      if(Checked){
//          Log = true;
//          
//          new logs().setVisible(true);
//      }else{
//          new logs().setVisible(false);
//      }
    }//GEN-LAST:event_GenConfigActionPerformed

    private void SourceFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceFolderActionPerformed
        SourceFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Down-72x.png")));
        SourceFolder.setText("Source Folder");
        PathsSelected[0] = "";
        String selected = path.get(this);

        if (!"Null".equals(selected)) {
            PathsSelected[0] = selected;

            /**
             * Setting log
             */
            if (Log) {
                logsPrivate.setLog("Source path selected : " + selected);
            }

            /**
             * Blokcing to the same paths
             */
            if (PathsSelected[1] != null && ExportFolder.getText().equals(selected)) {
                JOptionPane.showMessageDialog(null, "Directories cannot be the same!");
                return;
            }

            /**
             * Setting desgin
             */
            JOptionPane.showMessageDialog(null, "Selected directory: " + selected);
            SourceFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Folder-72x.png")));
            SourceFolder.setText("(" + selected.substring(0, 20) + "...)");

            //console.log(selected);
        } else {
            if (Log) {
                logsPrivate.setLog("Source path cancel");
            }
        }
    }//GEN-LAST:event_SourceFolderActionPerformed

    private void ExportFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportFolderActionPerformed
        ExportFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Down-72x.png")));
        ExportFolder.setText("Export Folder");
        PathsSelected[1] = "";

        String selected = path.get(this);

        if (!"Null".equals(selected)) {

            PathsSelected[1] = selected;

            /**
             * Setting log
             */
            if (Log) {
                logsPrivate.setLog("Export path selected : " + selected);
            }

            /**
             * Blokcing to the same paths
             */
            if (PathsSelected[0].equals(selected)) {
                JOptionPane.showMessageDialog(null, "Directories cannot be the same!");
                return;
            }

            /**
             * Setting desgin
             */
            JOptionPane.showMessageDialog(null, "Selected directory: " + selected);
            ExportFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Folder-72x.png")));
            ExportFolder.setText("(" + selected.substring(0, 20) + "...)");

            //console.log(selected);
        } else {
            if (Log) {
                logsPrivate.setLog("Export path cancel");
            }
        }
    }//GEN-LAST:event_ExportFolderActionPerformed

    private void LuaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuaFileActionPerformed
        // TODO add your handling code here:
        LuaFile.setText("OLD Lua");
        StringBuilder selected = null;
        try {
            selected = lua.selectFile(this);
            if (!"Null".equals(selected.toString())) {
                logsPrivate.setLog("Lua(C) File Selected: " + selected);
                LuaFile.setText("(" + selected.substring(0, 20) + "...)");
                LuaSelected = new StringBuilder(selected);
            } else {
                LuaFile.setText("OLD Lua");
                logsPrivate.setLog("Luac file cancel");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(updater.class.getName()).log(Level.SEVERE, null, ex);
        }

        //logsPrivate.setLog("Lua(C) File Selected: " + selected);
        //System.out.println(selected);
        //ConfigModel.check("asdasd");
    }//GEN-LAST:event_LuaFileActionPerformed

    private void VersionInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VersionInputKeyPressed
        // TODO add your handling code here:
        StringBuilder version = new StringBuilder().append(evt.getKeyChar());

        if (!StringUtils.isNumeric(version.toString())) {
            JOptionPane.showMessageDialog(null, "Numbers Only!");
            VersionInput.setText("");
            return;
        }

        /**
         * Setting log
         */
        if (Log) {
            logsPrivate.setLog("Version : " + version);
        }


    }//GEN-LAST:event_VersionInputKeyPressed

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
            java.util.logging.Logger.getLogger(updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new updater().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JButton ExportFolder;
    private javax.swing.JCheckBox GenConfig;
    private javax.swing.JCheckBox LogBox;
    private javax.swing.JButton LuaFile;
    private javax.swing.JButton SourceFolder;
    private javax.swing.JTextField VersionInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("res/icon.png")));
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
