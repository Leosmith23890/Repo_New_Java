package practice;

public class StrMeth {
    public static void main(String[] args) {


        String city = "NeW YOrK";
        String cont = "new";
        boolean result = city.toUpperCase().contains(cont.toUpperCase());
        System.out.println("the contains result is "+result);
        char mk=city.charAt(city.length()-1);
        System.out.println("char value is : "+mk);
    }
}