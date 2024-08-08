package com.project.airsample.elifAir;


import com.project.airsample.elifAir.enums.Flytype;

public class Passengers {
    private Flytype flytype;
    private IAdvantageProgram advantageProgram;

    //Constucter
    public Passengers(Flytype flytype, IAdvantageProgram advantageProgram) {
        this.flytype = flytype;
        this.advantageProgram = advantageProgram;
    }


    public Flytype getFlyType() {
        return flytype;
    }

    public void setFlyType(Flytype flytype) {
        this.flytype = flytype;
    }

    public IAdvantageProgram getAdvantageProgram() {
        return advantageProgram;
    }

    public void setAdvantageProgram(IAdvantageProgram advantageProgram) {
        this.advantageProgram = advantageProgram;
    }

}


