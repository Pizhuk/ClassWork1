
public class ASCII {
	public String getSymbol(int start, int end) {
		String symbols = "";
		for (int i = start; i <= end; i++) {
			String hg = Character.toString((char) i);
			symbols = symbols + " " + hg;
		}
		return symbols;
	}
	public static void main(String[] args) {
		ASCII symbols = new ASCII();
		String result = symbols.getSymbol(64, 70);
		System.out.println(result);
	}

}
