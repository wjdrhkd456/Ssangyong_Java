package src.javaStudy;
/*=====================================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - continue
=======================================================*/

/*
1 : 1
3 : 4
5 : 9
:
99 : 2500
*/

public class Test065
{
	public static void main(String[] args)
	{
		int n=0, s=0;

		while (n<100)
		{
			n++;

			// 테스트
			//System.out.println("n : " + n);

			if (n%2==0)	//-- 짝수라면...
				continue;
				//-- (뒷 부분 무시하고...) 계속해라.


			s += n;								//-- 뒷부분
			System.out.println(n + " : " + s);	//-- 뒷부분
		}

	}
}


// 실행 결과
/*
1 : 1
3 : 4
5 : 9
7 : 16
9 : 25
11 : 36
13 : 49
15 : 64
17 : 81
19 : 100
21 : 121
23 : 144
25 : 169
27 : 196
29 : 225
31 : 256
33 : 289
35 : 324
37 : 361
39 : 400
41 : 441
43 : 484
45 : 529
47 : 576
49 : 625
51 : 676
53 : 729
55 : 784
57 : 841
59 : 900
61 : 961
63 : 1024
65 : 1089
67 : 1156
69 : 1225
71 : 1296
73 : 1369
75 : 1444
77 : 1521
79 : 1600
81 : 1681
83 : 1764
85 : 1849
87 : 1936
89 : 2025
91 : 2116
93 : 2209
95 : 2304
97 : 2401
99 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/