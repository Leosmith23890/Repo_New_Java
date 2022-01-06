package codeTest;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ReverseStr {
    public static void main(String[] args) {
        String word="learn";
        String newStr="";
        for(int i=1;i<=word.length();i++)
        {
newStr=newStr+word.charAt(word.length()-i);

        }
        System.out.println(newStr);

    }
}
