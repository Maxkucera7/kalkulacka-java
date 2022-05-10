/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okna;

import java.awt.event.KeyEvent;
import vypocet.TlacitkoAns;
import vypocet.TlacitkoC;
import vypocet.TlacitkoCe;
import vypocet.TlacitkoCtyri;
import vypocet.TlacitkoDeleni;
import vypocet.TlacitkoDevet;
import vypocet.TlacitkoDva;
import vypocet.TlacitkoJedna;
import vypocet.TlacitkoLevaZavorka;
import vypocet.TlacitkoMinus;
import vypocet.TlacitkoNasobeni;
import vypocet.TlacitkoNula;
import vypocet.TlacitkoOsm;
import vypocet.TlacitkoPet;
import vypocet.TlacitkoPlus;
import vypocet.TlacitkoPlusMinus;
import vypocet.TlacitkoPravaZavorka;
import vypocet.TlacitkoRovnase;
import vypocet.TlacitkoSedm;
import vypocet.TlacitkoSest;
import vypocet.TlacitkoSipka;
import vypocet.TlacitkoTecka;
import vypocet.TlacitkoTri;


public class NewJFrame extends javax.swing.JFrame {
    
    
    public NewJFrame() {
        initComponents();
           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        Tlacitko1 = new tlacitka.SuperTlacitko(new TlacitkoJedna(),"1",KeyEvent.VK_1, jTextField1, jTextField2);
        Tlacitko2 = new tlacitka.SuperTlacitko(new TlacitkoDva(),"2", KeyEvent.VK_2, jTextField1, jTextField2);
        Tlacitko3 = new tlacitka.SuperTlacitko(new TlacitkoTri(),"3", KeyEvent.VK_3, jTextField1, jTextField2);
        Tlacitko4 = new tlacitka.SuperTlacitko(new TlacitkoCtyri(),"4",KeyEvent.VK_4, jTextField1, jTextField2);
        Tlacitko5 = new tlacitka.SuperTlacitko(new TlacitkoPet(),"5",KeyEvent.VK_5, jTextField1, jTextField2);
        Tlacitko6 = new tlacitka.SuperTlacitko(new TlacitkoSest(),"6",KeyEvent.VK_6, jTextField1, jTextField2);
        Tlacitko7 = new tlacitka.SuperTlacitko(new TlacitkoSedm(),"7",KeyEvent.VK_7, jTextField1, jTextField2);
        Tlacitko8 = new tlacitka.SuperTlacitko(new TlacitkoOsm(),"8",KeyEvent.VK_8, jTextField1, jTextField2);
        Tlacitko9 = new tlacitka.SuperTlacitko(new TlacitkoDevet(),"9",KeyEvent.VK_9, jTextField1, jTextField2);
        C = new tlacitka.SuperTlacitko(new TlacitkoC(),"C",KeyEvent.VK_1, jTextField1, jTextField2);
        CE = new tlacitka.SuperTlacitko(new TlacitkoCe(),"CE",KeyEvent.VK_DELETE, jTextField1, jTextField2);
        Arrow = new tlacitka.SuperTlacitko(new TlacitkoSipka(),"<--",KeyEvent.VK_1, jTextField1, jTextField2);
        Plus = new tlacitka.SuperTlacitko(new TlacitkoPlus(),"+",KeyEvent.VK_PLUS, jTextField1, jTextField2);
        Minus = new tlacitka.SuperTlacitko(new TlacitkoMinus(),"-",KeyEvent.VK_MINUS, jTextField1, jTextField2);
        Nasobeni = new tlacitka.SuperTlacitko(new TlacitkoNasobeni(),"*",KeyEvent.VK_MULTIPLY, jTextField1, jTextField2);
        Deleni = new tlacitka.SuperTlacitko(new TlacitkoDeleni(),"/",KeyEvent.VK_DIVIDE, jTextField1, jTextField2);
        Tlacitko0 = new tlacitka.SuperTlacitko(new TlacitkoNula(),"0",KeyEvent.VK_0, jTextField1, jTextField2);
        LevaZavorka = new tlacitka.SuperTlacitko(new TlacitkoLevaZavorka(),"(",KeyEvent.VK_BRACELEFT, jTextField1, jTextField2);
        superTlacitko19 = new tlacitka.SuperTlacitko(new TlacitkoTecka(),".",KeyEvent.VK_DECIMAL, jTextField1, jTextField2);
        PravaZavorka = new tlacitka.SuperTlacitko(new TlacitkoPravaZavorka(),"(",KeyEvent.VK_BRACERIGHT, jTextField1, jTextField2);
        Rovnase = new tlacitka.SuperTlacitko(new TlacitkoRovnase(),"=",KeyEvent.VK_EQUALS, jTextField1, jTextField2);
        superTlacitko22 = new tlacitka.SuperTlacitko(new TlacitkoPlusMinus(),"+/-",KeyEvent.VK_MINUS, jTextField1, jTextField2);
        ANS = new tlacitka.SuperTlacitko(new TlacitkoAns(),"ANS",KeyEvent.VK_1, jTextField1, jTextField2);
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tlacitko1.setText("1");

        Tlacitko2.setText("2");

        Tlacitko3.setText("3");

        Tlacitko4.setText("4");

        Tlacitko5.setText("5");

        Tlacitko6.setText("6");

        Tlacitko7.setText("7");

        Tlacitko8.setText("8");

        Tlacitko9.setText("9");

        C.setText("C");

        CE.setText("CE");

        Arrow.setText("<--");

        Plus.setText("+");

        Minus.setText("-");

        Nasobeni.setText("*");

        Deleni.setText("/");

        Tlacitko0.setText("0");

        LevaZavorka.setText("(");

        superTlacitko19.setText(".");

        PravaZavorka.setText(")");

        Rovnase.setText("=");

        superTlacitko22.setText("+/-");

        ANS.setText("ANS");

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tlacitko1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tlacitko4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tlacitko7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tlacitko0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LevaZavorka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Tlacitko5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Tlacitko6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Tlacitko2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Tlacitko3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Tlacitko8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Tlacitko9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(superTlacitko19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(superTlacitko22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Deleni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nasobeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PravaZavorka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rovnase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Arrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ANS, Arrow, C, CE, Deleni, LevaZavorka, Minus, Nasobeni, Plus, PravaZavorka, Tlacitko0, Tlacitko1, Tlacitko2, Tlacitko3, Tlacitko4, Tlacitko5, Tlacitko6, Tlacitko7, Tlacitko8, Tlacitko9, superTlacitko19, superTlacitko22});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Arrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nasobeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deleni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlacitko0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superTlacitko19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superTlacitko22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LevaZavorka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PravaZavorka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rovnase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ANS, Arrow, C, CE, Deleni, LevaZavorka, Minus, Nasobeni, Plus, PravaZavorka, Tlacitko0, Tlacitko1, Tlacitko2, Tlacitko3, Tlacitko4, Tlacitko5, Tlacitko6, Tlacitko7, Tlacitko8, Tlacitko9, superTlacitko19, superTlacitko22});

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tlacitka.SuperTlacitko ANS;
    private tlacitka.SuperTlacitko Arrow;
    private tlacitka.SuperTlacitko C;
    private tlacitka.SuperTlacitko CE;
    private tlacitka.SuperTlacitko Deleni;
    private tlacitka.SuperTlacitko LevaZavorka;
    private tlacitka.SuperTlacitko Minus;
    private tlacitka.SuperTlacitko Nasobeni;
    private tlacitka.SuperTlacitko Plus;
    private tlacitka.SuperTlacitko PravaZavorka;
    private tlacitka.SuperTlacitko Rovnase;
    private tlacitka.SuperTlacitko Tlacitko0;
    private tlacitka.SuperTlacitko Tlacitko1;
    private tlacitka.SuperTlacitko Tlacitko2;
    private tlacitka.SuperTlacitko Tlacitko3;
    private tlacitka.SuperTlacitko Tlacitko4;
    private tlacitka.SuperTlacitko Tlacitko5;
    private tlacitka.SuperTlacitko Tlacitko6;
    private tlacitka.SuperTlacitko Tlacitko7;
    private tlacitka.SuperTlacitko Tlacitko8;
    private tlacitka.SuperTlacitko Tlacitko9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private tlacitka.SuperTlacitko superTlacitko19;
    private tlacitka.SuperTlacitko superTlacitko22;
    // End of variables declaration//GEN-END:variables
}
