import java.util.Arrays;
public class StatsCalculator {

    //values - a private array of doubles. This array must always stay the same and not be modified.
    private double[] values;
    //sortedValues - a private array that contains the sorted values
    private double[] sortedValues;

    //StatsCalculator() - default constructor makes an array of size 20 full of 0s
    public StatsCalculator() {

        values = new double[20];
    }

    //StatsCalculator(double [ ] values) - overloaded constructor that sets instance variable equal to the parameter
    public StatsCalculator(double[] value) {
        values = value;
    }

    //public void sortData() - sorts the data
    public void sortData() {
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
    public double calculateMin() {
        double min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }

    //public double calculateFirstQuartile() - finds the value of the first quartile. Please note that I exclude the median for calculating the quartiles
    public double calculateFirstQuartile() {
        sortData();
        int index = 0;
        double[] firstHalf;
        if (sortedValues.length % 2 == 1) {
            firstHalf = new double[sortedValues.length / 2];
            for (int i = 0; i < firstHalf.length; i++) {
                firstHalf[i] = sortedValues[i];
            }
            return (firstHalf[firstHalf.length / 2] + firstHalf[firstHalf.length / 2 - 1]) / 2.0;


        } else {
            firstHalf = new double[sortedValues.length / 2];
            for (int i = 0; i < firstHalf.length - 1; i++) {
                firstHalf[i] = sortedValues[i];}
            if(firstHalf.length%2==1) {
                return firstHalf[firstHalf.length / 2];
            }else{
                return (firstHalf[firstHalf.length / 2] + firstHalf[firstHalf.length / 2 - 1]) / 2.0;
                }


        }
    }

    //public double calculateThirdQuartile() - finds the value of the third quartile. Please note that I exclude the median for calculating the quartiles
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
            return (lastHalf[lastHalf.length/2]+lastHalf[lastHalf.length/2-1])/2;


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



    //public double calculateMedian() - finds the value of the median
    public double calculateMedian() {
        sortData();
        int inx = 0;
        if (sortedValues.length % 2 == 1) {
            return sortedValues[sortedValues.length/2+1];
        } else  {
            double num= sortedValues[(sortedValues.length) / 2-1] + sortedValues[(sortedValues.length) / 2 ];
            num=num/2;
            return num;
        }

    }

    //public double calculateSum() - finds the sum of the array
    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    //public double calculateMean() - find the mean of the array
    public double calculateMean() {
        return calculateSum() / values.length;
    }

    //public void print() - prints the data in a single line. Must use an enhanced for loop
    public void print() {
        for (double i : values) {
            System.out.print(i+" ");
        }
    }

    //public void printSorted() - prints the sorted data in a single line. Must use an enhanced for loop
    public void printSorted() {
        System.out.println();
        for (double i : sortedValues) {
            System.out.print(i + " ");
        }
    }

    //public void printFiveNumberSummary() - prints the five number summary as shown below.
    public void printFiveNumberSummary() {
        System.out.println();
        System.out.println("\tMinimum: " + calculateMin());
        System.out.println("\tFirst Quartile: " + calculateFirstQuartile());
        System.out.println("\tMedian: " + calculateMedian());
        System.out.println("\tThird Quartile: " + calculateThirdQuartile());
        System.out.println("\tMaximum: " + calculateMax());
    }
}
