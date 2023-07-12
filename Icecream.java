class Icecream{

static String flavourNames[]= {null,null,null,null,null,null,null,null,null,null};

static int index;

public static boolean addflavour(String flavour){

	boolean isAdded = false;
	if(flavourNames != null){
	
	flavourNames[index] = flavour;
	index++;
		isAdded = true;
	}else{
	System.out.println("cannot add the flavour");
	
}
return isAdded;
}

public static void getAllflavour(){
		System.out.println("List of the flavour names:");
		
		
		for(int flavour=0; flavour< flavourNames.length; flavour++){
			
			String reference = flavourNames[flavour];
			System.out.println(reference);
		
		}
		
		System.out.println("end of the flavour names.");
		
	}

public static boolean updatedFlavourNames(String existingFlavourNames, String updatedFlavourNames){
	boolean isUpdated = false;
	for(int flavourIndex = 0 ; flavourIndex < flavourNames.length ; flavourIndex++){
		if(flavourNames[flavourIndex].equals(existingFlavourNames)) {
			
			flavourNames[flavourIndex ] = updatedFlavourNames ;
			isUpdated = true ;
		}
		
		
	}
	return isUpdated;
	
}
}

public static boolean deleteFlavourNames(String deleteFlavourNames){
	
boolean isDeleted = false;
int flavourIndex;
	for(int flavourIndex = 0 ; flavourIndex < flavourNames.length ; flavourIndex++ ){
		if(flavourNames[flavourIndex].equals(deleteFlavourNames){
			break;
	
}
}
}

if( falvourIndex < noOfElements){
	
noOfElements = noOfElements-1;

for(int newflavourIndex = flavourIndex ; newflavourIndex < noOfElements ; newflavourIndex++)
	flavourNames[newflavourIndex] = flavourNames[newflavourIndex+1];
}
}
return noOfElements;
}
public static void getAllflavourPostDeletion(int newlength){
	for(int flavourIndex = 0 ; flavourIndex < newlength ; flavourIndex++){
		System.out.println();
	}
public static String searchflavourNamesByName(String flavourName){
	System.out.println("invoking the searchflavourNamesByName");
	String fName = null;
	for( String name : falvourNames)
		if(name.equals(flavourName)){
			fName = name;
			System.out.println(flavourName)
			
		}
}
return fname;
}


