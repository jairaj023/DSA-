// import java.util.*;
// public class Functions {

//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }

    // public static int printHelloWorld() {
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return 3;
    // }
    // public static void main(String[] args) {
    //     printHelloWorld();     Function call
    // }

    // public static void calculatesum() {
    //     Scanner Sc = new Scanner (System.in);
    //     int a = Sc.nextInt();
    //     int b = Sc.nextInt();
    //     int sum = a + b;
    //     System.out.println("Sum is = " + sum);
    // }

    // public static void main(String args[]) {
    //     calculatesum();
    // }

    // public static void calculatesum(int a, int b) {
    //     int sum = a + b;
    //     System.out.println("Sum is = " + sum);
    // }

    // public static void main(String args[]) {
    //     Scanner Sc = new Scanner (System.in);
    //     int a = Sc.nextInt();
    //     int b = Sc.nextInt();
    //     calculatesum(a, b);
    // }

//     public static int calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         return sum;
//     }

//     public static void main(String args[]) {
//         Scanner Sc = new Scanner (System.in);
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("Sum is = " + sum);
//     }
// }

// Swaping of Code

import java.util.*;
public class Functions {

    // public static void main(String args[]) {
    //     int a = 5;
    //     int b = 10;

    //     //Swap code function 
    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.println("a = "+ a);
    //     System.out.println("b = "+ b);
    // }

//     // From Call by Value
//     public static void Swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = "+ a);
//         System.out.println("b = "+ b);
//     }
//     public static void main(String args[]) {
//         int a = 5;
//         int b = 10;
//         Swap(a, b);
//     }
    
// }

// import java.util.*;
// public class Functions {

//     public static void Swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;
//     }
//     public static void main(String args[]) {
//         int a = 5;
//         int b = 10;
//         Swap(a, b);

//         System.out.println("a = "+ a);// fuction me hi call hota h
//         System.out.println("b = "+ b);
//     }
// }

// Find the Products of a & b

// import java.util.*;
// public class Functions {

//     public static int multiply(int a, int b) {
        
//         int prod = a*b;
//         return prod;
//     }

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 5;
//         int prod = multiply(a, b);
//         System.out.println("a * b = "+ prod);
//         int product = multiply(20, 10);
//         System.out.println("a * b = "+ product);

//     }
// }

// Factorial of n Numbers

import java.util.*;
public class Functions {

    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    
    public static void main(String args[]) {
        System.out.println(factorial(7));

    }
}



