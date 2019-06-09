/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

/**
 *
 * @author Alexander Chelpanov
 * Date: 09.06.2019
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.Find the sum of all 
 * the multiples of 3 or 5 below 1000.
 * 
 * Если выписать все натуральные числа меньше 10, кратные 3 или 5, 
 * то получим 3, 5, 6 и 9. Сумма этих чисел равна 23. Найдите сумму всех 
 * чисел меньше 1000, кратных 3 или 5.
 * 
 * Задача с проекта Эйлера.
 */
public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i%5==0 || i%3==0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех натуральных чисел до 1000: "+sum);
    }
}
