// ---------------------------------------------------------
// BCS-553 JAVA PROGRAMMING LAB - ALL PROGRAMS
// SUBMITTED BY: ANSHIKA BATHAM
// ---------------------------------------------------------

// PROGRAM 1: Hello World
class program_01 { 
    public static void main(String[] args) { 
        System.out.println("Hello World"); 
        System.out.println("Welcome to Java");
    } 
}
/* 
INPUT: N/A 
OUTPUT: 
Hello World
Welcome to Java
*/

// PROGRAM 2: Variables
class program_02 { 
    public static void main(String[] args) { 
        int roll = 101; 
        System.out.println("Roll: " + roll); 
    } 
}
/* 
INPUT: N/A 
OUTPUT: Roll: 101 
*/

// PROGRAM 3: Arithmetic Operations
class program_03 { 
    public static void main(String[] args) { 
        int a = 17, b = 5;
        System.out.println("Sum: " + (a+b)); 
    } 
}
/* 
INPUT: a=17, b=5 
OUTPUT: Sum: 22 
*/

// PROGRAM 4: Constants
class program_04 { 
    public static void main(String[] args) { 
        final double PI = 3.14; 
        int r = 7;
        System.out.println("Area: " + (PI*r*r)); 
    } 
}
/* 
INPUT: r=7 
OUTPUT: Area: 153.86 
*/

// PROGRAM 5: Even Odd
class program_05 { 
    public static void main(String[] args) { 
        int n = 27; 
        if(n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    } 
}
/* 
INPUT: 27 
OUTPUT: Odd 
*/

// PROGRAM 6: Grade Calc
class program_06 { 
    public static void main(String[] args) { 
        int m = 83; 
        if(m >= 90) {
            System.out.println("A");
        } else if(m >= 75) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    } 
}
/* 
INPUT: 83 
OUTPUT: B 
*/

// PROGRAM 7: Leap Year
class program_07 { 
    public static void main(String[] args) { 
        int y = 2024; 
        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap");
        }
    } 
}
/* 
INPUT: 2024 
OUTPUT: Leap Year 
*/

// PROGRAM 8: Factorial
class program_08 { 
    public static void main(String[] args) { 
        int fact = 1; 
        for(int i = 1; i <= 5; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact); 
    } 
}
/* 
INPUT: 5 
OUTPUT: Factorial: 120 
*/

// PROGRAM 9: Square Pattern
class program_09 { 
    public static void main(String[] args) { 
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        } 
    } 
}
/* 
INPUT: N/A 
OUTPUT: 
****
****
****
****
*/

// PROGRAM 10: Star Triangle
class program_10 { 
    public static void main(String[] args) { 
        for(int i = 1; i <= 4; i++) { 
            for(int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        } 
    } 
}
/* 
INPUT: N/A 
OUTPUT: 
*
**
***
****
*/

// PROGRAM 11: Number Triangle
class program_11 { 
    public static void main(String[] args) { 
        for(int i = 1; i <= 4; i++) { 
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " "); 
            }
            System.out.println(); 
        } 
    } 
}
/* 
INPUT: N/A 
OUTPUT: 
1
1 2
1 2 3
1 2 3 4
*/

// PROGRAM 12: Reverse Triangle
class program_12 { 
    public static void main(String[] args) { 
        for(int i = 4; i >= 1; i--) { 
            for(int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        } 
    } 
}
/* 
INPUT: N/A 
OUTPUT: 
****
***
**
*
*/

// PROGRAM 13: Max of Two
class program_13 { 
    public static void main(String[] args) { 
        int a = 45, b = 78; 
        if(a > b) {
            System.out.println("Max is " + a);
        } else {
            System.out.println("Max is " + b);
        }
    } 
}
/* 
INPUT: 45, 78 
OUTPUT: Max is 78 
*/

// PROGRAM 14: Array Traversal
class program_14 { 
    public static void main(String[] args) { 
        int[] arr = {10, 20, 30}; 
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    } 
}
/* 
INPUT: {10, 20, 30} 
OUTPUT: 10 20 30 
*/

// PROGRAM 15: Array Sum
class program_15 { 
    public static void main(String[] args) { 
        int[] arr = {12, 45, 7}; 
        int sum = 0; 
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        } 
        System.out.println("Total Sum: " + sum); 
    } 
}
/* 
INPUT: {12, 45, 7}
OUTPUT: Total Sum: 64 
*/

// PROGRAM 16: Reverse Array
class program_16 { 
    public static void main(String[] args) { 
        int[] a = {1, 2, 3, 4, 5}; 
        for(int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " "); 
        }
    } 
}
/* 
INPUT: {1,2,3,4,5}
OUTPUT: 5 4 3 2 1 
*/

// PROGRAM 17: String Length
class program_17 { 
    public static void main(String[] args) { 
        String s = "Java"; 
        System.out.println("Length is: " + s.length()); 
    } 
}
/* 
INPUT: "Java" 
OUTPUT: Length is: 4 
*/

