class Telecomtst{

	public static void main(String sim[]){
	
	
		Telecom.addsim("JIO");
		Telecom.addsim("AIRTEL");
		Telecom.addsim("VODAFONE");
		Telecom.addsim("DOCOMO");
		Telecom.addsim("SPICE");
		Telecom.addsim("bsnl");
		Telecom.addsim("mts");
		Telecom.addsim("nokia");
		Telecom.addsim("idea");
		Telecom.addsim("aircel");
		
		
		boolean isUpdated = Telecom.updatedSimNames("JIO", "hfcl");
		boolean isUpdated1 = Telecom.updatedSimNames("AIRTEL", "tata");
		boolean isUpdated2 = Telecom.updatedSimNames("VODAFONE", "mtnl");
		boolean isUpdated3 = Telecom.updatedSimNames("SPICE", "reliance");
		boolean isUpdated4 = Telecom.updatedSimNames("DOCOMO", "tatadocomo");

		System.out.println("is updatedSimNames "+isUpdated);
		
		
		Telecom.getAllsim();
		}
	}