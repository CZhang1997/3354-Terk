package cxz173430;

public class TipsCalculator {
	private double bill;
	private int servicesScore;
	private int foodScore;
	private int tipsPercent;
	public TipsCalculator(double price, int services, int food)
	{
		bill = price;
		servicesScore = services;
		foodScore = food;
		calculateTipsPercent();
	}
	public void setBill(double d)
	{
		bill = d;
		System.out.println("The bill value has changed to : " + bill);
		calculateTipsPercent();
	}
	public void setServices(int i)
	{
		servicesScore = i;
		System.out.println("The Service Score value has changed to : " + i);
		calculateTipsPercent();
	}
	public void setFood(int i)
	{
		foodScore = i;
		System.out.println("The Food Score value has changed to : " + i);
		calculateTipsPercent();
	}
	public void setPercent(int i)
	{
		System.out.println("The Tips Percent has changed to : " + i);
		tipsPercent = i;
	}
	public int getTipsPercent()
	{
		return tipsPercent;
	}
	public int getServicesScore()
	{
		return servicesScore;
	}
	public int getFoodScore()
	{
		return foodScore;
	}
	public double getTipsValue()
	{
		double d = (double) tipsPercent / 100.0 * bill;
		return toTwoDecinmal(d);
	}
	public double getTotal()
	{
		return toTwoDecinmal((double) bill + getTipsValue());
	}
	private void calculateTipsPercent()
	{
		double percent = (servicesScore + foodScore) / 200.0 * 25;
		tipsPercent = (int) percent;
	}
	private double toTwoDecinmal(double d)
	{
		int r = (int)(d * 100);
		return r / 100.0;
	}
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
