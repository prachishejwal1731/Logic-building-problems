/*

Sqaure hollow pattern

* * * * *
*       *
*       *
*       *
* * * * *    

*/
package Pattern;

import java.util.Scanner;

public class Pattern1 {
    static void squareHollowPattern(int x,int y){
      for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            if(i==0 || j==0 || i==x-1 || j==y-1)
            {
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
      }
   }
    public static void main(String args[]){
         
         @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of rows : ");
         int iRows=sc.nextInt();

         System.out.println("Enter the number of columns : ");
         int iCols=sc.nextInt();

         squareHollowPattern(iCols,iRows);


    }
}
