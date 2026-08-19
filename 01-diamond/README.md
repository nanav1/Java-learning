# Diamond

K-MOVE 과정 java 학습 중 짠 코드

## 학습한 것들

for 반복문, scanner

## 주어진 문제

임의의 홀수 입력받아 다이아몬드 모양 만들기
다이아몬드의 값은 알파벳 순서대로 반복되어야함

## 1차 구현.
 
 System.out.print("임의의 홀수 입력(1~49)=");
		int i = sc.nextInt();
    char alp = 'A';
    for(int row=1; row<=i; row+=2) {
        for(int space=1; space<=(i-row)/2; space++) {
            System.out.printf(" ");
        }
        for(int col=1; col<=row; col++) {
            System.out.printf("%s", alp);
            alp = (char)((alp == 'Z') ? ('A') : (alp + 1)) ;
        }
        System.out.println();
    }
    for(int row=i-2; row>=1; row-=2) {
        for(int space=1; space<=(i-row)/2; space++) {
            System.out.printf(" ");
        }
        for(int col=1; col<=row; col++) {
            System.out.printf("%s", alp);
            alp = (char)((alp == 'Z') ? ('A') : (alp + 1)) ;
        }
        System.out.println();
    }
    i를 입력 받으면, 먼저 피라미드의 윗 부분을 만들고,
    그 후 아래의 역피라미드를 만드는 구조.
    알파벳 순으로 내용을 채워넣는 것을 char 변수를 1씩 증가 시켜서 구현하고, Z가 되면 변수의 값을 삼항연산자를 이용해 A로 되돌려
    알파벳이 반복되도록 짬.

## 반복되는 구조 개선
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
        System.out.println();
        if(i==row) step=-2;
    }
    int row=1; row>=1; row+=step
    row가 step(2)만큼 점점 증가하다가
    입력한 i값과 row가 같아지면 step을 -2로 바꿔 다시 줄어들어
    1보다 작아지면(다이아몬드를 다 그리면) 반복문이 끝나는 형식으로 만듦


## 추가 구현
    다이아몬드를 그리는 데에 쓰인 알파벳의 갯수를 세는 방법을 3가지 구현해봤음.
    1. 변수 count를 만들어서 알파벳을 하나 그릴때마다 count를 1씩 증가시키는. 실셈의 방법
    2. 		int ser = 0;
		for(int j=1; j<=i; j+=2) {
			ser +=j;
		}
		for(int k=i-2; k>=1; k-=2) {
			ser +=k;
		}
        각 열의 알파벳 갯수를 다 더해서 구하는 방법
    3. 		int ser2 = 0;
		ser2 = (i*i+1)/2; 
        1부터 i까지의 모든 홀수의 합은 {(i+1)/2}^2
        올라가는 홀수 등차수열, 내려가는 등차수열까지 두배 - 가운데 곂치는 한줄(i개) 이니까
        {(i+1)/2}^2+{(i-1)/2}^2
        -> (i*i+1)/2
        수학적인 식 하나로 계산하는 방법.

## 
수학적인 계산, 생각을 조금씩 더 할 수 있도록 했고
삼항연산자를 적극 활용할 수 있도록 if 대신 사용함