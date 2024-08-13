/* 

reverse right-angled triangle 

* * * * * 
* * * * 
* * * 
* * 
*

*/

package Pattern;

import java.util.*;

public class Pattern3 {

    public static void reverseRightAngledTriangle(int iRows) {
        for (int i = iRows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows you want to print : ");
        int iRows = sc.nextInt();

        reverseRightAngledTriangle(iRows);

        sc.close();
    }
}
