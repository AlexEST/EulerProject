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
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13. What is the 10 001st prime number?
 * 
 * Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. 
 * Очевидно, что 6-ое простое число - 13. Какое число является 10001-ым 
 * простым числом?
 * 
 * Задача из проекта Эйлера.
 */
public class Task7 {
    public static void main(String[] args) {
        int num  = 2; int Cnt=0; int divCnt=0;
        while (Cnt<10001) {           
            for (int i = 1; i < num+1; i++) {
                if (num%i == 0) {
                    divCnt++;
                }
            }
            if (divCnt==2) {
                Cnt++;
            }
            num++;
            divCnt = 0;
        }
        System.out.println(""+(num-1));
    }
}
