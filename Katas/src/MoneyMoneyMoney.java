public class MoneyMoneyMoney {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        // your code
        int years = 0;
        if (principal < desired) {
            do {
                double beforeTax = principal * interest;
                double afterTax = beforeTax - (beforeTax * tax);
                principal += afterTax;
                years++;
            } while (principal < desired);
        }
        return years;
    }

    public static void main(String[] args) {
        System.out.println(MoneyMoneyMoney.calculateYears(1000, 0.05, 0.18, 1100));
        System.out.println(MoneyMoneyMoney.calculateYears(1000, 0.01625, 0.18, 1200));
        System.out.println(MoneyMoneyMoney.calculateYears(1000, 0.05, 0.18, 1000));
    }
}
