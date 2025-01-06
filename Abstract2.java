package abstract_method;

public class Abstract2 extends Abstract1{
	@Override
	public void bloodgroup() {
		System.out.println("O positive");
	}
	@Override
	public void tabletname() {
		System.out.println("paracitamal");
	}
	@Override
	public void wardno() {
		System.out.println(6);	
	}
	@Override
	public void medicalbill() {
		System.out.println(2500);	
	}
	@Override
	public void roomcharge() {
		System.out.println(1700);	
	}
	public static void main(String[] args) {
		Abstract2 hh = new Abstract2();
		hh.hospital();
		hh.patientname();
		hh.bloodgroup();
		hh.tabletname();
		hh.wardno();
		hh.medicalbill();
		hh.roomcharge();
	}

}
