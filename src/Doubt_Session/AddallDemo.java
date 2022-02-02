package Doubt_Session;

import java.util.ArrayList;

public class AddallDemo {
    ArrayList<Integer> a1 = new ArrayList<Integer>(); //Generic list
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    public void InsertData()
    {
        a1.add(1);
        a1.add(2);
        a1.add(3);
        System.out.println(a1);
        System.out.println(a1.get(1));
        al1.add(4);
        al1.add(5);
        al1.add(6);
        a1.addAll(al1);
        System.out.println(a1);
        System.out.println(a1.size());
        a1.remove(2);
        System.out.println(a1);

    }
    public static void main(String[] args) {
        AddallDemo oo = new AddallDemo();
        oo.InsertData();
    }

}
