package com.company.KateSamokhvalova.java.Alexander.patternCommand;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    private List<Kick> kickList;

    public Combo(List<Kick> kickList){
        this.kickList = kickList;
    }
    public Combo(){
        this.kickList = new ArrayList<>();
    }
    public void addKick(Kick kick){
        this.kickList.add(kick);
    }
    public List<Kick> getKickList(){
        return kickList;
    }
}
