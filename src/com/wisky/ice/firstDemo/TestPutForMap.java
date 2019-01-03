package com.wisky.ice.firstDemo;


import java.util.HashMap;
import java.util.Map;

public class TestPutForMap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1", "周一");
        map.put("2", "周二");
        map.put("3", "周三");
        map.put("4", "周四");
        map.put("5", "周五");
        map.put("6", "周六");
        map.put("7", "周日");
        System.out.println(map);

        // 我就想看看效果
        String result = map.get("1");
        System.out.println(result);

        int i = map.hashCode();
        System.out.println(i);



        //测试
        int size = map.size();
        System.out.println(size);

    }
}
