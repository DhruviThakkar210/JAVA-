package collectionsdemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("hally");
        names.add("dhruvi");
        names.add("ruhi");
        System.out.println(names);
        System.out.println(names.get(0));
        names.add("amita");
        System.out.println(names);
        names.add(2, "amit");
        System.out.println(names);
        ArrayList<String> l1=new ArrayList<>();
        l1.add("ccc");l1.add("kjkj");l1.add("hkjhk");
        names.addAll(2,l1);
        System.out.println(names);
        ArrayList list=new ArrayList();
        list=(ArrayList)names.clone();

        
        System.out.println(list);
    boolean result = names.contains("ruhjhi");
    if(result)
        System.out.println("namae found ");
    else 
    System.out.println("name not found "); 

       
    }
}
