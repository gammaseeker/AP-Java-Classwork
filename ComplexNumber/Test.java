public class Test
{
	public static void main (String[] args)
	{
		ComplexNumber myNum = new ComplexNumber(5, 6);
		ComplexNumber myNum2 = new ComplexNumber(5);
		ComplexNumber myNum3 = new ComplexNumber();
		ComplexNumber myNum4 = new ComplexNumber(myNum);
		ComplexNumber myNum5 = new ComplexNumber(7, 18);
		ComplexNumber[] myNumArr = {myNum, myNum2, myNum3, myNum4, myNum5};
		for(int i = 0; i < 5; i++)
		{
			System.out.println(myNumArr[i]);
		}
		System.out.println(myNum.add(myNum2));
		System.out.println(myNum.subtract(myNum2));
		System.out.println(myNum.multiply(myNum5));
		System.out.println(myNum.divideBy(myNum5));
		System.out.println(myNum.getConjugate());
		QuadraticEquation myEq = new QuadraticEquation(1, 2, 3);
		ComplexNumber[] myArr = myEq.getRoot();
		System.out.println(myArr[0] + "  " + myArr[1]);
	}
}