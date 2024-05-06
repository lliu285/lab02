package lab02;

// Name(s): Lucia Liu, Nithya??
// Due date: 5/8/24

public abstract class Currency 
{
	private int wholeValue;
	private int fractionValue;
	
	public Currency()
	{
		
	}
	
	public Currency(double value)
	{
		
	}
	
	// distructor??
	
	public int getWholeValue()
	{
		return wholeValue;
	}
	
	public void setWholeValue(int wholeValue)
	{
		this.wholeValue = wholeValue;
	}
	
	public int getFractionValue()
	{
		return fractionValue;
	}
	
	public void setFractionValue(int fractionValue)
	{
		this.fractionValue = fractionValue;
	}
	
	public boolean isEqual()
	{
		return true;
	}
	
	public boolean isGreater()
	{
		return true;
	}
	
	public void print() // void or return String??
	{
		
	}
	
	
}
