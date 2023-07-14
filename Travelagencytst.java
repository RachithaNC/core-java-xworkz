class Travelagencytst{

	public static void main(String tourist[]){
	
	
		Travelagency.addplaces("HAMPI");
		Travelagency.addplaces("VIDHANA SOWDHA");
		Travelagency.addplaces("JOG FALLS");
		Travelagency.addplaces("KUDREMUKKA");
		Travelagency.addplaces("KEMMANGUNDI");
		Travelagency.addplaces("LAL BHAGH");
		Travelagency.addplaces("WONDERLA");
		Travelagency.addplaces("LION SAFARI");
		Travelagency.addplaces("malenadu");
		Travelagency.addplaces("malpe");
		
		
		
		
		boolean isUpdated = Travelagency.updatedTouristPlaces("HAMPI", "mahalakshmi");
		boolean isUpdated1 = Travelagency.updatedTouristPlaces("VIDHANA SOWDHA", "dr rajkumar");
		boolean isUpdated2 = Travelagency.updatedTouristPlaces("JOG FALLS", "siri cafe");
		boolean isUpdated3 = Travelagency.updatedTouristPlaces("KUDREMUKKA", "mulayanagiri");
		boolean isUpdated4 = Travelagency.updatedTouristPlaces("LAL BHAGH", "mangalore harbour");

		System.out.println("is updatedTouristPlaces "+isUpdated);
		Travelagency.getAllplace();
		}
		}