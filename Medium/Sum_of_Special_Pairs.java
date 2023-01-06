//You are given an arrayAofNintegers.
//Write a program to find thesumof the absolute difference between all such pairs (A[i], A[j]) such that i < j and ( j-i ) is prime.



package Medium;

import java.util.*;

public class Sum_of_Special_Pairs {


    public static boolean  isPrime(int n){

        if(n<= 1){
           return false;
        }

        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static int findPair(int n, int[] arr){

        int sum  = 0;

        for(int i = 0; i<n-1; i++){

            for(int j = i+1; i<n; i++){

                 if(isPrime(j-i)){
                    sum += Math.abs(arr[i]-arr[j]);
                 }
            }
        }
        return sum;
    }

    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(findPair(n,arr));
        
        
    }
}

// 1 2 3 5 7 12

// i=1
// j=3

// sum = 2,11,3,5,2,2


// primes =  2, 3, 5, 7, 11, 13, 17, 19, 23, 29