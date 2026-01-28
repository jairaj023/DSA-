//public class BasicJava {
//    public static void main (String args[]) {
//        System.out.print("Hello World");
//    }
//}
//public class BasicJava {
//    public static void main (String args[]) {
//        System.out.print("Hello Jairaj Choudhary");
//    }
//}
//public class BasicJava {
//    public static void main (String args[]) {
//        System.out.print("Hello World");
//        System.out.print("Hello World");
//        System.out.print("Hello World");
//    }
//}
/* public class BasicJava {
    public static void main (String args[]) {
        System.out.print("Hello World");
        System.out.print("Hello World");
        System.out.print("Hello World");
    }
}*/

//Print A Pattern

/*public class BasicJava {                                                  Pattern
        public static void main(String args[]) {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}*/

/*public class BasicJava {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name ="Tony Stark";
        System.out.println(name);
        System.out.println(a*b);
    }
}*/

/*public class BasicJava {
    public static void main(String args[]) {
        byte a = 10;
        char ch = 'a';
        System.out.println(a);
        System.out.println(ch);
        boolean var = false;                       
        float price = 10.5f;                        //it takes only decimal value/use double also
        int Number = 25;                            //use long also
        System.out.println(price);
        System.out.println(Number);
        //long                                    big value in integer
        //double                                  big value in decimal 
        short n = 240;
        System.out.println(n);
    }
}*/

//Sum

/*public class BasicJava {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
    }
}*/

//Type of Input

/*import java.util.*;

public class BasicJava {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        //String input = Sc.next();
        //System.out.println(input);

        //String input = Sc.nextLine();
        //System.out.println(input);

        int number = Sc.nextInt();
        System.out.println(number);

        float price = Sc.nextFloat();
        System.out.println(price);
    }
}*/

//Sum of A & B from taking Input

/*import java.util.*;

public class BasicJava {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}*/

// Product of A & B from taking inputs

/*import java.util.*;

public class BasicJava {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int product = a * b;
        System.out.println(product);
    }
}*/

//Area of Circle from taking input value

/*import java.util.*;

public class BasicJava {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        float r = Sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);
    }
}*/

//Type/widening/implicit Conversion

/*import java.util.*;

public class BasicJava {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        float number = Sc.nextInt();
        System.out.println(number);
    }
}*/

//Type/Narrowing/explicit Conversion

/*import java.util.*;

public class BasicJava {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        char ch2 = 'A';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);

    }
}*/

//Type Promotion In Expression


/*public class BasicJava {

    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        char c = a - b;                                       //Not Possible
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(a);
        // System.out.println(b-a);


        

    }
}*/

/*public class BasicJava {

    public static void main(String args[]) {
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);

    }
}*/

/*public class BasicJava {

    public static void main(String args[]) {
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);

    }
}*/

/*public class BasicJava {

    public static void main(String args[]) {
        byte b = 5;
        byte a = (byte) (b*2);
        System.out.println(a);

    }
}*/