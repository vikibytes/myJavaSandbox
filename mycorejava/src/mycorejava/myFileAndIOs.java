/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycorejava;
import java.io.*;

/**
 *
 * @author Vikas
 */
public class myFileAndIOs {
    public static void readConsole() throws IOException {
        InputStreamReader cin = null;
        try {
        cin = new InputStreamReader(System.in);
        System.out.println("Enter data");
        char c;
        do {
           c = (char) cin.read();
           System.out.println(c);
        } 
        while ((cin.read() !=  'q'));
        } finally {
           if  (cin != null){
            cin.close();
        }
        }
    }
    
}
