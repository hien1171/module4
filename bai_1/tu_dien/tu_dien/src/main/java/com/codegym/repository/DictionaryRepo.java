package com.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DictionaryRepo implements IDictionaryRepo {
    private static List<String> tiengViet= new ArrayList<>();
    private static List<String> engLish=new ArrayList<>();

    private static Map<String,String> map=new HashMap<>();

    static{
        map.put("mot","one");
        map.put("hai","two");
        map.put("ba","three");
    }


    public Map<String,String> listWord(){
        return map;
    }

}
