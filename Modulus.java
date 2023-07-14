class Modulus{

public static void main(String modulus[]){

mod(56 , 78);
mod(112 , 456);
mod(89 , 67);
mod(789 , 567);
mod(234 , 432);
mod(456 , 654);
mod(789 , 987);
mod(98 , 890);
mod(123 , 321);
mod(345 , 654);

mod(56 , 78, 79);
mod(112 , 456, 56);
mod(89 , 67, 67);
mod(789 , 567, 67);
mod(234 , 432, 321);
mod(456 , 654, 54);
mod(789 , 987, 87);
mod(98 , 890, 90);
mod(123 , 321, 21);
mod(345 , 654, 54);

}
public static void mod(int p , int q){

System.out.println(p%q);
}

public static void mod(int p , int q, int r){

System.out.println((p%q)%r);


}
}