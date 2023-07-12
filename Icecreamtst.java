class Icecreamtst{

	public static void main(String flavour[]){
	
	
		Icecream.addflavour("STRAWBERRY");
		Icecream.addflavour("MANGO");
		Icecream.addflavour("BUTTERSROCTH");
		Icecream.addflavour("CHOCOLATE");
		Icecream.addflavour("BLACKCURRENT");
		Icecream.addflavour("bluberry");
		Icecream.addflavour("kikat");
		Icecream.addflavour("eggnog");
		Icecream.addflavour("mint chocolate");
		Icecream.addflavour("pista");
		
		
		/*Stationary.getAllStationaryItems();
		
		Stationay.editStationaryItemNames("", "");
		
		Stationary.getAllStationaryItems();
		int newlength = Stationary.deleStationaryItemNames("");
		Stationary.getAllStationaryItemsPostDeletion(newlength);
		
		/*boolean isUpdated = Icecream.updatedFlavourNames("STRAWBERRY", "shake");
		boolean isUpdated1 = Icecream.updatedFlavourNames("MANGO", "corneto");
		boolean isUpdated2 = Icecream.updatedFlavourNames("BUTTERSROCTH", "oreo");
		boolean isUpdated3 = Icecream.updatedFlavourNames("CHOCOLATE", "darkchocolate");
		boolean isUpdated4 = Icecream.updatedFlavourNames("BLACKCURRENT", "canbeery");

		System.out.println("is updatedFlavourNames "+isUpdated);*/
		
		fName flavourName = Icecream.searchflavourNamesByName("pista");
		
		Icecream.getAllflavour();
		}
		}