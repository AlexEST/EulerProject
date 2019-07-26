/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Chelpanov
 * Date: 26.07.2019
 * 
 * The prime 41, can be written as the sum of six consecutive primes:
 * 41 = 2 + 3 + 5 + 7 + 11 + 13
 * This is the longest sum of consecutive primes that adds to a prime below 
 * one-hundred. The longest sum of consecutive primes below one-thousand that 
 * adds to a prime, contains 21 terms, and is equal to 953.
 * Which prime, below one-million, can be written as the sum of the most 
 * consecutive primes?
 * 
 * P.S. Not the best decision. About 3 minutes.
 */
public class Task50 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int simSum=0;
        int div=0;
        for (int i = 2; i < 1000000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i%j==0) {
                    div++;
                }
            }
            if (div==1) {
                simSum = simSum+i;
                list.add(i);
            }
            if (simSum>1000000) {
                break;
            }
            div=0;
        }
        int num = 0;
        div=0;
        int calls = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                div = div+list.get(j);
                calls++;
                if (isSimple(div)==true && div>num && div<1000000 && calls>count) {
                    num=div;
                    count=calls;
                }
                if (div>1000000) {
                    break;
                }               
            }
            div=0;
            calls=0;
        }
        System.out.println(num);
      
    }
    
    private static boolean isSimple(int num) {
        boolean answer = false;
        int div = 0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                div++;
            }
        }
        if (div==1) {
            answer=true;
        }
        return answer;
    }
    
}
