package com.zhoupu.dy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.Test;

public class T2 {

    @Test
    public void t2() {
        long s = 2018 ^ 2019;
        long y = 2019 ^ 2018;
        System.out.println(s);
    }

    @Test
    public void testList() {
        List<String> listData = new CopyOnWriteArrayList<>();
        listData.add("a");
        listData.add("b");
        listData.add("c");
        listData.add("d");
        listData.add("e");
        for (String s : listData) {
            if (s.equals("c")) {
                listData.remove(s);
            }
        }
        System.out.println(listData);

    }

    @Test
    public void testList2() {
        List<String> listData = new ArrayList<>();
        listData.add("a");
        listData.add("b");
        listData.add("c");
        listData.add("d");
        listData.add("e");
        for (String s : listData) {
            if (s.equals("c")) {
                listData.remove(s);
            }
        }
        System.out.println(listData);
    }


    @Test
    public void t3() {
        Map<String, Object> map = new HashMap<>();
        if (map.get("id").toString().equals("222")) {

        }
    }

}
