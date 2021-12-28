package com.stock;

public class MaxProfitCalculator {
    public int calculate(int[] data) {
        if(data == null) {
            return 0;
        }

        int min = data[0];
        int diff = 0;
        for(int i = 1; i < data.length; i++) {
            if(min > data[i]) {
                min = data[i];
            }

            int temp = data[i] - min;
            if(temp > diff) {
                diff = temp;
            }
        }

        return diff;
    }
}
