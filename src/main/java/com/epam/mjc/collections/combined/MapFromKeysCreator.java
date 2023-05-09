package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            if (!map.isEmpty() && map.containsKey(e.getKey().length())) {
                Set<String> newSet;
                newSet = map.get(e.getKey().length());
                newSet.add(e.getKey());
                map.put(e.getKey().length(), newSet);
            }else{
                Set<String> set = new HashSet<>();
                set.add(e.getKey());
                map.put(e.getKey().length(), set);
            }
        }
        return map;
    }
}
