import java.util.ArrayList;
import java.util.List;

public class SummationFinder {

    int findNumberBySumUsingList(int[] numbers, int expectedSum) {
        List<Integer> numbersList = prepareList(numbers);
        List<Integer> tempList = new ArrayList<>();

        int count = 0;

        for (int number : numbersList) {
            int initialNum = expectedSum - number;

            if (tempList.contains(initialNum)) {
                count++;
            }

            tempList.add(number);
        }

        return count;
    }

    int findNumberBySum(int[] numbers, int expectedSum) {
        int firstElement = 0;
        int lastElement = numbers.length - 1;
        int count = 0;

        while (firstElement < lastElement) {
            int sum = numbers[firstElement] + numbers[lastElement];

            if (sum == expectedSum) {
                count++;
                firstElement++;
                lastElement--;
            }
            else if (sum < expectedSum) {
                firstElement++;
            }
            else {
                lastElement--;
            }
        }

        return count;
    }


    private List<Integer> prepareList(int[] numbers) {
        List<Integer> numbersList = new ArrayList<Integer>();

        for (int number : numbers) {
            numbersList.add(number);
        }

        return numbersList;
    }

}
