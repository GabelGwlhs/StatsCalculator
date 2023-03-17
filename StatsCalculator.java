import java.util.Arrays;
/**
        * @file StatsCalculator.java
        * @author Gracie Gabel
        * @date 3/15/2023
        * @description creates an array based on the tester file in a constructor and if given no array has a defualt constructor.
        * can find the five number summary of the double array with various different methods and can do much more!
        */
public class StatsCalculator {

    //private arrays;
    private double[] values;
    private double[] sortedValues;

    /**
     * @descripton StatsCalculator() - default constructor makes an array of size 20 full of 0s
     */

    public StatsCalculator() {

        values = new double[20];
    }

    /**
     *
     * @param value which represent the array being taken in and set equal to
     * @var values.
     * @description this sets the value of that array to the array in the class, so it can be used.
     */

    public StatsCalculator(double[] value) {
        values = value;
    }

    /**
     * @description sorts the data and stores the data in the array
     * sortedValues.
     */
    public void sortData() {
        sortedValues = values;
        Arrays.sort(sortedValues);

    }

    /**
     * @description uses a for loop to iterate through the values array to find the max.
     * @returns the Max double in the values array.
     */
    public double calculateMax() {
        double max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    /**
     * @description uses a for loop to iterate through the values array to find the min.
     * @returns the Min double in the values array.
     */
    public double calculateMin() {
        double min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }

    /**
     * @description sorts the array and finds the first quartile within the array sortedValues.
     * @returns the first quartile value within the array sortedValues.
     */
    public double calculateFirstQuartile() {
        sortData();
        int index = 0;
        double[] firstHalf;

            firstHalf = new double[sortedValues.length / 2];
            for (int i = 0; i < firstHalf.length - 1; i++) {
                firstHalf[i] = sortedValues[i];}
            if(firstHalf.length%2==1) {
                return firstHalf[firstHalf.length / 2];
            }else{
                return (firstHalf[firstHalf.length / 2] + firstHalf[firstHalf.length / 2 - 1]) / 2.0;
                }


        }


    /**
     * @description sorts the array and finds the third quartile within the array sortedValues
     * @returns value of the third quartile with in the array sortedValues.
     */
    public double calculateThirdQuartile() {
        sortData();

        double [] lastHalf;
        if (sortedValues.length % 2 == 1) {
            lastHalf = new double [sortedValues.length/2];
            int indxLast=0;
            for(int i =sortedValues.length/2+1;i<sortedValues.length;i++){
                lastHalf[indxLast] = sortedValues[i];
                indxLast++;
            }
            if(lastHalf.length%2==1) {
                return lastHalf[lastHalf.length/2];
            }else{
                return (lastHalf[lastHalf.length/2]+lastHalf[lastHalf.length/2-1])/2;
            }



        } else  {
            lastHalf= new double [sortedValues.length/2];
            int indxLast=0;
            for(int i =sortedValues.length/2;i<sortedValues.length-1;i++){
                lastHalf[indxLast] = sortedValues[i];
                indxLast++;
            }
            if(lastHalf.length%2==1) {
                return lastHalf[lastHalf.length/2];
            }else{
                return (lastHalf[lastHalf.length / 2] + lastHalf[lastHalf.length / 2 - 1]) / 2.0;
            }


        }
    }
    /**
     * @descripton sorts the data and then calculates the median within the sortedValues array.
     * @return the median within the sortedValues array.
     */
    public double calculateMedian() {
        sortData();
        int inx = 0;
        if (sortedValues.length % 2 == 1) {
            return sortedValues[sortedValues.length/2];
        } else  {
            return (sortedValues[sortedValues.length / 2-1] + sortedValues[sortedValues.length/ 2 ])/2.0;

        }

    }

    /**
     * @description adds all the values together and
     * @returns the sum.
     */
    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    /**
     * @description calculates the mean by using the calculateSum() method and dividing it my the length of the array.
     * @return the Mean of the array.
     */
    public double calculateMean() {
        return calculateSum() / values.length;
    }

    /**
     * @description prints out all the data in the array a single line with spaces in between.
     */
    public void print() {
        for (double i : values) {
            System.out.print(i+" ");
        }
    }

    /**
     * @description prints out all the data within the array with spaces in between, but sorted.
     */
    public void printSorted() {
        System.out.println();
        for (double i : sortedValues) {
            System.out.print(i + " ");
        }
    }

    /**
     * @description prints out the five number summary tabbed
     * (min,first quartile, median, third quartile, and max)
     * with each value on another line.
     */
    public void printFiveNumberSummary() {
        System.out.println();
        System.out.println("The five number summary is:");
        System.out.println("\tMinimum: " + calculateMin());
        System.out.println("\tFirst Quartile: " + calculateFirstQuartile());
        System.out.println("\tMedian: " + calculateMedian());
        System.out.println("\tThird Quartile: " + calculateThirdQuartile());
        System.out.println("\tMaximum: " + calculateMax());
    }
}
