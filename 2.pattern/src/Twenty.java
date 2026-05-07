import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n = s.nextInt();
        int t1=0;

        for(int t=1;t<=(n*2)-1;t++){
            int k=0;
            int i=t;
            if(i>n&&t1==0){
                i=n-1;
                t1=i;
            } else if(i>n&&t1>0){
                t1--;
                i=t1;
            }

            for(int j=1;j<=(n*2);j++){
                if(j<=i && j<=n && k==0){
                    System.out.print("*");
                } else if(j>i && j<=n&& k==0){
                    System.out.print(" ");
                }

                if(j>n && k==0){
                    k=n;
                }
                if(k>0 && k<=i && j>n &&j<=n*2){
                    System.out.print("*");
                    k--;
                } else if(k>0 && k>i && j>n &&j<=n*2){
                    System.out.print(" ");
                    k--;
                }
            }
            System.out.println();
        }
    }
}
//TC:o(n^2)
//SC:o(1)