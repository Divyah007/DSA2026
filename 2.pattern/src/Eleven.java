import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                if(((i+j)%2)==0){
                    System.out.print(1);
                } else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

//TC:o(n^2)
//SC:o(1)