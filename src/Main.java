public class Main {
    public static void main (String [] args) {
        String[] animals = new String[4];

        for (int i = 0; i < animals.length; i ++){
            System.out.println(animals[i]);
        }

        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";

        for (int i = 0; i < animals.length; i ++){
            System.out.println(animals[i]);
        }
    }
}
