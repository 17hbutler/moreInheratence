
public class Bird 
{
	private String noise;  
	private String name; 
	
	public Bird() 
		{
		this("", ""); 
		}
	public Bird(String n, String m) 
		{
		noise = n; 
		name = m; 
		}
	public String getName() 
		{
		return name; 
		}
	public String getNoise() 
		{
		return noise; 
		}
	public static void method1() 
		{
		System.out.println("The bird goes chirp.");
		}
	public static void method2() 
		{
		System.out.println("The other bird goes chirp.");
		}
}
