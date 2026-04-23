
import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) {
        Scanner reader =new Scanner (System.in);
       String name ;
        int age;
        String number;
        System.out.println("Entor your name ");
        name=reader.nextLine();
        System.out.println("Enter your age ");
        age=reader.nextInt(); 
        reader.nextLine();
        
        System.out.println("Enter your Mobiel number");
        number =reader.nextLine();

   if (age >= 1 && age<13) {
    System.out.println("you are a chlid");
}

  else if (age >= 13 && age <18)
     {System.out.println(" you are young");

}

   else if (age >=18 && age <=160){
    System.out.println("hello  "+ name + " your age is "+ age + " your namber is "+ number);
System.out.println(" thank you " + name);

   }

    if (age <= 0 || name =="") {
        System.out.println("your age or your name is invalid ");
    }
     if (age<=0|| age >160 ) {
    System.out.println (" your age is invalid");
}

if (name == ""){}
    System.out.println("your name is invalid");
    }
}
  