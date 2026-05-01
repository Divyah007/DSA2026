import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();

        for(int i=n;i>0;i--){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}

//TC:o(n^2)
//SC:o(1)
