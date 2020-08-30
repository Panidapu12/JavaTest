package TestPackage;

public class TestClass2 {
	private int firstVariable;
	private int secondVariable;
	
	public void SetFirstVariable()
	{
		firstVariable = 10;
	}
	public int GetFirstVariable()
	{
		SetFirstVariable();
		return firstVariable;
	}
	
	public void SetSecondVariable()
	{
		secondVariable = 20;
	}
	
	public int GetSecondVariable()
	{
		SetSecondVariable();
		return secondVariable;
	}
	
	public int FindLargerValue(int firstNumber, int secondNumber)
	{
		if	(firstNumber>secondNumber)
		{
			return firstNumber;
		}
		else	
		{
			return secondNumber;
		}
	}
}
