class Bookstst{
	
	
	public static void main(String s[]){															
		// object creation in java 
		Books books = new Books("kannada text book", "story", "pragya", 300, "sangam", 100);
		System.out.println(books.name + ", "+ books.type + ", "+ books.author + ", "+ books.price + ", "+ books.publicationname + ", "+ books.numofpages);
		
		Books books1 = new Books("english", "story", "pragya", 380, "sangam", 200);
		System.out.println(books1.name + ", "+ books1.type + ", "+ books1.author + ", "+ books1.price + ", "+ books1.publicationname + ", "+ books1.numofpages);
		
		Books books2 = new Books("kannada text book", "story", "pragya",  300, "sangam", 40);
		System.out.println(books2.name + ", "+ books2.type + ", "+ books2.author + ", "+ books2.price + ", "+ books2.publicationname + ", "+ books2.numofpages);
		
		Books books3 = new Books("kannada text book", "story", "pragya", 450, "sangam", 467);
		System.out.println(books3.name + ", "+ books3.type + ", "+ books3.author + ", "+ books3.price + ", "+ books3.publicationname + ", "+ books3.numofpages);
		
		Books books4 = new Books("hindi text book", "story", "pragya", 300, "sangam", 678);
		System.out.println(books4.name + ", "+ books4.type + ", "+ books4.author + ", "+ books4.price + ", "+ books4.publicationname + ", "+ books4.numofpages);
		
		Books books5 = new Books("thamil text book", "story", "pragya", 500, "udaya", 780);
		System.out.println(books5.name + ", "+ books5.type + ", "+ books5.author + ", "+ books5.price + ", "+ books5.publicationname + ", "+ books5.numofpages);
		
		Books books6 = new Books("kannada text book", "story", "pragya", 300, "sangam", 600);
		System.out.println(books6.name + ", "+ books6.type + ", "+ books6.author + ", "+ books6.price + ", "+ books6.publicationname + ", "+ books6.numofpages);
		
		Books books7 = new Books("english book", "history", "pragya", 200, "sangam", 230);
		System.out.println(books7.name + ", "+ books7.type + ", "+ books7.author + ", "+ books7.price + ", "+ books7.publicationname + ", "+ books7.numofpages);
		
		Books books8 = new Books("kannada text book", "story");
		books8.name = ;
		books8.type = ;
		books8.author = "pragya";
		books8.price = 300;
		books8.publicationname = "sangam";
		books8.numofpages = 100;
		books8.togainKnowlegde();
		System.out.println(books8.name + ", "+ books8.type + ", "+ books8.author + ", "+ books8.price + ", "+ books8.publicationname + ", "+ books8.numofpages);
		
		Books books9 = new Books();
		books9.name = "kannada text book";
		books9.type = "story";
		books9.author = "pragya";
		books9.price = 300;
		books9.publicationname = "sangam";
		books9.numofpages = 100;
		books9.togainKnowlegde();
		System.out.println(books9.name + ", "+ books9.type + ", "+ books9.author + ", "+ books9.price + ", "+ books9.publicationname + ", "+ books9.numofpages);
		
		
		
		
	}
}


/*
class Bookstst{
	
	
	public static void main(String s[]){															
		// object creation in java 
		Books books = new Books();
		books.name = "kannada text book";
		books.type = "story";
		books.author = "pragya";
		books.price = 300;
		books.publicationname = "sangam";
		books.numofpages = 100;
		books.togainKnowlegde();
		System.out.println(books.name + ", "+ books.type + ", "+ books.author + ", "+ books.price + ", "+ books.publicationname + ", "+ books.numofpages);
		
		Books books1 = new Books();
		books1.name = "";
		books1.type = "story";
		books1.author = "pragya";
		books1.price = 300;
		books1.publicationname = "sangam";
		books1.numofpages = 100;
		books1.togainKnowlegde();
		System.out.println(books1.name + ", "+ books1.type + ", "+ books1.author + ", "+ books1.price + ", "+ books1.publicationname + ", "+ books1.numofpages);
		
		Books books2 = new Books();
		books2.name = "kannada text book";
		books2.type = "story";
		books2.author = "pragya";
		books2.price = 300;
		books2.publicationname = "sangam";
		books2.numofpages = 100;
		books2.togainKnowlegde();
		System.out.println(books2.name + ", "+ books2.type + ", "+ books2.author + ", "+ books2.price + ", "+ books2.publicationname + ", "+ books2.numofpages);
		
		Books books3 = new Books();
		books3.name = "kannada text book";
		books3.type = "story";
		books3.author = "pragya";
		books3.price = 300;
		books3.publicationname = "sangam";
		books3.numofpages = 100;
		books3.togainKnowlegde();
		System.out.println(books3.name + ", "+ books3.type + ", "+ books3.author + ", "+ books3.price + ", "+ books3.publicationname + ", "+ books3.numofpages);
		
		Books books4 = new Books();
		books4.name = "kannada text book";
		books4.type = "story";
		books4.author = "pragya";
		books4.price = 300;
		books4.publicationname = "sangam";
		books4.numofpages = 100;
		books4.togainKnowlegde();
		System.out.println(books4.name + ", "+ books4.type + ", "+ books4.author + ", "+ books4.price + ", "+ books4.publicationname + ", "+ books4.numofpages);
		
		Books books5 = new Books();
		books5.name = "kannada text book";
		books5.type = "story";
		books5.author = "pragya";
		books5.price = 300;
		books5.publicationname = "sangam";
		books5.numofpages = 100;
		books5.togainKnowlegde();
		System.out.println(books5.name + ", "+ books5.type + ", "+ books5.author + ", "+ books5.price + ", "+ books5.publicationname + ", "+ books5.numofpages);
		
		Books books6 = new Books();
		books6.name = "kannada text book";
		books6.type = "story";
		books6.author = "pragya";
		books6.price = 300;
		books6.publicationname = "sangam";
		books6.numofpages = 100;
		books6.togainKnowlegde();
		System.out.println(books6.name + ", "+ books6.type + ", "+ books6.author + ", "+ books6.price + ", "+ books6.publicationname + ", "+ books6.numofpages);
		
		Books books7 = new Books();
		books7.name = "kannada text book";
		books7.type = "story";
		books7.author = "pragya";
		books7.price = 300;
		books7.publicationname = "sangam";
		books7.numofpages = 100;
		books7.togainKnowlegde();
		System.out.println(books7.name + ", "+ books7.type + ", "+ books7.author + ", "+ books7.price + ", "+ books7.publicationname + ", "+ books7.numofpages);
		
		Books books8 = new Books();
		books8.name = "kannada text book";
		books8.type = "story";
		books8.author = "pragya";
		books8.price = 300;
		books8.publicationname = "sangam";
		books8.numofpages = 100;
		books8.togainKnowlegde();
		System.out.println(books8.name + ", "+ books8.type + ", "+ books8.author + ", "+ books8.price + ", "+ books8.publicationname + ", "+ books8.numofpages);
		
		Books books9 = new Books();
		books9.name = "kannada text book";
		books9.type = "story";
		books9.author = "pragya";
		books9.price = 300;
		books9.publicationname = "sangam";
		books9.numofpages = 100;
		books9.togainKnowlegde();
		System.out.println(books9.name + ", "+ books9.type + ", "+ books9.author + ", "+ books9.price + ", "+ books9.publicationname + ", "+ books9.numofpages);
		
		
		
		
	}
}
*/