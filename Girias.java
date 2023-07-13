class Girias {

//static electronicDevices[]= {"washing machine", "tv", "ac", "fridge", "microwave", "ironbox", "girnder", "LED"};


public static void main(String args[]){

 String electronicDevices[]= {"washing machine", "tv", "ac", "fridge", "microwave", "ironbox", "girnder", "LED"};

System.out.println("main Started");

for( int deviceIndex = 0 ; deviceIndex  < electronicDevices.length ; deviceIndex++) {


System.out.println(electronicDevices[deviceIndex]);
}
System.out.println("main Ended");
}
}