
public class Address {
	 private int dNo;
	 private String street;
	 private int pin;
	 
	 public Address(int dNo,String street,int pin) {
	  this.dNo = dNo;
	  this.street =  street;
	  this.pin = pin;
	 }

	public int getdNo() {
		return dNo;
	}

	public void setdNo(int dNo) {
		this.dNo = dNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", street=" + street + ", pin=" + pin + "]";
	}
	  
}
