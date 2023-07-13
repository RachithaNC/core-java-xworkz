class  Supermarket2{


static String vegetables[]={"Potato", "Carrot", "Beans", "Brinjal", "Onion"};

static String biscuits[]={ "dark fantasy", "oreo", "dark","light", "tiger", "bounce", "goodday", "smiley", "monaco","horlicks"};


static String perfumes[]={"yardley", "layer", "denver", "spring", "fogg", "eva", "sangle", "engage", "park", "somethig"};

//static String  groceries[]={ "oil","honey", "moong dal", "shampoo", "smothing", "nothing", "soap", "rava", "dal", "soya"};

public static void main(String market[]){
	
 String vegetables[]={"Potato", "Carrot", "Beans", "Brinjal", "Onion"};

System.out.println("------List of the perfumes :-------");
getPerfumes();
System.out.println("-----List of the vegetables :------");
getVegetables(vegetables);
System.out.println("-------List of the biscuits :----");
getBiscuits();
System.out.println("Main ended");
}

public static void getPerfumes(){
		for(String perfume : perfumes){
			System.out.println(perfume);
		}
}
public static void getVegetables(String vegetables[]){
		for(String  vegetable : vegetables){
			System.out.println(vegetable);
		}
}
public static void getBiscuits(){
		for(String biscuit : biscuits){
			System.out.println(biscuit);
		}
}
}




	
	
	
	
	
	
	
	/*System.out.println(perfumes[0] + " " + 
				   perfumes[1] + " " +
				   perfumes[2] + " " +
				   perfumes[3] + " " +
				   perfumes[4] + " " +
				   perfumes[5] + " " +
				   perfumes[6] + " " +
				   perfumes[7] + " " +
				   perfumes[8] + " " +
				   perfumes[9]);
				   
				   
System.out.println(vegetables[0] + " " +
				   vegetables[1] + " " +	
				   vegetables[2] + " " +
				   vegetables[3] + " " +	
				   vegetables[4]);*/	
				


			   
				   
				   