
public class ChetAndNechet {
	public String getNumberOfChetAndNechet(int num) {
		String NumToText = num + "";
		
		int chet = 0;
		int nechet = 0;
		
		for (int i = 0; i < NumToText.length(); i++) {
			if(Character.getNumericValue(NumToText.charAt(i))%2 == 0) {
				chet++;
			}
			else {
				nechet++;
			}
		}
		return "Number of chet is "+chet+"\nNumber of nechet is "+nechet;
	}
	public static void main(String[] args) {
		ChetAndNechet number = new ChetAndNechet();
		String result = number.getNumberOfChetAndNechet(1234874825);
		System.out.println(result);

	}

}
