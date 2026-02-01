import java.util.Scanner;

public class WeightConverter {
    static void main(String[] args) {

        // Weight Conversion Program

        Scanner input = new Scanner(System.in);

        //Declare variabels

        double weight;
        double newWeight;
        int choice;

        //Welcome message

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to Kgs");
        System.out.println("2: Convert Kgs to lbs");

        //Prompt for user choice

        System.out.println("================================");
        System.out.print("Choose an option: ");
        choice = input.nextInt();

        //Option 1 convert lbs to Kgs

        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();

            newWeight = weight * 0.453592;

            System.out.printf("The new weight is  %.2f Kgs\n", newWeight);
        }

        //Option 2 convert Kgs to lbs

        else if (choice == 2) {
            System.out.print("Enter the weight in Kgs: ");
            weight = input.nextDouble();

            newWeight = weight * 2.20462;

            System.out.printf("The new weight is  %.2f lbs\n", newWeight);

        }
        // Else print not a valid choice
        else {
            System.out.println("Invalid choice");
        }

        input.close();
    }
}
