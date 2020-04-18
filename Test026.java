/*================================
  ■■■ 연산자(operator) ■■■
  - 비트 단위 연산자
==================================*/


// 비트 shift 연산자

public class Test026
{
	public static void main(String[] args)
	{
		int x = 128;		// 00000000 00000000 00000000 10000000

		System.out.printf("x << 3: %d\n", x<<3);
		System.out.printf("x * 8 : %d\n", x*8);

		System.out.printf("x >> 3 : %d\n", x>>3);
		System.out.printf("x / 8 : %d\n", x/8);


		System.out.printf("x << 24 : %d\n", x<<24);
		// 10000000 00000000 00000000 00000000		--==>> 이렇게 되면 MSB가 바뀐 상황이 되어버려
		// --==>> x << 24 : -2147483648

		System.out.printf("x << 25 : %d\n", x<<25);
		// 00000000	00000000 00000000 00000001
		//
		//--==>> x << 25 : 0

		System.out.printf("x << 26 : %d\n", x<<26);
		// 00000000	00000000 00000000 00000010
		//
		//--==>> x << 26 : 0

		System.out.printf("x << 32 : %d\n", x<<32);
		// 00000000	00000000 00000000 10000000
		//
		//--==>> x << 32 : 128

		System.out.printf("x << 33 : %d\n", x<<33);
		// 00000000	00000000 00000001 00000000
		//
		//--==>> x << 32 : 256





	}
}


// 실행 결과
/*
x << 3: 1024
x * 8 : 1024
x >> 3 : 16
x / 8 : 16
계속하려면 아무 키나 누르십시오 . . .
*/