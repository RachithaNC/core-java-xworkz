class Garden{

static String flowerNames[]= {null,null,null,null,null,null,null,null,null,null};

static int index;

public static boolean createflowers(String flowers){

	boolean isAdded = false;
	if(flowerNames != null){
	
	flowerNames[index] = flowers;
	index++;
		isAdded = true;
	}else{
	System.out.println("cannot add the flower");
	
}
return isAdded;
}

public static void getAllflowers(){
		System.out.println("List of the flower names:");
		
		
		for(int flowers=0; flowers< flowerNames.length; flowers++){
			
			String reference = flowerNames[flowers];
			System.out.println(reference);
		
		}
		
		System.out.println("end of the flower names.");
		
	}

public static boolean updatedFlowerNames(String existingFlowerNames, String updatedFlowerNames){
	boolean isUpdated = false;
	for(int flowerIndex = 0 ; flowerIndex < flowerNames.length ; flowerIndex++){
		if(flowerNames[flowerIndex].equals(existingFlowerNames)) {
			
			flowerNames[flowerIndex ] = updatedFlowerNames ;
			isUpdated = true ;
		}
		
		
	}
	return isUpdated;
	
}
}