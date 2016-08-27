/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycorejava;

import java.util.*;

/**
 *
 * @author Vikas
 */
//This function can be used to find all Armstrong numbers in the range
public class myAlgos {
        public static ArrayList<Integer> listOfArmstrong(int a, int b){
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = a; i < b+1; i++){
            if(isThisNum.armStrong(i)){
                myList.add(i);   
            }
        }
        return myList;
    }
    
}
