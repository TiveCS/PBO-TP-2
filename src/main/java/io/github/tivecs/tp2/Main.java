/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.tivecs.tp2;

/**
 *
 * @author Ahmad Fathan Hanif_1302204090
 */
public class Main {
    
    
    public static void main(String[] args){
        demoFibonacci();
        System.out.println(" ");
        demoArray();
    }

    static void demoArray(){
        int[][] array = new int[4][];

        for (int i = 0; i < 4; i++){
            switch (i){
                case 0:
                    array[i] = new int[]{3, 6, 9};
                    break;
                case 1:
                    array[i] = new int[]{1, 3, 5, 7};
                    break;
                case 2:
                    array[i] = new int[]{1, 2, 6, 24, 120};
                    break;
                case 3:
                    array[i] = new int[]{1,2,3,4,5,6};
                    break;
            }
        }

        System.out.println("Demo Array2D:");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    
    static void demoFibonacci(){
        StringBuilder builder = new StringBuilder();
        String space = "";
        for (int i = 2; i <= 10; i++){
            builder.append(space).append(fib(i));
            space = " ";
        }

        System.out.println("Demo Fibonacci:");
        System.out.println(builder.toString());
    }
    
    static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    
}
