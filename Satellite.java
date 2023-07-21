/*class Satellite{
	
String orbit;
String mass;
String power;
String communication;
String lifespan;

public void toLanuch(){
System.out.println("Information about the Satellite :");

}

}


//to minimize the risk of doing 100 lines can use this method is parameterized constructor initialization.
*/
class Satellite{
	
String orbit;
String mass;
String power;
String communication;
String lifespan;


	public Satellite(String obt, String ms, String pw, String cmn, String lspn){
		
		orbit = obt;
		mass = ms;
		power = pw;
		communication = cmn;
		lifespan = lspn;
		
	}

public void toLanuch(){
System.out.println("Information about the Satellite :");

}

}