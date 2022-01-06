package firstproject;

import java.util.Arrays;

public class JJ {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        int count=0;
        int[] kk=new int[array.length];
        for (int i= array.length-1;i>=0;i--){

                kk[count]=array[i];
                count++;
            }
            System.out.println(Arrays.toString(kk));
        }
    }

