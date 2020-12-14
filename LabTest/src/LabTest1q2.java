import java.util.Scanner;

public class LabTest1q2 {

	public static void main(String[] args) {
		//QUESTION 2
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your sales: ");
		double sales1=in.nextDouble();
		System.out.print("Enter the hours worked: ");
		double hours1=in.nextDouble();
		System.out.println();
		
		double com1=sales1*0.05;
		double com2=sales1*0.10;
		double com3=sales1*0.15;
		double hourlywages=hours1*5;
		double dailywages1=hourlywages+com1;
		double dailywages2=hourlywages+com2;
		double dailywages3=hourlywages+com3;
		
		if(sales1>=50 && sales1<=300) {
			System.out.println("Your commission is: " + "RM" + com1);
		} else if(sales1>=301 && sales1<=500) {
			System.out.println("Your commission is: " + "RM" + com2);
		} else if(sales1>500) {
			System.out.println("Your commission is: " + "RM" + com3);
		}
		
		if(sales1>=50 && sales1<=300) {
			System.out.println("Your daily wages is: " + "RM" + dailywages1);
		} else if(sales1>=301 && sales1<=500) {
			System.out.println("Your daily wages is: " + "RM" + dailywages2);
		} else if(sales1>500) {
			System.out.println("Your daily wages is: " + "RM" + dailywages3);
		}
	}

}
