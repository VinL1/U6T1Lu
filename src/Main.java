public class Main {
    public static void main (String [] args) {
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};

        String name = alphabeticalNames [1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = name;

        System.out.println (alphabeticalNames[0]);
        System.out.println (alphabeticalNames[1]);
        System.out.println (alphabeticalNames[2]);
        System.out.println (alphabeticalNames[3]);
    }
}
