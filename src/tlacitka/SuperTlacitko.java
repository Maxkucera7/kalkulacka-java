/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlacitka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import vypocet.ITlacitko;

/**
 *
 * @author Martin
 */
public class SuperTlacitko extends JButton {
    //vlastnosti
    ITlacitko strategy;
    
    
    //konstruktor
    public SuperTlacitko(ITlacitko strategy, String nazev, int key, final JTextField text1, final JTextField text2){
        super();
        this.strategy=strategy;
        this.setText(nazev);
        
       
                
        //udalost na stisk tlacitka
        ActionListener mujListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                strategy.alg(text1, text2);
                }catch(NumberFormatException e){
                    //dvakrat stiknuto
                }
            }
        };
        this.addActionListener(mujListener);
        this.registerKeyboardAction(mujListener, KeyStroke.getKeyStroke(key, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.setFont(new java.awt.Font("Tahoma",1,11));
        this.setBackground(new java.awt.Color(204,255,204));
    }
    
    public SuperTlacitko(){
       
    }
            
}
