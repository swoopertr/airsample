package com.project.airsample.airEgo.Interfaces;

import com.project.airsample.elifAir.enums.AdvantageProgram;

public interface IAdvangeProgram {
    AdvantageProgram advantageProgram = AdvantageProgram.NonAdvantage;

    public int counter();
}
