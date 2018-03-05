package inter;

public interface Plebface {

	// HardCore Ultimate Magnificent Coffee Pleb Drinker
	
	/**
	 * Create a cup with given size of sips to drink
	 */
	public void setCupSize(int n);
	
	/**
	 * Returns the amount of sips that can be drunk 
	 */
	public int getSipsLeft(); 
	
	/**
	 * Returns the amont of sips that have been drunk
	 */
	public int getSipsTaken();
	
	/**
	 * Takes a sip from a cup
	 */
	public void sip(int n); 
	
	/**
	 * Checks if more coffee is wanted
	 */
	public void wantMoreCoffee(boolean n); //
	
	// HardCore Ultimate Magnificent Cookie Pleb Eater
	
	/**
	 * Creates and returns a cookie(int) with a random amount of chocolate chips
	 */
	public int bakeACookie(); 
	
	/** 
	 * Returns the amount of chips left on the cookie
	 */
	public int chipsLeft(); 
	
	/**
	 * Returns how many chips were eaten. 1 Bite = 1 Chip
	 */
	public int getBitesTaken(); 
	
	/**
	 * Takes a bite from a cookie
	 */
	public void bite(); 
	
	/**
	 * Checks if more cookies are wanted
	 */
	public void wantMoreCookies(boolean n); 
	
}
