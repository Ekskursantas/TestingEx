package main;

import java.util.Random;

import inter.PlebfaceWithDependecies;

public class PlebMainWithDependencies implements PlebfaceWithDependecies{
	

	@Override
	public int setCupSize(int n) {
		if(n < 0 || n > 150)
			throw new IndexOutOfBoundsException();
		return n;
	}

	@Override
	public int getSipsLeft(int cupSize, int sipsTaken) {
		return cupSize - sipsTaken;
	}

	@Override
	public int getSipsTaken(int cupSize, int sipsLeft) {
		if(cupSize < sipsLeft || cupSize < 0 || sipsLeft < 0 || cupSize > 150)
			throw new IndexOutOfBoundsException();
		return cupSize - sipsLeft;
	}

	@Override
	public boolean wantMoreCoffee(boolean n, int sipsLeft) {
		if(n && sipsLeft != 0)
			throw new IndexOutOfBoundsException();
		return true;	
	}

	@Override
	public int bakeACookie() {
		Random ran = new Random();
		return ran.nextInt(100)+1;
	}

	@Override
	public int chipsLeft(int cookieSize, int bitesTaken) {
		if(cookieSize < bitesTaken)
			throw new IndexOutOfBoundsException();
		return cookieSize - bitesTaken;
	}

	@Override
	public int getBitesTaken(int cookieSize, int chipsLeft) {
		if(cookieSize < chipsLeft || cookieSize < 0 || chipsLeft < 0 || cookieSize > 150)
			throw new IndexOutOfBoundsException();
		return cookieSize - chipsLeft;
	}

	@Override
	public boolean wantMoreCookies(boolean n, int chipsLeft) {
		if(n && chipsLeft != 0)
			throw new IndexOutOfBoundsException();
		return true;	
		
	}
	
}
