package company.entitiy;

import company.entitiy.base.Student;
import company.enumeration.Gender;

import java.time.LocalDate;

public class Undergraduate extends Student {
    private String residentialHall;

    public String getResidentialHall() {
        return residentialHall;
    }

    public void setResidentialHall(String residentialHall) {
        this.residentialHall = residentialHall;
    }

    public Undergraduate( String id, String fullName, String nationality, Gender gender, String faculty, LocalDate admissionYear, String residentialHall) {
        super( id, fullName, nationality, gender, faculty, admissionYear);
        this.residentialHall = residentialHall;
    }

    public Undergraduate() {
    }
}
