import java.util.HashMap;

public class hashmap {
    public static void main(String args[]){
        HashMap<Integer , String  > namesHash=new HashMap<>();

        namesHash.put(1,"nanda");
        namesHash.put(2,"navin");
        namesHash.put(3,"nithin");
        namesHash.put(4,"naga");


        System.out.println("value for key 1 is :"+namesHash.get(1));
        System.out.println("value for key 2 is :"+namesHash.get(2));


    }
}
