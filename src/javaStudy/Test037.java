package src.javaStudy;
/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else 문 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.
// 단, 입력 데이터를 한 번에 처리할 수 있도록 구성하며
// 『xor』 연산자를 활용하여 스왑 처리를 할 수 있도록 한다.

// 실행 예)
// 임의의 세 정수 입력(공백 구분) : 160 80 214
// >> 정렬 결과 : 80 160 214
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		int a, b, c;
		//-- temp(임시 저장 변수) 선언하지 않음.

		Scanner scan = new Scanner(System.in);

		System.out.print("임의의 세 정수 입력(공백구분) : ");
		a = scan.nextInt();
		b = scan.nextInt();	
		c = scan.nextInt();

		if (a > b)
		{
			a ^= b;		// 아래 3줄을 한꺼번에 한줄에 작성했다고 해도 3줄을 쓴거나 다름 없음.
			b ^= a;		// 그러므로 괄호를 없앨 수 없음.
			a ^= b;
		}

		if (b > c)
		{
			b ^= c;
			c ^= b;
			b ^= c;
		}

		if (a > b)
		{
			a ^= b;
			b ^= a;
			a ^= b;
		}

		System.out.printf(">> 정렬 결과 : %d %d %d\n", a, b, c);
	}
}


// 실행 결과

/*

임의의 세 정수 입력(공백구분) : 57 13 62
>> 정렬 결과 : 13 57 62
계속하려면 아무 키나 누르십시오 . . .

*/