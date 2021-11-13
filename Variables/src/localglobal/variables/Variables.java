package localglobal.variables;

public class Variables {

	/*Global variable is accessible to everyone and its value is shared*/
	static String biCampeaoMundial = "Corinthians!";
	
	/*Main is a self-executable method in Java*/
	public static void main(String[] args) {
		
		/*Local variable because it belongs only to this method and the value is inside it*/
		String maiorCampeaoPaulista = "tamb�m � o Corinthians.";
		System.out.println("O maior campe�o paulista " + maiorCampeaoPaulista);
		
		callGlobalVariable();

	}
	
	public static void callGlobalVariable () {
		System.out.println("O �ltimo sulamericano a conquistar o mundo e o �nico brasileiro reconhecidamente bicampe�o mundial pela FIFA � o " + biCampeaoMundial);
	}
}