// PROGRAM 18: Uppercase
class program_18 { 
    public static void main(String[] args) { 
        String s = "hello"; 
        System.out.println(s.toUpperCase()); 
    } 
}
/* 
INPUT: "hello" 
OUTPUT: HELLO 
*/

// PROGRAM 19: String Concat
class program_19 { 
    public static void main(String[] args) { 
        String s1 = "A", s2 = "B"; 
        System.out.println(s1 + s2); 
    } 
}
/* 
INPUT: "A", "B" 
OUTPUT: AB 
*/

// PROGRAM 20: Simple Method
class program_20 { 
    static void greet() { 
        System.out.println("Hi from Method!"); 
    } 
    public static void main(String[] args) { 
        greet(); 
    } 
}
/* 
INPUT: N/A 
OUTPUT: Hi from Method! 
*/

// PROGRAM 21: Square Root
class program_21 { 
    public static void main(String[] args) { 
        System.out.println("Square root of 16 is: " + Math.sqrt(16)); 
    } 
}
/* 
INPUT: 16 
OUTPUT: Square root of 16 is: 4.0 
*/

// PROGRAM 22: Power
class program_22 { 
    public static void main(String[] args) { 
        System.out.println("2 to the power 3 is: " + Math.pow(2,3)); 
    } 
}
/* 
INPUT: 2, 3 
OUTPUT: 2 to the power 3 is: 8.0 
*/

// PROGRAM 23: Fibonacci Series
class program_23 { 
    public static void main(String[] args) { 
        int n=5, a=0, b=1; 
        for(int i=0; i<n; i++) { 
            System.out.print(a + " "); 
            int c = a + b; 
            a = b; 
            b = c; 
        } 
        System.out.println();
    } 
}
/* 
INPUT: 5 
OUTPUT: 0 1 1 2 3 
*/

// PROGRAM 24: Armstrong Number
class program_24 { 
    public static void main(String[] args) { 
        int n=153, sum=0, temp=n; 
        while(temp>0) { 
            int r = temp % 10; 
            sum += (r*r*r); 
            temp /= 10; 
        } 
        if(sum == n) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    } 
}
/* 
INPUT: 153 
OUTPUT: Armstrong 
*/

// PROGRAM 25: Swap without temp
class program_25 { 
    public static void main(String[] args) { 
        int a=5, b=10; 
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("a=" + a + " b=" + b); 
    } 
}
/* 
INPUT: a=5, b=10 
OUTPUT: a=10 b=5 
*/

// PROGRAM 26: Add Two Arrays
class program_26 { 
    public static void main(String[] args) { 
        int[] a={1,2}, b={3,4}; 
        System.out.println("Sum: " + (a[0]+b[0]) + " " + (a[1]+b[1])); 
    } 
}
/* 
INPUT: {1,2}, {3,4}
OUTPUT: Sum: 4 6 
*/

// PROGRAM 27: Reverse Number
class program_27 { 
    public static void main(String[] args) { 
        int n=123, rev=0; 
        while(n != 0) { 
            rev = rev * 10 + n % 10; 
            n /= 10; 
        } 
        System.out.println("Reverse: " + rev); 
    } 
}
/* 
INPUT: 123 
OUTPUT: Reverse: 321 
*/

