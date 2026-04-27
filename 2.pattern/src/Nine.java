import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int i=0,k=0;

        while(i<=n-1 && i>=0){
            for(int j=0;j<=(n-1)+i;j++){
                if((i+j)>=(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i==n-1) {
                i = i-k;
                k++;
            }
                else if (k>0){
                  i--;
                  k++;
                }
            else{
                i++;
            }
        }
    }
}

//TC: o(n^2)
//SC : o(1)
