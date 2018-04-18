/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundtopoweroftwo;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class RoundToPowerOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            
            int powerOf2=1;
            int distance=1-a;
            while (powerOf2<a) {
                distance=a-powerOf2;
                powerOf2*=2;
            }
            if (distance<0 || distance>=powerOf2-a) {
                System.out.println(powerOf2);
            } else {
                System.out.println(powerOf2/2);
            }
            
        }

    }

}
