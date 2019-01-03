package com.wisky.ice.firstDemo;

import java.util.HashMap;
import java.util.Map;

public class FirstMap {

    public static void main(String[] args) {
//        Map<String, String> paramMap = new HashMap<String, String>();
//        paramMap.put("1", "111111");
//        paramMap.put("2", "222222");
//        paramMap.put("3", "333333");
//        paramMap.put("4", "444444");
//        paramMap.put("5", "555555");
//        paramMap.put("6", "666666");

//        String a = "今天是周三";
//
//        String b = "今天是周三";
//
//        String c = new String("啊啊啊啊啊啊");
////        String d = c;
//        String d = new String("啊啊啊啊啊啊");
//
//        System.out.println(c.equals(d));
//        System.out.println(c == d);

        Integer a = 200;
        Integer b = a;
        int c = 268;
        int d = 268;
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(c == d);

    }
}
