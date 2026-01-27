/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        int age = 69;
        if (age >= 18) {
            System.out.println("adult: drive, vote");
            
        }

        if (age > 13 && age < 18) {
            System.out.println("teenager");
            
        }

        else {
            System.out.println("not adult");
        }

    }
}*/

//Largest of two numbers

/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int A = Sc.nextInt();
        int B = Sc.nextInt();
        if (A >= B) {
            System.out.println("A Is Largest Of 2");
            
        }

        else {
            System.out.println("B Is Largest Of 2");
        }

    }
}*/

//Odd/Even Number

/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();

        if (num%2==0) {
            System.out.println("It's an even number!");
            
        }

        else {
            System.out.println("It's an odd number!");
        }
    }
}*/

//Else if 
//Income Tax calaculator

/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        double tax; 
        Scanner Sc = new Scanner(System.in);
        int sal = Sc.nextInt(); 

        if (sal<500000) {
            tax = sal*0;
            
        }
        else if(sal>=500000 && sal<1000000){
            tax= sal*(0.2);

        }
        else{
            tax=(0.3)*sal;
        }
        
        System.out.println("The Tax Calculated for The Given salary Is: " + tax);
    }
}*/

// Largest among Three Numbers

/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int A = Sc.nextInt();
        int B = Sc.nextInt();
        int C = Sc.nextInt();

        if (A >= B && A >= C) {
            System.out.println("A Is Greatest among This Numbers!");
            
        }
        else if (B >= A && B >= C) {
            System.out.println("B Is Greatest Among This Numbers!");
            
        }
        else {
            System.out.println("C Is Greatest Among This Numbers!");
        }
    }
}*/

// Ternary Operator

/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int number = Sc.nextInt();

        //Ternary Operator
        String type = ((number%2)==0)? "Even" : "Odd";
        System.out.println(type);
    }
}*/

// Ternary Operator

/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int marks = Sc.nextInt();

        //Ternary Operator
        String reportCard = marks >= 33 ? "Pass" : "Fail";
        System.out.println(reportCard);
    }
}*/

//Switch Statement

/*import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
    int day = Sc.nextInt();

    switch (day) {
        case 1 : System.out.println("samosa");
                break;
        case 2 : System.out.println("Burger");
        break;
        case 3 : System.out.println("Mango Shake");
        break;

    
        default: System.out.println("We Wake Up");
            break;
    }
    }
}*/

//Calculator

import java.util.*;

public class Conditinal {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = Sc.nextInt();
        System.out.println("Enter second number : ");
        int b = Sc.nextInt();
        System.out.println("Enter Operator : ");
        char Operator = Sc.next().charAt(0);

        switch (Operator) {
            case '+' : System.out.println(a + b);
                        break;
            case '-' : System.out.println(a - b);
                        break;
            case '*' : System.out.println(a * b);
                        break;
            case '/' : System.out.println(a / b);
                        break;
            case '%' : System.out.println(a % b);
                        break;
            
        
            default: System.out.println("Wrong Operator!");
        }

    }
}