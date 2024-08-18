package com.project.airsample.nebiAir.bussines;

import com.project.airsample.nebiAir.interfaces.IPersonnelBussines;
import com.project.airsample.nebiAir.manager.PassangerManager;

public class PersonnelBussines extends PassangerManager implements IPersonnelBussines {
    @Override
    public boolean getPassengerByLogic(int id, String city) {
        // todo: logiğini ekleyeceksin buraya sayfada spesifik bir ihtiyaç doğarsa burada o detayı çekebilirsin mesela
        //belli bir yaş gurubunun belli bir bögeye uçuş sıklığı gibi.
        return true;
    }

    @Override
    public boolean getPassengerByLogic1(int id, String city) {
        return true;
    }

    @Override
    public boolean getPassengerByLogic2(int id, String city) {
        return true;
    }
}
