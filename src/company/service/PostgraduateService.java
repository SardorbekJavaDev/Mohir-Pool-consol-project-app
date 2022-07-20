package company.service;

import company.entitiy.Postgraduate;
import company.entitiy.base.Student;

import java.util.ArrayList;

import static company.container.ComponentContainer.DATA_BASE;
import static company.container.ComponentContainer.STUDENT_SERVICE;

public class PostgraduateService {

    public Boolean add(Student student, String supervisorName, String researchTopic) {
        Postgraduate postgraduate = STUDENT_SERVICE.toPostgraduate(student);
        postgraduate.setSupervisorName(supervisorName);
        postgraduate.setResearchTopic(researchTopic);
        return DATA_BASE.postgraduateDB.add(postgraduate);
    }

    public boolean remove(String id) {
        Postgraduate postgraduate = getByID(id);
        if (postgraduate == null) {
            System.out.println("Not found !");
        }
        return DATA_BASE.postgraduateDB.remove(postgraduate);
    }

    public Postgraduate find(String id) {
        Postgraduate postgraduate = getByID(id);
        if (postgraduate == null) {
            System.out.println("Not found !");
        }
        return postgraduate;
    }

    private Postgraduate getByID(String id) {
        for (Postgraduate postgraduate : DATA_BASE.postgraduateDB) {
            if (postgraduate.getId().equals(id)) {
                return postgraduate;
            }
        }
        return null;
    }

    public ArrayList<Postgraduate> getList() {
        return DATA_BASE.postgraduateDB;
    }
}
