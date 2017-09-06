package Algorithm;

import java.util.ArrayList;

public class Fibonacci {
	
	//lastN������ �Ǻ���ġ ������ ����Ʈ�� ������ �� �����ϴ� �޼ҵ�
	public ArrayList<Integer> fibonacci(int lastN){
		
		//������ ����Ʈ�� ������ �� ���� Ŭ�������� ����Ѵ�
		ArrayList<Integer> list = new ArrayList<>();
		
		//1��
		int x1 = 0;
		list.add(x1);
		//2��
		int x2 = 1;
		list.add(x2);
		//3��
		int x3;
		
		//3���� lastN���� ũ�� ���� ������ ����ؼ� ��ȯ�Ѵ�.
		while(x1+x2 < lastN){
			//���⼭ �迭�� �־��ִ� ������ � ���� �־��ִ����� �ſ� �߿��ϴ�.
			//1�װ� 2���� �ٲ�� ���� ������� 3�׿� �־��ְ� �迭�� �־��� �� ���� ���� ������ ��� �Ѵ�.
			x3 = x1 + x2;
			list.add(x3);
			x1 = x2;
			x2 = x3;
			
		}
		return list;
	}

}
