package company.controller;

import company.entitiy.Undergraduate;
import company.entitiy.base.Student;

import java.util.Scanner;

import static company.container.ComponentContainer.*;

public class UndergraduateController {
    public void add() {
        Scanner scanner = new Scanner(System.in);
        Student student = STUDENT_CONTROLLER.start();

        System.out.print("Enter residentialHall: ");
        String residentialHall = scanner.nextLine();

        if (UNDERGRADUATE_SERVICE.add(student, residentialHall))
            System.out.println("Successful added !");
        else System.out.println("Error !");
    }

    public void remove() {
        System.out.print("Enter undergraduate ID: ");
        String id = scanner.next();
        if (UNDERGRADUATE_SERVICE.remove(id))
            System.out.println("Successful deleted !");
        else System.out.println("Error !");
    }

    public void find() {
        System.out.print("Enter undergraduate ID: ");
        String id = scanner.next();
        Undergraduate undergraduate = UNDERGRADUATE_SERVICE.find(id);
        System.out.println("FullName: " + undergraduate.getFullName() + "faculty: " + undergraduate.getFaculty() + " id:" + undergraduate.getId());
    }

    public void displayAll() {
        for (Undergraduate undergraduate : UNDERGRADUATE_SERVICE.getList()) {
            System.out.println("FullName: " + undergraduate.getFullName() + " Faculty: " + undergraduate.getFaculty() + " ID:" + undergraduate.getId());
        }
    }
}
