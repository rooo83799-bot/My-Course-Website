  import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner rital = new Scanner(System.in);
        int age = 0;
        String name = "User";

        while (age <= 0 || age >= 160) {
            System.out.println("Enter Your Age:");
            age = rital.nextInt();
        }

        if (age <= 15) {
            System.out.println("Hi " + name + " Your Age is " + age);
            System.out.println("You Are Adult");
        } else if (age == 18) {
            System.out.println("You are 18");
        } else if (age > 0) {
            System.out.println("Your age is valid");
        } else {
            System.out.println("Wrong number");
        }

        int sum = 0;
        for (int total = 10; total <= age; total++) {            
            sum = sum + total;
        }

        System.out.println("sum is : " + sum);
    }
}
    