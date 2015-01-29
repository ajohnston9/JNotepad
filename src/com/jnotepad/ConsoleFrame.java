/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jnotepad;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author anthony
 */
public class ConsoleFrame extends javax.swing.JFrame {
    
    JavaNotepad notepad;

    /**
     * Creates new form ConsoleFrame
     */
    public ConsoleFrame() {
        initComponents();
    }
    
    public ConsoleFrame(JavaNotepad notepad){
        this.setType(Type.UTILITY);
        initComponents();
        this.notepad = notepad;
        this.setResizable(false);
        setIcons();
    }
    
    private void setIcons(){
        ArrayList<Image> iconList = new ArrayList<>();
        iconList.add(new ImageIcon("res/icons/jn16.png").getImage());
        iconList.add(new ImageIcon("res/icons/jn32.png").getImage());
        iconList.add(new ImageIcon("res/icons/jn64.png").getImage());
        iconList.add(new ImageIcon("res/icons/jn128.png").getImage());
        iconList.add(new ImageIcon("res/icons/jn256.png").getImage());
        this.setIconImages(iconList);
    }
    
    public void appendToConsole(String s){
        consoleArea.append(s+"\n");
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        consoleArea = new javax.swing.JTextArea();

        setTitle("Console");

        consoleArea.setEditable(false);
        consoleArea.setColumns(20);
        consoleArea.setRows(5);
        consoleArea.setFocusable(false);
        jScrollPane1.setViewportView(consoleArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea consoleArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
