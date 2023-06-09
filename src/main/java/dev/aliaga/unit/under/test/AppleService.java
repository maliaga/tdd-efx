package dev.aliaga.unit.under.test;

import java.util.ArrayList;
import java.util.List;

import dev.aliaga.exception.NoAppleException;
import dev.aliaga.model.Apple;

/**
 * 
 * @author Mario Aliaga
 *
 */
public class AppleService {
	
	private static final Integer MAX_APPLE_LOT = 100;
	
	public List<Apple> getApple(final Integer numberOfApples) throws NoAppleException{
		if(numberOfApples > MAX_APPLE_LOT){
			throw new NoAppleException();
		}
		final List<Apple> apples = new ArrayList<>();
		for(int i = 0; i < numberOfApples; i++){
			final Apple apple = new Apple();
			apples.add(apple);
		}
		return apples;
	}

}
