import java.util.Arrays;

public class RandomStatsAyyay {

    public static void main(String[] args) {
        RandomStatsAyyay stats = new RandomStatsAyyay();
        
        int[] randomNumbers = stats.generate4DigitRandomArray(5);
        System.out.println("Random 4-digit numbers: " + Arrays.toString(randomNumbers));
        
        double[] results = stats.findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 9000) + 1000; // random 4-digit number between 1000 and 9999
        }
        return array;
    }

    // Method to find average, min, and max values of an array
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}
