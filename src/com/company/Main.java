package com.company;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /*StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());*/

        /*String collect = "GRGeger ge gergergfdfsr32rt4yjytktiu567456"
                .chars()
                .distinct()
                .mapToObj(s -> "" + (char) s)
                .collect(Collectors.joining());
        System.out.println(collect);*/

        /*Locale aDefault = Locale.getDefault();
        System.out.println(aDefault);*/

/*        int a = 10;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {

        }
        System.out.println(c);*/

        /*try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/*        HashSet<String> hs = new HashSet<String>();
        hs.add("Z");
        hs.add("M");
        hs.add("N");
        hs.add("L");
        hs.add("F");

        System.out.println(hs);*/

/*        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("Z");
        hs.add("M");
        hs.add("N");
        hs.add("L");
        hs.add("F");

        System.out.println(hs);*/

        TreeSet hs = new TreeSet();
        hs.add("Z");
        hs.add("M");
        hs.add("G");
        hs.add("L");
        hs.add("F");

        System.out.println(hs);
    }
}
