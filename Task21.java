/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

/**
 *
 * @author Alexander Chelpanov
 * Date: 13.06.2019
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n 
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a 
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 
 * 71 and 142; so d(284) = 220. Evaluate the sum of all the amicable numbers 
 * under 10000.
 * 
 * Пусть d(n) определяется как сумма делителей n (числа меньше n, делящие n нацело).
 * Если d(a) = b и d(b) = a, где a ≠ b, то a и b называются дружественной парой, 
 * а каждое из чисел a и b - дружественным числом. Например, делителями числа 
 * 220 являются 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 и 110, поэтому d(220) = 284. 
 * Делители 284 - 1, 2, 4, 71, 142, поэтому d(284) = 220. Подсчитайте сумму всех
 * дружественных чисел меньше 10000.
 * 
 * Задача из проекта Эйлера.
 */
public class Task21 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum=0;
        int sumDiv2;
        for (int i = 1; i < 10000; i++) {
            num1=i;
            num2=calculateDividers(num1);
            sumDiv2=calculateDividers(num2);
            if (num1==sumDiv2 && num2>num1) {
                sum +=num1+num2;
            }
        }
        System.out.println(sum);
    }
    
    private static int calculateDividers(int num1) {
        int sumDiv=0;
        for (int j = 1; j < num1-1; j++) {
            if (num1 % j ==0) {
                sumDiv += j;
            }
        }
        return sumDiv;
    }
    
}
