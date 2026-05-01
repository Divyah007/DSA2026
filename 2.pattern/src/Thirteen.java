import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                k++;
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

//TC: o(n^2)
//SC: o(1)
