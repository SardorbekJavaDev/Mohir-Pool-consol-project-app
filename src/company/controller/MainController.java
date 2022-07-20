package company.controller;

import static company.container.ComponentContainer.*;
import static company.util.Util.getAction;

public class MainController {

    public void add() {
        UTIL.showStudentType();
        switch (getAction()) {
            case "1" -> {
                System.out.println("*** Add Undergraduate ***");
                UNDERGRADUATE_CONTROLLER.add();
            }
            case "2" -> {
                System.out.println("*** Add Postgraduate ***");
                POSTGRADUATE_CONTROLLER.add();
            }
            case "0" -> {
                System.out.println("*** Back ***");
            }
        }
    }

    public void remove() {
        UTIL.showStudentType();
        switch (getAction()) {
            case "1" -> {
                System.out.println("*** Remove Undergraduate ***");
                UNDERGRADUATE_CONTROLLER.remove();
            }
            case "2" -> {
                System.out.println("*** Remove Postgraduate ***");
                POSTGRADUATE_CONTROLLER.remove();
            }
            case "0" -> {
                System.out.println("*** Back ***");
            }
        }
    }

    public void find() {
        UTIL.showStudentType();
        switch (getAction()) {
            case "1" -> {
                System.out.println("*** Find Undergraduate ***");
                UNDERGRADUATE_CONTROLLER.find();
            }
            case "2" -> {
                System.out.println("*** Find Postgraduate ***");
                POSTGRADUATE_CONTROLLER.find();
            }
            case "0" -> {
                System.out.println("*** Back ***");
            }
        }
    }

    public void displayAll() {
        UTIL.showStudentType();
        switch (getAction()) {
            case "1" -> {
                System.out.println("*** Display All Undergraduate ***");
                UNDERGRADUATE_CONTROLLER.displayAll();
            }
            case "2" -> {
                System.out.println("*** Display All Postgraduate ***");
                POSTGRADUATE_CONTROLLER.displayAll();
            }
            case "0" -> {
                System.out.println("*** Back ***");
            }
        }

    }
}
