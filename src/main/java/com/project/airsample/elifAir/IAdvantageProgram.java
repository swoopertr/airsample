package com.project.airsample.elifAir;


import com.project.airsample.elifAir.enums.AdvantageProgram;

import static com.project.airsample.elifAir.enums.AdvantageProgram.NonAdvantage;

public interface IAdvantageProgram {

    AdvantageProgram advantageProgram = NonAdvantage;

    public default int counter() {
        return 0;
    }
}
