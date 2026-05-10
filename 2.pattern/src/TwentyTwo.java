import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s = 0;
        int t = (n * 2) - 1;
        int e = t - 1;
        int v = n;
        int[][] a=new int[t][t];

        while (v != 0) {
            for (int i = s; i <= e; i++) {
                for (int j = s; j <= e; j++) {
                    if (i == s || j == s || i == e || j == e) {
                        a[i][j]=v;
                    }
                }
            }
            v--;
            s++;
            e--;

        }

        for(int i=0;i<=t-1;i++){
            for(int j=0;j<=t-1;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}

//TC:O(n³) + O(n²) = O(n³) //we drop lower order for TC calculation
//SC:O(n^2)
