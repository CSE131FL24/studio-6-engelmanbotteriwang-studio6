package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0.0;
		if (n==0) {
			return 0.0;
		}
		if (n == 1) {
			return 0.5;
		}
		sum = 1/ Math.pow(2, n) + geometricSum(n-1);
		return sum;
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius <= radiusMinimumDrawingThreshold) {
			return;
		}
		StdDraw.setPenColor(155, 10, 155);
		StdDraw.circle(xCenter, yCenter, radius);
		circlesUponCircles(xCenter + radius, yCenter, radius/3,radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter - radius, yCenter, radius/3,radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter + radius, radius/3,radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter - radius, radius/3,radiusMinimumDrawingThreshold);
		return;
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int [] reversed = reverseArray(array, 0, array.length - 1);
			
		return reversed;
		
	}
	
	public static int[] reverseArray(int[] x, int i, int j) {
		 int [] arrayReverse;
		if(i<j){
		       int tmp = x[i];
		       x[i] = x[j];
		       x[j] = tmp;
		       arrayReverse =  reverseArray(x, ++i, --j);
		    }   
		 return arrayReverse;
	}
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

}
