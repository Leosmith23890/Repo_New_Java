package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer,String> studentMap=new HashMap<>();
        studentMap.put(1,"Deepak");
        studentMap.put(2,"Sivasankari");
        studentMap.put(3,"Ram");
        studentMap.put(4,"Rani");
        studentMap.put(5,"John");
        studentMap.put(6,"Divya");
        System.out.println();
        System.out.print("The MapSet list is :" +studentMap);
        System.out.println("The HashMap size is: "+studentMap.size());
        //String kk=studentMap.remove(1);
       // System.out.println("Value removed is "+kk);
  boolean jk=studentMap.remove(3,"Ram");
        System.out.println("Value removed is "+jk);
        System.out.println("The HashMap size is: "+studentMap.size());
        String  mk=studentMap.get("John");
        System.out.println("fetch" +mk);
        System.out.println(studentMap.size());
        System.out.println("The Hashmap Key sets are");
        Set<Integer> allIds = studentMap.keySet();
        System.out.println("The keyset values are : " +allIds);

        for (Integer id : allIds) {
            {
                System.out.println("ID=" + id + ", Name= " + studentMap.get(id));

            }
        }
        System.out.println("\nnext exercise");


        for (Integer id1 : allIds) {
            if (id1%2 == 0 && (studentMap.get(id1).length())>4)
            {
                System.out.println("ID=" + id1 + ",Name= " + studentMap.get(id1));
            }

        }

    }}
