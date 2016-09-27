package popup.model;

public class Thingy
{



	private int number;
	private double value;
	private String words;
	private boolean isValid;
	
	public String getwords()
	{
		return words;
	}
	public int getnumber()
	{
		return number;
	}
	public double getvalue()
	{
		return value;
	}
	public boolean isValid()
	{
		return isValid;
	}
	
	public void setwords(String words)
	{
		this.words = words;
	}
	public void setnumber(int number)
	{
	this.number = number;
	}
	public void setvalue(double value)
	{
	this.value = value;
	}
	public void setisValid(boolean isValid)
	{
	this.isValid = isValid;
	}
}