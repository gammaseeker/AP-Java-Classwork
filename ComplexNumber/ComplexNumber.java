public class ComplexNumber
{
	private double a;
	private double b;
	
	public ComplexNumber(double realPart, double imaginaryPart)
	{
		a = realPart;
		b = imaginaryPart;
	}
	public ComplexNumber(double realPart)
	{
		a = realPart;
		b = 0;
	}	
	public ComplexNumber()
	{
		a = 0;
		b = 0;
	}
	public ComplexNumber(ComplexNumber other)
	{
		this.a = other.a;
		this.b = other.b;
	}
	public double getA()
	{
		return this.a;
	}
	public double getB()
	{
		return this.b;
	}
	public String toString()
	{
		return this.a + "+" + this.b + "i";
	}
	public ComplexNumber add(ComplexNumber other)
	{
		double resultA = this.a + other.getA();
		double resultB = this.b + other.getB();
		return new ComplexNumber(resultA, resultB);
	}
	public ComplexNumber subtract(ComplexNumber other)
	{
		double resultA = this.a - other.getA();
		double resultB = this.b - other.getB();
		return new ComplexNumber(resultA, resultB);
	}
	public ComplexNumber multiply(ComplexNumber other)
	{
		double c = other.a;
		double d = other.b;
		return new ComplexNumber((this.a * c - this.b * d), (this.b * c + this.a * d));
	}
	public ComplexNumber divideBy(ComplexNumber other)
	{
		double c = other.a;
		double d = other.b;
		/*ComplexNumber theConjugate = other.getConjugate();
		ComplexNumber numerator = multiply(theConjugate);
		ComplexNumber denominator = multiply(theConjugate);*/
		return new ComplexNumber(((a * c + b * d)/(Math.pow(c, 2) + Math.pow(d,2))), ((b * c - a * d)/(Math.pow(c, 2) + Math.pow(d, 2))));
	}
	public ComplexNumber getConjugate()
	{
		return new ComplexNumber(this.a, (0-this.b));
	}
}