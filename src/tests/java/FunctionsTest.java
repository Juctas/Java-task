package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import main.Functions;

public class FunctionsTest
{
	Functions junit = new Functions();
	
	@Test
	public void Find3DigitOrHighest_HighestPositive() 
	{
		List<Double> list = Arrays.asList(1d, 2d, 4d, 8d, 16d, 32d, 64d);
        assertEquals(64, junit.Find3DigitOrHighestNumber(list).getAsDouble(), 0);
	}
	
	@Test
	public void Find3DigitOrHighest_HighestNegative() 
	{
		List<Double> list = Arrays.asList(-1d, -2d, -4d, -8d, -16d, -32d, -64d);
        assertEquals(-1, junit.Find3DigitOrHighestNumber(list).getAsDouble(), 0);
	}
	
	@Test
	public void Find3DigitOrHighest_CombinedHighest() 
	{
		List<Double> list = Arrays.asList(-16d, 64d, -14d, -12d, -99.99d, 10d, 99d, -20d);
		assertEquals(99, junit.Find3DigitOrHighestNumber(list).getAsDouble(), 0);
	}
	
	@Test
	public void Find3DigitOrHighest_CombinedFirst3Digit() 
	{
		List<Double> list = Arrays.asList(-16d, 64d, -99d, 99.99d, 128d, 256d, 100d, -50d, -200d);
		assertThat(junit.Find3DigitOrHighestNumber(list).getAsDouble(), anyOf(is(128d), is(256d), is(100d), is(-200d)));
	}
	
	@Test
	public void Find3DigitOrHighest_EmptyList() 
	{
		List<Double> emptyList = new LinkedList<Double>();
		assertNull(junit.Find3DigitOrHighestNumber(emptyList));
	}
	
	@Test
	public void Find3DigitOrHighest_Null() 
	{
        assertNull(junit.Find3DigitOrHighestNumber(null));
	}
	
	@Test
	public void Find3DigitOrHighest_CollectionTypeList() 
	{
		List<Double> list = Arrays.asList(-16d, 64d, -99d, 99.99d, 128d, 256d, 100d, -50d, -200d);
        assertThat(junit.Find3DigitOrHighestNumber(list).getAsDouble(), anyOf(is(128d), is(256d), is(100d), is(-200d)));
	}
	
	@Test
	public void Find3DigitOrHighest_CollectionTypeSet() 
	{
		Set<Double> set = new TreeSet<Double>(Arrays.asList(-16d, 64d, -99d, 99.99d, 128d, 256d, 100d, -50d, -200d)); 
        assertThat(junit.Find3DigitOrHighestNumber(set).getAsDouble(), anyOf(is(128d), is(256d), is(100d), is(-200d)));
	}
	
	@Test
	public void Find3DigitOrHighest_CollectionTypeQueue() 
	{
		Queue<Double> queue = new PriorityQueue<Double>(Arrays.asList(-16d, 64d, -99d, 99.99d, 128d, 256d, 100d, -50d, -200d)); 
        assertThat(junit.Find3DigitOrHighestNumber(queue).getAsDouble(), anyOf(is(128d), is(256d), is(100d), is(-200d)));
	}
}