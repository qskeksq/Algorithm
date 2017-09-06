package Algorithm;

public class Sum {

	public static void main(String[] args) {
		
//		long result = sum(10, 10);		
//		long evenResult = sumEven(10);
//		long oddResult = sumOdd(9);
//		long sumResult = sumOddOrEven(9);
	}
	
	/**
	 * 알고리즘에서 중요한 것은 가장 먼저 패턴을 찾는 것. 홀수가 됬든 짝수가 됬든 3의 배수, 5의 배수이든지 일정한 수로 증가한다는 패턴을
	 * 파악하는 것이 중요하다. 혹은 구하는 것, 즉 각각 합에서 패턴을 찾아낼 수 있다. 즉, 변수 단위에서 패턴을 찾거나, 변수의 합으로 새로운 변수를
	 * 만들어 '패턴'을 만들어 내는 것이 중요하다.
	 */
	
	public static long sum(int limit, int d) {
		int count = limit/d;
		return count*(2*d+(count-1)*d)/2;
	}
	
	public static long sumEven(int max) {
		return ((2+max)/2)*(max/2);
	}
	
	public static long sumOdd(int max) {
		int count = (1+max)/2;
		return count*count;
	}
	
	public static long sumOddOrEven(int max) {
		int oddOrEven = max%2;
		switch(oddOrEven) {
			case 0: return ((2+max)/2)*max/2;
			case 1: return ((1+max)/2)*((1+max)/2);
		}
		return 0;
	}

}
