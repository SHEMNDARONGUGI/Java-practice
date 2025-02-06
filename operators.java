public class operators {

    // public is access modifier
    // static means that one does not have to create an object of the class so as to call the main function because JVM is going to call the main function
    // void means that it does not have a return type
    // main is the function
    // (String[] args) - refers to argument that it can accept from the command line
    public static void main(String[] args) { 
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);
        // Assignment
        // left = (right)

        int a = 46+56-34;
        System.out.println(a);

        // Arithmetic ....
        // +,-,%,/,*
        System.out.println("sum = "+(23+45));
        System.out.println("diff = "+(34-4));
        System.out.println("mult = "+(2 * 2));
        System.out.println("div = "+(8/4));
        System.out.println("mod = "+(13 % 4));
        System.out.println();

        // Comparison operators(<,>,<=,>=,!=, == )
        int b = 20;
        int c = 45;
        System.out.println(b<c);
        System.out.println(b>c);
        System.out.println(b<=c);
        System.out.println(b>=c);
        System.out.println(b!=c);
        System.out.println(b == c);

        System.out.println();

        // Logical operators(&&, || , !)
        // for && (t && t = t)

        System.out.println(true && true);

        System.out.println();

        boolean rain = false;
        boolean umbrella = false;

        System.out.println(rain && umbrella);

        System.out.println();


        System.out.println(true|| true);
        System.out.println(!true);

        System.out.println();


        // bitwise operators (<<, >>, | , ^ , & ) 
        // 1 - 0001
        // 2 - 0010
        // 3 - 0011
        // 4 - 0100
        // 5 - 0101
        // 6 - 0110
        // 7 - 0111
        // 8 - 1000

        // 6&4
        System.out.println(6&4);
        // 0110
        // 0100
        // apply truth table vertically
        // 0100 = 4

        System.out.println();

        

        // 1 | 1 = 1
        // 0 | 0 = 0

        System.out.println(8 | 3);
        System.out.println(2 | 3);

        System.out.println();

        // XOR - true if only exactly one of the values is true and false otherwise
        System.out.println(7 ^ 8);
        // 1111 = 15

        System.out.println();

        char num ='c';
        System.out.println((int)num); //ASCII information
        

        System.out.println();
    
    }
}
// conditional statements can be made using ternary operator, if-else and switch