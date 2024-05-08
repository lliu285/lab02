package lab02;

//Names: Lucia Liu, Nithya Ramasubramonian
//Due date: 5/8/24

public class Pound extends Currency
{
	private String name = "pound";

	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public Pound copy() 
	{
		Pound poundCopy = new Pound();
		poundCopy.setWholeValue(getWholeValue());
		poundCopy.setFractionValue(getFractionValue());
		
		return poundCopy;
	}
}
