package com.company;

public class Main {
        static int factorial(int n) {
            int result;

            if (n < 1) {
                return 1;
            }
            result = factorial(n - 1) * n;
            return result;
        }

        public static void main(String[] args) {
            System.out.println("Факториал числа 5: " + factorial(5));
            System.out.println("Факториал числа 6: " + factorial(6));
            System.out.println("Факториал числа 7: " + factorial(7));
            System.out.println("Факториал числа 8: " + factorial(8));
            System.out.println("Факториал числа 9: " + factorial(9));
            System.out.println("Факториал числа 10:" + factorial(10));
        }
    }











