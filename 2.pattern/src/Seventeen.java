import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        for(int i=0;i<n;i++){
            char c='A';
            for(int j=1;j<=(n+i);j++){
                if((i+j)>=n&&j<=n){
                    System.out.print(c);
                    c++;
                } else if ((i+j)>=n && j>n) {
                    if(j==n+1){
                        c--;
                        c--;
                    } else{
                        c--;
                    }
                    System.out.print(c);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//TC:o(n^2)
//SC:o(1)