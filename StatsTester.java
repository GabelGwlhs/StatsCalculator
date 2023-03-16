public class StatsTester {
    public static void main(String[] args) {
        double[ ] data = {6.0,7.0,4.5,20.5,9.5,66.5,35.5,20.0};

//create a StatsCalculator object
        StatsCalculator myCalculator = new StatsCalculator(data);

        myCalculator.print();
        myCalculator.sortData();
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println("\nThe mean is " + myCalculator.calculateMean());





    }
}
