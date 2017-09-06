# 알고리즘 연습

### 합, 아나그램, 로또번호, 피보나치 알고리즘

- 제어문으로 반복하는 것보다 규칙과 패턴을 찾아 알고리즘을 짜는 것이 빠르다
- for문을 통해 합을 더하는 것보다 합의 규칙을 만들어 알고리즘을 짜면 성능에서 현저한 차이가 생긴다.
- 알고리즘에서 중요한 것은 가장 먼저 패턴을 찾는 것이다. 홀수, 짝수수, 3의 배수, 5의 배수이든 일정한 수로 증가한다는 패턴을 파악하는 것이 중요하다. 혹은 구하는 것, 각각 합에서 패턴을 찾아낼 수 있다. 즉, 변수 단위에서 패턴을 찾거나 변수의 합으로 새로운 변수를 만들어 '패턴'을 찾아내는 것이 중요하다.

> 합 구하기

```java
public static long sum(int limit, int d) {
	int count = limit/d;
	return count*(2*d+(count-1)*d)/2;
}
```
```java
public static long sumEven(int max) {
	return ((2+max)/2)*(max/2);
}
```
```java
public static long sumOdd(int max) {
	int count = (1+max)/2;
	return count*count;
}
```
```java
public static long sumOddOrEven(int max) {
	int oddOrEven = max%2;
	switch(oddOrEven) {
		case 0: return ((2+max)/2)*max/2;
		case 1: return ((1+max)/2)*((1+max)/2);
	}
	return 0;
}
```
> 로또 번호 구하기

```java
//기존 배열을 사용하는 경우
public int[] getLottoNumbers() {
	int[] result = new int[6];
	Random random = new Random();
	int count=0;
	int lottoNum = 0;

	outer : while(count < 6) {
		num = random.nextInt(45)+1;
		for(int i=0; i<result.length; i++) {
			if(result[i]==lottoNum) {
				continue outer;
			}
		}
		result[count] = lottoNum;
		count++;
	}
	return result;
}
```

> 아나그램

```java
public static boolean anagram(String a, String b) {

	// default 리턴값은 true
	boolean result = true;

	// 먼저 길이 비교하고
	// 그 다음 배열로 만들어 줄 수 있다.
	// a.toCharArray();
	// b.toCharArray();

	String[] aTemp = a.split("");
	String[] bTemp = b.split("");

	Arrays.sort(aTemp);
	Arrays.sort(bTemp);

	// 길이가 다르면 바로 false 리턴
	if(aTemp.length != bTemp.length) {
		return false;
	} else {
		for(int i=0; i<aTemp.length ; i++) {
			// 하나라도 다르면 바로 false 리턴
			if(!aTemp[i].equals(bTemp[i])) {
				return false;
			}
		}
	}
	return result;
}
```

>피보나치 수열

```java
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
```
