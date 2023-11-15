public class Main {
    public static void main(String[] args) {
        Integer[] intArray = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        Integer minInt = intMinMax.findMin();
        Integer maxInt = intMinMax.findMax();
        System.out.println("Min: " + minInt + ", Max: " + maxInt);

        Double[] doubleArray = { 3.14, 2.71, 1.41, 1.73, 2.0 };
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        Double minDouble = doubleMinMax.findMin();
        Double maxDouble = doubleMinMax.findMax();
        System.out.println("Min: " + minDouble + ", Max: " + maxDouble);
    }
}