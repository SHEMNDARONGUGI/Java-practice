import java.util.Scanner;
public class student_record {
    public static void main(String[] args) 
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Input Number of Students: ");
        int std_num = object.nextInt();
        object.nextLine();
        String name;
        String reg;
        int age;
        for(int i = 1; i<= std_num;i++){
        System.out.println("Input " + i);
        System.out.println("Input name: ");
        name = object.nextLine();
        System.out.println("Input registration number: ");
        reg = object.nextLine();
        System.out.println("Input age: ");
        age = object.nextInt();
        object.nextLine();
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Registration number: "+ reg +"\nAge: "+ age);
        System.out.println();
        }
        object.close();
    }
}
