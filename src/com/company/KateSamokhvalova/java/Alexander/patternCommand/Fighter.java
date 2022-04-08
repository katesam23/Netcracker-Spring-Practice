package com.company.KateSamokhvalova.java.Alexander.patternCommand;

public class Fighter {

    public void doCombo(Combo combo){
        for (Kick kick : combo.getKickList()) {
            kick.kick();

        }
    }
}
