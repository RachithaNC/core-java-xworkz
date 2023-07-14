class Multiplication{

public static void main(String multiplication[]){

mul(56 , 78);
mul(112 , 456);
mul(89 , 67);
mul(789 , 567);
mul(234 , 432);
mul(456 , 654);
mul(789 , 987);
mul(98 , 890);
mul(123 , 321);
mul(345 , 654);

mul(56 , 78, 79);
mul(112 , 456, 45);
mul(89 , 67, 456);
mul(789 , 567, 67);
mul(234 , 432, 57);
mul(456 , 654, 67);
mul(789 , 987, 456);
mul(98 , 890, 890);
mul(123 , 321, 490);
mul(345 , 654, 654);
}

public static void mul(int p , int q){

System.out.println(p*q);
}

public static void mul(int p , int q, int r){

System.out.println((p*q)*r);


}
}