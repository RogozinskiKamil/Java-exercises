import java.util.Scanner;

public class scratch_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik z zakresu od 0 - 100");
        int score = scanner.nextInt();

        if (score >= 90){
            System.out.println("Twoja ocena to 5 :33");
        } else if (score >= 80) {
            System.out.println("twoja oocena to 4 :3");
        } else if (score >= 70) {
            System.out.println(" Twoja ocena to 3 ;/");

        } else if (score >= 60) {
            System.out.println("Twoja ocena to 2 ;(");

        } else {
            System.out.println("twoja ocena to 1 ;(((((");

        }
        if (score > 100 || score < 0){
            System.out.println("nie poprawny zakres liczbowy");
        }
    }
}