package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int q = 0 ; q <= 300 ; q++ ){
            if (q  % 3 == 0 && q %4 == 0 && q % 5 == 0 ){
                sum += q;
                System.out.println(sum);
            }
        }
    }
}
