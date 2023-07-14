class WashingMachine{
	
	static String name = "SAMSUNG";
	static  int minSpeed;
	static  int currentSpeed;
	static  int maxSpeed = 30;
	static boolean isConnected;

	
		public static boolean onOrOff(){
		
			//boolean isConnected = false;
			System.out.println("-----invoking onOrOff------");
			System.out.println("Parameter" + 0);
			if(isConnected == false){
				isConnected = true;
				System.out.println("WM is Turned on");
			}
			else if(isConnected == true){
						isConnected = false;
				System.out.println("WM is Turned off");
			}
			return isConnected;
		}
	

//increase volume
public static void increaseSpeed(){
	
	if(isConnected = true){
		if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed + 1 ;
			System.out.println("The Current Speed is " +currentSpeed);
		}
		else{
			System.out.println("Max Speed reached");
		}
	
	}else{
			System.out.println("gube WM connect madu");
	}
}


	
public static void decreaseSpeed(){
		
		
		System.out.println("Start of the decrease WM");
		
		if(isConnected == true){
			if(currentSpeed > minSpeed){
				currentSpeed = currentSpeed - 1;
				System.out.println("The current Speed is " +currentSpeed);
			}
			else{
				System.out.println("min Speed reached");
			}
		}
		else{
			System.out.println("off the WM");
		}
		
	System.out.println("end of the decreaseSpeed");
	System.out.println("");
	}
}

		
			
			
			
			
			
			
			
			
			
			
		
	