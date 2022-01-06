package CodeTest2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayCompObj {
    public static void main(String[] args) {


    String[] list1 = {"happY","king","peace","living standard"};
    String[] list2 = {"king kong", "Happy", "PEACE"};
    System.out.println("The list1 array values are:" + Arrays.toString(list1));
    System.out.println("The list2 array values are:" + Arrays.toString(list2));
        StringArrayCompMain stringArrayObject=new StringArrayCompMain();
        List<String> list = stringArrayObject.commonString(list1, list2);
        System.out.println("The common String values in 2 input String arrays are : "+list);


}}
