/* 

Right-Aligned Right Angled triangle
   
        * 
      * * 
    * * * 
  * * * * 
* * * * *  

*/

package Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void rightAlignedRightAngledTriangle(int iRows) {

        // for-loop : rows
        for (int i = 1; i <= iRows; i++) {
            // for-loop : spaces
            for (int j = iRows; j > i; j--) {
                System.out.print("  ");
            }
            // for-loop : *
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iRows = sc.nextInt();

        rightAlignedRightAngledTriangle(iRows);

        sc.close();
    }
}
