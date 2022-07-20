package company.controller;

import company.entitiy.base.Student;
import company.enumeration.Gender;
import company.util.Faculty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static company.container.ComponentContainer.DATA_BASE;
import static company.container.ComponentContainer.STUDENT_SERVICE;
import static company.enumeration.Gender.FEMALE;
import static company.enumeration.Gender.MALE;
import static company.util.Util.getAction;

public class StudentController {
    public Student start() {
        Scanner scanner = new Scanner(System.in);

        String fullName = null;
        while (fullName == null) {
            System.out.print("Enter fullName: ");
            fullName = scanner.nextLine();
            try {
                STUDENT_SERVICE.checkStudent(fullName);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                fullName = null;
            }
        }

        System.out.print("Enter nationality: ");
        String nationality = scanner.nextLine();
        System.out.println("*Faculties*");
        int i = 0;
        ArrayList<Faculty> temp = new ArrayList<>();
        for (Faculty f : DATA_BASE.facultyDB) {
                temp.add(f);
                System.out.println(++i + ". " + f.getName());
        }
        System.out.print("Choice faculty: ");
        int index = scanner.nextInt();
        String faculty = null;
        while (faculty == null) {
            try {
                faculty = temp.get(index - 1).getName();
            } catch (RuntimeException e) {
                System.out.println("Non-existent faculty !");
            }
        }

        System.out.println("Choice gender: ");
        System.out.println("1. Male ");
        System.out.println("2. Female ");

        Gender gender = null;
        while (gender == null) {
            switch (getAction()) {
                case "1" -> {
                    gender = MALE;
                }
                case "2" -> {
                    gender = FEMALE;
                }
            }
            if (gender == null) System.out.println("re-Select");
        }
        System.out.println("Choice gender: " + gender);

        LocalDate admissionYear = null;
        while (admissionYear == null) {
            System.out.print("`15-12-2020` Enter admissionYear: ");
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = scanner.next();
                //convert String to LocalDate
                admissionYear = LocalDate.parse(date, formatter);
            } catch (RuntimeException e) {
                System.out.println("Data format error !");
            }
        }
        return new Student(fullName, nationality, gender, faculty, admissionYear);
    }


}
