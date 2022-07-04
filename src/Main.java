public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6};

        double harmonicSum = 0;

        for (int i = 0; i < list.length; i++) {

            harmonicSum += 1.0 / list[i];

        }
        System.out.println("Harmonic Average: " + list.length / harmonicSum);
    }
}
