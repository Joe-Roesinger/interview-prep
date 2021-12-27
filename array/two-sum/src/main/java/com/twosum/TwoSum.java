package com.twosum;

public class TwoSum {
    public static void main(String[] args) {
        int[] data = {1, 3, 4, 6};
        int target = 4;

        SumFinder sumFinder = new SumFinder();
        int[] matchIndexes = sumFinder.findTargetMatch(data, target);
        TwoSum.printResult(matchIndexes);
    }

    private static void printResult(int[] matchIndexes) {
        if(matchIndexes == null) {
            System.out.println("No match found.");
        } else if(matchIndexes.length == 2) {
            System.out.printf("Match found at {%d, %d}.", matchIndexes[0], matchIndexes[1]);
        } else {
            System.out.println("Houston we have a problem.");
        }
    }
}
