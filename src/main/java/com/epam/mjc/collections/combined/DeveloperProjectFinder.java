package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Comparator<String> comparator = (o1, o2) -> o2.length() -o1.length();
        List<String> nameProjects = new ArrayList<>();
        for(Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                nameProjects.add(e.getKey());
            }
        }


        nameProjects.sort(comparator);
        return nameProjects;
    }
}
