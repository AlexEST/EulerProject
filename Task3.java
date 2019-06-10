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
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime 
 * factor of the number 600851475143 ?
 * 
 * Простые делители числа 13195 - это 5, 7, 13 и 29. Каков самый большой 
 * делитель числа 600851475143, являющийся простым числом?
 * 
 * Задача из проекта Эйлера.
 */
public class Task3 {
    public static void main(String[] args) {
        long start, end;
        start = System.nanoTime();
        long number = 600851475143L;
        long div = 0;
        int i = 1;
        while (i < number) {
            i++;
            if (number % i == 0) {
                number = number / i;
                if (i > div) {
                    div = i;
                }
                i = 1;
            }
        }
        System.out.println("" + div);
        end = System.nanoTime();
        long time = end - start;
        System.out.println("In ns: "+time);
        double seconds = (double)time / 1000000.0;
        System.out.println("In ms: "+seconds);
    }
}
