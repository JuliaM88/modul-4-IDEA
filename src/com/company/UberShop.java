package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UberShop {
    public void printPrices(float[] prices) {
        int i;
        float x;
        ;
        for (i = 0; i < prices.length; i++) {
            x = prices[i];
            System.out.println(x + " jup.");
        }

    }

    public void multiplyPrices(float[] prices) {
        int i;
        float priceOrigin;
        float newPrice;


        for (i = 0; i < prices.length; i++) {

            priceOrigin = prices[i];
            if (priceOrigin < 1000f) {
                newPrice = priceOrigin * 2f;
                prices[i] = newPrice;
            } else {
                newPrice = priceOrigin * 1.5f;
                prices[i] = newPrice;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        Arrays.sort(prices);
        int[] result;


        if (prices[0] == prices[(prices.length - 1)]) {
            return result = new int[]{prices[0]};
        } else if (prices[0] != prices[(prices.length - 1)]) {
            return result = new int[]{prices[0], prices[prices.length - 1]};
        }


        return result = new int[0];

    }
    public int getMinPriceCount(int[] prices){
    int i;
    int result;
    int count = 0;
    Arrays.sort(prices);
        if (prices.length == 0) {
            return 0;
        }
        for(i = 0; i < prices.length; i++) {
            if (prices[i] == prices[0]) {
                count++;

            }
             }
        return  count;
    }
//for(i = 0; i < n; i++)
//    { if(a[i] == x){
//            count++;
//        }
//    }
//        System.out.println("Number of Occurrence of the Element:"+count);

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for(int price: prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for(int price: prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }




    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [150, 200]
        int[] prices = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
    }

}
