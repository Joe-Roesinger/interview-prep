package com.twosum;

import java.util.HashMap;
import java.util.Map;

public class SumFinder {
    int[] findTargetMatch(int[] data, int target) {
        if(data == null) {
            throw new IllegalArgumentException("The data to find the target summation cannot be null.");
        }
        Map<Integer, Integer> cache = new HashMap<>();

        for(int i = 0; i < data.length; i++) {
            Integer matchIndex = cache.get(target - data[i]);

            if(matchIndex != null) {
                return new int[]{matchIndex, i};
            }

            cache.put(data[i], i);
        }

        return null;
    }
}
