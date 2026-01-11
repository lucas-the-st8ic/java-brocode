import java.util.Scanner;

public class MathClass {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número de PI com a classe Math(Math.PI): "+Math.PI);
        System.out.println("Número Exponencial com a classe Math(Math.E): "+Math.E);

        /*double result;

        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10, 20);
        result = Math.min(10, 20);
        System.out.println(result);*/

        //HYPOTENUSE c = Math.sqrt(a² + b²)

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = input.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm.");
    }
}
