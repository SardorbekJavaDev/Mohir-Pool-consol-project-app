package company.util;

import company.container.ComponentContainer;
import company.entitiy.Postgraduate;
import company.entitiy.Undergraduate;

import java.time.LocalDate;

import static company.container.ComponentContainer.*;
import static company.enumeration.Gender.FEMALE;
import static company.enumeration.Gender.MALE;

public class Util {
    public void showMenu() {

        System.out.println("*** Menu ***");
        System.out.println("1. Add ");
        System.out.println("2. Remove ");
        System.out.println("3. Find ");
        System.out.println("4. Display All ");
        System.out.println("5. Exit ");

    }

    public void showStudentType() {

        System.out.println("1. Undergraduate ");
        System.out.println("2. Postgraduate ");
        System.out.println("0. Back ");

    }

    public static String getAction() {

        System.out.print("Enter Your Action _ ");
        return ComponentContainer.scanner.next();

    }

    public void InitialValues() {

        DATA_BASE.undergraduateDB.add(new Undergraduate("dc5sv5v5d", "Yorqulov Sardorbek", "Uzbek", MALE, "Cyber Security", LocalDate.now(), "Laboratory"));
        DATA_BASE.undergraduateDB.add(new Undergraduate("qsdwrvbeb", "Saida Karimova", "Uzbek", FEMALE, "Computer Engineering", LocalDate.now(), "Event Hall"));

        DATA_BASE.postgraduateDB.add(new Postgraduate("svbvbsv2", "Saidolim Jabborov", "Uzbek", MALE, "Data Analytics", LocalDate.now(), "Saidkarim Olimov", "Marketing analytics"));
        DATA_BASE.postgraduateDB.add(new Postgraduate("sbfb5svb", "Dilmurod To'raqulov", "Uzbek", MALE, "Data Analytics", LocalDate.now(), "Murodjon Azizov", "Television technology"));

        DATA_BASE.facultyDB.add(new Faculty("Cyber Security"));
        DATA_BASE.facultyDB.add(new Faculty("Data Analytics"));
        DATA_BASE.facultyDB.add(new Faculty("Computer Engineering"));
        DATA_BASE.facultyDB.add(new Faculty("Television technology"));

    }

}
