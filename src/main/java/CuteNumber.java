import java.util.Arrays;

public class CuteNumber {
    public boolean checkCuteNumberGreaterThan10(int[] numbers) {
        int[] evenNumbers = findAllEvenNumbers(numbers);
        int largestNumber = findLargestNumber(evenNumbers);

        return isGreaterThan10(largestNumber);
    }

    private int[] findAllEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .toArray();
    }

    private int findLargestNumber(int[] numbers) {
        return Arrays.stream(numbers)
                .max()
                .getAsInt();
    }

    private boolean isGreaterThan10(int number) {
        return number > 10;
    }
}
