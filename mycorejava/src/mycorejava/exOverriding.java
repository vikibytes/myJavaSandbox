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
public class exOverriding {
    public static int minValue(int a, int b){
        int result = 0;
        if (a > b){
            result = a;
        } else {
            result = b;
        }
        return result;
    }
    public static double minValue(double a, double b){
        double result = 0;
        if (a > b){
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
