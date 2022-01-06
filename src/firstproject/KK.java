package firstproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KK {

        public static void main(String[] args) {
            Integer array[]={1,2,3,3,1};
            System.out.println(Arrays.toString(array));
            Set<Integer> items = new HashSet<>(Arrays.asList(array));
            System.out.println(items);



        }
    }



