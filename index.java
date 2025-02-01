//everything should be contained inside the class
//whetever we are writing iside these {} will be considered a part of class

// JVM =>  instatiate a thread => main

class index{
    // public static void print(){
    //     System.out.println("happy birthday");
    // }
    public static void main(String [] args){

        // byte(-128 - 127) > short(2 bytes) > int(4 bytes) > long (8 bytes)

        short x = Short.MAX_VALUE;
        short y = Short.MIN_VALUE;
        System.out.println(x);
        System.out.println(y);

        long i = Long.MAX_VALUE;
        long j = Long.MIN_VALUE;
        System.out.println(i);
        System.out.println(j);

    }
}