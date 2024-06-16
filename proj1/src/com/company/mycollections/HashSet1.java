package com.company.mycollections;

import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println(hashSet);
    }

}
