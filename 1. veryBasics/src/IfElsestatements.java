import java.util.Scanner;

class Solution1 {
    public void studentGrade(int marks) {
            if(marks > 100 || marks <0){
              return;
            } else if(marks>=90){
                System.out.printf("Grade A");
            } else if (marks>=70){
                System.out.printf("Grade B");
            } else if (marks>=50){
                System.out.printf("Grade C");
            } else if (marks>=35){
                System.out.printf("Grade D");
            } else{
                System.out.printf("Fail");
            }

    }
}


public class IfElsestatements {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Solution1 sol= new Solution1();
        sol.studentGrade(s.nextInt());
    }
}


/*
```
time complexity-studentGrade
condition comparison inside if,else if..-->for each it is o(1), so max it can go upto 5--->o(1)+o(1)+o(1)+o(1)+o(1)=o(1)
system.out.println inside else if and else block -->o(1)--> bcoz only 1 block will be executed
total time= o(1)+o(1)=o(1)


space complexity-studentGrade
No extra variables, arrays, or recursion created-->o(1) -->Method uses constant space regardless of input value
total space=o(1)
What uses space?
  • Parameter 'marks': 1 int (4 bytes) - but it's INPUT (don't count)
  • Local variables: NONE created
  • Arrays/Lists: NONE created
  • Recursion: NONE (no stack frames)
  • if ,else if, else statement: Control flow only (no data storage)
  • Output (println): Doesn't count (delivered, not stored)

Total EXTRA space used: O(1) ✓

Why O(1)?
  • No matter what value 'marks' has (1, 25, or 50),
    the method uses the SAME amount of memory
  • No data structures that grow with input
  • Method uses constant space regardless of input value



note:
dont consider anything outside the method ex. object creation, loop,.. which is outside of the algorithm method.
dont consider i/p,o/p because for space complexity we need to consider only the extra
meaning of o(1)--> constant or fixed
Output doesn't count in space complexity!It's like delivering a package - you're not storing it
Count only Arrays,Lists, local variables you create and Recursion depth for space complexity
Object creation is NOT counted in time complexity!
Object creation happens ONCE at the start (initialization), not during the algorithm execution.
We analyze complexity for the algorithm's core logic, not setup.
*/

