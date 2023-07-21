class ChocolatesTester{
	
	public static void main(String test[]){
		
		Chocolates chocolates =new Chocolates("Dairy milk", "vanilla", 2, 50, "2023 dec", "2022 jan");
		System.out.println(chocolates.name + " "+ chocolates.flavour + " "+ chocolates.price + " " + chocolates.expDate + " " + chocolates.mngDate);

		Chocolates chocolates1 =new Chocolates("straberry", "fruit", 2, 50, "2023 nov", "2022 feb");
		chocolates1.toGetColories();
		System.out.println(chocolates1.name + " "+ chocolates1.flavour + " "+ chocolates1.price + " " + chocolates1.expDate + " " + chocolates1.mngDate);


		Chocolates chocolates2 =new Chocolates("milky bar", "vanilla", 6, 300, "2023 oct", "2022 march");
		chocolates2.toGetColories();
		System.out.println(chocolates2.name + " "+ chocolates2.flavour + " "+ chocolates2.price + " " + chocolates2.expDate + " " + chocolates2.mngDate);


		Chocolates chocolates3 =new Chocolates("Dairy day", "vanilla", 4, 60, "2023 sep", "2022 april");
		chocolates3.toGetColories();
		System.out.println(chocolates3.name + " "+ chocolates3.flavour + " "+ chocolates3.price + " " + chocolates3.expDate + " " + chocolates3.mngDate);


		Chocolates chocolates4 =new Chocolates("nestle", "vanilla", 2, 50, "2023 aug", "2022 may");
		chocolates4.toGetColories();
		System.out.println(chocolates4.name + " "+ chocolates4.flavour + " "+ chocolates4.price + " " + chocolates4.expDate + " " + chocolates4.mngDate);


		Chocolates chocolates5 =new Chocolates("kit kat ", "choclate", 6, 40, "2022 july", "2021 june");
		chocolates5.toGetColories();
		System.out.println(chocolates5.name + " "+ chocolates5.flavour + " "+ chocolates5.price + " " + chocolates5.expDate + " " + chocolates5.mngDate);


		Chocolates chocolates6 =new Chocolates(" amul", "vanilla", 8, 500, "2023 jun", "2022 july");
		chocolates6.toGetColories();
		System.out.println(chocolates6.name + " "+ chocolates6.flavour + " "+ chocolates6.price + " " + chocolates6.expDate + " " + chocolates6.mngDate);


		Chocolates chocolates7 =new Chocolates("snickers", "vanilla", 2, 50, "2023 may", "2022 aug");
		chocolates7.toGetColories();
		System.out.println(chocolates7.name + " "+ chocolates7.flavour + " "+ chocolates7.price + " " + chocolates7.expDate + " " + chocolates7.mngDate);


		Chocolates chocolates8 =new Chocolates("topic", "vanilla", 8, 500, "2020 april", "2000 sep");
		chocolates8.toGetColories();
		System.out.println(chocolates8.name + " "+ chocolates8.flavour + " "+ chocolates8.price + " " + chocolates8.expDate + " " + chocolates8.mngDate);


		Chocolates chocolates9 =new Chocolates("aero", "vanilla", 2, 40, "1567 march", "2005 oct");
		chocolates9.toGetColories();
		System.out.println(chocolates9.name + " "+ chocolates9.flavour + " "+ chocolates9.price + " " + chocolates9.expDate + " " + chocolates9.mngDate);



}

}

