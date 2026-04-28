import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        int i=0, k=n-1;

        while(i>=0 && i<=n-1){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i==(n-1) || k!=(n-1)){
                k--;
                i=k;
            } else{
                i++;
            }
        }
    }
}

//TC: O(n^2)
//SC: O(1)
