package company.service;

import company.entitiy.Postgraduate;
import company.entitiy.Undergraduate;
import company.entitiy.base.Student;
import company.exp.AlreadyExistsException;
import company.exp.FullNameNotValidException;

import java.time.LocalDateTime;
import java.util.UUID;

import static company.container.ComponentContainer.DATA_BASE;

public class StudentService {
    public Postgraduate toPostgraduate(Student student) {
        Postgraduate postgraduate = new Postgraduate();
        postgraduate.setCreatedDate(LocalDateTime.now());
        postgraduate.setFullName(student.getFullName());
        postgraduate.setFaculty(student.getFaculty());
        postgraduate.setAdmissionYear(student.getAdmissionYear());
        postgraduate.setGender(student.getGender());
        postgraduate.setNationality(student.getNationality());
        postgraduate.setId(UUID.randomUUID().toString());
        postgraduate.setCreatedDate(LocalDateTime.now());
        return postgraduate;
    }

    public Undergraduate toUndergraduate(Student student) {
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.setCreatedDate(LocalDateTime.now());
        undergraduate.setFullName(student.getFullName());
        undergraduate.setFaculty(student.getFaculty());
        undergraduate.setAdmissionYear(student.getAdmissionYear());
        undergraduate.setGender(student.getGender());
        undergraduate.setNationality(student.getNationality());
        undergraduate.setId(UUID.randomUUID().toString());
        undergraduate.setCreatedDate(LocalDateTime.now());
        return undergraduate;
    }

    public void checkStudent(String fullName) {
        if (!fullName.contains(" ") && fullName.length() < 5)
            throw new FullNameNotValidException("Full name not valid !");

        for (Postgraduate postgraduate : DATA_BASE.postgraduateDB) {
            if (postgraduate.getFullName().equals(fullName)) {
                throw new AlreadyExistsException("This student already register !");
            }
        }
    }
}
