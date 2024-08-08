package com.project.airsample.sinanAir.personnel;

import com.project.airsample.sinanAir.base.Human;
import com.project.airsample.sinanAir.enums.Profession;

public class Personnel extends Human {
    private Profession profession;

    public  Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}
