package com.company;

import java.util.Arrays;

public class ArlanHelper {

    public String drawQuad(int n) {
        int j = n;

        String result = "";
        while (j > 0) {
            j--;
            int i = n;
            while (i > 0) {
                result = result + "*";
                i--;
            }
            result = result + "\n";
        }
        return result;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        int line = height;
        while (line > 0) {
            line--;
            int columns = width;
            while (columns > 0) {
                result += c;
                columns--;
            }
            result += "\n";

        }

        return result;
    }
    public String drawLine(int length){
        String result = "";
        int i = 0;
        while (i < length) {
            i++;
            if (i%2 != 0){
                result +="*";
               // System.out.println(result);
            } else
                result +="#";
        }

        return result;

    }

    public String drawPattern(char[] pattern, int repeatCount) {
        int j = 0;
        String result = "";
        while (j < repeatCount) {
            j++;
            int i = 0;
            while (i < pattern.length) {
                result += pattern[i];
                i++;
            }



        }
        return result;
    }
        //Test output

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
        }


    }
