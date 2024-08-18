package com.project.airsample.nebiAir.personnel;

import com.project.airsample.nebiAir.base.Human;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("nebiPersonnel")
public class Personnel extends Human {
    private String employeeId;
    private String department;
    private static List<Personnel> personnelList = new ArrayList<>();


    public Personnel() {
        this.employeeId = "Unknown Employee ID";
        this.department = "Unknown Department";
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Static methods to manage the personnel list
    public static List<Personnel> getAllPersonnels() {
        return personnelList;
    }

    public static Personnel getById(int id) {
        return personnelList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static boolean addPersonnel(Personnel newPersonnel) {
        return personnelList.add(newPersonnel);
    }

    public static boolean updatePersonnel(Personnel updatedPersonnel) {
        for (int i = 0; i < personnelList.size(); i++) {
            if (personnelList.get(i).getId() == updatedPersonnel.getId()) {
                personnelList.set(i, updatedPersonnel);
                return true;
            }
        }
        return false;
    }

    public static boolean removePersonnel(int id) {
        return personnelList.removeIf(p -> p.getId() == id);
    }

    // Assuming the use of hashCode as a temporary ID
    public int getId() {
        return this.hashCode();
    }
}
