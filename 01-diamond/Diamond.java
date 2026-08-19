package basic;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 홀수 입력(1~49)=");
		int i = sc.nextInt();
		if(i%2==0) {
			System.out.println("완벽한 다이아몬드를 위해 홀수로 만들겠습니다(+1)");
			i=i+1;
		}
		char alp = 'A';
		int count = 0;
		int step = 2;
		for(int row=1; row>=1; row+=step) {
			for(int space=1; space<=(i-row)/2; space++) {
				System.out.printf(" ");
			}
			for(int col=1; col<=row; col++) {
				System.out.printf("%s", alp);
				alp = (char)((alp == 'Z') ? ('A') : (alp + 1)) ;
				count++;
			}
//			alp = 'A';
			System.out.println();
			if(i==row) step=-2;
		}
//		for(int row=1; row<=i; row+=2) {
//			for(int space=1; space<=(i-row)/2; space++) {
//				System.out.printf(" ");
//			}
//			for(int col=1; col<=row; col++) {
//				System.out.printf("%s", alp);
//				alp = (char)((alp == 'Z') ? ('A') : (alp + 1)) ;
//				count++;
//			}
//			System.out.println();
//		}
//		for(int row=i-2; row>=1; row-=2) {
//			for(int space=1; space<=(i-row)/2; space++) {
//				System.out.printf(" ");
//			}
//			for(int col=1; col<=row; col++) {
//				System.out.printf("%s", alp);
//				alp = (char)((alp == 'Z') ? ('A') : (alp + 1)) ;
//				count++;
//			}
//			System.out.println();
//		}
		System.out.println(count);
		int ser = 0;
		for(int j=1; j<=i; j+=2) {
			ser +=j;
		}
		for(int k=i-2; k>=1; k-=2) {
			ser +=k;
		}
		System.out.println(ser);
		int ser2 = 0;
		ser2 = (i*i+1)/2; 
		System.out.println(ser2);
	}

}
