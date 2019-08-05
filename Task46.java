/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Chelpanov
 * Date: 05.08.2019
 * 
 * It was proposed by Christian Goldbach that every odd composite number 
 * can be written as the sum of a prime and twice a square.
 * 
 * 9 = 7 + 2×12
 * 15 = 7 + 2×22
 * 21 = 3 + 2×32
 * 25 = 7 + 2×32
 * 27 = 19 + 2×22
 * 33 = 31 + 2×12
 * 
 * It turns out that the conjecture was false.
 * What is the smallest odd composite that cannot be written as the 
 * sum of a prime and twice a square?
 * 
 * Кристиан Гольдбах показал, что любое нечетное составное число можно 
 * записать в виде суммы простого числа и удвоенного квадрата.
 * 
 * 9 = 7 + 2×12
 * 15 = 7 + 2×22
 * 21 = 3 + 2×32
 * 25 = 7 + 2×32
 * 27 = 19 + 2×22
 * 33 = 31 + 2×12
 * 
 * Оказалось, что данная гипотеза неверна. Каково наименьшее нечетное составное
 * число, которое нельзя записать в виде суммы простого числа и удвоенного 
 * квадрата?
 * 
 */
public class Task46 {
    public static void main(String[] args) {
        List<Integer> SimList = new ArrayList<>(); 
        int GolNum;
        int divs = 0;
        for (int i = 2; i < 10000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i%j==0) {
                    divs++;
                }
            }
            if (divs==1) {
                SimList.add(i);
            }
            divs=0;
        }
        Integer [] arr = new Integer [SimList.size()];
        arr = SimList.toArray(arr);
        divs=0;
        for (int i = 3; i < 10000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i%j==0) {
                    divs++;
                } 
            }
            if (divs>1 && isEven(i)==false && Goldbach(i,arr)==false) {
                GolNum = i;
                System.out.println(GolNum);
                System.exit(0);
            }
            divs=0;
        }
    }
    
    private static boolean isEven(int num) {
        boolean answer = false;
        if (num%2==0) {
            answer = true;
        }
        return answer;
    }
    
    private static boolean Goldbach(int num, Integer [] arr) {
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < num; j++) {
                if (arr[i]+2*(int)Math.pow(j, 2)==num) {
                    answer=true;
                    return answer;                    
                }
                if (arr[i]+2*Math.pow(j, 2)>num) {
                    break;
                }
            }
        }
        return answer;
    }    
}
