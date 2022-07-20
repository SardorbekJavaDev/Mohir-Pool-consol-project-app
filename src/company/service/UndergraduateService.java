package company.service;

import company.entitiy.Undergraduate;
import company.entitiy.base.Student;

import java.util.ArrayList;

import static company.container.ComponentContainer.DATA_BASE;
import static company.container.ComponentContainer.STUDENT_SERVICE;

public class UndergraduateService {
    public Boolean add(Student student, String residentialHall) {
        Undergraduate undergraduate = STUDENT_SERVICE.toUndergraduate(student);
        undergraduate.setResidentialHall(residentialHall);
        return DATA_BASE.undergraduateDB.add(undergraduate);
    }

    public boolean remove(String id) {
        Undergraduate undergraduate = getByID(id);
        if (undergraduate == null) {
            System.out.println("Not found !");
        }
        return DATA_BASE.undergraduateDB.remove(undergraduate);
    }

    public Undergraduate find(String id) {
        Undergraduate undergraduate = getByID(id);
        if (undergraduate == null) {
            System.out.println("Not found !");
        }
        return undergraduate;
    }

    private Undergraduate getByID(String id) {
        for (Undergraduate undergraduate : DATA_BASE.undergraduateDB) {
            if (undergraduate.getId().equals(id)) {
                return undergraduate;
            }
        }
        return null;
    }

    public ArrayList<Undergraduate> getList() {
        return DATA_BASE.undergraduateDB;
    }
}
