package naveenjavaconcepts.collectionconcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArratyListConcept {
    public static void main(String[] args) {
        ArrayList<Object> arr= new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add("Testing");
        arr.add('t');
        arr.add(12.344);
        arr.add("Java");
        System.out.println(arr);
       /*System.out.println("----------------");
        for(Object o : arr){
            System.out.println(o);
        }
        System.out.println("----------------");
        for(int i =0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println("----------------");
        arr.forEach(ele -> System.out.println(ele));

        System.out.println("----------------");

        Iterator<Object> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(number);
        //number.forEach(ele -> System.out.println(ele));
        /*Iterator<Integer> it = number.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        arr.addAll(number);
        System.out.println(arr);

        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Tom","John","Tom","Naveen","Steve"));
        System.out.println(nameList);
        System.out.println(nameList.lastIndexOf("Tom"));

        nameList.clear();
        System.out.println(nameList);

        System.out.println(number.contains(10));

        ArrayList<String> clone = (ArrayList<String>)arr.clone();
        System.out.println(clone);

        clone.remove(4);
        System.out.println(clone);
        clone.remove("Testing");
        System.out.println(clone);


        ArrayList<Integer> no = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,22));
        no.removeIf(num -> num %2 == 0);
        System.out.println(no);

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Tom", "Tina", "Teee", "Sand", "Nav", "Tome", "Tomy"));
        System.out.println(name);
        name.removeIf(val -> val.contains("Tom"));

        System.out.println(name);


    }
}
