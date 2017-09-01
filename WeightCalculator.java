public class WeightCalculator
{
	public static void main (String [] args)
	{
		double earthWeight = Double.parseDouble(args [0]);
	
		
		printPlanet(earthWeight, 0.38, "Mars");
		printPlanet(earthWeight, 2.38, "Jupiter");
		printPlanet(earthWeight, .91, "Venus");
		printPlanet(earthWeight, 1.06, "Saturn");
		
		
	}
	
	public static void printPlanet(double earth, double factor, String planet)
	{
		double weight = earth * factor; 
		System.out.println(planet + ": " + weight);
		
	}
}