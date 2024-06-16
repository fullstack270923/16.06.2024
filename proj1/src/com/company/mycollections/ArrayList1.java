package com.company.mycollections;

import com.company.mygenerics.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        int[] x = new int[10]; // 10 is the max
        // Arrays.stream(x).filter()
        ArrayList<String> fruits_list = new ArrayList<>();
        fruits_list.add("Apple");
        fruits_list.add("Banana");

        System.out.println(fruits_list);
        System.out.println("fruits_list.indexOf(\"Apple\"): " + fruits_list.indexOf("Apple"));
        System.out.println("fruits_list.get(1): " + fruits_list.get(1));

        System.out.print("fruits_list.stream().filter(f -> f.startsWith(\"A\")).forEach(System.out::println): ");
        fruits_list.stream().filter(f -> f.startsWith("A")).forEach(System.out::println);

        System.out.println("remove apple");
        fruits_list.remove("Apple");

        System.out.println(fruits_list);
        System.out.println(fruits_list.size());

        fruits_list = new ArrayList<>();
        fruits_list.add("Apple");
        fruits_list.add("Banana");

        List<Float> list = new ArrayList<>();
        list.add(1.5f);
        list.add(22.2f);
        list.add(33.f);

        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
                list.remove(i);
        }

        for (String fruit:  fruits_list) {
            System.out.println(fruit);
            fruits_list.remove("Banana");
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        System.out.println("Original list: " + list2);

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            it.next();  // Move the iterator to the next element
            it.remove();  // Remove the element at the current iterator position
        }

        System.out.println("List after removing all elements: " + list2);

    }

}
