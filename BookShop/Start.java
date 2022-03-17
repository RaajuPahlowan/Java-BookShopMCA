import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StoryBook S1 = new StoryBook("2996876", "Superman", "Jerry Siegel", 200.0, 20, "Comic");
		StoryBook S2 = new StoryBook("3229990", "Batman", "Bob Cane", 270.0, 25, "Comic");
		StoryBook S3 = new StoryBook("3229870", "Flash", "Jim", 250.0, 56, "Comic");
		StoryBook S4 = new StoryBook("1278589", "Rick Sanchez", "A Swim", 365.0, 32, "Comic");
		StoryBook S5 = new StoryBook("2788978", "Spiderman", "Stan Lee", 159.0, 21, "Comic");

		TextBook T1 = new TextBook("1990980", "Basic Machinelearning", "Nicolas", 170.0, 45, 1);
		TextBook T2 = new TextBook("1765489", "Deep Learning", "jennifer", 200.0, 30, 1);
		TextBook T3 = new TextBook("3278947", "Economics", "Jerry", 202.0, 20, 1);
		TextBook T4 = new TextBook("5464748", "Planet", "Unknown", 245.0, 18, 1);
		TextBook T5 = new TextBook("6747483", "Java", "Jerry", 269.0, 12, 1);

		BookShop B = new BookShop("Rokomari");
		B.showDetails();

		System.out.println("-------------------------------");

		if(B.insertBook(S1)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(S2)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(S3)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(S4)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(S5)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}



		if(B.insertBook(T1)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(T2)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(T3)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(T4)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}

		if(B.insertBook(T5)){System.out.println("Inserted");}
		else{System.out.println("Can NOT be Inserted");}


		B.showDetails();

		System.out.println("-------------------------------");


		if(B.removeBook(S4)){System.out.println("Removed");}
		else{System.out.println("Can NOT be Removed");}

		if(B.removeBook(T4)){System.out.println("Removed");}
		else{System.out.println("Can NOT be Removed");}

		System.out.println("-------------------------------");

		B.showDetails();


		Book bb = B.searchBook(S1.getIsbn());
		
		if(bb != null)
		{
			System.out.println("Object Found...");
			bb.showDetails();
		}
		else{System.out.println("No Object Found...");}

		Book bbb = B.searchBook(T1.getIsbn());
		
		if(bbb != null)
		{
			System.out.println("Object Found...");
			bbb.showDetails();
		}
		else{System.out.println("No Object Found...");}
		
		System.out.println("-------------------------------");


	



		
	}
}