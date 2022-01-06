package CodeTest2;

import java.util.ArrayList;
import java.util.List;

public class StringArrayCompMain {

    public  List<String> commonString(String[] input1, String[] input2) {
    String[] list1 = input1;
   String[] list2 = input2;
        List<String> myList=new ArrayList<>();

        for(int i=0;i<=list1.length-1;i++){
            for(int j=0;j<=list2.length-1;j++){
                if(list1[i].equalsIgnoreCase(list2[j])){
                    myList.add(list1[i].toLowerCase());
                }
            }
        }
      return myList;

}}