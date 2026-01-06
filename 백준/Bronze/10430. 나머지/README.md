# [Bronze V] 나머지 - 10430 

[문제 링크](https://www.acmicpc.net/problem/10430) 

### 성능 요약

메모리: 14204 KB, 시간: 104 ms

### 분류

구현, 사칙연산, 수학

### 제출 일자

2026년 1월 6일 23:27:38

### 문제 설명

<p>(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?</p>

<p>(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?</p>

<p>세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)</p>

### 출력 

 <p>첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.</p>

-

[첫 코드]
```
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        
        long A = next.nextLong();
        long B = next.nextLong();
        long C = next.nextLong();
        
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
```

1) Scanner

장점

사용법이 직관적이고 코드가 짧다.

토큰 단위(nextInt(), nextLong())로 바로 읽을 수 있다.

단점

상대적으로 느리다(입력량이 많아질수록 체감).

대형 입력/반복 테스트 케이스에서 TLE 위험이 있다.

추천 상황

입력이 매우 작은 문제

빠르게 문제 이해/구현에 집중하고 싶을 때(연습용)

2) BufferedReader + StringTokenizer

장점

매우 빠르다(대부분의 알고리즘 문제에서 안정적).

입력 규모가 커져도 성능이 잘 유지된다.

단점

readLine() 기반이라 토큰화/파싱을 직접 처리해야 한다.

IOException 처리(throws 또는 try-catch)가 필요하다.


