/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package flds6.aluno.ifnmg.cordeirinho;

import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filipe
 */
public class Cordeirinho 
    implements IPlayer{

    @Override
    public String getDeveloperName() {
        return "Filipe Santos";
    }

    @Override
    public String getEngineName() {
        return "Cordeirinho";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        if(opponentPreviousMove == Decision.COOPERATE)
            return Decision.DEFECT;
        try {
            return SecureRandom.getInstanceStrong()
                .nextBoolean() ? Decision.COOPERATE : Decision.DEFECT;
        }catch(NoSuchAlgorithmException ex){
            Logger.getLogger(Cordeirinho.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return Decision.NONE;
    }
    

}
