//While Loop

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("Hello World ");
            counter++;
            
        }
    }
}*/

// Print Number 1 To 10

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
            
        }
    }
}*/

//print 1 to n

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = 1;
        int n = Sc.nextInt();
    
        while (a <= n) {
            System.out.println(a);
            a++;
            
        }
    }
}*/

//print sum of first n natural numbers

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        int n = Sc.nextInt();
    
        while (a <= n) {
            sum += a;
            a++;
            
        }
        System.out.println(sum);
    }
}*/

//For loop

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Hello World");
        }
    }
}*/

// Print Square Method

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        
        for(int i=1;i<=5;i++) {
            System.out.println("*****");
        }
    }
}*/

//Print Reverse Of A Number

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int a;
        while(n > 0) {
            a=n%10;
            n=n/10;
            
            System.out.print(a);
            
        }
    }
}*/

//Reverse the given number

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int rev = 0;
        while(n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n  / 10;
            
            
        }
            System.out.println(rev);
    }
}*/

//Break Staement

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
                
            }
            System.out.println(i);
        }
        System.out.println("I Am Out Of The Loop");
        
    }
}*/

//Keep Entering Number Till User Enters A Multiple Of 10

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        do {
            int num = Sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        } while(true);
    }
}*/

//Continue Statement

/*import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        do {
            int num = Sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println(num);
        } while(true);
    }
}*/

//Check If A Number Is Prime Or Not

import java.util.*;

public class Loops {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        
            boolean isprime = true;
            for(int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }

            if (isprime == true) {
                System.out.println(n +" is prime number...");
            
            } else {
            System.out.println(n +" is not a prime number");
        }

        

    }
}