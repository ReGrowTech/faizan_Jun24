package constructorPro;

public class Animal {
	
	int eye;
	String species;
	boolean isMale;
	double weight;
	
	private Animal()
	{
		//default constructor  -- eye=0 species=null isMale=false weight=0.0
		eye=2;
		species = "Mammal";
		isMale = true;
		weight = 10.5;
		
	}
	
	public Animal(int eye)
	{
		//default constructor  -- eye=0 species=null isMale=false weight=0.0
		this.eye=eye;
	}
	
	public Animal(String species)
	{
		this.species = species;
	}
	
	
	public Animal(int eye, String species)
	{
		this.eye=eye;
		this.species = species;
	}
	
	
	public Animal(String species, int eye)
	{
		//default constructor
		this.eye=eye;
		this.species = species;
		System.out.println("This is species, eye constructor");
	}
	
	

	
	public Animal(int eye, String species, boolean isMale, double weight)
	{
		this();
		this.isMale = isMale;
		this.weight = weight;
		
	}
	

	public static void main(String[] args) {
//		Animal ob = new Animal();
//		ob.display();
//		System.out.println("------------------------------------------");
//		
		Animal dog = new Animal(2,"xyz",false,3.8);
		dog.display();
		System.out.println("------------------------------------------");
		
//		Animal cat= new Animal("CatSpecies", 2);
//		cat.display();
//		
		
	}
	
	public void display() {
		System.out.println(eye);
		System.out.println(species);
		System.out.println(isMale);
		System.out.println(weight);
	}

}

// Constructor is a method that has same name as the class name
// Constructor does not have a return type
// Constructor is non-static
// Constructor is invoked at the time of object creation.
// Constructor can have any code inside it (Even you can create an object inside a constructor)
// But the main purpose of the constructor is to initialize the instance variables

//Types of Constructor: 
     // 1. Default Constructor
     // 2. Zero Parameterized Constructor
     // 3. Parameterized Constructor

//We can have more than 1 constructor in a class.
//this keywords refers to the current object. 

// What is the difference between methods and constructors
// Constructor overloading
