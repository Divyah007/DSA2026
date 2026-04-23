import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n= s.nextInt();

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=((n-1)+i);j++)
            {
                if((i+j)>=n-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}

/*TC:O(n^2)
    SC:O(1)*/
