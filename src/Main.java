import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("Info successfully saved.");
            } catch (IllegalNameExeption e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter your age: ");
            Integer age = scanner.nextInt();
            try {
                user.setAge(age);
                System.out.println("Success. Your age is " + user.getAge());
            } catch (IllegalAgeExeption ie) {
                System.out.println(ie.getMessage());
            }

        }
    }
}