package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
import main.Functions;

public class FunctionsTest
{
	@Test
	public void Find3DigitOrHighest_FunctionalTest() 
	{
		List<Double>    list1    = Arrays.asList(1d, 2d, 4d, 8d, 16d, 32d, 64d);
		List<Double>    list2    = Arrays.asList(-1d, -2d, -4d, -8d, -16d, -32d, -64d);
		List<Double>    list3    = Arrays.asList(-16d, 64d, -99d, 99.99d, 128d, 256d, 100d, -50d, -200d);
		List<Double>    list4    = Arrays.asList(-16d, 64d, -14d, -12d, -99.99d, 10d, 99d, -20d);
        
		Functions junit = new Functions();
		
		double result = junit.Find3DigitOrHighestNumber(list1);
        System.out.println("Checking functionality of the function:\nPirmoji seka: " +list1);
        System.out.println("Pirmasis triþenklis arba didþiausias skaièius sekoje: "+result+"\n");
        assertEquals(64, result, 0);
		
        result = junit.Find3DigitOrHighestNumber(list2);
        System.out.println("Antroji seka: " +list2);
        System.out.println("Pirmasis triþenklis arba didþiausias skaièius sekoje: "+result+"\n");
        assertEquals(-1, result, 0);
        
        result = junit.Find3DigitOrHighestNumber(list3);
        System.out.println("Treèioji seka: " +list3);
        System.out.println("Pirmasis triþenklis arba didþiausias skaièius sekoje: "+result+"\n");
        assertEquals(128, result, 0);
        
        result = junit.Find3DigitOrHighestNumber(list4);
        System.out.println("Ketvirtoji seka: " +list4);
        System.out.println("Pirmasis triþenklis arba didþiausias skaièius sekoje: "+result+"\n");
        assertEquals(99, result, 0);
	}
	
	@Test
	public void Find3DigitOrHighest_CollectionTypesTest() 
	{
		Double[] sequence = {-16d, 64d, -99d, 99.99d, 128d, 256d, 100d, -50d, -200d};
		
		List<Double>    list    = Arrays.asList(sequence);
        Set<Double>     set     = new TreeSet<Double>(Arrays.asList(sequence)); 
        Queue<Double>   queue   = new PriorityQueue<Double>(Arrays.asList(sequence)); 
        
        Functions junit = new Functions();
        
        double result = junit.Find3DigitOrHighestNumber(list);
        System.out.println("Checking all collection types compatibility with the function: \nList: " +list);
        System.out.println("Pirmasis triþenklis arba didþiausias skaièius sekoje: "+result+'\n');
        assertEquals(128, result, 0);
        
        result = junit.Find3DigitOrHighestNumber(set);
        System.out.println("Set: " +set);
        System.out.println("Pirmasis triþenklis arba didþiausias skaièius sekoje: "+result+'\n');
        assertEquals(-200, result, 0);
        
        result = junit.Find3DigitOrHighestNumber(queue);
        System.out.println("Queue: " +queue);
        System.out.println("Pirmasis triþenklis arba didþiausias skaièius sekoje: "+result+'\n'+'\n');
        assertEquals(-200, result, 0);
	}
}
