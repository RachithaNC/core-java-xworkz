class Amazonmethods{


static String kannadaMovies[]={"pagaru", "badavarascal" , "yuvaratna" , "kabza", "robert", "kgf", "kgf2", "rider", "oldmonk", "rana",
								"A", "lovebirds", "galipata", "galipata2", "mansoonraga", "headbush", "totapuri", "kranthi", "hero", "ramyo",
								"petromax", "luckyman", "kantara" , "darbar", "hint"};
								
static String englishMovies[]={"freeguy", "thekingman", "afterlife", "the lost city", "polite soceity", "the 355", "death on the nile", "no time to die", "moonfall", "thecontractor",
								"uncahrted", "etrenals", "reddog", "thematrix", "thegrayman", "sing2", "thekingman", "thekinkong", "venoms", "dune",
								"blackadam", "blackpanther", "sisu", "morblus", "batman"};
								
static String hindiMovies[]={"missionmanju", "pathan", "kantara", "middleclass", "billu", "weddingseason", "tiranga", "bholaa", "nazarandaz", "razz",
							"missionmangal", "goodbye", "hit", "vadh", "phonebhoot", "ramsetu", "omg", "blurr", "bhediya", "cuttputli",
							"forensic", "lovegoals", "race", "race2", "race3"};
							
static String malayalamMovies[]={"2018", "oh my darling", "romacham", "robert", "chirsty", "kaapa", "christper", "kaduva", "corona papers", "kumari",
								"iratta", "thamkam", "ayisha", "dearvappi", "padavettu", "paltujanwar", "ariyippu", "poonam", "poovam", "pappa",
                                "thami", "obaby", "live", "amala", "binary"};

								
								
public static void main(String netflix[]){

System.out.println("------List of the kannadaMovies :-------");
getkannadaMovies(kannadaMovies);
System.out.println("-----List of the englishMovies :------");
getenglishMovies();
System.out.println("-------List of the hindiMovies :----");
gethindiMovies();
System.out.println("-------List of the malayalamMovies :----");
getmalayalaMovies();
System.out.println("Main ended");
}

public static void getkannadaMovies(String kannadaMovies[]){
for(String kannadaMovie : kannadaMovies){
	System.out.println(kannadaMovie);
}
}

public static void  getenglishMovies(){
for(String  englishMovies : englishMovies){
	System.out.println(englishMovies);
}
}

public static void gethindiMovies(){
for(String hindiMovies : hindiMovies){
	System.out.println(hindiMovies);
}
}

public static void getmalayalaMovies(){
			for(String malayalamMovies : malayalamMovies){
	System.out.println(malayalamMovies);
}
}
}
