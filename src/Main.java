public class Main {
    public static void main (String [] args) {
        boolean[] bools = new boolean [6];
        for (int i = 0; i < bools.length; i ++){
            bools[i] = i % 2 == 0;
        }

        bools [0] = bools [3];

        System.out.println (bools.length);
        System.out.println (bools[0]);
        System.out.println (bools[bools.length - 1]);
    }
}
