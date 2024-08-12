/* 

Number-increasing Pyramid Pattern 

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/

package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void NumberIncreasingPyramidPattern(int iNum) {

        for (int i = 1; i <= iNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximum number of rows for the pattern : ");
        int iNum = sc.nextInt();

        NumberIncreasingPyramidPattern(iNum);

        sc.close();
    }
}
