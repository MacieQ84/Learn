package com.MacieQ;

/*
in: n random numbers (rand)
out: number of numbers where modulo by k == 0
 */
public class InputTest {
    public static void main(String[] args) {
        //number of lines
        int n = 5;
        //divide
        int k =2;
        int rand = (int)Math.pow(10, 9);
        int[] t = new int[n];
        int t1 = 0;

        for (int a = 0; a < n; a++) {
            t[a] = (int)(Math.random() * rand) +1;
            System.out.println(t[a]);
            if (t[a] % k == 0){
                t1++;
            }
        }
        System.out.println(t1);

    }
}
