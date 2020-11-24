public class Main {
    public static void main(String[] args) {
        CuteNumber cuteNumber = new CuteNumber();
        int[] numbers = {1, 3, 5, 8, 10, 15, 14};
        boolean isGreaterThan10 = cuteNumber.checkCuteNumberGreaterThan10(numbers);

        System.out.println(isGreaterThan10);
    }
}
