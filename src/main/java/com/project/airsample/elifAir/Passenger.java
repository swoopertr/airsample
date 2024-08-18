package com.project.airsample.elifAir;


import com.project.airsample.elifAir.enums.Flytype;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Passenger extends ElifHuman implements IPassenger {

    private Flytype flytype;

    //constructor yazmamız gerekiyor
    public Passenger(){

        super();


    }

    //Constucter
    public Passenger(Flytype flytype, IAdvantageProgram advantageProgram) {
        this.flytype = flytype;
    }

    public Flytype getFlyType() {
        return flytype;
    }

    public void setFlyType(Flytype flytype) {
        this.flytype = flytype;
    }


    @Override
    public Passenger getById(int id) {
        //todo : get data from db by id;
        return new Passenger();
    }

    @Override
    public List<Passenger> getAll() {
        //todo : get data from db by id;
        return new ArrayList<>();
    }

    @Override
    public boolean insertPassenger(Passenger passenger) {
        //todo : insert data into db.
        return true;
    }

    @Override
    public boolean updatePassenger(Passenger passenger) {
        //todo : insert data db by passenger.
        return true;
    }

    @Override
    public boolean deletePassenger(int id) {
        //todo: delete data by id.

        // directly delete data from db.

        //1. get data
        //2. set prop deleted true
        //3. update data.

        return true;
    }
}


