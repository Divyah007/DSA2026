import java.util.Scanner;

class Solution2 {
    public void whichWeekDay(int day) {
        if(day >= 0 && day <= 50){
            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
public class SwitchCase {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Solution2 sol = new Solution2();
        sol.whichWeekDay(s.nextInt());
    }
}

/*
TIME COMPLEXITY- whichWeekDay
if(day >= 0 && day <= 50)- O(1) -comparison
switch(day)- it will directly enter the case=0(1)
inside switch statement only one sout will be printed =0(1)
total time= o(1)+o(1)+o(1)=o(1)

SPACE COMPLEXITY- whichWeekDay
What uses space?
  • Parameter 'day': 1 int (4 bytes) - but it's INPUT (don't count)
  • Local variables: NONE created
  • Arrays/Lists: NONE created
  • Recursion: NONE (no stack frames)
  • Switch statement: Control flow only (no data storage)
  • Output (println): Doesn't count (delivered, not stored)

Total EXTRA space used: O(1) ✓

Why O(1)?
  • No matter what value 'day' has (1, 25, or 50),
    the method uses the SAME amount of memory
  • No data structures that grow with input
  • Method uses constant space regardless of input value


*/
