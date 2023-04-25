package dev.aliaga.unit.under.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import dev.aliaga.model.Apple;
import org.junit.Before;
import org.junit.Test;

import dev.aliaga.exception.NoAppleException;

/**
 * 
 * @author Mario Aliaga
 *
 */
public class AppleServiceTest {
	
	private AppleService appleService;
	
	@Before
	public void setUp(){
		appleService = new AppleService();
	}
	
	@Test
	public void shouldGet100ApplesBadAssertion() throws NoAppleException{
		final List<Apple> apples = appleService.getApple(100);
		assertNotNull(apples);
	}
	
	@Test
	public void shouldGet100ApplesBadAssertion1() throws NoAppleException{
		final List<Apple> apples = appleService.getApple(100);
		assertTrue(apples.size() > 0);
	}
	
	@Test
	public void shouldGet100ApplesGoodAssertion() throws NoAppleException{
		final List<Apple> apples = appleService.getApple(100);
		assertEquals(100, apples.size());
	}
	
	
	@Test
	public void shouldGetNoAppleException_(){
		try {
			final List<Apple> apples = appleService.getApple(101);
		} catch (Exception e) {
			assertTrue(e instanceof NoAppleException);
		}
	}
	
	@Test(expected = NoAppleException.class)
	public void shouldGetNoAppleException() throws NoAppleException{
		final List<Apple> apples = appleService.getApple(101);
		fail("Expected NoAppleException");
	}
}
