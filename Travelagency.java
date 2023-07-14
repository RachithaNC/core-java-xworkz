class Travelagency{

static String touristPlaces[]= {null,null,null,null,null,null,null,null,null,null};

static int index;

public static boolean addplaces(String tourist){

	boolean isAdded = false;
	if(touristPlaces != null){
	
	touristPlaces[index] = tourist;
	index++;
		isAdded = true;
	}else{
	System.out.println("cannot add the places");
	
}
return isAdded;
}

public static void getAllplace(){
		System.out.println("List of the place names:");
		
		
		for(int place=0; place< touristPlaces.length; place++){
			
			String reference = touristPlaces[place];
			System.out.println(reference);
		
		}
		
		System.out.println("end of the Place names.");
		
	}

public static boolean updatedTouristPlaces(String existingTouristPlaces, String updatedTouristPlaces){
	boolean isUpdated = false;
	for(int touristIndex = 0 ; touristIndex < touristPlaces.length ; touristIndex++){
		if(touristPlaces[touristIndex].equals(existingTouristPlaces)) {
			
			touristPlaces[touristIndex] = updatedTouristPlaces ;
			isUpdated = true ;
		}
		
		
	}
	return isUpdated;
	
}
}