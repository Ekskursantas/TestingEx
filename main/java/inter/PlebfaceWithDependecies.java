package inter;

public interface PlebfaceWithDependecies {
	// HardCore Ultimate Magnificent Coffee Pleb Drinker
	
		/**
		 * Create a cup with given size of sips to drink
		 */
		public int setCupSize(int n);
		
		/**
		 * Returns the amount of sips that can be drunk 
		 */
		public int getSipsLeft(int cupSize, int sipsTaken); 
		
		/**
		 * Returns the amont of sips that have been drunk
		 */
		public int getSipsTaken(int cupSize, int sipsLeft);
		
		/**
		 * Checks if more coffee is wanted
		 */
		public boolean wantMoreCoffee(boolean n, int sipsLeft); //
		
		// HardCore Ultimate Magnificent Cookie Pleb Eater
		
		/**
		 * Creates and returns a cookie(int) with a random amount of chocolate chips
		 */
		public int bakeACookie(); 
		
		/** 
		 * Returns the amount of chips left on the cookie
		 */
		public int chipsLeft(int cookieSize, int bitesTaken); 
		
		/**
		 * Returns how many chips were eaten. 1 Bite = 1 Chip
		 */
		public int getBitesTaken(int cookieSize, int chipsLeft); 
		
		/**
		 * Takes a bite from a cookie
		 */
		
		/**
		 * Checks if more cookies are wanted
		 */
		public boolean wantMoreCookies(boolean n, int chipsLeft); 
}
