
import java.util.Scanner;

public class Project 
{
	public static Scanner scan = new Scanner(System.in);
		
		public static String[] List = new String[1000];
		public static String[] CheckList = new String[1000];
		
		public static int toDoList = 0;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List = new String[1000];
		
		
		
		
		Test();
		
		
		
		
		

	}
	
	public static void Test() 
	{
		System.out.println("Type 1 to add/ Type 2 to remove/ Type 3 To Read/ Type 4 to check.");
		int mode = scan.nextInt();
		
		//This chooses if you want to add,remove,read,etc
		
		switch (mode) 
		{
		
		case 1:
			System.out.println("Add task");
			Add();
			break;
		case 2:
			System.out.println("Remove task");
			Remove();
			break;
		case 3:
			System.out.println("Read task");
			Read();
			break;
		case 4:
			System.out.println("Check task");
			Check();
			break;
			
		default:
			
			System.out.println("Error");
			Test();
			break;
		
		}
		
		
		
		
	}
	
	public static void Add() 
	{
		// this adds tasks into the list
		Scanner Input = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Type in what you want to add.");
		String add = Input.nextLine();
		
		
		List[toDoList] = add;
		CheckList[toDoList] = " : Isn't done";
		toDoList++;
		System.out.println(" ");
		Test();
		
	}
	
	public static void Read() 
	{
		//This reads whatever is in the list
		
		boolean mode = true;
		
		if(mode == false)
		{
		System.out.println("Type in the number you want to read");
		int read = scan.nextInt();
		
		read = Clamp(read,0,toDoList - 1);
		
		if(List[read] != null) 
		{
			System.out.println(List[read]);
		}else 
		{
			System.out.println("Error, item not found.");
		}
		}else 
		{
			System.out.println(" ");
				System.out.println("Here is your list:");
				
				
				
			for (int i = 0; i < toDoList; i++) 
			{
				
				System.out.println((i + 1) + ". " + List[i] + CheckList[i]);
				
			}
			
			System.out.println(" ");
		}
		
		//This restarts the process
		Test();
		
	}
	
	public static void Remove() 
	{
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Type in what you want to remove.");
		int remove = Input.nextInt();
		remove = Clamp(remove - 1,0,toDoList);
		
		for(int t = remove; t < toDoList; t++) 
		{
			List[t] = List[t + 1];
			CheckList[t] = CheckList[t + 1];
			List[t + 1] = null;
			CheckList[t + 1] = null;
		}
		
		toDoList--;
				
			
		
		Test();
		
		
		
	}
	
	public static void Check() 
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("What item do you want to check.");
		
		
		
		int checker = scan.nextInt();
		
		checker = Clamp(checker,0,toDoList - 1);
		
		if(CheckList[checker] == " : Done") 
		{
			CheckList[checker] = " : Isn't done";
		}else
		CheckList[checker] = " : Done";
		
		Test();

	}
	
	public static int Clamp(int value, int min, int max) 
	{
		if(value < min)
			value = min;
		else if(value > max)
			value = max;
		
		return value;
	}

}
