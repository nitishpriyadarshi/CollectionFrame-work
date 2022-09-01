package Bridelab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeanArrayList {
    public static void main(String[] args) {
      /*  List<Integer> List = new ArrayList();
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println(List);
        List.add(4); // this will add 4 at end of the line
List.add(1,50);//This will add 50 at index 1
        System.out.println(List);
        System.out.println(List);
        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(160);
        List.addAll(newList);//This will add all the element end of the line
        System.out.println(List);
        System.out.println(List.get(1));*/

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);
    /*    list.remove(1); //this will remove the index position
        System.out.println(list);
        list.remove(Integer.valueOf(30)); //this will remove the elememt at index position
        System.out.println(list);
        list.clear();
        System.out.println(list);//this will clear the element from the list elemnt*/
        list.set(2, 1000);
        System.out.println(list);
        System.out.println(list.contains(50));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " + list.get(i));


        }
        for (Integer element : list) {
            System.out.println("foreach the element is " + element);
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()){
                System.out.println("iterator" + it.next());
            }

        }


    }
}
