public class Long_4 {
    public static void main(String[] args) {
        long num = 23;
        System.out.println("Original number: " + num);
        long highestOneBit = Long.highestOneBit(num);
        System.out.println("Highest one bit: " + highestOneBit);
    }
}
