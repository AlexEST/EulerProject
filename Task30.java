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
 * Surprisingly there are only three numbers that can be written as the sum 
 * of fourth powers of their digits:
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * As 1 = 1^4 is not a sum it is not included.
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316. 
 * Find the sum of all the numbers that can be written as the sum of 
 * fifth powers of their digits.
 * 
 * Удивительно, но существует только три числа, которые могут быть записаны в 
 * виде суммы четвертых степеней их цифр:
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * 1 = 1^4 не считается, так как это - не сумма. 
 * Сумма этих чисел равна 1634 + 8208 + 9474 = 19316. 
 * Найдите сумму всех чисел, которые могут быть записаны в виде суммы пятых 
 * степеней их цифр.
 * 
 * Задаяа из проекта Эйлера.
 */
public class Task30 {
    public static void main(String[] args) {
        int sum = 0; int num; int sumNum = 0;
        for (int i = 2; i < 1000000; i++) {
            String str = Integer.toString(i);
            char [] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                num = (int) Math.pow(Character.getNumericValue(arr[j]), 5);
                sumNum = sumNum+num;
            }
            if (sumNum==i) {
                sum = sum + sumNum;
            }
            sumNum=0;           
        }
        System.out.println(""+sum);
    }
}
