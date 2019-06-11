/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

import java.util.ArrayList;

/**
 *
 * @author Alexander Chelpanov
 * Date: 11.06.2019
 * 
 * Наименьшее число, которое можно представить в виде суммы квадрата простого
 * числа, куба простого числа и четвертой степени простого числа, равно 28. 
 * Между прочим, существует ровно 4 таких числа меньше пятидесяти, которые 
 * можно представить в виде суммы указанным способом:
 * 28 = 22 + 23 + 24
 * 33 = 32 + 23 + 24
 * 49 = 52 + 23 + 24
 * 47 = 22 + 33 + 24
 * Сколько чисел до пятидесяти миллионов можно представить в виде суммы 
 * квадрата, куба и четвертой степени простых чисел?
 * 
 * The smallest number expressible as the sum of a prime square, prime cube, 
 * and prime fourth power is 28. In fact, there are exactly four numbers below 
 * fifty that can be expressed in such a way:
 * 28 = 22 + 23 + 24
 * 33 = 32 + 23 + 24
 * 49 = 52 + 23 + 24
 * 47 = 22 + 33 + 24
 * How many numbers below fifty million can be expressed as the sum of a prime 
 * square, prime cube, and prime fourth power?
 * 
 * 
 * P.S. Плохое решение - время выполнения около 25-30 минут.
 * P.S. Bad decision - runtime is about 25-30 minutes.
 */
public class Task87 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Long> arr3 = new ArrayList<>();
        long count = 0; int cnt = 0;
        long num = 50000000L;
        for (int i = 2; i < 7072; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    count++;
                }
                
            }
            if (count==2) {
                arr.add(i);
            }
            count = 0;
        }
        System.out.println(arr.size());
        Integer [] arr2 = new Integer[arr.size()];
        arr2 = arr.toArray(arr2);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    long a = (long) Math.pow(arr2[i], 2);
                    long b = (long) Math.pow(arr2[j], 3);
                    long c = (long) Math.pow(arr2[k], 4);
                    long sum = a + b + c;
                    if (sum > num) {
                        break;
                    }
                    if (sum < num && isExist(arr3, sum) == false) {
                        cnt++;
                        arr3.add(sum);
                    }
                }
            }
        }
        System.out.println("" + cnt);
    }
    private static boolean isExist(ArrayList<Long> array, long sum) {
        boolean answer=false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == sum) {
                answer=true;
                break;
            }
        }
        return answer;
    }
    
}
