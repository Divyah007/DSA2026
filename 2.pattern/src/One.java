import java.awt.*;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n= s.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
* TC: O(N^2)
* SC: O(1)
* */
