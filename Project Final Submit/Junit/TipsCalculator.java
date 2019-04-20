package cxz173430;

public class TipsCalculator {
	private double bill;
	private int servicesScore;
	private int foodScore;
	private int tipsPercent;
	/**
	 * Construct a calculator
	 * @param price	the price of the bill
	 * @param services rate the service from 0 to 100
	 * @param food rate the food from 0 to 100
	 */
	public TipsCalculator(double price, int services, int food)
	{
		bill = price;
		servicesScore = services;
		foodScore = food;
		calculateTipsPercent();
	}
	/**
	 * change the bill of the calculator
	 * @param d the price of the bill
	 */
	public void setBill(double d)
	{
		bill = d;
		System.out.println("The bill value has changed to : " + bill);
	}
	/**
	 * change the service score
	 * @param i the new score
	 */
	public void setServices(int i)
	{
		servicesScore = i;
		System.out.println("The Service Score value has changed to : " + i);
		calculateTipsPercent(); // calculate the tips percent
	}
	/**
	 * change the food's score
	 * @param i the new score
	 */
	public void setFood(int i)
	{
		foodScore = i;
		System.out.println("The Food Score value has changed to : " + i);
		calculateTipsPercent(); // calculate the tips percent
	}
	/**
	 * change to a custom tips percent
	 * @param i the new tips percent from 0 to 100
	 */
	public void setPercent(int i)
	{
		System.out.println("The Tips Percent has changed to : " + i);
		tipsPercent = i;
		System.out.println("The Tips Percent has changed to : " + i);
		
	}
	/**
	 * get the tips percent
	 * @return tipsPercent
	 */
	public int getTipsPercent()
	{
		return tipsPercent;
	}
	/**
	 * get the service score
	 * @return servicesScore
	 */
	public int getServicesScore()
	{
		return servicesScore;
	}
	/**
	 * get the food score
	 * @return foodScore
	 */
	public int getFoodScore()
	{
		return foodScore;
	}
	/**
	 * get the tips value
	 * @return how much to pay for tips
	 */
	public double getTipsValue()
	{
		double d = (double) tipsPercent / 100.0 * bill;
		return toTwoDecimal(d);
	}
	/**
	 * get the total including tips
	 * @return the total price
	 */
	public double getTotal()
	{
		return toTwoDecimal((double) bill + getTipsValue());
	}
	/**
	 * calculate the suggest tips whenever food or services score changed
	 */
	private void calculateTipsPercent()
	{	// calculate the percent base on the two score, and a max tips percent of 25 when both score are 100
		double percent = (servicesScore + foodScore) / 200.0 * 25;
		tipsPercent = (int) percent;
	}
	/**
	 * change a double to two decimal number
	 * @param d the number to convert
	 * @return the two decimal number of d
	 */
	private double toTwoDecimal(double d)
	{
		int r = (int)(d * 100);
		return r / 100.0;
	}
	/**
	 * print conclusion of the calculator 
	 */
	public String toString()
	{
		String result = "The recommand Tips % : \t" + tipsPercent + " %\nThe suggested Tips : \t$" 
						+ getTipsValue() + "\nThe Total Bill : \t$" + getTotal();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipsCalculator cal = new TipsCalculator(1213.23, 75,75);
		System.out.println(cal);
		
		cal.setBill(100);
		System.out.println(cal);
	}

}
