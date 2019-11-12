package sec01.exam06;

import java.util.ArrayList;

public class MyCustomerExample {

	public static void main(String[] args) {
		ArrayList<MyCustomer> customerList=new ArrayList<MyCustomer>();
		
		MyCustomer customer_1=new MyCustomer(10010, "김인수");
		MyCustomer customer_2=new MyCustomer(10020, "정인호");
		MyCustomer customer_3=new MyCustomer();
		MyCustomer customer_4=new MyCustomer();
		MyCustomer customer_5=new MyCustomer();
		
		customerList.add(customer_1);
		customerList.add(customer_2);
		customerList.add(customer_3);
		customerList.add(customer_4);
		customerList.add(customer_5);
	}

}
