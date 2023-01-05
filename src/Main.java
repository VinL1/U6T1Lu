public class Main {
    public static void main (String [] args) {
        int[] heights = new int [3];

        for (int i = 0; i < heights.length; i ++){
            System.out.println(heights[i]);
        }

        heights[0] = 78;
        heights[1] = 72;
        heights[heights.length - 1] = 69;

        for (int i = 0; i < heights.length; i ++) {
            System.out.println(heights[i]);
        }
    }
}
