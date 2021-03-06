package src.javaStudy;
/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
===========================================*/

// 1 * 2 * 3 * 4 * ... * 9 * 10

// 실행 예)
// 연산 결과 : xxxx
// 계속하려면 아무 키나 누르세요...

public class Test049
{
	public static void main(String[] args)
	{
		int n = 1, x = 1;

		while (n<=10)
		{
			x *= n;
			System.out.println(n + " : 연산 결과 : " + x);
			n++;
			
		}

		System.out.println("\n연산 결과 : " + x);
	}
}

// 실행 결과

/*
1 : 연산 결과 : 1
2 : 연산 결과 : 2
3 : 연산 결과 : 6
4 : 연산 결과 : 24
5 : 연산 결과 : 120
6 : 연산 결과 : 720
7 : 연산 결과 : 5040
8 : 연산 결과 : 40320
9 : 연산 결과 : 362880
10 : 연산 결과 : 3628800

연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/