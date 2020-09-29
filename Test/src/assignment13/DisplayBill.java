package assignment13;

	import java.util.Scanner;

	interface CustomerType {
		void selectCustomerType();
	}
	interface HalvesDiscountPercent {
		void discountPercent();
	}
	interface CalculateHalves {
		void calculateHalves(int purchase);
		
	}
	interface CalculateDiscount {
		int calculateDiscountAmount(int purchase);
	}
	class SelectCustomer implements CustomerType {
		int third_half_pa=0,second_half_pa=0,first_half_pa=0;
		
		public int customer_type;
		public void selectCustomerType() {
			System.out.println("Select customer type:"
					+ "\n" + "1. Classic"
					+ "\n" + "2. Gold"
					+ "\n" + "3. Platinum");
			Scanner sc = new Scanner(System.in);
			customer_type = sc.nextInt();
		}
	}
	class SelectHalvesDiscountPercent extends SelectCustomer implements HalvesDiscountPercent{
		int first_half=10000,second_half=20000,discount_first=0,discount_second = 0,discount_third=0;
		public void discountPercent() {
			if(super.customer_type==1) {
				discount_first = 10;
				discount_second = 15;
				discount_third = 20;
			}
			if(super.customer_type==2) {
				discount_first = 20;
				discount_second = 25;
				discount_third = 30;
			}
			if(super.customer_type==3) {
				discount_first = 30;
				discount_second = 35;
				discount_third = 40;
			}
			
		}
	}
	class CalculateDiffHalves extends SelectHalvesDiscountPercent implements CalculateHalves {
		int third_half_pa=0,second_half_pa=0,first_half_pa=0;
		public void calculateHalves(int purchase) {
			if(purchase>20000) {
				third_half_pa = purchase -second_half;
				second_half_pa = second_half-first_half;
				first_half_pa = first_half;
			}
			if(purchase<=20000 && purchase>10000) {
				second_half_pa = purchase-first_half;
				first_half_pa = first_half;
			}
			if(purchase<=10000) {
				first_half_pa = purchase;
			}
			
		}
	}
	class CalculateTotalDiscount extends CalculateDiffHalves implements CalculateDiscount{
		int first_discount_pa=0 , second_discount_pa=0 , third_discount_pa=0, total_discount=0;
		
		public int calculateDiscountAmount(int purchase) {
				first_discount_pa = first_half_pa*discount_first/100;
				second_discount_pa = second_half_pa*discount_second/100;
				third_discount_pa = third_half_pa*discount_third/100;
				total_discount = first_discount_pa+second_discount_pa+third_discount_pa;
				return total_discount;
		}
	}
	class CalculateBill extends CalculateTotalDiscount{
		int totalBillAmount = 0;
		   public int DisplayBill(int purchase) {
			totalBillAmount = purchase - total_discount;
			return totalBillAmount;
	}
		
	}
	public class DisplayBill {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int start=1;
			while(start!=0) {
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter purchase Amount");
				int purchase = sc.nextInt();
				CalculateBill obj = new CalculateBill();
				obj.selectCustomerType();
				obj.discountPercent();
				obj.calculateHalves(purchase);
				System.out.println("DISCOUNT AMOUNT=" +obj.calculateDiscountAmount(purchase));
				System.out.println("TOTAL AMOUNT=" +obj.DisplayBill(purchase));
				System.out.println("if you want to exit program press '0'");
				start = sc.nextInt();
			}		
		}

	}

