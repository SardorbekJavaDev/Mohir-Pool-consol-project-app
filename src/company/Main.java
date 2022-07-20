package company;

import static company.container.ComponentContainer.*;
import static company.util.Util.getAction;

public class Main {

    // Odatda console projectlar qilishni yaxshi ko'raman darslarim ko'proqligi uchun projectni
    // Alloh qodir qilganicha yaxshi qilishga harakat qildim...

    public static void main(String[] args) {

        UTIL.InitialValues();

        while (true) {
            UTIL.showMenu();
            try {
                switch (getAction()) {
                    case "1" -> {
                        System.out.println("*** Add ***");
                        MAIN_CONTROLLER.add();
                    }
                    case "2" -> {
                        System.out.println("*** Remove ***");
                        MAIN_CONTROLLER.remove();
                    }
                    case "3" -> {
                        System.out.println("*** Find ***");
                        MAIN_CONTROLLER.find();
                    }
                    case "4" -> {
                        System.out.println("*** Display All ***");
                        MAIN_CONTROLLER.displayAll();
                    }
                    case "5" -> {
                        System.out.println("*** Thank you for attention ***");
                        return;
                    }
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }


}