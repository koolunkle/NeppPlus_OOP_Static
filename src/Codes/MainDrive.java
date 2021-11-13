package Codes;

public class MainDrive {

	public static void main(String[] args) {

//		Card card1 = new Card("스페이드", 2);
//		Card card2 = new Card("하트", 7);

		Card.width = 10.3;
		Card.height = 12.5;

		System.out.println(Card.width);
		System.out.println(Card.height);

		Card.printCardClassInfo();

//		Math.random 함수 연습 
		System.out.println(Math.random());
		test();
	}

	static void test() {
		System.out.println("별도 코드 모아서 작성");

	}

}