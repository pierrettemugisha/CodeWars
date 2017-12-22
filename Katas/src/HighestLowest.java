public class HighestLowest {
    public static String HighAndLow(String numbers) {
        String[] arr_numbers = numbers.split("\\s");
        String low = arr_numbers[0];
        String high = arr_numbers[0];
        for (String str :
                arr_numbers) {
            if (Integer.parseInt(high) < Integer.parseInt(str)) {
                high = str;
            }
            if (Integer.parseInt(low) > Integer.parseInt(str)) {
                low = str;
            }
        }
        return String.format("%s %s", high, low);
    }

    public static void main(String[] args) {
        System.out.println(HighestLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(HighestLowest.HighAndLow("1 2 3 4 5"));
        System.out.println(HighestLowest.HighAndLow("1 2 -3 4 5"));
        System.out.println(HighestLowest.HighAndLow("1 9 3 4 -5"));
    }
}
