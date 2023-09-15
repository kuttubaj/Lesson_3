public class Main {
    public static void main(String[] args) {
        double[] list = {1.56, -5.34, 4.6, 9.72, 5.29, -7.8, -9.23, 9.5, 10.1, 61.2, -1.5, -98.3, -2.3, 2.3, -32.4};
        double kill = 0;
        int opera = 0;
        boolean firstNegative = false;
        for (double NUM : list) {
            if (NUM < 0) {
                firstNegative = true;
            } else if (firstNegative) {
                kill += NUM;
                opera++;
            }
        }
        double bip = kill / opera;
        System.out.println("Среднее арифметическое положительных чисел - " + bip);
    }
}