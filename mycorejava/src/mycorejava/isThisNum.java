/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycorejava;

/**
 *
 * @author Vikas
 */
public class isThisNum {
    public static boolean armStrong(int num){
        boolean noIsArmstrong = false;
        int numOfDigits = thisNum.howManyDigits(num);
            int tempSum = 0;
            int tempNum = num;
            for(int i=0; i<=2; i++){
                tempSum = (int) Math.pow((int) (tempNum % 10),numOfDigits) + tempSum;
                tempNum = tempNum / 10;
                //System.out.println(tempSum);
            }
            if (tempSum == num){
                //System.out.println("No is Armstrong");
                noIsArmstrong = true;
            } else {
                //System.out.println("No is not Armstrong");
                noIsArmstrong = false;
            }
            return noIsArmstrong;
    }
}
