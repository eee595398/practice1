package edu.kh.oop.practice.model.vo;

public class BookService {
	
	public void practice() {
		
		Book bo1 = new Book();
		Book bo2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		System.out.println(bo1.toString());
		System.out.println(bo2.toString());
	

		System.out.println(bo2.getTitle()+"/"+bo2.getPrice()+"/"+bo2.getDiscountRate()+"/"+bo2.getAuthor());
	
		
		bo1.setTitle("c언어");
		bo1.setPrice(30000);
		bo1.setDiscountRate(0.1);
		bo1.setAuthor("홍길동");
		System.out.println(bo1.getTitle()+"/"+bo1.getPrice()+"/"+bo1.getDiscountRate()+"/"+bo1.getAuthor());
		System.out.println("도서명 = ");
		System.out.println("할인된 가격 = ");
		System.out.println("도서명 = ");
		System.out.println("할인된 가격 = ");
		
	}

	
	
}
