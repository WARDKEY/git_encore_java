
public class StringDemoMain {
	public static void main(String[] args) {
		// 자바에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수의 타입은 String	
		// String 은 인스턴스 생성없이 사용가능하지만 객체로 취급이 된다.
//		String str01 = "임섭순" ;	// 기본 타입처럼 사용했을 땐 둘 다 같다로 나온다.
//		String str02 = "임섭순" ;
		String str01 = new String("임섭순") ;	// 객체 생성하면 둘 다 다르다.
		String str02 = new String("임섭순") ;
		
		if(str01 == str02) {	// 주소를 직접 비교
			System.out.println("주소값이 동일합니다.");
		}else {
			System.out.println("주소값이 동일하지 않습니다.");
		}
		
		if(str01.equals(str02)) {	// 문자열을 비교
			System.out.println("값이 동일합니다.");
		}else {
			System.out.println("값이 동일하지 않습니다.");
		}
	}
}
