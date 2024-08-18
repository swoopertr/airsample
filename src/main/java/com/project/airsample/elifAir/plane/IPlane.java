package com.project.airsample.elifAir.plane;

public interface IPlane {
    Plane getById(int id);

    boolean insertDb(Plane plane);

    boolean updateDb(Plane plane);

    Plane deleteDb(int id);
}