/*
class ChocolatesTester{
	
	public static void main(String test[]){
		
		Chocolates chocolates =new Chocolates();
		chocolates.name = "Dairy milk";
		chocolates.flavour = "vanilla";
		chocolates.quantity = 2;
		chocolates.price = 50;
		chocolates.expDate = "2023 dec";
		chocolates.mngDate = "2022 jan";
		chocolates.toGetColories();
		System.out.println(chocolates.name + " "+ chocolates.flavour + " "+ chocolates.price + " " + chocolates.expDate + " " + chocolates.mngDate);

		Chocolates chocolates1 =new Chocolates();
		chocolates1.name = "straberry";
		chocolates1.flavour = "fruit";
		chocolates1.quantity = 2;
		chocolates1.price = 50;
		chocolates1.expDate = "2023 nov";
		chocolates1.mngDate = "2022 feb";
		
		chocolates1.toGetColories();
		System.out.println(chocolates1.name + " "+ chocolates1.flavour + " "+ chocolates1.price + " " + chocolates1.expDate + " " + chocolates1.mngDate);


		Chocolates chocolates2 =new Chocolates();
		chocolates2.name = "milky bar";
		chocolates2.flavour = "vanilla";
		chocolates2.quantity = 6;
		chocolates2.price = 300;
		chocolates2.expDate = "2023 oct";
		chocolates2.mngDate = "2022 march";
		
		chocolates2.toGetColories();
		System.out.println(chocolates2.name + " "+ chocolates2.flavour + " "+ chocolates2.price + " " + chocolates2.expDate + " " + chocolates2.mngDate);


		Chocolates chocolates3 =new Chocolates();
		chocolates3.name = "Dairy day";
		chocolates3.flavour = "vanilla";
		chocolates3.quantity = 4;
		chocolates3.price = 60;
		chocolates3.expDate = "2023 sep";
		chocolates3.mngDate = "2022 april";
		
		chocolates3.toGetColories();
		System.out.println(chocolates3.name + " "+ chocolates3.flavour + " "+ chocolates3.price + " " + chocolates3.expDate + " " + chocolates3.mngDate);


		Chocolates chocolates4 =new Chocolates();
		chocolates4.name = "nestle";
		chocolates4.flavour = "vanilla";
		chocolates4.quantity = 2;
		chocolates4.price = 50;
		chocolates4.expDate = "2023 aug";
		chocolates4.mngDate = "2022 may";
		
		chocolates4.toGetColories();
		System.out.println(chocolates4.name + " "+ chocolates4.flavour + " "+ chocolates4.price + " " + chocolates4.expDate + " " + chocolates4.mngDate);


		Chocolates chocolates5 =new Chocolates();
		chocolates5.name = "kit kat ";
		chocolates5.flavour = "choclate";
		chocolates5.quantity = 6;
		chocolates5.price = 50;
		chocolates5.expDate = "2022 july";
		chocolates5.mngDate = "2021 june";
		
		chocolates5.toGetColories();
		System.out.println(chocolates5.name + " "+ chocolates5.flavour + " "+ chocolates5.price + " " + chocolates5.expDate + " " + chocolates5.mngDate);


		Chocolates chocolates6 =new Chocolates();
		chocolates6.name = " amul";
		chocolates6.flavour = "vanilla";
		chocolates6.quantity = 8;
		chocolates6.price = 500;
		chocolates6.expDate = "2023 jun";
		chocolates6.mngDate = "2022 july";
		
		chocolates6.toGetColories();
		System.out.println(chocolates6.name + " "+ chocolates6.flavour + " "+ chocolates6.price + " " + chocolates6.expDate + " " + chocolates6.mngDate);


		Chocolates chocolates7 =new Chocolates();
		chocolates7.name = "snickers";
		chocolates7.flavour = "vanilla";
		chocolates7.quantity = 2;
		chocolates7.price = 50;
		chocolates7.expDate = "2023 may";
		chocolates7.mngDate = "2022 aug";
		
		chocolates7.toGetColories();
		System.out.println(chocolates7.name + " "+ chocolates7.flavour + " "+ chocolates7.price + " " + chocolates7.expDate + " " + chocolates7.mngDate);


		Chocolates chocolates8 =new Chocolates();
		chocolates8.name = "topic";
		chocolates8.flavour = "vanilla";
		chocolates8.quantity = 8;
		chocolates8.price = 500;
		chocolates8.expDate = "2020 april";
		chocolates8.mngDate = "2000 sep";
		
		chocolates8.toGetColories();
		System.out.println(chocolates8.name + " "+ chocolates8.flavour + " "+ chocolates8.price + " " + chocolates8.expDate + " " + chocolates8.mngDate);


		Chocolates chocolates9 =new Chocolates();
		chocolates9.name = "aero";
		chocolates9.flavour = "vanilla";
		chocolates9.quantity = 2;
		chocolates9.price = 50;
		chocolates9.expDate = "1567 march";
		chocolates9.mngDate = "2005 oct";
		
		chocolates9.toGetColories();
		System.out.println(chocolates9.name + " "+ chocolates9.flavour + " "+ chocolates9.price + " " + chocolates9.expDate + " " + chocolates9.mngDate);



}

}
*/