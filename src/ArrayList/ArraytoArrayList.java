package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {
    public static void main(String[] args) {
        String words[]={"siva","joe","king","pop"};
        System.out.println("Array values are "+Arrays.toString(words));
        // converting Array to ArrayList
        List<String> Alist=new ArrayList<>();
        for(int i=0;i< words.length;i++) {
            Alist.add(words[i]);
        }
        System.out.println("Alist values are :" +Alist);

        // converting Array to ArrayList using asList() (asList method)
        List<String> ArrayList2=Arrays.asList(words);
        System.out.println("New Arraylist values are"+ArrayList2);


        // converting Array to ArrayList using enhanced for loop

        List<String> Alist1=new ArrayList<>();
        for (String ss:words)
        {
            Alist1.add(ss);
        }
        System.out.println("The Alist with enhanced:"+Alist1);
        }








    }

