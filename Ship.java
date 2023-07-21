class Ship{
	
	public Ship(String name, String length, String horsepower, int capacity, String speed){
		// "this." is a keyword which will avoid the conflic btw the instance variable and the parameter.
		this.name = name;
		this.length = length;
		this.horsepower = horsepower;
		this.capacity = capacity;
		this.speed = speed;
		
		
		
	}
	
	/*public Ship(String nme, String lnt, String hpw, int cpy, String spd){
		
		name = nme;
		length = lnt;
		horsepower = hpw;
		capacity = cpy;
		speed = spd;
		
		
	
	}
	*/

	String name;
	String length;
	String horsepower;
	int capacity;
	String speed;
	

	public void toSail(){
	System.out.println("  efrgf");
    }

}