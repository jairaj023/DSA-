// Arithmetic Operators

/*import java.util.*;

public class Operator {

    public static void main(String args[]) {
        int A = 10;
        int B = 5;
        System.out.println("Addition = " + (A+B));
        System.out.println("Substract = " + (A-B));
        System.out.println("Multiplication = " + (A*B));
        System.out.println("Divide = " + (A/B));
        System.out.println("Modulo(Reminder) = " + (A%B));
    }
}*/

//Unary Opertoars

/*import java.util.*;

public class Operator {

    public static void main(String args[]) {
        // int a = 10;
        // int b = ++a;                                  //Pre-Increament
        // System.out.println(a);
        // System.out.println(b);
        
        // int a = 10;
        // int b = a++;                                  //Post-Increament
        // System.out.println(a);
        // System.out.println(b);

        // int a = 10;
        // int b = --a;                                  //Pre-Decreament
        // System.out.println(a);
        // System.out.println(b);

        int a = 10;
        int b = a--;                                  //Post-Decreament
        System.out.println(a);
        System.out.println(b);
    }
}*/

// Relational Operator

/*import java.util.*;

public class Operator {

    public static void main(String args[]) {
        int a = 10;
        int b = 5;                                  
        System.out.println(a==b);                   //Equal To
        System.out.println(a!=b);                   //Not-Equal To
        System.out.println(a>b);                    //Greater Than
        System.out.println(a<b);                    //Less Than
        System.out.println(a>=b);                   //Greater Than Equal To
        System.out.println(a<=b);                   //Less Than Equal To


    }
}*/

//Logical Operators

/*import java.util.*;

public class Operator {

    public static void main(String args[]) {
        System.out.println((3>2) && (2>0));          //AND Operator
        System.out.println((3<2) && (2>0));          //AND Operator
        System.out.println((3>2) || (2<0));          //OR Operator
        System.out.println((3<2) || (2<0));          //OR Operator
        System.out.println(!(2>0));                  //NOT Operator
        System.out.println(!(2<0));                  //NOT Operator


    }
}*/

//Assignment Operator

import java.util.*;

public class Operator {

    public static void main(String args[]) {
        int A = 10;
        A += 10;                        //A = A + 10
        System.out.println(A);
        int B = 10;
        B -= 10;                        //B = B - 10
        System.out.println(B);
        int C = 10;
        C *= 10;                        //C = C * 10
        System.out.println(C);
        int D = 10;
        D /= 10;                        //D = D / 10
        System.out.println(D);
        int E = 10;
        E %= 10;                        //E = E % 10
        System.out.println(E);


    }
}