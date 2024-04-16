public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays ( 525600 );
        printYearsAndDays(1051200); // Additional test case
        printYearsAndDays(-525600); // Additional test case for negative value
        printYearsAndDays (561600);
    }

    public static void printYearsAndDays(long min) {

//        long h = min/60;
//        long d = (h / 24);
//        long y = (d / 365);
//        long nd = 0;

        if (min < 0) {
            System.out.println ("Invalid Value");
        }else  {
           long d = min/ (60 * 24); // overlooked combining values for variables.
           long y = d /365;
           long remainingDays = d % 365;

           System.out.println (min + " min = " + y + "y and " + remainingDays + "d");
        }
    }

}
