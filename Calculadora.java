
public class Calculadora {

   
    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

      
        int resultado = calc.somar(10, 20);

        System.out.println("A soma de 10 e 20 é: " + resultado);
    }
}

