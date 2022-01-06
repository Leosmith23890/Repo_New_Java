package CodeTest2;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SmallestPositiveIntMain {
    public  static int missingInteger(int[] input1) {
        int[] input2 = input1;
        int arraySize = input2.length;
        System.out.println("The length of array is " + arraySize);
        HashSet<Integer> mySet = new HashSet<Integer>();
        for (int i = 0; i < arraySize; i++) {
            mySet.add(input2[i]);
        }
        System.out.println("The values of HashSet are : " + mySet);
        int setSize = mySet.size();
        List<Integer> myArrayList = new ArrayList<>();


        for (int i = 1; i <= setSize + 1; i++) {
            if (!mySet.contains(i)) {
                //System.out.println(i);
                myArrayList.add(i);
            }
        }
        System.out.println("The ArrayList with missing values are " + myArrayList);
        Integer result = null;
        for (int m = 0; m < myArrayList.size() - 1; m++) {
            for (int p = 0; p < myArrayList.size() - 1; p++) {

                if (myArrayList.get(m) < myArrayList.get(p)) {
                    result = myArrayList.get(m);
                }

            }
        }
        return result;
    }}


