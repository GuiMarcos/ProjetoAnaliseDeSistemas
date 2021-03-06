/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.utfpr.projetoanalisedesistemas;

import javax.swing.JOptionPane;


public class OptionScreen extends Screen {

    /**
     * Creates new form OptionScreen
     */
    public OptionScreen() {
        super("optionScreen");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionScreen = new javax.swing.JPanel();
        p_nav = new javax.swing.JPanel();
        l_logo1 = new javax.swing.JLabel();
        p_options = new javax.swing.JPanel();
        btn_card = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_buyTqt = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1280, 800));

        optionScreen.setBackground(new java.awt.Color(255, 204, 0));
        optionScreen.setPreferredSize(new java.awt.Dimension(1280, 800));

        p_nav.setBackground(new java.awt.Color(247, 245, 245));

        l_logo1.setBackground(new java.awt.Color(247, 245, 245));
        l_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoutfpr.png"))); // NOI18N
        l_logo1.setOpaque(true);

        javax.swing.GroupLayout p_navLayout = new javax.swing.GroupLayout(p_nav);
        p_nav.setLayout(p_navLayout);
        p_navLayout.setHorizontalGroup(
            p_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_navLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(l_logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162))
        );
        p_navLayout.setVerticalGroup(
            p_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_navLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(l_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        p_options.setOpaque(false);

        btn_card.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_card.setText("C??RDAPIO DA SEMANA");
        btn_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_exit.setText("SAIR");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_buyTqt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_buyTqt.setText("COMPRAR TICKET");
        btn_buyTqt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyTqtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_optionsLayout = new javax.swing.GroupLayout(p_options);
        p_options.setLayout(p_optionsLayout);
        p_optionsLayout.setHorizontalGroup(
            p_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_optionsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(p_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_card, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buyTqt, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        p_optionsLayout.setVerticalGroup(
            p_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_optionsLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btn_card, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btn_buyTqt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout optionScreenLayout = new javax.swing.GroupLayout(optionScreen);
        optionScreen.setLayout(optionScreenLayout);
        optionScreenLayout.setHorizontalGroup(
            optionScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        optionScreenLayout.setVerticalGroup(
            optionScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(optionScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardActionPerformed
        Screen menuScreen = new MenuScreen();
        MainClass.switchScreen(menuScreen, menuScreen.getName());       
    }//GEN-LAST:event_btn_cardActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        Screen loginScreen = new LoginScreen();
        MainClass.switchScreen(loginScreen, loginScreen.getName());
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_buyTqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyTqtActionPerformed
        Screen purchaseScreen = new PurchaseScreen();
        MainClass.switchScreen(purchaseScreen, purchaseScreen.getName());
    }//GEN-LAST:event_btn_buyTqtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buyTqt;
    private javax.swing.JButton btn_card;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel l_logo1;
    private javax.swing.JPanel optionScreen;
    private javax.swing.JPanel p_nav;
    private javax.swing.JPanel p_options;
    // End of variables declaration//GEN-END:variables
}
