import java.util.Scanner;

public class scratch_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();


        System.out.println("Ile masz lat? ");
        int age = scanner.nextInt();


        if (age >= 18 && name.endsWith("a")) {
            System.out.println("Jesteś pełnoletnia");
        } else if (age >= 18 && !name.endsWith("a")) {
            System.out.println("Jesteś pełnoletni.");
        } else if (age <18 && name.endsWith("a")) {
            System.out.println("Nie jesteś pełnoletnia");
        } else if (age <18 && !name.endsWith("a")) {
            System.out.println("Nie jesteś pełnoletni.");

        }





//        System.out.println("Jakie jest światło (zielone, żółte, czerwone)");
//        String color = scanner.nextLine();
//
//        if (color.equals("zielone")) {
//
//                System.out.println("Jedź");
//            } else if (color.equals("żółte")) {
//            System.out.println("poczekaj");
//        }else if (color.equals("czerwone")) {
//            System.out.println("Stój");
//        } else {
//            System.out.println("Nie znam takiego koloru :) ");
//        }

    }
    }