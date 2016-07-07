/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatasks;

/**
 *
 * @author Abed Eid
 */
public class Q5_4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= 1; j--) {
                if (j >i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }

}
