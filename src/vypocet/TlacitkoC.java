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
public class TlacitkoC implements ITlacitko{
    
    @Override
    public void alg(JTextField text1, JTextField text2){
        text1.setText("");
        text2.setText("");
    }
}
