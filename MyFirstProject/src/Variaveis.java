import java.util.*;

public class Variaveis {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int age;
        int year = 1998;
        int qt = 1;

        double price = 19.99;
        double avaliacao = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '@';
        char currency = '$';

        boolean isStudent;
        boolean forSale = false;

        String name;
        String favFood = "Pizza";
        String eMail = "fake123@gmail.com";
        String car = "Pontiac GTO";

        System.out.println("\nYour favorite food is: " +favFood+"!!");


        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your note: ");
        double note = input.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        isStudent = input.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your note is " + note);

        if(isStudent){
            System.out.println("You're enrolled as a student");
        } else {
            System.out.println("You're not enrolled as a student");
        }


        input.close();
    }
}
