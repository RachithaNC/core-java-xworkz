class Medicalstoretst{

	public static void main(String medicine[]){
	
	
		Medicalstore.addmedicine("cipla");
		Medicalstore.addmedicine("rantac");
		Medicalstore.addmedicine("okacet");
		Medicalstore.addmedicine("dolo 650");
		Medicalstore.addmedicine("antibiotics");
		Medicalstore.addmedicine("citrizen");
		Medicalstore.addmedicine("crocin");
		Medicalstore.addmedicine("paracetomol");
		Medicalstore.addmedicine("cough syrup");
		Medicalstore.addmedicine("atorva");
		
		
		
		boolean isUpdated = Medicalstore.updatedMedicineNames("cipla", "azithromycin");
		boolean isUpdated1 = Medicalstore.updatedMedicineNames("rantac", "ativan");
		boolean isUpdated2 = Medicalstore.updatedMedicineNames("okacet", "cymbalta");
		boolean isUpdated3 = Medicalstore.updatedMedicineNames("dolo 650", "aspirin");
		boolean isUpdated4 = Medicalstore.updatedMedicineNames("antibiotics", "insulin");

		System.out.println("is updatedMedicineNames "+isUpdated);
		
		Medicalstore.getAllmedicine();
		}
		}