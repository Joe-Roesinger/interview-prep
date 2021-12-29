package com.duplicate;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {
    public boolean evaluate(int[] data) {
        if(data == null || data.length <= 1) {
            return false;
        }
        
        Set<Integer> cache = new HashSet<>();

        for(int num : data) {
            if(cache.contains(num)) {
                return true;
            } else {
                cache.add(num);
            }
        }

        return false;
    }
}
