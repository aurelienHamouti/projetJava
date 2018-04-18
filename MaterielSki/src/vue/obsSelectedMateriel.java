/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.util.Observable;
import java.util.Observer;
import metier.Action;
import java.awt.Label;
import java.awt.List;

/**
 *
 * @author Aurélien
 */
public class obsSelectedMateriel implements Observer {
    List lstMateriel;
    Label lblNb;
    
    public obsSelectedMateriel(List lstMateriel, Label lblNb){
        this.lstMateriel = lstMateriel;
        this.lblNb = lblNb;
    }
    
    public void update (Observable o, Object arg) {
        switch (((Action)arg).getAction()) {   
            case Action.SEL: 
                int nbSelected = (lstMateriel.getSelectedIndexes()).length;
                lblNb.setText(Integer.toString(nbSelected));
                break; 
        }
    }
}
