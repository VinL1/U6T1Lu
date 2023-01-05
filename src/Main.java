public class Main {
    public static void main (String [] args) {
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = new double[2];

        array3[0] = array1[0] + array2[0];
        array3[1] = array1[1] * array2[1];

        System.out.println(array3[0]);
        System.out.println(array3[1]);
    }
}
