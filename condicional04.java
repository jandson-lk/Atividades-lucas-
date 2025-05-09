import java.util.Scanner;

public class condicional04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
       
        System.out.println("Digite um numero:");
        double x = scanner.nextDouble(); 

        if (x % 2 == 0){
            System.out.println(x + "é um numero par");
        } 
        else {
            System.out.println(x + "é um numero impar" );
        }
        scanner.close();
    }
}