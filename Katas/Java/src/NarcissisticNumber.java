public class NarcissisticNumber {
    public static boolean narcissistic(int value) {
        int sum =0;
        int _value = value;
        int count = String.valueOf(_value).length();
        while (_value > 0) {
            sum += Math.pow(_value % 10, count);
            _value = _value / 10;
        }
        //System.out.println(("Original number " + value + ". Powered number " + sum + ""));
        return sum == value;
    }

    public static void main(String[] args) {
        System.out.println(NarcissisticNumber.narcissistic(153));
    }
}
