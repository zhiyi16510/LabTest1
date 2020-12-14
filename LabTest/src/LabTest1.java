import java.util.Scanner;

public class LabTest1 {

	public static void main(String[] args) {
		//QUESTION 1
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		int num1=in.nextInt();
		
		System.out.print("Enter the price of the first item: ");
		int num2=in.nextInt();
		System.out.print("Enter the quantity of the first item: ");
		int num3=in.nextInt();
		int price1=num2*num3;
		System.out.println("The total price of the first item: " + "RM" + price1);
		System.out.println();
		
		System.out.print("Enter the price of the second item: ");
		int num4=in.nextInt();
		System.out.print("Enter the quantity of the second item: ");
		int num5=in.nextInt();
		int price2=num4*num5;
		System.out.println("The total price of the second item: " + "RM" + price2);
		System.out.println();
		
		System.out.print("Enter the price of the third item: ");
		int num6=in.nextInt();
		System.out.print("Enter the quantity of the third item: ");
		int num7=in.nextInt();
		int price3=num6*num7;
		System.out.println("The total price of the third item: " + "RM" + price3);
		System.out.println();
		
		int sum=price1+price2+price3;
		System.out.println("The total price of the item(s) you have bought: " + "RM" + sum);
		
		double discount1=sum*0.2;
		double discount2=sum*0.1;
		if(sum>=100) {
			System.out.println("The discount you received is: " + "RM" + discount1);
		} else if(sum<100) {
			System.out.println("The discount you received is: " + "RM" + discount2);
		}
		
		double totalprice1=sum-discount1;
		double totalprice2=sum-discount2;
		if(sum>=100) {
			System.out.println("The total price you have to pay is: " + "RM" + totalprice1);
		} else if(sum<100) {
			System.out.println("The total price you have to pay is: " + "RM" + totalprice2);
		}
		
	}

}
