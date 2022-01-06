package CodeTest2;


import java.util.Arrays;

public class MaxArrayObj {


    public static void main(String[] args) {

        int[] input1 = {32,54,12,67,2,5};
        System.out.println("The given Array list is:" + Arrays.toString(input1));
        int result = MaxArrayMain.maxArray(input1);
        System.out.println("The maximum value in the array list  is : " + result);
    }
}