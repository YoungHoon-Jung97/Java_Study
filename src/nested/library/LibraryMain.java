package nested.library;

public class LibraryMain
{
	public static void main(String[] args)
	{
		Library library = new Library(3);
		
		library.addBook("책1", "정영훈");
		library.addBook("책2", "김영훈");
		library.addBook("책3", "박영훈");
		library.addBook("책4", "최영훈");
		
		library.showBooks();
		
	}
}	
