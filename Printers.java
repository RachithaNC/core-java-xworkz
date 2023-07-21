public class Printers {
    String brand;
    String model;
    double price;
	
	
	public Printers(String brand, String model, double price){
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}

    public void print() {
        System.out.println("Printing with " + brand + " " + model + " printer");
    }
}



/*

public class Printers {
    String brand;
    String model;
    double price;

    public void print() {
        System.out.println("Printing with " + brand + " " + model + " printer");
    }
}
*/