# 알고리즘 연습

- 제어문으로 반복하는 것보다 규칙과 패턴을 찾아 알고리즘을 짜는 것이 빠르다
- for문을 통해 합을 더하는 것보다 합의 규칙을 만들어 알고리즘을 짜면 성능에서 현저한 차이가 생긴다.
- 알고리즘에서 중요한 것은 가장 먼저 패턴을 찾는 것이다. 홀수, 짝수수, 3의 배수, 5의 배수이든 일정한 수로 증가한다는 패턴을 파악하는 것이 중요하다. 혹은 구하는 것, 각각 합에서 패턴을 찾아낼 수 있다. 즉, 변수 단위에서 패턴을 찾거나 변수의 합으로 새로운 변수를 만들어 '패턴'을 찾아내는 것이 중요하다.

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

```
