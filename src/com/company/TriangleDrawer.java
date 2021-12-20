package com.company;

public class TriangleDrawer {

    public String drawTriangle(int side) {

        String result = "";
        int i = side;
        while (i > 0) {
            i--;
            result += "*";
           // System.out.println(result);
        }
        int n = side;
        result = result + "\n";
        while (n >= 0) {
            n--;
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }


        return result;
    }

    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(triangleDrawer.drawTriangle(5));
          //  System.out.println("hh");
    }

}
