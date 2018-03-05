package main;

import java.util.Random;

import inter.Plebface;

public class PlebMain implements Plebface{
	// Coffee
	private int sipsLeft = 0;
	private int cupSize = 0;
	private int sipsTaken = 0;

	
	//Cookie
	private int chipsLeft;
	private int chipAmount = 0;;
	private int bitesTaken = 0;
	private Random ran = new Random();
	
	@Override
	public void setCupSize(int n) {
		if(n > 150 || n <= 0)
		{
			throw new IndexOutOfBoundsException();
		}
		this.sipsLeft = n;
		this.cupSize = n;
	
	
	}

	@Override
	public int getSipsLeft() {
		return this.sipsLeft;
	}

	@Override
	public int getSipsTaken() {
		return this.sipsTaken;
	}

	@Override
	public void sip(int n) {
		if(this.cupSize == 0 || this.sipsLeft < n)
		{
			throw new IndexOutOfBoundsException();
		}
		this.sipsLeft -= n;
		this.sipsTaken += n;
		
	}

	@Override
	public void wantMoreCoffee(boolean n) {
		if(n && this.sipsLeft == 0)
		{
			this.sipsLeft = this.cupSize;
		}
		else 
		{
			throw new IndexOutOfBoundsException();
		}
		
	}

	@Override
	public int bakeACookie() {
		this.chipAmount = ran.nextInt(100)+1;
		this.chipsLeft = this.chipAmount;
		return this.chipAmount;
	}

	@Override
	public int chipsLeft() {
		return this.chipsLeft;
	}

	@Override
	public int getBitesTaken() {
		return this.bitesTaken;
	}

	@Override
	public void bite() {
		if(chipAmount == 0 || chipsLeft < 1)
		{
			throw new IndexOutOfBoundsException();
		}
		this.bitesTaken++;
		this.chipsLeft--;
		
	}

	@Override
	public void wantMoreCookies(boolean n) {
		if(n && this.chipsLeft == 0)
		{
			this.chipsLeft = this.chipAmount;
		}
		else 
		{
			throw new IndexOutOfBoundsException();
		}
		
	}

	

}
