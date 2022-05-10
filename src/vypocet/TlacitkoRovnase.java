/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vypocet;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JTextField;
import static jdk.nashorn.internal.objects.Global.eval;
import sun.font.Script;

/**
 *
 * @author Martin
 */
public class TlacitkoRovnase implements ITlacitko{
    
    @Override
    public void alg(JTextField text1, JTextField text2){
        String vel= text2.getText();
        if(vel.length() > 0){
            vel = text1.getText()+text2.getText();
            String tx1 = text1.getText();
            text1.setText(tx1);
            text2.setText("");
            
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            try {
                Object result = engine.eval(vel);
                text1.setText(result.toString());
            } catch (Exception e) {
                text1.setText("Error");
            }
        }
    }
}
