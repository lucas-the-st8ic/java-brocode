import java.util.Scanner;

public class IfStatements {
    static void main(String[] args) {

        // If statement = performs a block of code if its condition is true

        // Declaração if(Se) = executa um bloco de código
        //se uma condição for verdadeira

        Scanner input = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("Are you a student(true/false)? ");
        isStudent = input.nextBoolean();

         //Group 1
        if (name.isEmpty()) {
            System.out.println("Name is empty! (T_T)");
        } else {
            System.out.println("Hello, " + name + "! ✋");
        }


         //Group 2
        if (age >= 65) {
            System.out.println("You are a senior!");
        }else if (age >= 18) {
            System.out.println("You are of legal age!!");
        } else if (age < 0) {
            System.out.println("Please enter a valid age!!");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else {
            System.out.println("You are under legal age!!");
        }


        //Group 3
        if(isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }
        input.close();
    }

}
