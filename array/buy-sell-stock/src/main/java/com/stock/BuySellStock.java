package com.stock;

public class BuySellStock {
    private static final String profitMessage = "The max profit would be %d";
    private static final String noProfitMessage = "No profit can be made";
    public static void main(String[] args) {
        int[] data = {7, 1, 5, 3, 6, 4};
        MaxProfitCalculator maxProfitCalculator = new MaxProfitCalculator();
        int profit = maxProfitCalculator.calculate(data);

        BuySellStock.displayResults(profit);
    }

    private static void displayResults(int profit) {
        String output = profit == 0 ? BuySellStock.noProfitMessage : String.format(BuySellStock.profitMessage, profit);
        System.out.println(output);
    }
}
