import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            int j=1;
            while(j<=(n*2)){
                if(j<=i){
                    System.out.print(j);
                } else if(j>n){
                    int k=((n*2)-j)+1;
                    if(k<=i){
                        System.out.print(k);
                    } else{
                        System.out.print(" ");
                    }
                } else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
        }
    }
}

//TC: o(n^2)
//SC: o(1)