// PROGRAM 28: Palindrome String
class program_28 { 
    public static void main(String[] args) { 
        String s = "madam"; 
        String rev = new StringBuilder(s).reverse().toString(); 
        if(s.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    } 
}
/* 
INPUT: madam 
OUTPUT: Palindrome 
*/

// PROGRAM 29: Vowel Count
class program_29 { 
    public static void main(String[] args) { 
        int count=0; 
        for(char c : "apple".toCharArray()) {
            if("aeiou".indexOf(c) != -1) count++; 
        }
        System.out.println("Vowels: " + count); 
    } 
}
/* 
INPUT: apple 
OUTPUT: Vowels: 2 
*/

// PROGRAM 30: Prime Number
class program_30 { 
    public static void main(String[] args) { 
        int n=29; 
        boolean p=true; 
        for(int i=2; i<n; i++) {
            if(n % i == 0) p = false; 
        }
        if(p) System.out.println("Prime");
        else System.out.println("Not Prime");
    } 
}
/* 
INPUT: 29 
OUTPUT: Prime 
*/

// PROGRAM 31: String Replace
class program_31 { 
    public static void main(String[] args) { 
        System.out.println("Java".replace('a', 'o')); 
    } 
}
/* 
INPUT: Java 
OUTPUT: Jovo 
*/

// PROGRAM 32: String Trim
class program_32 { 
    public static void main(String[] args) { 
        System.out.println("  hello  ".trim()); 
    } 
}
/* 
INPUT: "  hello  " 
OUTPUT: "hello" 
*/

// PROGRAM 33: Method with Parameters
class program_33 { 
    static int add(int a, int b) { 
        return a + b; 
    } 
    public static void main(String[] args) { 
        System.out.println("Sum: " + add(2,3)); 
    } 
}
/* 
INPUT: 2, 3 
OUTPUT: Sum: 5 
*/

// PROGRAM 34: Method Overloading
class program_34 { 
    static int add(int a, int b, int c) { 
        return a + b + c; 
    } 
    public static void main(String[] args) { 
        System.out.println("Sum of 3 numbers: " + add(1,2,3)); 
    } 
}
/* 
INPUT: 1, 2, 3 
OUTPUT: Sum of 3 numbers: 6 
*/

// PROGRAM 35: StringBuffer Reverse
class program_35 { 
    public static void main(String[] args) { 
        StringBuffer sb = new StringBuffer("Test"); 
        sb.reverse(); 
        System.out.println(sb); 
    } 
}
/* 
INPUT: Test 
OUTPUT: tseT 
*/

// PROGRAM 36: 2D Array basics
class program_36 { 
    public static void main(String[] args) { 
        int[][] m = {{1,2},{3,4}}; 
        System.out.println("First element: " + m[0][0]); 
    } 
}
/* 
INPUT: {{1,2},{3,4}} 
OUTPUT: First element: 1 
*/

// PROGRAM 37: int to String
class program_37 { 
    public static void main(String[] args) { 
        System.out.println(String.valueOf(100) + 10); 
    } 
}
/* 
INPUT: 100 
OUTPUT: 10010 
*/

// PROGRAM 38: String to int
class program_38 { 
    public static void main(String[] args) { 
        System.out.println(Integer.parseInt("200") + 20); 
    } 
}
/* 
INPUT: "200" 
OUTPUT: 220 
*/

// PROGRAM 39: Try Catch (Arithmetic)
class program_39 { 
    public static void main(String[] args) { 
        try { 
            int a = 5 / 0; 
        } catch(Exception e) { 
            System.out.println("Cannot divide by zero"); 
        } 
    } 
}
/* 
INPUT: 5/0 
OUTPUT: Cannot divide by zero 
*/

// PROGRAM 40: Try Catch (Array Bounds)
class program_40 { 
    public static void main(String[] args) { 
        int[] a = new int[2]; 
        try { 
            a[3] = 5; 
        } catch(Exception e) { 
            System.out.println("Array Index Out Of Bounds"); 
        } 
    } 
}
/* 
INPUT: Array size 2, accessing index 3 
OUTPUT: Array Index Out Of Bounds 
*/

// PROGRAM 41: Random Number
class program_41 { 
    public static void main(String[] args) { 
        int rand = (int)(Math.random() * 100);
        System.out.println("Random number: " + rand); 
    } 
}
/* 
INPUT: N/A 
OUTPUT: Random number: (Any number between 0-99) 
*/

// PROGRAM 42: Substring
class program_42 { 
    public static void main(String[] args) { 
        System.out.println("Hello".substring(1,4)); 
    } 
}
/* 
INPUT: Hello, start=1, end=4 
OUTPUT: ell 
*/

// PROGRAM 43: IndexOf in String
class program_43 { 
    public static void main(String[] args) { 
        System.out.println("Index of v in Java: " + "Java".indexOf('v')); 
    } 
}
/* 
INPUT: Java, 'v' 
OUTPUT: Index of v in Java: 2 
*/

// PROGRAM 44: Array Sort
class program_44 { 
    public static void main(String[] args) { 
        int[] arr = {3, 1, 2};
        java.util.Arrays.sort(arr); 
        System.out.println("Smallest element after sort: " + arr[0]); 
    } 
}
/* 
INPUT: {3,1,2} 
OUTPUT: Smallest element after sort: 1 
*/

// PROGRAM 45: CharAt
class program_45 { 
    public static void main(String[] args) { 
        System.out.println("Character at index 1: " + "hello".charAt(1)); 
    } 
}
/* 
INPUT: hello, index 1 
OUTPUT: Character at index 1: e 
*/

// PROGRAM 46: CompareTo
class program_46 { 
    public static void main(String[] args) { 
        int result = "apple".compareTo("banana");
        if(result < 0) System.out.println("apple comes first"); 
    } 
}
/* 
INPUT: apple, banana 
OUTPUT: apple comes first 
*/

// PROGRAM 47: EqualsIgnoreCase
class program_47 { 
    public static void main(String[] args) { 
        System.out.println("A equals a? " + "A".equalsIgnoreCase("a")); 
    } 
}
/* 
INPUT: A, a 
OUTPUT: A equals a? true 
*/

// PROGRAM 48: Autoboxing
class program_48 { 
    public static void main(String[] args) { 
        int a = 10; 
        Integer obj = a; 
        System.out.println("Object value: " + obj); 
    } 
}
/* 
INPUT: int 10 
OUTPUT: Object value: 10 
*/

// PROGRAM 49: Completion Message
class program_49 { 
    public static void main(String[] args) { 
        System.out.println("All 49 Programs Done Successfully!"); 
    } 
}
/* 
INPUT: N/A 
OUTPUT: All 49 Programs Done Successfully! 
*/
