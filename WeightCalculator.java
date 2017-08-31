public class WeightCalculator
{
	public static void main (String [] args)
	{
		double earthWeight = Double.parseDouble(args [0]);
		double marsWeight = (earthWeight * .38);
		double jupiterWeight = (earthWeight * 2.38);
		double venusWight = (earthWeight * .91);
		double saturnWeight = (earthWeight * 1.06);
	
		System.out.println("Earth: " + earthWeight);
		System.out.println("Mars: " + marsWeight);
		System.out.println("Jupiter: " + jupiterWeight);
		System.out.println("Venus: " + venusWight);
		System.out.println("Saturn: " + saturnWeight);
		
	}
}