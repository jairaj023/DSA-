// Print Star Patterns
// *
// **
// ***
// ****


/*import java.util.*;

public class Patterns {
    public static void main (String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// Print Inverted Star Patterns
// ****
// ***
// **
// *

/*import java.util.*;

public class Patterns {
    public static void main (String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= (a-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// Print Half Pyramid Patterns
//1
//12
//123
//1234

/*import java.util.*;

public class Patterns {
    public static void main (String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

// Print Character Patterns
//A
//AB
//ABC
//ABCD

import java.util.*;

public class Patterns {
    public static void main (String args[]) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        char ch = 'A';

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}