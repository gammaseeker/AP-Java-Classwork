package Objects;
import java.util.*;

public class Log {
	private Date[] checkOut;
	private Date[] dueDate;
	
	public Log()
	{
		
	}
	
	public Log(Date[] checkOut, Date[] dueDate)
	{
		this.checkOut = checkOut;
		this.dueDate = dueDate;
	}
	
	public void setCheckOut(Date[] checkOut)
	{
		this.checkOut = checkOut;
	}
	
	public void setDueDate(Date[] dueDate)
	{
		this.dueDate = dueDate;
	}
	
	public Date[] getCheckOut()
	{
		return this.checkOut;
	}
	
	public Date[] dueDate()
	{
		return this.dueDate;
	}
}
