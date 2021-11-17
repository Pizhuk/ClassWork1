
public class NeStrogoeAnd {
	public String getNeStrogoeAnd(String first, String second) {
		String result = "";
		if (first.length()==second.length()) {
			for (int i = 0; i<first.length(); i++) {
				if (first.charAt(i) == '0' && second.charAt(i)=='0') {
					result = result + "0";
				}
				else if((first.charAt(i) == '0' && second.charAt(i)=='1') || 
						(first.charAt(i) == '1' && second.charAt(i)=='0')|| (first.charAt(i) == '1' && second.charAt(i)=='1')){
					result = result + "1";
				}
				else {
					result = "Here should be 1 or 0";
					break;
				}
			}
		}
		else {
			result = "First And Second should be the same length";
		}
		return result;
	}
	public static void main(String[] args) {
		NeStrogoeAnd binNumber = new NeStrogoeAnd();
		String result = binNumber.getNeStrogoeAnd("1001010", "0111010");
		System.out.println(result);

	}

}
