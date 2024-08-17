/*

Zero One Triangle

0 
1 0 
0 1 0 
1 0 1 0 
0 1 0 1 0 

 */
package Pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void zeroOneTriangle(int iRows) {
        for (int i = 1; i <= iRows; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows you want to print : ");

        int iRows = sc.nextInt();

        zeroOneTriangle(iRows);
        sc.close();

    }
}
