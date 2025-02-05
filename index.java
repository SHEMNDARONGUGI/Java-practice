//everything should be contained inside the class
//whatever we are writing inside these {} will be considered a part of class

// JVM =>  instatiate a thread => main

class index{
    public static void main(String [] args){

        // byte(-128 - 127) > short(2 bytes) > int(4 bytes) > long (8 bytes)
        // float = 4 bytes
        // double = 8 bytes

        byte a = Byte.MAX_VALUE;
        byte b = Byte.MIN_VALUE;
        System.out.println("\n For Byte:");
        System.out.println(a);
        System.out.println(b);

        short x = Short.MAX_VALUE;
        short y = Short.MIN_VALUE;
        System.out.println("\n For Short:");
        System.out.println(x);
        System.out.println(y);

        int m = Integer.MAX_VALUE;
        int n = Integer.MIN_VALUE;
        System.out.println("\n For Integer:");
        System.out.println(m);
        System.out.println(n);

        long i = Long.MAX_VALUE;
        long j = Long.MIN_VALUE;
        System.out.println("\n For long:");
        System.out.println(i);
        System.out.println(j);

        float f = Float.MAX_VALUE;
        float g = Float.MIN_VALUE;
        System.out.println("\n For float:");
        System.out.println(f);
        System.out.println(g);

        double d = Double.MAX_VALUE;
        double e = Double.MIN_VALUE;
        System.out.println("\n For double:");
        System.out.println(d);
        System.out.println(e);


    }
}