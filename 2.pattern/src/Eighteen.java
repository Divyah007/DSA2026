import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        for(int i=0;i<n;i++){
            char c= (char)(65+(n-1)-i);
            for(int j=0;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}


//TC:o(n^2)
//SC:o(1)
