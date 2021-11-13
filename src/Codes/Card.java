package Codes;

public class Card {

// 	포커 카드 표현 클래스 

//	멤버변수 - 무늬 (pattern : 스페이드·하트·다이아·클로버)
	String pattern;

//	숫자 - (number : 1~10, 11, 12, 13) int
	int number;

//	카드의 가로크기 / 세로크기 => 모든 카드가 공유하는, 카드 종류 자체의 정보(속성)
	static double width = 5.5;
	static double height = 7.2;

	public Card(String pattern, int number) {
		super();
		this.pattern = pattern;
		this.number = number;
	}

	static void printCardClassInfo() {
		System.out.println("이 클래스는, 포커 카드를 표현하는 클래스입니다.");

	}

}