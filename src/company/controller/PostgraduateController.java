package company.controller;

import company.entitiy.Postgraduate;
import company.entitiy.base.Student;

import java.util.Scanner;

import static company.container.ComponentContainer.*;

public class PostgraduateController {
    public void add() {
        Scanner scanner = new Scanner(System.in);
        Student student = STUDENT_CONTROLLER.start();

        System.out.print("Enter supervisorName: ");
        String supervisorName = scanner.nextLine();
        System.out.print("Enter researchTopic: ");
        String researchTopic = scanner.nextLine();

        if (POSTGRADUATE_SERVICE.add(student, supervisorName, researchTopic))
            System.out.println("Successful added !");
        else System.out.println("Error !");
    }

    public void remove() {
        System.out.print("Enter postgraduate ID: ");
        String id = scanner.next();
        if (POSTGRADUATE_SERVICE.remove(id))
            System.out.println("Successful deleted !");
        else System.out.println("Error !");
    }

    public void find() {
        System.out.print("Enter postgraduate ID: ");
        String id = scanner.next();
        Postgraduate postgraduate = POSTGRADUATE_SERVICE.find(id);
        System.out.println("FullName: " + postgraduate.getFullName() + "faculty: " + postgraduate.getFaculty() + " id:" + postgraduate.getId());
    }

    public void displayAll() {
        for (Postgraduate postgraduate : POSTGRADUATE_SERVICE.getList()) {
            System.out.println("FullName: " + postgraduate.getFullName() + " Faculty: " + postgraduate.getFaculty() + " ID:" + postgraduate.getId());
        }
    }

}
