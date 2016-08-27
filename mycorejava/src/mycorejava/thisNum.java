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
public class thisNum {
    public static int howManyDigits(int num){
        int digCounter = 0;
        while(num != 0){
            num = num / 10;
            digCounter++;
            
        }
    return digCounter;    
    }
    
}
