import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimalConcept {
	public static void main(String[] args) {
		
//		double a = 0.03;
//		double b = 0.04;
//		double c = b - a;
		
//		BigDecimal a = new BigDecimal("0.03");
//		BigDecimal b = new BigDecimal("0.04");
//		BigDecimal c = b.subtract(a);
//		
		BigInteger a = new BigInteger("34583254859");
		BigInteger b = new BigInteger("6329876837");
		
		BigInteger c = a.add(b);
		
		System.out.println(c);
		
	}
}
