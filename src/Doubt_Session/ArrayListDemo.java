package Doubt_Session;

import java.util.ArrayList;

public class ArrayListDemo {
    //ArrayList a1 = new ArrayList(); // Non Generic list
    ArrayList<Integer> a1 = new ArrayList<Integer>(); //Generic list
    public void InsertData()
    {
        a1.add(1);
        a1.add(2);
        a1.add(3);
        System.out.println(a1);
        System.out.println(a1.get(1));
    }
    public static void main(String[] args) {
        ArrayListDemo oo = new ArrayListDemo();
        oo.InsertData();
    }
}
