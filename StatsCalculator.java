import java.util.Arrays;
public class StatsCalculator {

    //values - a private array of doubles. This array must always stay the same and not be modified.
    private double[] values;
    //sortedValues - a private array that contains the sorted values
    private double[] sortedValues;
    //StatsCalculator() - default constructor makes an array of size 20 full of 0s
    public StatsCalculator() {
        values= new doubles[20];
    }
    //StatsCalculator(double [ ] values) - overloaded constructor that sets instance variable equal to the parameter
    public StatsCalculator(double [] value) {
        values = value;
    }
    //public void sortData() - sorts the data
        public void sortData(){
            sortedValues = values;
            Arrays.sort(sortedValues);

        }
    //public double calculateMax() - find the maximum value in the array
    public double calculateMax() {
        double max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }
    //public double calculateMin() - finds the minimum value in the array
    public double calculateMin(){
        double min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (min >values[i]) {
                min = values[i];
            }
        }
        return min;
    }
    //public double calculateFirstQuartile() - finds the value of the first quartile. Please note that I exclude the median for calculating the quartiles
    public double calculateFirstQuartile(){
        int index=(sortedValues.length+1)/4;




    //public double calculateThirdQuartile() - finds the value of the third quartile. Please note that I exclude the median for calculating the quartiles
    //public double calculateMedian() - finds the value of the median
    //public double calculateSum() - finds the sum of the array
    //public double calculateMean() - find the mean of the array
    //public void print() - prints the data in a single line. Must use an enhanced for loop
    //public void printSorted() - prints the sorted data in a single line. Must use an enhanced for loop
    //public void printFiveNumberSummary() - prints the five number summary as shown below.
    }
}
