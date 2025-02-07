import java.util.Scanner;

public class student_record {
    public static void main(String[] args) 
    {
<<<<<<< HEAD
        Scanner object = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int std_num = object.nextInt();
        object.nextLine();

        for(int i = 1; i<= std_num;i++){

        System.out.println("Input name for " + i);
=======
        System.out.println("Input name: ");
        Scanner object = new Scanner(System.in);
>>>>>>> 7993413654854b739594e484d51e8aab162ef457
        String name = object.nextLine();

        System.out.println("Input registration number: ");
        String reg = object.nextLine();

        System.out.println("Input age: ");
        int age = object.nextInt();
<<<<<<< HEAD
        object.nextLine();

        System.out.println();
        
        System.out.println("Details for: " + i);
        System.out.println("Name: "+name +"\nRegistration number: "+ reg +"\nAge: "+ age);
        System.out.println();
        }
        object.close();
=======

        System.out.println("Name: "+name +"\nRegistration number: "+ reg +"\nAge: "+ age);
        
>>>>>>> 7993413654854b739594e484d51e8aab162ef457

    }
}
