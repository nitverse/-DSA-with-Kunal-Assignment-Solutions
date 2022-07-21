import java.util.Scanner;

public class ass1 {

    public static void main(String[] args) {
        operators();
        //twonum();
        //currency();
        //fibonacci();
        //palindrome();
        //reverse();
       // armstrong();
    }

    static void operators() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int subtract;
        if (num1>num2){
            subtract = num1 - num2;
        }
        else{
            subtract=num2-num1;
        }
        int product = num1*num2;
        int division =num1/num2;

        System.out.println("sum is = " +sum);
        System.out.println("subtraction is = " +subtract);
        System.out.println("Product is = " +product);
        System.out.println("Division is = " +division);
    }
    static void twonum(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int x = input.nextInt();

        System.out.println("Enter second number : ");
        int y = input.nextInt();

        if (x>y)
            System.out.println("X is the largest number which is = " +x);
        else
            System.out.println("Y is the largest number which is = " +y);
    }

    static void currency(){
        Scanner rupees = new Scanner(System.in);

        System.out.println("Enter the amount in rupees : ");
        int rs = rupees.nextInt();

        double dollar = rs*0.013;

        System.out.println("The amount in dollar is " +dollar );
    }

    static void fibonacci() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of terms : ");
        int n = input.nextInt();

        int sum = 0, a = -1, b = 1;

        for (int i = 1; i <= n; i++) {
            sum = a + b;
            System.out.println("fibonacci sequence is : " + sum);
            a = b;
            b = sum;
        }
    }

    static void reverse(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String s = input.next();

        StringBuffer reverse = new StringBuffer(s).reverse();

        int length = s.length();
        //string before reversing
        System.out.println(""+s);
        //string after reversing
        System.out.println(""+reverse);
    }

    static void palindrome(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String s = input.next();

        StringBuffer reverse = new StringBuffer(s).reverse();


        String data = reverse.toString();

        if (s.equals(data)){
            System.out.println("Given string is palindrome");
        }
        else
            System.out.println("Given string is not palindrome");
    }

    static void armstrong(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = input.nextInt();
        System.out.println("Enter second number : ");
        int b = input.nextInt();

        for (int i = a; i<b; i++){
            int check,rem,sum=0;
            check=i;
            while (check!=0){
                rem=check%10;
                sum=sum+(rem*rem*rem);
                check=check/10;

            }
            if (sum==i)
                System.out.println(""+sum+" is an armstrong number");
        }
    }
}
