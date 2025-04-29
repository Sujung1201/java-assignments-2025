public class NoMemory {
    public static void main(String[] args) {
        String s = "A";

        while (true) {
            s += s + s;
        }
    }
}
