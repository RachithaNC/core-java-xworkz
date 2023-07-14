class Wmtester{


public static void main(String test[]){
 
 System.out.println("Main Started");
 
 WashingMachine.name = "jbl";
 boolean connected = WashingMachine.onOrOff();
 System.out.println("Is WM is Connected" +connected);
 
 WashingMachine.increaseSpeed();

 WashingMachine.decreaseSpeed();
 
 boolean connected1 = WashingMachine.onOrOff();
System.out.println("Is WM is Connected" +connected1);

WashingMachine.decreaseSpeed();

 WashingMachine.increaseSpeed();
 


 System.out.println("Main ended");
}
}