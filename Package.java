package Project2;
import java.util.Scanner;

public class Package {
	
//3 private instance variables - length, width and height
	private double length, width, height;
	
//1 private instance variable (type - scanner)
	private Scanner input = new Scanner(System.in);
	
//no args public constructor - initialize all three instance variables to 1.0
	public Package() 
	{
        this.length = this.width = this.height = 1.0;
	}

//Initial public constructor – initialize all three instance variables
    public Package(double length, double width, double height) 
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
//Copy constructor – copy Package
    public Package(Package b) 
    {
        this(b.length, b.width, b.height);
    }
    
//inputWidth, inputLength, and inputHeight methods 
    public void inputWidth() 
    {
        this.width = input.nextDouble();
    }

    public void inputLength() 
    {
        this.length = input.nextDouble();
    }

    public void inputHeight() 
    {
        this.height = input.nextDouble();
    }
    
//displayDimensions method 
    public void displayDimensions() 
    {
        System.out.printf("%.1f X %.1f X %.1f", length, width, height);
    }
    
//calcVolume method that has no parameters and calculates the volume
    public double calcVolume() 
    {
        return length * width * height;
    }
     

}
