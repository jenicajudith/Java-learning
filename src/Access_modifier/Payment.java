package Access_modifier;

abstract class Payment {
	abstract void payment();

}

class Upi extends Payment{
	void payment() {
		System.out.println("payment done using UPI");
	}
}

class Credit extends Payment{
	void payment() {
		System.out.println("payment done using Credit card");
	}
}



