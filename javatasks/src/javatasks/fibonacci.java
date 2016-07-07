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
public class fibonacci {

    public static void main(String[] args) {
int frist=0,secound=1,sum;
        System.out.print("1  ");
        for (int i = 0; i < 10; i++) {
            sum=frist+secound;
            frist=secound;
            secound=sum;
            System.out.print(sum+"   ");
        }

    }
}
