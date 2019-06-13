/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProject;

import java.math.BigInteger;

/**
 *
 * @author Alexander Chelpanov
 * Date: 13.06.2019
 * 
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26. 
 * What is the sum of the digits of the number 2^1000?
 * 
 * 215 = 32768, сумма цифр этого числа равна 3 + 2 + 7 + 6 + 8 = 26. 
 * Какова сумма цифр числа 2^1000?
 * 
 * Задача из проекта Эйлера.
 */
public class Task16 {
    public static void main(String[] args) {
        int exp = 1000;
        BigInteger num1 = new BigInteger ("2");
        BigInteger number = num1.pow(exp);
        String str = number.toString();
        char [] charArr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArr.length; i++) {
            int num = Character.getNumericValue(charArr[i]);
            sum += num;
        }
        System.out.println(""+sum);
    }
}
