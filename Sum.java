package Algorithm;

public class Sum {

	public static void main(String[] args) {
		
//		long result = sum(10, 10);		
//		long evenResult = sumEven(10);
//		long oddResult = sumOdd(9);
//		long sumResult = sumOddOrEven(9);
	}
	
	/**
	 * �˰��򿡼� �߿��� ���� ���� ���� ������ ã�� ��. Ȧ���� ��� ¦���� ��� 3�� ���, 5�� ����̵��� ������ ���� �����Ѵٴ� ������
	 * �ľ��ϴ� ���� �߿��ϴ�. Ȥ�� ���ϴ� ��, �� ���� �տ��� ������ ã�Ƴ� �� �ִ�. ��, ���� �������� ������ ã�ų�, ������ ������ ���ο� ������
	 * ����� '����'�� ����� ���� ���� �߿��ϴ�.
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
