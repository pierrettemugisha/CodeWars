public class SumTerms {
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double sum = n > 0 ? 1 : 0;
        int i = 4;
        while (n > 1) {
            sum += 1d / i;
            i += 3;
            n--;
        }
        return String.format("%.2f", sum);
    }

    public static void main(String[] args) {
        System.out.println(SumTerms.seriesSum(5));
        System.out.println(SumTerms.seriesSum(0));
        System.out.println(SumTerms.seriesSum(1000000005));
    }
}
