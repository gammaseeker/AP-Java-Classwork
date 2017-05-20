import java.util.ArrayList;
public class Elements
{
	private ArrayList<Element> elements = new ArrayList<Element>();
	
	public Elements(Element[] theElements)
	{
		for(int i = 0; i < theElements.length; i++)
		{
			elements.add(theElements[i]);
		}
	}
	public Elements(ArrayList<Element> theElements)
	{
		elements = theElements;
	}
	
	public Element getElementById(int atomicNum)
	{
		for(int i = 0; i < elements.size(); i++)
		{
			if(elements.get(i).getAtomicNumber() == atomicNum)
			{
				return elements.get(i);
			}
		}
		return null;
	}
	public void sortByAtomicNumber()
	{
		for(int i = 0; i < elements.size()-1; i++)
		{
			int maxIndex = i;
			for(int y = i+1; y < elements.size(); y++)
			{
				if(elements.get(y).getAtomicNumber() > elements.get(maxIndex).getAtomicNumber() )
				{
					maxIndex = y;
				}	
			}
			swap(elements, maxIndex, i);
		}
	}
	public void sortByName()
	{
		for(int i = 0; i < elements.size()-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < elements.size(); y++)
			{
				if(elements.get(y).getName().compareTo(elements.get(minIndex).getName()) < 0)
				{
					minIndex = y;
				}	
			}
			swap(elements, minIndex, i);
		}
	}
	public void sortByAtomicWeight()
	{
		for(int i = 0; i < elements.size()-1; i++)
		{
			int maxIndex = i;
			for(int y = i+1; y < elements.size(); y++)
			{
				if(elements.get(y).getAtomicWeight() > elements.get(maxIndex).getAtomicWeight())
				{
					maxIndex = y;
				}
			}
			swap(elements, maxIndex, i);
		}
	}
	private void swap(ArrayList<Element> arr, int a, int b)
	{
		arr.set(b, arr.set(a, arr.get(b)));
	}
	private void swap(Element[] arr, int a, int b)
	{
		Element temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	private void swap(String[] arr, int a, int b)
	{
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	private void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}