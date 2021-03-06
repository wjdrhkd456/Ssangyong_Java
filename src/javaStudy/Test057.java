package src.javaStudy;
/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(for문) 실습
===========================================*/

// ○ 실습 문제
// 1 부터 100 까지의 수 중에서
// 4의 배수만 출력하는 프로그램을 구현한다.
// 단, for 문을 활용해야 하며
// 한 줄에 5개씩 출력할 수 있도록 한다.

// 실행 예)
//	 4	8	12	16	20
//	24 28	32	36	40
//			:
// 계속하려면 아무 키나 누르세요...


public class Test057
{
	public static void main(String[] args)
	{
		/*
		int n, num=1;

		for (n=1; n<=25; n++)
		{
			if ((n-1)%5==0 && (n-1)!=0)		//-- 5개 씩 분할 하기, 첫 줄 개행하지 않기
			{
				System.out.println();		//-- 5개 채웠을 때 개행
			}
			num = 4 * n;					//-- 루프변수를 순차적 피연산자로 취하여 곱셈연산 실행
			System.out.printf(" %3d ",num);	//-- 연산값 출력
		}
		System.out.println();
		*/

// 선생님이랑 풀기 =================================================================================

		for (int n=4; n<=100; n+=4)
		{
			System.out.printf(" %3d ", n);
			if (n%(4*5)==0)
			{
				System.out.println();
			}
		}
		System.out.println();

	}
}

// 실행 결과

/*
   4    8   12   16   20
  24   28   32   36   40
  44   48   52   56   60
  64   68   72   76   80
  84   88   92   96  100
계속하려면 아무 키나 누르십시오 . . .
*/