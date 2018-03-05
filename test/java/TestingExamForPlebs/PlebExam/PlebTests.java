package TestingExamForPlebs.PlebExam;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import inter.Plebface;
import main.PlebMain;

class PlebTests{


	private Plebface inter;  
	

	//Coffee testing
	@Test
	void settingCoffeeTest() {
		inter = new PlebMain();
		assertEquals(0, inter.getSipsLeft());
		inter.setCupSize(100);
		assertEquals(100, inter.getSipsLeft());
	}
	
	@Test
	void checkingSipsLeft() {
		inter = new PlebMain();
		assertEquals(0, inter.getSipsLeft());
		inter.setCupSize(100);
		assertEquals(100, inter.getSipsLeft());
		inter.sip(30);
		assertEquals(70, inter.getSipsLeft());
	}
	
	@Test
	void checkingSipsTaken() {
		inter = new PlebMain();
		assertEquals(0, inter.getSipsLeft());
		inter.setCupSize(100);
		assertEquals(100, inter.getSipsLeft());
		inter.sip(30);
		assertEquals(30, inter.getSipsTaken());
	}
	
	@Test
	void checkForRefill() {
		inter = new PlebMain();
		assertEquals(0, inter.getSipsLeft());
		inter.setCupSize(100);
		assertEquals(100, inter.getSipsLeft());
		inter.sip(100);
		assertEquals(0, inter.getSipsLeft());
		inter.wantMoreCoffee(true);
		assertEquals(100, inter.getSipsLeft());
	}
	
	@Test
	void settingCookiesTest() {
		inter = new PlebMain();
		assertEquals(0, inter.chipsLeft());
		int chips = inter.bakeACookie();
		assertEquals(chips, inter.chipsLeft());
	}
	
	@Test
	void checkingChipsLeft() {
		inter = new PlebMain();
		assertEquals(0, inter.chipsLeft());
		int chips = inter.bakeACookie();
		assertEquals(chips, inter.chipsLeft());
		inter.bite();
		assertEquals(chips-1, inter.chipsLeft());
	}
	
	@Test
	void checkingBitesTaken() {
		inter = new PlebMain();
		assertEquals(0, inter.chipsLeft());
		int chips = inter.bakeACookie();
		assertEquals(0, inter.getBitesTaken());
		inter.bite();
		assertEquals(1, inter.getBitesTaken());
	}
	
	@Test
	void checkForMoreCookies() {
		inter = new PlebMain();
		assertEquals(0, inter.chipsLeft());
		int chips = inter.bakeACookie();
		assertEquals(chips, inter.chipsLeft());
		for(int i = 0; i < chips; i++)
			inter.bite();
		assertEquals(0, inter.chipsLeft());
		inter.wantMoreCookies(true);
		assertEquals(chips, inter.chipsLeft());
	}
	//---------------------------------------------------------
	//----------------------Exceptions-------------------------
	@Test
	void WantMoreCoffeeWithNotEmptyCupException() {
		inter = new PlebMain();
		assertEquals(0, inter.getSipsLeft());
		inter.setCupSize(100);
		assertEquals(100, inter.getSipsLeft());
		inter.sip(25);
		assertThrows(Exception.class, ()->{inter.wantMoreCoffee(true);});
	}
	
	@Test
	void WantMoreCookiesWithoutFinishingFirst() {
		inter = new PlebMain();
		assertEquals(0, inter.chipsLeft());
		int chips = inter.bakeACookie();
		assertEquals(chips, inter.chipsLeft());
		inter.bite();
		assertThrows(Exception.class, ()->{inter.wantMoreCookies(true);});
	}

	@Test
	void TakeTooManySipsException() {
		inter = new PlebMain();
		assertEquals(0, inter.getSipsLeft());
		inter.setCupSize(100);
		assertEquals(100, inter.getSipsLeft());
		assertThrows(Exception.class, ()->{inter.sip(999);});
	}
	
	@Test
	void TakeTooManyBitesException() {
		inter = new PlebMain();
		assertEquals(0, inter.chipsLeft());
		int chips = inter.bakeACookie();
		assertEquals(0, inter.getBitesTaken());
		for(int i = 0; i < chips; i++)
		inter.bite();
		assertThrows(Exception.class, ()->{inter.bite();});
	}
	//-----------------------------------------------------------
	//--------------------Boundaries-----------------------------
	@Test
	void setCupSizeBoundaries() {
		inter = new PlebMain();
		assertThrows(Exception.class, ()->{inter.setCupSize(0);});
		inter.setCupSize(1);
		assertEquals(1, inter.getSipsLeft());
		inter.setCupSize(150);
		assertEquals(150, inter.getSipsLeft());
		assertThrows(Exception.class, ()->{inter.setCupSize(151);});
	}
	
	@Test
	void checkCookieSizeBoundaries() {
		inter = new PlebMain();
		int chips = inter.bakeACookie();
		assertThrows(Exception.class,()->{
			for(int i = 0; i < chips + 1; i++) {
				inter.bite();
			}
			});
		
		
	}
	
}
