package com.company.mycollections;

import com.company.targil2.Cat;

import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "One");
        hashMap.put(250, "Two");
        hashMap.remove(100);
        hashMap.put(250, "two hundred fifty");

        System.out.println("hashMap.get(250): " + hashMap.get(250));

        HashMap<String, String> danny = new HashMap<>();
        danny.put("name",  "Danny");
        System.out.println("danny.get(\"name\") : " + danny.get("name"));

        HashMap<Integer, Cat> db = new HashMap<>();
        db.get(998652);

        // 1, 100000, 34875, 2, 2, 1, 34875, 34875, 34875
        HashMap<Integer, Integer> dup = new HashMap<>();
        int[] list = { 1, 100000, 34875, 2, 2, 1, 34875, 34875, 34875 };
        for(Integer i : list) {
            int counter = 0;
            if (dup.containsKey(i)) {
                counter = dup.get(i);
            }
            dup.put(i, counter + 1);
            // 1: 2
            // 100000: 1
            // 34875: 2
            // 2: 2

        }

        System.out.println(hashMap);
    }
}
