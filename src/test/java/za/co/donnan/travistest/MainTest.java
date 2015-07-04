package za.co.donnan.travistest;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertThat(0, is(0));
	}
	
	@Test
	public void test2() {
		assertThat(1, is(0));
	}

}
