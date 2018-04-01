package com.company;
import java.util.Scanner;
public class Main {

    public static void printArray(int[] myArray){
        for(int a = 0; a < myArray.length;a++) {
            System.out.println(myArray[a] + " ");

        }
    }
    public static void printFirstNPrimes(int n) {
        int primesFound = 0;
        int i = 2;
        int[] primes = new int[n];

        while (primesFound < n) {
            int divisors = 0;
            int j = 2;
//            for(int j = 2; j < i; j++) {
//                if(i % j == 0) {
//                    divisors++;
//                }
//            }
            System.out.println("testam numarul  " + i);

            while(j <= (i/2) && divisors == 0) {
                System.out.println("i: " + i +  " j: " + j);
                if(i % j == 0) {
                    divisors++;
                }
                j++;
            }
            System.out.println("divisors " + divisors);

            if(divisors == 0) {
//                System.out.println("Numarul " + i + " este prim");
                primes[primesFound] = i;
                primesFound++;
            }
            i++;
        }

        System.out.print("Numere prime gasite: ");
        printArray(primes);
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = scanner.nextInt();
        int[] a= new int[n];
        int contorPrim = 0;
        System.out.println("Please enter m: ");
        int m = scanner.nextInt();
        System.out.println("Determining first " + n + " primes");

        printFirstNPrimes(n);
    }
    }
