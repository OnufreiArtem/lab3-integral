package com.lodbrock;


import java.util.function.*;
public class Main {

    public static void main(String[] args) {
	    Function<Double, Double> function = Math::sin;

        double start = 0;
	    double end   = Math.PI;

	    double lineHeight = 0.1;

	    int accuracy = 100;

	    double range = end - start;
	    double value = range / accuracy;

	    double integral = 0;

	    for(int step = 0; step < accuracy; step++){
            double area = value;
            double functionHeight = Math.abs(function.apply(step*value));
            area *= Math.min(functionHeight, lineHeight);
	        integral += area;
        }
        System.out.println("The integral is of current function is " + integral);

    }

}
