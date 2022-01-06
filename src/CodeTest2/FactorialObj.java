package CodeTest2;

import java.util.Arrays;
import java.util.Scanner;

public class FactorialObj {
    public static void main(String[] args) {

Scanner input =new Scanner(System.in);
        System.out.println("Enter the number");
       int number= input.nextInt();
        int result=FactorialMain.factorialMethod(number);
        System.out.println("The factorial value of " +number +" is  : "+result);
}}
