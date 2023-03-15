public class StatsTester {
    public static void main(String[] args) {
        double[] data = {1, 2, 3, 4, 5, 6};

        //create a StatsCalculator object'
        StatsCalculator myCalculator = new StatsCalculator(data);

        myCalculator.print();
        myCalculator.sortData();
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println(myCalculator.calculateMean());

    }
}
