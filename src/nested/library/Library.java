package nested.library;

import java.util.ArrayList;
import java.util.Iterator;

public class Library
{
	private Object[] books;
	private int count =0; 
	
	public Library(int max){
		
		books = new Object[max];
	}
	
	private static class Book{
		private String title;
		private String author;
		
		public Book(String title , String author)
		{
			this.title = title;
			this.author = author;
		}
		
		public String getTitle()
		{
			return title;
		}
		
		public String getAuthor()
		{
			return author;
		}
		
	}
	public void addBook(String title , String author) {
		
		if (count >=books.length)
		{
			System.out.println("도서관 저장 공간이 부족합니다.");
			return;
		
		}
		
		books[count++] = new Book(title, author);
	}
	
	public void showBooks() {
		
		System.out.println("============[책 목록 출력]============");
		for (Object book : books)
		{
			System.out.println("도서 제목 : " +((Book)book).getTitle() + ", 저자 : "+ ((Book)book).getAuthor() );
		}
	}
}
