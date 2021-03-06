package src.javaStudy;
/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나 누르세요...

// ※ 소수 : 1 또는 자기 자신의 값 이외의 어떤 수로도 나눌 수 없는 값.
//			 단, 1은 소수 아님.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		System.out.print("임의의 정수 입력 : ");	

		

		/*
// ① 방법=======================================================================================================

		int n, i=1;						//-- 사용자로부터 받을 정수 변수, 증가변수, counter 변수 선언

		n = Integer.parseInt(br.readLine());		//-- 사용자로부터 정수 받기


		while ((n-i)%n!=0 || n==1)					//-- 소수란 1과 본인사이의 나눠지는 수가 없는 수, 1은 예외
		{

			i++;									//-- 증가 변수 add postfix
		
			if (i==n)								//-- 본인과 증가된 수가 같을 때 소수
			{
				System.out.printf("%d → 소수\n", n);
				return;
			}

			else if (i!=n)
			{	
				if (n%i==0 || n==1)					//-- 본인과 증가된 수가 같기 전에 증가된 수로 본인이 나눠지면 소수 아님
				{
					System.out.printf("%d → 소수 아님\n",n);
					return;
				}
				
			}
			else
			{										//-- 다른 경우 입력이 잘못되었다고 안내문 출력
				System.out.println("입력이 잘 못 되었습니다.");
				return;
			}
		}
		

		

		
		
		
// ② 방법====================================================================================================================
		while (i<n)
		{
				i++;
				if (n%i==0)
				{
					break;
				}
			
		}

			if (i!=n || n==1)
			{
				System.out.printf("%d → 소수아님\n", n);
			}
			else if (i==n)
			{
				System.out.printf("%d → 소수\n", n);
			}

			*/
// 선생님 ==============================================================================================================

		int n = 2;			//-- 입력값을 대상으로 나눗셈 연산을 수행할 변수
							//	 (1씩 증가)		27	→ 2 3 4 5 6 ... 26
		int num = 0;
		num = Integer.parseInt(br.readLine());
		boolean flag = true;//-- 소수다~!!!
		
				
		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;//-- 소수가 아니다~!!!
				break;		 //-- 불필요한 반복 없애기
			}

			n++;
		}

		// 결과 출력(출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
		// 소수이다. && 1 이 아니다.
		// → 최종 결론으로 소수다~!!!
		// 그렇지 않으면
		// → 최종 결론으로 소수 아니다~!!!

		if (flag && num!=1)
			System.out.printf("%d → 소수~!!!\n", num);
        else
			System.out.printf("%d → 소수 아님~!!!\n", num);



	}

		
}


// 실행 결과

/*
임의의 정수 입력 : 5
5 → 소수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 4
4 → 소수아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
1 → 소수아님
계속하려면 아무 키나 누르십시오 . . .
*/