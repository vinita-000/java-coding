package code.practice;

import java.math.BigInteger;

public class AddMultiplyTwoBigNumbers {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("21436547655324213124235345");
        BigInteger b = new BigInteger("28375628756092835098723095");
        BigInteger result = a.add(b);
        BigInteger mult = a.multiply(b);
        System.out.println(result);
        System.out.println(mult);
    }
}
