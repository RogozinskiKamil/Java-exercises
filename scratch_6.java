public class scratch_6 {
    public static void main(String[] args) {


          int year = 2400;

        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println("rok jest przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
            
        }


    }
}