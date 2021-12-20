package com.company;

import java.util.Arrays;

public class CheapStocks {

    public String getCheapStocks(String[] stocks) {
            String [] parts;
            String result ="";
        for (int i = 0; i < stocks.length; i++){
            parts = stocks[i].split( " ");
            int number = Integer.parseInt(parts[1]);
            if (number <200){
                result = result + parts[0] + " ";
            }
            // System.out.println(Arrays.deepToString(parts));


        }
        return result;
    }


    public static void main(String[] args) {
    String[] stocks = new String[]{"a 199", "b 201"};
    CheapStocks cheapStocks = new CheapStocks();
        System.out.println(cheapStocks.getCheapStocks(stocks));

//        String [] text = new String[]{"a 10", "b 12"};
//        String firstEl = text[0];
//        String[] parts = firstEl.split(" ");
        // int number1 = Integer.parseInt(parts[0]); //123
//        int number2 = Integer.parseInt(parts[1]); //456
//        System.out.println(Arrays.deepToString(parts));
    }
}
