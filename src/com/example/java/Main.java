package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> map1= new HashMap<>();
        map1.put("Kerala", "Aluva");
        map1.put("Tamil Nadu", "Coimbatore");
        map1.put("Karnataka","Banglore");

        System.out.println(map1);

        System.out.println("Removing place in kerala");
        map1.remove("Kerala");
        System.out.println("The map is now"+ map1);
        System.out.println("A place in Karnataka is: " + map1.get("Karnataka"));

    }
}
