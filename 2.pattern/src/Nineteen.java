import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        for(int t=n*2;t>0;t--){
            int i=t;
            if(i>n){
                i=Math.abs(i-n);
            }else{
                i=(n-i) +1;
            }
            int j=1,k=0;
            while(j<=n*2 && j>0){
                if(j<=i && j<=n && k==0){
                    System.out.print("*");
                } else if(j>i && j<=n && k==0){
                    System.out.print(" ");
                }
                 if(j>i && k==0 && j>n){
                    k=j-1;
                }

                if(k>0&& k<=i){
                    System.out.print("*");
                    k--;
                } else if (k>0&& k>i){
                    System.out.print(" ");
                    k--;
                }
                j++;

            }
            System.out.println();
        }
    }
}

//TC:o(n^2)
//SC:o(1)
