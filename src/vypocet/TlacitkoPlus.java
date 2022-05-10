/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vypocet;

import javax.swing.JTextField;

/**
 *
 * @author Martin
 */
public class TlacitkoPlus implements ITlacitko{
    
    @Override
    public void alg(JTextField text1, JTextField text2){
        if(text2.getText().length() > 0){
        String tl = text1.getText()+text2.getText()+"+";
        text1.setText(tl);
        text2.setText("");
        }
    }
}
