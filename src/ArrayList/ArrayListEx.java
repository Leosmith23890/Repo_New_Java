package ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> word = new ArrayList<String>();
word.add("Siva");
        word.add("mala");
        word.add("latha");
        word.add("kala");
        word.add("rama");
        word.add("latha");
        word.add("neka");
        word.add("metha");
        word.add("Latha");
        System.out.println("the word list :"+word);

//finding the length of arraylist
int sk=word.size();
        System.out.println("length : " +sk);

        //removing a data from arraylist using index value
        String jj=word.remove(0);
        System.out.println("remove name :"+jj);
        System.out.println("the word list :"+word);
        System.out.println(+word.size());

        //removing a data from arraylist outside the arraylength with throw exception
       // String jk=word.remove(10);
       // System.out.println(jk);

        //removing a data from arraylist using data value
        boolean jp=word.remove("metha");
        System.out.println("remove name :"+jp);
        System.out.println(+word.size());
        System.out.println("the word list :"+word);

        //to replace old with new value
        String krs=word.set(0,"Mango");
        System.out.println("After replacing mala with mango the new list is : "+word);


        //to get the data from AL
        String hh=word.get(1);
        System.out.println("get index1 :"+hh);

//out of bound exception on entering data index out of range
        //String gh=word.get(11);
        //System.out.println("get index1 :"+gh);

//to store mutiple data type

        List<Object> mulitpleDataType=new ArrayList<>();
        mulitpleDataType.add("siva");
        mulitpleDataType.add("100");
        mulitpleDataType.add("1.1");
        mulitpleDataType.add("'a'");
        mulitpleDataType.add("joe");
        System.out.println("multiple data type AL list : " +mulitpleDataType);
        System.out.println("Size : "+mulitpleDataType.size());

        for (int i=0;i<= mulitpleDataType.size()-1;i++)
            System.out.println(mulitpleDataType.get(i));
        System.out.println("...........................................................................");

        for( String sts : word){
            System.out.println("the list: "+sts);
        }
        System.out.println("............................");
        for (int i=0;i<= word.size()-1;i++) {
            if (word.get(i).equalsIgnoreCase("neka")) {
                System.out.println("the match : " + word.get(i));
            }}
                System.out.println("............................");
//to find the index of data in AL
                int jk = word.indexOf("latha");
                System.out.println("index :" + jk);
                System.out.println("............................");
//to find the last  index of data in AL
                int jk1 = word.lastIndexOf("latha");
                System.out.println("lastindex :" + jk1);
                System.out.println("............................");
                int jk11 = word.lastIndexOf("mango");
                System.out.println("lastindex :" + jk11);
                System.out.println("............................");
//to find the last occurance of latha

int lastIndex=-1;
        for (int j = 0; j <= word.size() - 1; j++) {
            if (word.get(j).equalsIgnoreCase("latha")) {
                lastIndex = j;
            }}
            if (lastIndex==-1){
                System.out.println("no value found");}
                else{
                System.out.println("value is in index "+lastIndex);
            }
        System.out.println("............................");



        }}


