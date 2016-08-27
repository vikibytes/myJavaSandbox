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
public class myArrayList {
    public static void StringList() {
        ArrayList<String> names = new ArrayList<String>(); //Create new arrayList
        names.add("Vikas");
        names.add("Pooja");
        names.add("Yogesh");
        names.add("Akash");
        //int sizeOfnames = 
//        Iterator itr1 = names.iterator(); //Getting iterator for a list
//        while(itr1.hasNext()){
//            System.out.println(itr1.next
names.stream().forEach((arg) -> {
    System.out.println(arg);
        });
        
    }
    
}
