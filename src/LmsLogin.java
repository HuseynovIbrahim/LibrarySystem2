import java.util.Scanner;

public class LmsLogin {

    String username = "Ibo777";
    String password = "12345";

            public void login(){
                Scanner scanner = new Scanner(System.in);

                while (true) {

                    System.out.println("Please enter your username: ");
                    String username2 = scanner.nextLine();

                    if (!username2.equals(username)) {
                        System.out.println("Wrong username!");
                        continue;
                    }else {
                        System.out.println("Your logged in!");
                    }

                    System.out.println("Please enter your password: ");
                    String password2 = scanner.nextLine();

                    if (!password2.equals(password)) {
                        System.out.println("Wrong password!");

                    }else {
                        System.out.println("Login Successful!");
                        break;
                    }
                }
            }

}
