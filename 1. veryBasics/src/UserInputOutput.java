import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        System.out.println("The entered no. is: "+sc.nextInt());
    }
}

public class UserInputOutput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        s.printNumber(sc);
    }
}

/*
EXPLANATION:

System.out.println("The entered no. is: " + sc.nextInt());

it reads the input first and then prints the line.

the order of execution:

"("The entered no. is: " + sc.nextInt())"--> first the method  sc.nextInt() is executed and then concatenation(+) happens.

when the control comes to the line "System.out.println("The entered no. is: " + sc.nextInt());"
first the expression "The entered no. is: " + sc.nextInt() will be executed,
the order of execution of the expression will be first the method "sc.nextInt()" will get executed,
sc.nextInt()- it takes the input integer and returns the same.

1. when the program reaches this line.,it  pauses and waits .Cursor blinks waiting for you to type a number.
2. You type a number (e.g., 42) and press Enter
3. sc.nextInt() reads the number  from keyboard and returns 42
4. String concatenation happens "The entered no. is: " + 42 becomes "The entered no. is: 42"
5. System.out.println() prints the  Output: The entered no. is: 42

*/


/*
 TIME COMPLEXITY - printNumber
ex. System.out.println("... "); - o(1) -Prints a fixed string and Always takes same time
---
 because every time the string length  is constant- O(1)

 System.out.println("The entered no. is: "+sc.nextInt())-
           sc.nextInt()-Reads one integer from inputTime- O(1) - Reading one value
           String concatenation: "The entered no. is: " + number- Concatenating two strings-  O(1) - Both strings are small and constant size

Total Time: O(1) + O(1)  i.e--> constant + constant =constant.

SPACE COMPLEXITY -- printNumber
ex. System.out.println("... "); - does NOT take space! It's output (delivered, not stored) Remember: "Like delivering a package" 📦
---
System.out.println("The entered no. is: "+sc.nextInt())-

        sc.nextInt()-  return value is NOT stored here, It's used immediately in concatenation, Then immediately printed (not stored)
        concat-"The entered no. is: "+number  - Concatenated string is temporary, Created → Printed → Discarded,Not stored in your method
        Total space:   = O(1) - O(1) - Method uses constant space

 */