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
public class TlacitkoOsm implements ITlacitko{
    
    @Override
    public void alg(JTextField text1, JTextField text2){
        text2.setText(text2.getText()+"8");
    }
}
