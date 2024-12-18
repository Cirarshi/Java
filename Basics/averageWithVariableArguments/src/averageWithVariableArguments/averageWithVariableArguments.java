package averageWithVariableArguments;

public class averageWithVariableArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int average1 = (int) calculateAverage(10, 20, 30, 40, 50);
        System.out.println("Average 1: " + average1);

        double average2 = calculateAverage(1.5, 2.5, 3.5);
        System.out.println("Average 2: " + average2);
	}
	
	public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided.");
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

}
