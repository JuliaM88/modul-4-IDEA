package com.company;

public class TrurlBank {
    public int sumQuads(int n){
        int i = 0;
        int res=0;
        while (i<n){
            i++;
            int curr = i ;
            //System.out.println(curr);
            res += curr * curr;
           // System.out.println(i);
           // System.out.println(res);
        }

        return res;
    }


    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }
}
