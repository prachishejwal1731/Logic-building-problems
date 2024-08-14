/* 
Square Filled Pattern

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

 */
package Pattern;

import java.util.*;

public class Pattern5 {
    public static void squareFilledPattern(int iRows) {
        for (int i = 0; i < iRows; i++) {
            for (int j = 0; j < iRows; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print : ");
        int iRows = sc.nextInt();

        squareFilledPattern(iRows);
        sc.close();
    }
}
