package com.duplicate;

public class ContainsDuplicate {
    private static final String success = "Duplicate Found";
    private static final String failure = "No Duplicate Found";
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 1, 6};

        DuplicateFinder duplicateFinder = new DuplicateFinder();
        boolean containsDuplicate = duplicateFinder.evaluate(data);

        ContainsDuplicate.displayResult(containsDuplicate);
    }

    private static void displayResult(boolean containsDuplicate) {
        System.out.println(
            containsDuplicate ? ContainsDuplicate.success : ContainsDuplicate.failure
        );
    }
}
