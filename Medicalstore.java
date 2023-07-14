class Medicalstore{

static String medicineNames[]= {null,null,null,null,null,null,null,null,null,null};

static int index;

public static boolean addmedicine(String medicine){

	boolean isAdded = false;
	if(medicineNames != null){
	
	medicineNames[index] = medicine;
	index++;
		isAdded = true;
	}else{
	System.out.println("cannot add the medicine");
	
}
return isAdded;
}

public static void getAllmedicine(){
		System.out.println("List of the medicine names:");
		
		
		for(int medicine=0; medicine< medicineNames.length; medicine++){
	
			String reference = medicineNames[medicine];
			System.out.println(reference);
		
		}
		
		System.out.println("end of the medicines names.");
		
	}

public static boolean updatedMedicineNames(String existingMedicineNames, String updatedMedicineNames){
	boolean isUpdated = false;
	for(int medicineIndex = 0 ; medicineIndex < medicineNames.length ; medicineIndex++){
		if(medicineNames[medicineIndex].equals(existingMedicineNames)) {
			
			medicineNames[medicineIndex] = updatedMedicineNames ;
			isUpdated = true ;
		}
		
		
	}
	return isUpdated;
	
}
}