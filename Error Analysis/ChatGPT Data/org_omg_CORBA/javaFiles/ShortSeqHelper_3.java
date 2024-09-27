import org.omg.CORBA.ShortSeqHelper;

public class ShortSeqHelper_3 {
    
    public static void main(String[] args) {
        short[] shortArray = new short[]{1, 2, 3, 4};
        
        // Converting short array to CORBA short sequence
        org.omg.CORBA.ShortSeqHolder shortSeqHolder = new org.omg.CORBA.ShortSeqHolder(shortArray);
        
        // Getting the String id of ShortSeqHelper
        String id = ShortSeqHelper.id();
        
        System.out.println("ShortSeqHelper id: " + id);
    }
}
