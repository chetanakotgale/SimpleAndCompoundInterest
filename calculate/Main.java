package calculate;

/**
 *  This program is to find simple interest and compound interest.
 *  
 * @author chetana
 *
 */

public class Main
{

	public double simple(double principal_amount,double time,double rate_of_interest)
	{
		
		/**
		 * @param principal_amount
		 * @param time
		 * @param rate_of_interest
		 *  This method finds simple interest and returns the result.
		 * 
		 */
		
		return ((principal_amount*time*rate_of_interest)/100);
	}
	
	public double compound(double principal_amount,double time,double rate_of_interest)
	{
		/**
		 * @param principal_amount
		 * @param time
		 * @param rate_of_interest
		 *  This method finds compound interest and returns the result.
		 * 
		 */
		
		return principal_amount * (Math.pow((1+rate_of_interest / 100),time));
	}
}
