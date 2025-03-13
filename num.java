import java.util.Scanner;
public class num {
    public static void main(String[] args){
        Scanner my_object = new Scanner(System.in);
        System.out.println("Input Number: ");
        int num = my_object.nextInt();

        for(int i = 1; i<= num; i++){
            System.out.println(i);
        }
        my_object.close();
    }
}
