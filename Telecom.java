class Telecom{

static String simNames[]= {null,null,null,null,null,null,null,null,null,null};

static int index;

public static boolean addsim(String sim){

	boolean isAdded = false;
	if(simNames != null){
	
	simNames[index] = sim;
	index++;
		isAdded = true;
	}else{
	System.out.println("cannot add the sim");
	
}
return isAdded;
}

public static void getAllsim(){
		System.out.println("List of the sim names:");
		
		
		for(int sim=0; sim< simNames.length; sim++){
			
			String reference = simNames[sim];
			System.out.println(reference);
		
		}
		
		System.out.println("end of the sim names.");
		
	}

public static boolean updatedSimNames(String exitingSimNames, String updatedSimNames){
	boolean isUpdated = false;
	for(int simIndex = 0 ; simIndex < simNames.length ; simIndex++){
		if(simNames[simIndex].equals(exitingSimNames)) {
			
			simNames[simIndex ] = updatedSimNames ;
			isUpdated = true ;
		}
		
		
	}
	return isUpdated;
	
}
}