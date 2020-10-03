package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Main {


    public static void main(String[] args) throws IOException {

        ArrayList<String> listA = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите в список: ");
            String text = br.readLine();
            listA.add(text);
        }

        Iterator<String> a = listA.iterator();
        System.out.println("Список А: ");
        while (a.hasNext()) {
            System.out.println(a.next());
        }

        ArrayList<String> listB = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите в список: ");
            String text = br.readLine();
            listB.add(text);
        }

        Iterator<String> b = listB.iterator();
        System.out.println("Список Б: ");
        while (b.hasNext()) {
            System.out.println(b.next());
        }

        Collections.reverse(listB);
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("Список С: " + listC);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(listC, comparator);
        Iterator<String> c2 = listC.iterator();
        System.out.println("Отсортированный список С: ");
        while (c2.hasNext()) {
            System.out.println(c2.next());
        }
    }
}


