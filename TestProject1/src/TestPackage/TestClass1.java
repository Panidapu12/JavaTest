/**
 * 
 */
package TestPackage;

/**
 * @author panid
 *
 */
public class TestClass1 {

	private int testVriableOne;
	private int testVariableTwo;
	public void SetTestVariableOne()
	{
		testVriableOne = 10;
	}
	public int GetTestVariableOne()
	{
		SetTestVariableOne();
		return testVriableOne;
	}
	public int GetTestVariableTwo()
	{
		SetTestVariableTwo();
		return testVariableTwo;
	}
	public void SetTestVariableTwo()
	{
		testVariableTwo = 20;
	}
	
	public int AddTwoNumbers(int firstNumber, int secondNumber)
	{
		return firstNumber + secondNumber;
	}
	
	public int MutliplyTwoNumbers(int firstNumber, int secondNumber)
	{
		return firstNumber * secondNumber;
	}
	
	public double DivisionOperation(int firstNumber, int secondNumber)
	{
		return firstNumber/secondNumber;
	}
	
	public int SubtractOperation(int firstNumber, int secondNumber)
	{
		return secondNumber - firstNumber;
	}
	
}
