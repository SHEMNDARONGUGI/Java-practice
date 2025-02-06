public class Conditional {
    public static void main(String[] args) {
        //rain umbrella

    // boolean rain = true;
    // boolean umbrella = true;

    // ternary operator
    // expression 1? expression 2 : expression 3;
    // expression 1 - has to be a boolean expression

    // String out = rain == true && umbrella == true? "go out": "cannot go out";
    // System.out.println(out);
    // System.out.println();

    // String permission = rain == false ? "go out" : umbrella ==false "do not go out": "go out";
    // System.out.println(permission);
    // if(rain == true && umbrella == true){
    //     System.out.println("You can go out");
    // }

    // else if(rain == true && umbrella == false){
    //     System.out.println("You cannot go out");
    // }

    // else{
    //     System.out.println("You can go out");
    // }

    // expression => sth that can be evaluated further

    // switch(expression){
    //     case x : System.out.println("case 2");
    // }

    int ch = 2;
    switch (ch + 2) {
        case 2 : System.out.println("case 2");
            
            break;

        case 4 : System.out.println("Case 4");
            break;

        case 6 : System.out.println("case 6");
            break;

        case 8 : System.out.println("case 8");
            break;
    
        default: System.out.println("this is a default case");
        
    }

    }
}

// 