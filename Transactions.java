package com.lab2.transaction;
import java.util.*;

public class Transactions {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Transaction array");
            int size = sc.nextInt();
            int[] transaction = new int[size];
            System.out.println("Enter the values for Transaction array");
            for (int i = 0; i < size; i++)
                transaction[i] = sc.nextInt();
            System.out.println("Enter the number of targets that needs to be achieved");
            int targetCount = sc.nextInt();
            while (targetCount-- != 0) {
                int flag = 0;
                long target;
                System.out.println("\nEnter the target value");
                target = sc.nextInt();
                long sum = 0;
                for (int i = 0; i < size; i++) {
                    sum =sum + transaction[i];
                    if (sum >= target) {
                        System.out.println("Target achieved after "+(i + 1) + " Transactions \n");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("Given target is not achieved ");
                }
            }
        }
    }
