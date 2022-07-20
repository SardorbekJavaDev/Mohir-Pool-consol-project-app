package company.container;

import company.controller.MainController;
import company.controller.PostgraduateController;
import company.controller.StudentController;
import company.controller.UndergraduateController;
import company.repo.DataBase;
import company.service.PostgraduateService;
import company.service.StudentService;
import company.service.UndergraduateService;
import company.util.Util;

import java.util.Scanner;

public interface ComponentContainer {
    Scanner scanner = new Scanner(System.in);
    Util UTIL = new Util();
    DataBase DATA_BASE = new DataBase();
    PostgraduateController POSTGRADUATE_CONTROLLER = new PostgraduateController();
    UndergraduateController UNDERGRADUATE_CONTROLLER = new UndergraduateController();
    StudentController STUDENT_CONTROLLER = new StudentController();

    PostgraduateService POSTGRADUATE_SERVICE = new PostgraduateService();
    UndergraduateService UNDERGRADUATE_SERVICE = new UndergraduateService();
    StudentService STUDENT_SERVICE = new StudentService();
    MainController MAIN_CONTROLLER = new MainController();


}
