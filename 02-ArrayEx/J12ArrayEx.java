package basic;

import java.util.Scanner;

public class J12ArrayEx {

	public static void main(String[] args) {
		// 국 영 수 과 입력받아 총점 평균 총점평균도 배열로 저장 평균 실수
		Scanner sc = new Scanner(System.in);
//		
//		
//		double scores[] = new double[5];
//		System.out.print("번호 = ");
//		scores[0] = sc.nextDouble();
//		System.out.print("국어 점수 = ");
//		scores[1] = sc.nextDouble();
//		System.out.print("영어 점수 = ");
//		scores[2] = sc.nextDouble();
//		System.out.print("수학 점수 = ");
//		scores[3] = sc.nextDouble();
//		System.out.print("과학 점수 = ");
//		scores[4] = sc.nextDouble();
//		
//		double tot[] = new double[5];
//		double avg[] = new double[5];
//		
//		for(int i=1;i<scores.length;i++) {
//			tot[0]+=scores[i];
//		}
//		avg[0] = tot[0]/(scores.length-1);
//		
//		System.out.println("번호 = "+scores[0]+"총점 = "+tot[0]+"평균 = "+avg[0]);
		

		//======================================================================
		
		
		String name[] = {"다나카", "타카나시", "카이지", "시라카미"};
		int stucount = name.length;
		String sub[] = {"국어", "영어", "수학", "과학","한국사"};
		int agumi[][] = new int[stucount][(sub.length+1)];
		double score[][] = new double[stucount][2];
		
		
		for(int n=0; n<agumi.length ;n++) {
		
		System.out.print("번호 = ");
		agumi[n][0] = sc.nextInt();
		
		for(int h = 0; h < sub.length; h++) {
			System.out.print(sub[h]+" 점수 = ");
			agumi[n][(h+1)] = sc.nextInt();
		}
		
		
		for(int i=1; i<agumi[n].length;i++) {
			score[n][0] += agumi[n][i];
		}
		
		score[n][1] = score[n][0]/sub.length;
		
		System.out.println("번호 : "+agumi[n][0]+" 이름 : "+name[n]+" 총점 : "+score[n][0]+" 평균 : "+score[n][1]);
		
		}
		System.out.println("==============================================================");
		for(int j = 0; j <agumi.length ; j++) {
			System.out.println("번호 : "+agumi[j][0]+" 이름 : "+name[j]+" 총점 : "+score[j][0]+" 평균 : "+score[j][1]);
		}
		double avgsum = 0;
		for(int k = 0; k<agumi.length; k++) {
			avgsum += score[k][1];
		}
		double aheikin = avgsum/agumi.length;
		System.out.printf("반 평균 : %.2f\n",aheikin);
		for(int l = 0; l < sub.length; l++) {
			System.out.print(sub[l]+" 평균 : ");
			double subsum = 0;
			for(int p = 0; p < stucount;p++) {
			subsum += agumi[p][(l+1)];
			}
			double subavg = (double)subsum/stucount;
			System.out.print(subavg+" ");
		}
		
		
		//=================================================================
		
//		String title[] = {"국어", "영어", "수학", "과학", "물리", "체육"};
//		
//		double jumsu[] = new double[title.length+2];
//		
//		for(int idx = 0; idx<title.length; idx++) {
//			System.out.print(title[idx]+"점수 = ");
//			jumsu[idx] = sc.nextDouble();
//		}
//
//		for(int idx=0; idx<title.length; idx++)
//			jumsu[title.length] += jumsu[idx];
//		
//		jumsu[title.length+1] = jumsu[title.length] / title.length;
//		
//		System.out.println("==================================");
//		
//		for(int i=0; i<jumsu.length; i++) {
//			if(title.length == i) {
//				System.out.println("총점 = " + jumsu[i]);
//			}else if(title.length+1 == i) {
//				System.out.println("평균"+jumsu[i]);
//			}else {
//			System.out.println(title[i]+"="+ jumsu[i]);
//			}
//		}
		
	
		//========================================================

	}

}
