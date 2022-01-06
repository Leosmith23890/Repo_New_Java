package practice;

import java.util.Arrays;

public class ArraySmallNumber {

    public static void main(String[] args) {
        int number[]={3,15,5,7,29};
        int[] number1=new int[number.length];
        System.out.println(Arrays.toString(number));
        int max=0;
        for (int i=0;i< number.length;i++){
            for(int j=0;j< number.length;j++){
             //   if((number[i])>number[j]){
                    if((number[i])<number[j]){
                max=number[i];
                number[i]=number[j];
                number[j]=max;

                }
                System.out.println(Arrays.toString(number));
            }

        }

    }

}
