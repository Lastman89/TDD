package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> map = new HashMap<>();

    public int add(String name, String phone) {
        map.put(name, phone);
        return map.size();
    }

    public String findByNumber(String phone) {
        return map.entrySet().stream().filter(key -> key.getValue() == phone)
            .map(Map.Entry::getKey).findFirst().get();
    }
}
