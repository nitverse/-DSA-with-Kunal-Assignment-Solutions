package ass2;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        //fact();
        //fibo();
       // prodsum();
       // factors();
        // till();
       // till1();
        }



    static void fact() {

        int n,fact = 1;
        System.out.println("Enter the no. : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 1 ; i<=n ; i++){

            fact = fact*i;
        }
        System.out.println("factorial = " + fact);
    }

    static void fibo(){

        int a=-1 , b =1 , sum =0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of terms you want : ");
        int n = input.nextInt();

        for (int i = 1; i<=n ; i++){
            sum=a+b;
            System.out.print(" " +sum);
            a=b;
            b=sum;
        }
    }

    static void prodsum(){

        int rem , sum=0, product=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = input.nextInt();

        while (n>0){
            rem = n%10;
            sum = sum + rem;
            product = product * rem;
            n=n/10;
        }
        System.out.println("Sum is : " +sum);
        System.out.println("Product is : " +product);

        int diff = product-sum;
        System.out.println("Difference between product and sum is : " +diff);

    }

    static void factors(){

        int fact;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = input.nextInt();

        for (int i = 1; i<=n ; i++){
            if(n%i==0) {
                fact = n / i;

                System.out.println("The factors are : " + fact);
            }
        }

    }
    static void till(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int x =1;

        while (x!=0) {
            System.out.println("Enter number : ");
            int n = input.nextInt();
            if (n == 0) {
                x = n;
            } else {
                sum = sum + n;
            }
        }
            System.out.println("the sum of all entered numbers is : " +sum);


    }

    static void till1(){
        Scanner input = new Scanner(System.in);
            int largest = 0;
            int x =1;

            while (x!=0){
                System.out.println("Enter number : ");
                int n = input.nextInt();
                if (n==0){
                    x=n;
                }
                else if(largest<n) {
                    largest = n;
                }
        }
        System.out.println("The largest number is : " + largest);
    }
}

