package company.entitiy;

import company.entitiy.base.Student;
import company.enumeration.Gender;

import java.time.LocalDate;

public class Postgraduate extends Student {
    private String supervisorName;
    private String researchTopic;

    public Postgraduate( String id, String fullName, String nationality, Gender gender, String faculty, LocalDate admissionYear, String supervisorName, String researchTopic) {
        super(id, fullName, nationality, gender, faculty, admissionYear);
        this.supervisorName = supervisorName;
        this.researchTopic = researchTopic;
    }


    public Postgraduate() {
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }
}
