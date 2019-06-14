/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

/**
 *
 * @author Alexander Chelpanov
 * Date: 14.06.2019
 * 
 * The sum of the squares of the first ten natural numbers is, 
 * 12 + 22 + ... + 102 = 385 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred 
 * natural numbers and the square of the sum.
 * 
 * Сумма квадратов первых десяти натуральных чисел равна
 * 12 + 22 + ... + 102 = 385
 * Квадрат суммы первых десяти натуральных чисел равен
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Следовательно, разность между суммой квадратов и квадратом суммы первых 
 * десяти натуральных чисел составляет 3025 − 385 = 2640.
 * Найдите разность между суммой квадратов и квадратом суммы первых ста 
 * натуральных чисел.
 * 
 * Задача из проекта Эйлера.
 */
public class Task6 {
    public static void main(String[] args) {
        int sum1 = 0; 
        int num1;
        int num2=0;
        int number;
        for (int i = 1; i < 101; i++) {
            num1 = (int) Math.pow(i, 2);
            sum1 = sum1+num1;
        }
        for (int i = 1; i < 101; i++) {
            num2=num2+i;
        }
        num2=(int) Math.pow(num2, 2);
        number = num2-sum1;
        System.out.println(number);
    }
}
