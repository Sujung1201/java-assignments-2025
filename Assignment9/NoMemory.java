public class NoMemory {
    public static void main(String[] args) {
        while (true) {
            int[] bigArray = new int[1000000000];
            System.out.println(bigArray.length);
        }
    }
}
