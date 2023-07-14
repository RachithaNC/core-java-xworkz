class Karnatakatst{

	public static void main(String citynames[]){
	
	
		Karnataka.createcity("Bangalore");
		Karnataka.createcity("Mysore");
		Karnataka.createcity("Hubali");
		Karnataka.createcity("Mangalore");
		Karnataka.createcity("Shivmogga");
		Karnataka.createcity("chikkamagaluru");
		Karnataka.createcity("Mandya");
		Karnataka.createcity("Hassan");
		Karnataka.createcity("Udupi");
		Karnataka.createcity("uttar kannada");
	
		boolean isUpdated = Karnataka.updateCityNames("chikkamagaluru", "ckm");
		boolean isUpdated1 = Karnataka.updateCityNames("Mandya", "kolar");
		boolean isUpdated2 = Karnataka.updateCityNames("Hassan", "bagalkot");
		boolean isUpdated3 = Karnataka.updateCityNames("Udupi", "brahmavara");
		boolean isUpdated4 = Karnataka.updateCityNames("uttar kannada", "dakshina kannada");

		System.out.println("is updateCityNames "+isUpdated);
		
		Karnataka.getAllcity();
	}
}