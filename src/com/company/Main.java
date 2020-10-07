package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Введите силу каждого врага через пробел:");
        Scanner in = new Scanner(System.in);
        int enemies_pow[] = Arrays.stream(in.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();;
        int max_pow = Arrays.stream(enemies_pow).sum() / 2;
        System.out.println();
        int temp;
        for (int i =0;i<enemies_pow.length;i++) {
            if(enemies_pow[i] == max_pow) {
                temp = enemies_pow[i];
                enemies_pow[i] = enemies_pow[enemies_pow.length-1];
                enemies_pow[enemies_pow.length-1] = temp;
            }
        }
        System.out.println("Выигрышная последовательность уничтожения врагов:");
        for(int i: enemies_pow) {
            System.out.print(i + " ");
        }


    }
}
