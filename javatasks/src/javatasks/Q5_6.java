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
public class Q5_6 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print("* | ");
            } else {
                System.out.print(i + "  ");
            }

        }
        System.out.println("");
        System.out.println("-----------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 10; j++) {
                int ans = i * j;
                if (ans < 10) {
                    System.out.print(ans + "  ");
                } else {
                    System.out.print(ans + " ");
                }
            }
            System.out.println("");
        }
    }
}
