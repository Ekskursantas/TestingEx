package TestingExamForPlebs.PlebExam;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import inter.PlebfaceWithDependecies;
import main.PlebMainWithDependencies;

class PlebTestWithDep {

	private PlebfaceWithDependecies inter;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void sipsLeftHamCrest() {
		inter = new PlebMainWithDependencies();
		int size = inter.setCupSize(149);
		assertThat(size - inter.getSipsTaken(size, 99), is(equalTo(inter.getSipsLeft(size, inter.getSipsTaken(size, 99)))));
	}

	@Test
	void getBitesTakenHamCrest() {
		inter = new PlebMainWithDependencies();
		Random ran = new Random();
		int size = inter.bakeACookie();
		int bites = ran.nextInt(100)+1;
		while(size <= bites){
			bites = ran.nextInt(100)+1;
		}		
		assertThat(size - inter.chipsLeft(size, bites), is(equalTo(inter.getBitesTaken(size, inter.chipsLeft(size, bites)))));
	}
	@Test
	void getSipsLeftDataDriven() {
		int[] cupSize = new int[] {-1, 5, 100}
		int[] sipsTaken = new int[] {-1, 0, 1}
		int[] expected1 = new int[] {null, 0, 99}

				
		DataDriven(cupSize, sipsTaken, expected1)
		
	}


	@Test
	void DataDriven(int[] size, int[] sipsTaken, int[] expected) {
		inter = new PlebMainWithDependencie();
		int[] actual = inter.getSipsLeft(size, sipsTaken)
		assertArrayEquals(expected, actual);

	}

}
