import java.util.Scanner;

public class scratch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Jak masz na imię? ");
        String imie = scanner.nextLine();

        System.out.println("Jak masz na nazwisko? ");
        String nazwisko = scanner.nextLine();

        System.out.println("Ile masz lat? ");
        String wiek = scanner.nextLine();

        System.out.println("Imię: "+ imie );
        System.out.println("Nazwisko: "+ nazwisko );
        System.out.println("Wiek: "+ wiek );

    }
}