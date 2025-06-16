import java.util.Scanner;

public class scratch_5 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę od 0 do 100");

        int number1 = scanner.nextInt();

        if (number1 > 100 || number1 < 0 ){
            System.out.println("to nie właściwy wynik, podaj prawidłową liczbę");
            System.exit(0);
        }
        
        if (number1 >=90){
            System.out.println("Twoja ocena to 5");
        } else if (number1 >= 80) {
            System.out.println("Twoja ocena to 4");
        } else if (number1 >= 70) {
            System.out.println("twoja ocena to 3");
        } else if (number1 >= 60 ) {
            System.out.println("Twoja ocena to 2");
        } else  {
            System.out.println("Twoja ocena to 1");

        }
        {

        }


    }
}