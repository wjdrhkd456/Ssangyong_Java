package src.javaStudy;
/*===========================================
  ■■■ 연산자(operator) ■■■
  - 비트 단위 연산자
=====================================*/



public class Test022
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;

		System.out.printf("~a : %d%n", ~a);
		System.out.printf("~b : %d%n", ~b);
	}
}


// 처리 결과
/*
~a : -11
~b : 9
계속하려면 아무 키나 누르십시오 . . .

*/


/*

a = 10 → 00001010
			 ↓
			 ↓~a
			 ↓
		  11110101 → -11

		  11110101 → -11?
		+ 00001011 → 11
		-----------------
		  00000000 → 0



b = -10 → ?????????	00001010 → 11110101
								  +		   1
								  -----------
								  	11110110 → -10
								  + 00001010 → 10
								  -----------
								  1 00000000


--=======> 11110110
			  ↓
			  ↓
			  ↓
		   00001001 = 9




// 항상 음수로 변환 후에는 검산 필수!!



*/