import java.math.BigInteger;
import java.security.spec.DSAParameterSpec;

public class DSAParameterSpec_3 {
    public static void main(String[] args) {
        // Create a DSAParameterSpec object
        DSAParameterSpec dsaParameterSpec = new DSAParameterSpec(
                new BigInteger("6277101735386680763835789423207666416083908700390324961279"),
                new BigInteger("62295556557358440530398094194575627825784295090521581159"),
                new BigInteger("39919355636043424539597604449664020049569955147099669857"),
                new BigInteger("245666636715404666783780569685087765462657300881413000048"),
                new BigInteger("54809617457755007603088667360949001011647866653718360882")
        );

        // Get the value of g from the DSAParameterSpec object
        BigInteger g = dsaParameterSpec.getG();

        // Print the value of g
        System.out.println("The value of g is: " + g);
    }
}
