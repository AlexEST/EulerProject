/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

/**
 *
 * @author Alexander Chelpanov
 * Date: 11.06.2019
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 
 * 1 to 10 without any remainder. What is the smallest positive number that 
 * is evenly divisible by all of the numbers from 1 to 20?
 * 
 * 2520 - самое маленькое число, которое делится без остатка на все числа 
 * от 1 до 10. Какое самое маленькое число делится нацело на все числа 
 * от 1 до 20?
 * 
 * Задача из проекта Эйлера.
 */
public class Task5 {
    public static void main(String[] args) {
        int num = 20;        
        while (true) {
            if (isDivide(num)==true) {
                break;
            }
            num++;
        }
        System.out.println(num);
    }
    private static boolean  isDivide(int num) {
        boolean answer = false;
        int cnt = 0;
        for (int i = 1; i <= 20; i++) {
            if (num%i==0) {
                cnt++;
            }else{
            break;
            }
        }
        if (cnt==20) {
            answer=true;
        }
        return answer;       
    }   
}
