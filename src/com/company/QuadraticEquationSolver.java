package com.company;
import java.util.Arrays;
public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c){
        int d = b*b - 4*a*c;
        double [] result;
        if( d<0){
            return result = new double[0];
        }  else if  ( d == 0 ){
            double x = (double)-b / (2*a);

            return result = new double[] {x};
        } else {
            double x1 = (((-b)+Math.sqrt(d))/(2*a));
            double x2 = ((-b)-Math.sqrt(d))/(2*a);
            return result = new double[] {x1,x2};
        }


    }

        public static void main (String[] args){
                System.out.println(Arrays.toString(new QuadraticEquationSolver().solve(10,-100,240)));
        }


}

