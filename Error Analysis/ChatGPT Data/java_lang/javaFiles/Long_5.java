public class Long_5 {
    public static void main(String[] args) {
        long number = 9L;
        long lowestBit = Long.lowestOneBit(number);
        System.out.println("Lowest one bit of " + number + " is: " + lowestBit);
    }
}
