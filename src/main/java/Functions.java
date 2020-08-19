package main;

import java.util.*;

public class Functions 
{
	public double Find3DigitOrHighestNumber(Collection<Double> givenList)
    { 
		if (givenList == null || givenList.size() == 0) return 0;
        double max = Double.NEGATIVE_INFINITY;
        for (Double number: givenList)
        {
            if (number <= -100 || number >= 100) return number;
           	else if (max < number) max = number;
        }
        return max;
    }
}
