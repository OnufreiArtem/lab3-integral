package com.lodbrock;


import java.util.function.*;
public class Main {

    public static void main(String[] args) {
	    Function<Double, Double> function = x -> -Math.sin(x);

        double start = 0;
	    double end   = Math.PI;

	    double lineHeight = 0.5;

	    int accuracy = 100;

	    double range = end - start;
	    double value = range / accuracy;

	    double integral = 0;

	    for(int step = 0; step < accuracy; step++){
            double area = value;
			double functionResult = function.apply(step*value);

			if(lineHeight > 0)
				area *= functionResult < 0 ? Math.abs(functionResult) : Math.min(functionResult, lineHeight);
	        else
			{
				area *= functionResult < 0 ? Math.max(functionResult, lineHeight) : functionResult;
				area = Math.abs(area);
			}

			integral += area;
        }

        System.out.println("The integral is of current function is " + integral);

    }

}
