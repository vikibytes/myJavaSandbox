/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycorejava;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Vikas
 */
public class myDate {
    public static String dateDemo(){
        Date timeNow = new Date();
        return timeNow.toString();
   
    }
    
    public static int dateManipulation(){
        System.out.println(myDate.dateDemo());
        Date timeNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd");
        System.out.println("Current Date: " + ft.format(timeNow));
        int dateToday = (int)Integer.parseInt(ft.format(timeNow));
        //System.out.println(dateToday);
        return dateToday;
    }

}
