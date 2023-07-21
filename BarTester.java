class BarTester {
    public static void main(String[] args) {
        Bar bar1 = new Bar("Cheers Bar", 21, "pub", "mandya", "selfservice");
        System.out.println("Bar 1 Details:");
        System.out.println(bar1.name + ", " + bar1.ageLimit + ", " +bar1.type + ", " + bar1.location + ", " + bar1.service);
        System.out.println();
		
        Bar bar2 = new Bar("Mojito Lounge", 18, "Cocktail Bar", "maddur", "wellservice");
        System.out.println("Bar 2 Details:");
        System.out.println(bar2.name + ", " + bar2.ageLimit + ", " + bar2.type + ", " + bar2.location + ", " + bar2.service);
        System.out.println();

        Bar bar3 = new Bar("Whiskey Tavern", 25, "Whiskey Bar", "cpn", "service");
        System.out.println("Bar 3 Details:");
        System.out.println(bar3.name + ", " + bar3.ageLimit + ", " + bar3.type + ", " + bar3.location + ", " + bar3.service);
        System.out.println();

        Bar bar4 = new Bar("Brews and Bites", 21, "Microbrewery", "ramnagar", "slow service");
        System.out.println("Bar 4 Details:");
        System.out.println(bar4.name + ", " + bar4.ageLimit + ", " + bar4.type + ", " + bar4.location + ", " + bar4.service);
        System.out.println();

        Bar bar5 = new Bar("Dive Bar", 21, "Neighborhood Bar", "bidadi", "table service");
        System.out.println("Bar 5 Details:");
        System.out.println(bar5.name + ", " + bar5.ageLimit + ", " + bar5.type + ", " + bar5.location + ", " + bar5.service);
        System.out.println();

        Bar bar6 = new Bar("Tiki Hut", 21, "Beach Bar", "kengeri", "urgent service");
        System.out.println("Bar 6 Details:");
        System.out.println(bar6.name + ", " + bar6.ageLimit + ", " + bar6.type + ", " + bar6.location + ", " + bar6.service);
        System.out.println();

        Bar bar7 = new Bar("Rooftop Lounge", 21, "Outdoor Bar", "satellite", "self service");
        System.out.println("Bar 7 Details:");
        System.out.println(bar7.name + ", " + bar7.ageLimit + ", " + bar7.type + ", " + bar7.location + ", " + bar7.service);
        System.out.println();

        Bar bar8 = new Bar("Sports Bar", 21, "Sports Bar", "rajajinagar", "well service");
        System.out.println("Bar 8 Details:");
        System.out.println(bar8.name + ", " + bar8.ageLimit + ", " + bar8.type + ", " + bar8.location + ", " + bar8.service);
        System.out.println();

        Bar bar9 = new Bar("Wine Bar", 21, "Wine Bar", "rr nagar", "urgentservice");
        System.out.println("Bar 9 Details:");
        System.out.println(bar9.name + ", " + bar9.ageLimit + ", " + bar9.type + ", " + bar9.location + ", " + bar9.service);
        System.out.println();

        Bar bar10 = new Bar("Irish Pub", 21, "Irish Pub", "kr market", "self service");
        System.out.println("Bar 10 Details:");
        System.out.println(bar10.name + ", " +bar10.ageLimit + ", " + bar10.type + ", " + bar10.location + ", " + bar10.service);
        System.out.println();
    }
}
