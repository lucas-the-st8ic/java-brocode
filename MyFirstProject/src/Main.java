
import java.util.Random;

static void main(String[] args) {

    Random random = new Random();

    int number;

    number = random.nextInt(1, 7);

    System.out.println("Random Number: " +number);

    double number2;

    number2 = random.nextDouble(0, 10.90);

    System.out.printf("Random Number: %.2f", number2);
}

