package sec01.exam06;

public class MyCustomer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int mileagePoint;
	double mileageRatio;
	
	public MyCustomer() {
		initCustomer();
	}
	
	public MyCustomer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade="SILVER";
		mileageRatio=0.01;
		
	}
	public int calcPrice(int price) {
		mileagePoint +=price*mileageRatio;
		return price;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	

}



