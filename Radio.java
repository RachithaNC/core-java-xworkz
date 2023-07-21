class Radio {
	String brand;
    String model;
    String color;
    double price;
	public Radio(String bd, String ml, String cl, double pr){
		brand=bd;
		model=ml;
		color=cl;
		price=pr;
	System.out.println("Radio Constructor is invoked");
}
    // String brand;
    // String model;
    // String color;
    // double price;

    public void turnOn() {
        System.out.println("Turning on the radio");
    }
}

/*
public class Radio {
    String type;
    String author;
    double price;
    String publicationLane;
    int noOfPages;

    public void listen() {
        System.out.println("Listening to the " + type);
    }
}
*/
