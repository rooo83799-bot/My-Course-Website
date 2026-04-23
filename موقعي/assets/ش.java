import java.util.Scanner;

public class ش   { 
    public static void main(String[] args) {
          

        String name = "rital";
        int age = 18;
        System.out.println("اسمي" +name + "وعمري" + age );

        Scanner inqut =new Scanner(System.in);
        System.out.println("اكتب اسمك");
        String name2 = inqut.nextLine();
        System.out.println("اهلا يا" + name2);
    }
}

 