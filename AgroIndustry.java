class AgroIndustry {
    String name;
    String location;
    int employees;
	
	
	public AgroIndustry(String name, String location, int employees){
		this.name=name;
		this.location=location;
		this.employees=employees;
	}
    
    public void process() {
        System.out.println("Processing at " + name + " agro-industry");
    }
}
