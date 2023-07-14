class Gardentst{

	public static void main(String flowers[]){
	
	
		Garden.createflowers("ROSE");
		Garden.createflowers("MARIE GOLD");
		Garden.createflowers("LOTUS");
		Garden.createflowers("LILY");
		Garden.createflowers("HIBISCUS");
		Garden.createflowers("jasmine");
		Garden.createflowers("grass");
		Garden.createflowers("orchids");
		Garden.createflowers("lavender");
		Garden.createflowers("cactus");
		
		boolean isUpdated = Garden.updatedFlowerNames("ROSE", "daisy");
		boolean isUpdated1 = Garden.updatedFlowerNames("MARIE GOLD", "iris");
		boolean isUpdated2 = Garden.updatedFlowerNames("LOTUS", "tulips");
		boolean isUpdated3 = Garden.updatedFlowerNames("LILY", "dahila");
		boolean isUpdated4 = Garden.updatedFlowerNames("HIBICUS", "pansy");

		System.out.println("is updatedFlowerNames "+isUpdated);
		
		Garden.getAllflowers();
		}
		}