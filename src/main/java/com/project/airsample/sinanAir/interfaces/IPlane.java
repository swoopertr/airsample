package com.project.airsample.sinanAir.interfaces;

import com.project.airsample.sinanAir.planes.Plane;

import java.util.List;

public interface IPlane {
    public Plane getPlaneById(int planeId);
    public List<Plane> getAllPlanes();
    public boolean addPlane(Plane plane);
    public boolean updatePlane(Plane plane);
    public boolean deletePlane(int planeId);
}
