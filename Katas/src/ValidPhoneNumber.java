public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        // TODO: Return whether phoneNumber is in the proper form
        return phoneNumber.matches("^\\(?\\d{3}\\)[\\s]\\d{3}[-]\\d{4}$");
    }

    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(123) 456-7890"));
        System.out.println(validPhoneNumber("(1111)555 2345"));
        System.out.println(validPhoneNumber("(098) 123 4567"));
    }
}
