package company.entitiy.base;

import company.entitiy.info.AdditionalInfo;
import company.enumeration.Gender;

import java.time.LocalDate;

public class Student extends AdditionalInfo {
    private String fullName;
    private String nationality;
    private Gender gender;
    private String faculty;
    private LocalDate admissionYear;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(LocalDate admissionYear) {
        this.admissionYear = admissionYear;
    }

    public Student(String id, String fullName, String nationality, Gender gender, String faculty, LocalDate admissionYear) {
        super(id);
        this.fullName = fullName;
        this.nationality = nationality;
        this.gender = gender;
        this.faculty = faculty;
        this.admissionYear = admissionYear;
    }

    public Student( String fullName, String nationality, Gender gender, String faculty, LocalDate admissionYear) {
        this.fullName = fullName;
        this.nationality = nationality;
        this.gender = gender;
        this.faculty = faculty;
        this.admissionYear = admissionYear;
    }



    public Student() {
    }
}
