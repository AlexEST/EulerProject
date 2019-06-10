/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

/**
 *
 * @author Alexander Chelpanov
 * Date: 10.06.2019
 * 
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest 
 * palindrome made from the product of two 3-digit numbers.
 * 
 * Число-палиндром с обеих сторон (справа налево и слева направо) читается 
 * одинаково. Самое большое число-палиндром, полученное умножением двух 
 * двузначных чисел – 9009 = 91 × 99.Найдите самый большой палиндром, 
 * полученный умножением двух трехзначных чисел.
 * 
 * Задача из проекта Эйлера.
 */
public class Task4 {
    public static void main(String[] args) {
        int maxPal = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int num = i*j;
                String a = Integer.toString((num/100000));
                String b = Integer.toString((num/10000)%10);
                String c = Integer.toString((num/1000)%10);
                String d = Integer.toString((num/100)%10);
                String e = Integer.toString((num/10)%10);
                String f = Integer.toString(num%10);
                String s = f+e+d+c+b+a;
                int revNum = Integer.parseInt(s);
                if (revNum==num && revNum>maxPal) {
                    maxPal=revNum;
                }
            }
        }
        System.out.println(""+maxPal);
    }
}
