class Karnataka{

static String cityNames[]= {null,null,null,null,null,null,null,null,null,null};

static int index;

public static boolean createcity(String city){

	boolean isAdded = false;
	if(cityNames != null){
	
	cityNames[index] = city;
	index++;
		isAdded = true;
	}else{
	System.out.println("cannot add the city");
	
}
return isAdded;
}

public static void getAllcity(){
		System.out.println("List of the city names:");
		
		
		for(int city=0; city< cityNames.length; city++){
			
			String reference = cityNames[city];
			System.out.println(reference);
		
		}
		
		System.out.println("end of the city names.");
		
	}

public static boolean updateCityNames(String existingCityNames, String updatedCityNames){
	boolean isUpdated = false;
	for(int cityIndex = 0 ; cityIndex <  cityNames.length ; cityIndex++){
		if(cityNames[cityIndex].equals(existingCityNames)) {
			
			cityNames[cityIndex ] = updatedCityNames ;
			isUpdated = true ;
		}
		
		
	}
	return isUpdated;
	
}
}