/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_euler;


/**
 *
 * @author Alexander Chelpanov
 * Date: 03.08.2019
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * 
 */
public class Task10 {
    public static void main(String[] args) {
        int n = 2000000;
        int[] arr = new int[n];       
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        arr[1] = 0; 
        for (int i = 2; i < n; i++) {
            if (arr[i] != 0) {
                for (int j = i * 2; j < n; j += i) {
                    arr[j] = 0;
                }
            }
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }  
}    
 
