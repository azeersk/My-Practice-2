import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*You're given a word and an index position of a character. You need to write a program that prints the given word without the character at the given index.
        String a = input.nextLine();
        int b = input.nextInt();
        System.out.println(a.substring(0,b)+ a.substring(b+1));

        Write a program to check if the given string is a valid password or not. A string is considered as a valid password if the number of characters present is greater than 7.
        String a = input.nextLine();
        boolean b = a.length() >7;
        System.out.println(b);

        Write a program which checks whether the given number N is between 25 and 75.
        int a = input.nextInt();
        boolean b = a>25 && a<75;
        System.out.println(b);

        Write a program that reads a single line of input and prints the first and last characters of the given input and prints the asterisk character (*) in place of the remaining characters.
        String a =input.nextLine();
        int b = a.length();
        System.out.println(a.charAt(0) + "*".repeat(b-2)+a.charAt(b-1));

        Write a program that reads the student's marks as input and prints PASS or FAIL.If the student has scored more than 50, print PASS.
        In all other cases print FAIL.
        int a = input.nextInt();
        if (a>50)
            System.out.println("Pass.");
        else
            System.out.println("Fail.");

        Write a program to print the greatest among the two numbers.
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);

        Write a program to check if the given two numbers are equal.
        int a = input.nextInt();
        int b = input.nextInt();
        if (a==b)
            System.out.println("Equal.");
        else
            System.out.println("Not Equal.");

    Write a program to find if the given number is positive, negative, or zero.
        int a = input.nextInt();
        if (a>0)
            System.out.println("positive number.");
        else if (a<0)
            System.out.println("negative number.");
        else
            System.out.println("Zero.");

    Given two integers, they are considered a lucky pair if any one of them is 6 or if their sum or difference is equal to 6.
    int a = input.nextInt();
    int b = input.nextInt();
    if ((a==6 || b==6) || (a-b==6 || b-a==6))
        System.out.println("Lucky.");
    else
        System.out.println("Unlucky.");

    Write a program to check if the given number is even or odd.
        int a = input.nextInt();
        if (a%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");


        Write a program to read a single line of input, which is a two-digit integer and
        Print "Special Number" if any one of the following conditions are satisfied
        1. The sum of digits is 7
        2. One of the digits is 7
        3. The number is a multiple of 7
        Print "Normal Number" in all others cases

        String a = input.nextLine();
        int Main = Integer.parseInt(a);
        int Zero = Integer.parseInt(String.valueOf(a.charAt(0)));
        int first = Integer.parseInt(String.valueOf(a.charAt(1)));
        if (Zero + first == 7)
            System.out.println("Special Number.");
        else if (Zero ==7 || first ==7)
            System.out.println("Special Number.");
        else if (Main%7 ==0)
            System.out.println("Special Number.");
        else
            System.out.println("Normal Number");

A number is all Special Eleven, if it is a multiple of 11 or if it is one more than a multiple of 11.
Write a program to check if the given number is a Special Eleven number.
        int a = input.nextInt();
        boolean b = (a%11)==1;
        if (b || (a%11)==0)
            System.out.println("Special Eleven");
        else
            System.out.println("Normal Number");

        Write a program to print if the given number is divisible by any of the lucky numbers 6, 3, 2 in decreasing
         order of priority(6 is luckier than 3 and 3 is luckier than 2).
        Print "Number is divisible by" followed by the luckiest number among the above 3 which can divide the number.
        Print "Number is not divisible by 2, 3 or 6" if the number is not divisible by any of them
        If the given number is divisible by 6, print "Number is divisible by 6". If the given number is divisible by 3, print "Number is divisible by 3".
        If the given number is divisible by 2, print "Number is divisible by 2" In all other cases print "Number is not divisible by 2, 3 or 6".
        int a = input.nextInt();
        if (a%6==0)
            System.out.println("Number is divisible by 6");
        else if (a%3==0)
            System.out.println("Number is divisible by 3");
        else if (a%2==0)
            System.out.println("Number is divisible by 2");
        else
            System.out.println("Number is not divisible by 2, 3 or 6");

        Given two positive integers, which is a number and a power. Write a program to calculate the power of the given number.
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Math.pow(a,b));

        Given two integers a and b, write a program to find the greatest among the powers of each other.
        int a = input.nextInt();
        int b = input.nextInt();
        double c = Math.pow(a,b);
        double d = Math.pow(b,a);
        if (a>b)
            System.out.println(c);
        else if (b>a)
            System.out.println(d);

        Given a two-digit number, print "Lucky Number" if any of the following conditions are satisfied
        1. The number is a multiple of 9
        2. One of the digits is 9
        Print "Unlucky Number" in all other cases.
        String a = input.nextLine();
        int c = Integer.parseInt(a);
        int b = Integer.parseInt(String.valueOf(a.charAt(0)));
        int d = Integer.parseInt(String.valueOf(a.charAt(1)));
        if (c%9==0)
            System.out.println("Lucky Number");
        else if (b==9 || d==9)
            System.out.println("Lucky Number");
        else
            System.out.println("Unlucky Number");
     Given two integers A and B, write a program to print the relation between the two numbers.
        int a = input.nextInt();
        int b = input.nextInt();
        if (a==b)
            System.out.println("A and B is Equal.");
        else if (a>b)
            System.out.println("A is greater than B.");
        else
            System.out.println("A is less than B.");

        Write a program to calculate the grade of the student based on marks he/she scored.
        If the given marks are greater than 85, print "A".
        If the given marks are greater than 70 and less than or equal to 85, print "B".
        If the given marks are greater than or equal to 60 and less than or equal to 70, print "C".
        If the given marks are less than 60, print "F".
        int a = input.nextInt();
        if (a>85)
            System.out.println("A");
        else if (a>70 && a<=85)
            System.out.println("B");
        else if (a>=60 && a<=70)
            System.out.println("C");
        else
            System.out.println("F");

        Write a program to print a greeting message based on the given time.
        If the time is greater than or equal to 4 and less than 12, print "Good Morning".
        If the time is greater than or equal to 12 and less than 16, print "Good Afternoon".
        If the time is greater than or equal to 16 and less than 20, print "Good Evening".
        If the time is greater than or equal to 20 or less than 4, print "Good Night".
        int a = input.nextInt();
        if (a>=4 && a<=12)
            System.out.println("Good Morning");
        else if(a>12 && a<=16)
            System.out.println("Good Afternoon");
        else if(a>16 && a<=20)
            System.out.println("Good Evening");
        else if(a<=4 || a>20)
            System.out.println("Good Night");

        In this problem, you need to write a program to calculate the electricity bill for a household, based on the units of electricity the household consumed. The price for unit varies based on the slab. The charges per unit for different slabs are as mentioned below:
        For the first 50 units (0-50), the charge is 2/unit
        For the next 100 units (51-150), the charge is 3/unit
        For the next 100 units (151-250), the charge is 5/unit
        For above 250 units (251 and above), the charge is 8/unit
        Apart from these charges, there is also an additional surcharge of 20% on the total amount is added to the bill.
        int a= input.nextInt();
        if(a>=1 && a<=50)
            System.out.println(a*2 + (a*2)*0.2);
        else if(a>=51 && a<=150)
            System.out.println(50*2+(a-50)*3+(50*2+(a-50)*3)*0.2);
        else if(a>=151 && a<=250)
            System.out.println(50*2 + 100*3 + (a-150)*5+(50*2 + 100*3 + (a-150)*5)*0.2);
        else if(a>=251)
            System.out.println(50*2 +100*3 + 100*5+(a-250)*8+(50*2 +100*3 + 100*5+(a-250)*8)*0.2);

        Given an amount, write a program to find the minimum number of notes of different denominations that sum up to the given amount
        Available note denominations are 100, 50, 10, 1.
        The first line of output should contain the number of 100 notes, print "100:a".
        The second line of output should contain the number of 50 notes, print "50:b".
        The third line of output should contain the number of 10 notes., print "10:c".
        The fourth line of output should contain the number of 1 notes, print "1:d".
        In place of (a, b, c, d), print the count of corresponding notes.
        int a = input.nextInt();
        int b = a/100;
        int c = (a-(100*b))/50;
        int d = (a-(100*b)-(50*c))/10;
        int e = a-(100*b)-(50*c)-(10*d);
        System.out.println("100: "+b);
        System.out.println("50: "+c);
        System.out.println("10: "+d);
        System.out.println("1: "+e);

        Write a program to print integers from 1 to the given integer (N).
        int a = input.nextInt();
        int b = 1;
        while(a>=b){
            System.out.println(b);
            b++;
        }

        Given two integer numbers M and N, write a program to print the integers from M to N.
        int a = input.nextInt();
        int b = input.nextInt();
        while (b>=a){
            System.out.println(a);
            a++;
            }
    Write a program to print a solid square pattern of N rows and N columns using the asterisk character (*), where integer N is given as an input.

        int a = input.nextInt();
        int b = 0;
        while (a>b){
            System.out.println("* ".repeat(a));
            b++;
        }


    Given two integers M and N, write a program to print a solid rectangle pattern of M rows and N columns using the asterisk character (*).x
        int a = input.nextInt();
        int b = input.nextInt();
        int c = 0;
        while (b>c){
            System.out.println("* ".repeat(a));
            c++;
        }

    Given an integer number (N) as input. Write a program to print the right-angled triangular pattern of N lines using an asterisk(*) character.

        int a = input.nextInt();
        int b = 0;
        while (a>b){
            System.out.println("* ".repeat(b+1));
            b++;
        }

    Given an integer number (N) as input. Write a program to print the sum of first N natural numbers.
        int a = input.nextInt();
        int b = 1;
        int c = 0;
        while (a>=b){
            c = c+b;
            b++;
        }
        System.out.println(c);


    Given an integer N, write a program which reads N inputs and prints them.*/
        int a =input.nextInt();
        int b = 0;
        while (a>b){
            int c = input.nextInt();
            System.out.println(c);
            b++;
        }
    }
}
