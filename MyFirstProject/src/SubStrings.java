import java.util.Scanner;

public class SubStrings {
    static void main(String[] args) {
        /*.substring() = A method used to extract
        a portion of a string.

        string.subtring(star, end)*/
        Scanner input = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your e-mail: ");
        email = input.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);

        } else {
            System.out.println("Emails must contain @");
        }




    }
}
