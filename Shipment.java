package Project2;

public class Shipment {

	public static void main(String[] args) 
	{
		Package p1 = new Package();
		Package p2 = new Package();
		
//Input all height width and length of both packages
		System.out.println("Welcome to Yashpreet’s shipping calculator! \n");
		System.out.println("Enter first package dimensions");
		System.out.print("Enter the length: ");
		p1.inputLength();
		System.out.print("Enter the Height: ");
		p1.inputWidth();
		System.out.print("Enter the Height: ");
		p1.inputHeight();
		
		System.out.println("\nEnter second package dimensions");
		System.out.print("Enter the length: ");
		p2.inputLength();
		System.out.print("Enter the Height: ");
		p2.inputWidth();
		System.out.print("Enter the Height: ");
		p2.inputHeight();
		 
//Using calcVolume() from package class
		double price1 = 3.0 + (p1.calcVolume() - 1)*1.0;
		double price2 = 3.0 + (p2.calcVolume() - 1)*1.0;
		
//using displayDimensions() from package class
		System.out.print("\nFirst package dimensions: ");
		   p1.displayDimensions();
		   System.out.print(", Volume= "+p1.calcVolume() +"\n");
		   
		   System.out.print("Second package dimensions: ");
		   p2.displayDimensions();
		   System.out.print(", Volume= "+p2.calcVolume() +"\n");
	       
		   
		   System.out.println("Package 1 will cost: $" + price1 + " to ship.");
		   System.out.println("Package 2 will cost: $" + price2 + " to ship.");
		   
		   if(price1 == price2)
		   {//The price is same
			   
		       System.out.println("The first package is the same cost as the second package");
		   }
		   else
		   {//One is more costly than the other
		       String moreCostlierString = "First package";   //By default, first is costlier
		       String lessCostlierString = "Second package";  
		       double moreCostlierPrice = price1;
		       double lessCostlierPrice = price2;
		      
	      if(price2 > price1)
		   {//If the default is not true
			   moreCostlierString = "Second package"; // swap the values
		       lessCostlierString = "First package";
		       moreCostlierPrice = price2;
		       lessCostlierPrice = price1;
		   }
	     
// To store the comparison
		   String comparisionString; 
		   if(moreCostlierPrice < 2*lessCostlierPrice)
		   {
		       comparisionString = "slightly more than";
		   }
		   else if(moreCostlierPrice < 3*lessCostlierPrice)
		   {
		       comparisionString = "twice";
		   }
		   else if(moreCostlierPrice < 4*lessCostlierPrice)
		   {
		       comparisionString = "triple";
		   }
		   else if(moreCostlierPrice < 5*lessCostlierPrice)
		   {
		       comparisionString = "quadruple";
		   }
		   else
		   {
		       double multiple = moreCostlierPrice/lessCostlierPrice;
		       comparisionString = multiple + " times";
	       }
		   
		       System.out.println("The " + moreCostlierString+" is " + comparisionString+ " than the " + lessCostlierString);
		   }
	    }


}

/**
Output 1:
Welcome to Yashpreet’s shipping calculator! 

Enter first package dimensions
Enter the length: 1
Enter the Height: 1
Enter the Height: 1

Enter second package dimensions
Enter the length: 1
Enter the Height: 1
Enter the Height: 1

First package dimensions: 1.0 X 1.0 X 1.0, Volume= 1.0
Second package dimensions: 1.0 X 1.0 X 1.0, Volume= 1.0
Package 1 will cost: $3.0 to ship.
Package 2 will cost: $3.0 to ship.
The first package is the same cost as the second package

Output2:
Welcome to Yashpreet’s shipping calculator! 

Enter first package dimensions
Enter the length: 1
Enter the Height: 1
Enter the Height: 1

Enter second package dimensions
Enter the length: 2
Enter the Height: 2
Enter the Height: 2

First package dimensions: 1.0 X 1.0 X 1.0, Volume= 1.0
Second package dimensions: 2.0 X 2.0 X 2.0, Volume= 8.0
Package 1 will cost: $3.0 to ship.
Package 2 will cost: $10.0 to ship.
The Second package is triple than the First package

**/

