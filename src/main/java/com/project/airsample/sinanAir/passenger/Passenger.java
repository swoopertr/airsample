package com.project.airsample.sinanAir.passenger;

import com.project.airsample.sinanAir.base.Human;
import com.project.airsample.sinanAir.enums.Flytpe;

public class Passenger extends Human {
    private Flytpe flytpe;

    public Flytpe getFlytpe() {
        return flytpe;
    }

    public void setFlytpe(Flytpe flytpe) {
        this.flytpe = flytpe;
    }
}
