import java.util.*;

public class Functions
{
	public static OptionalDouble Find3DigitOrHighestNumber(Collection<Double> givenList)
    { 
		if (givenList == null || givenList.size() == 0) return null;
        double max = Double.NEGATIVE_INFINITY;
        for (Double number: givenList)
        {
            if (number <= -100 || number >= 100) return OptionalDouble.of(number);
           	else if (max < number) max = number;
        }
        return OptionalDouble.of(max);
    }
}