package mainPackage;

public class IPrint {
	
	private String textToPrint;
	
	public IPrint(String pvText) {
		textToPrint = pvText;
	}
	
	public void printText() {
		System.out.println("Der Text, den ich ausgeben soll, ist:\n"+textToPrint);
	}
	
}
