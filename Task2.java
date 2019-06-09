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
 * Каждый следующий элемент ряда Фибоначчи получается при сложении двух 
 * предыдущих. Начиная с 1 и 2, первые 10 элементов будут: 1, 2, 3, 5, 8, 13,
 * 21, 34, 55, 89, ... Найдите сумму всех четных элементов ряда Фибоначчи, 
 * которые не превышают четыре миллиона.
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous 
 * two terms. By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 
 * 8, 13, 21, 34, 55, 89, ... By considering the terms in the Fibonacci 
 * sequence whose values do not exceed four million, find the sum of the 
 * even-valued terms.
 * 
 * Задача из проекта Эйлера
 */
public class Task2 {
    public static void main(String[] args) {
        int second = 1; int first; int sum = 0;
        for (int i = 1; i < 4000000; i=first+second) {
            if (i%2 == 0) {
                sum += i;
            }
            first=second;
            second=i;
        }
        System.out.println(""+sum);
    }
    
}