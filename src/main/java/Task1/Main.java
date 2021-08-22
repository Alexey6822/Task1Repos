/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/**
 *
 * @author Aleksey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = new int[100];
       for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 1000000);
            //System.out.println(array[i]);
        }
       int min, max, iMin, iMax;
       min = 10000000;
       max = -10000000;
       iMin = 0;
       iMax = 0;
       for (int i = 0; i < array.length; i++){
           if (array[i] < min) { 
               min = array[i];
               iMin = i;}
           if (array[i] > max) {
               max = array[i];
               iMax = i;
           }
       }
       System.out.println(String.format("min = %s i = %s", min, iMin));
       System.out.println(String.format("max = %s i = %s", max, iMax));
    }
}
