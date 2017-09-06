package Algorithm;

import java.util.ArrayList;

public class Fibonacci {
	
	//lastN까지의 피보나치 수열을 리스트에 저장한 후 리턴하는 메소드
	public ArrayList<Integer> fibonacci(int lastN){
		
		//수열을 리스트에 저장한 후 메인 클래스에서 출력한다
		ArrayList<Integer> list = new ArrayList<>();
		
		//1항
		int x1 = 0;
		list.add(x1);
		//2항
		int x2 = 1;
		list.add(x2);
		//3항
		int x3;
		
		//3항이 lastN보다 크지 않을 때까지 계속해서 순환한다.
		while(x1+x2 < lastN){
			//여기서 배열에 넣어주는 순서와 어떤 항을 넣어주는지가 매우 중요하다.
			//1항과 2항이 바뀌기 전에 결과값을 3항에 넣어주고 배열에 넣어준 후 항의 값을 변경해 줘야 한다.
			x3 = x1 + x2;
			list.add(x3);
			x1 = x2;
			x2 = x3;
			
		}
		return list;
	}

}
