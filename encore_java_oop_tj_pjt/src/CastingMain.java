
public class CastingMain {
	
	// 자바의 캐스팅 연산자 : (타입)변수명 ;
	
	public static void main(String[] args) {
		byte x, y, sum ; // 선언 
		
		x = 10 ;
		y = 10 ;
		sum = (byte)(x + y) ;
		
		System.out.println("sum = "+sum);
		System.out.println();
		System.out.println();
		
		char charValue = 'A' ;
		char charValue02 = 'B' ;
		System.out.println("char value = "+charValue) ;
		System.out.println(charValue + charValue02);
		System.out.println((char)(97));
	}

}
