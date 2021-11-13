package localglobal.variables;

public class Variables {

	/*Global variable is accessible to everyone and its value is shared*/
	static String biCampeaoMundial = "Corinthians!";
	
	/*Main is a self-executable method in Java*/
	public static void main(String[] args) {
		
		/*Local variable because it belongs only to this method and the value is inside it*/
		String maiorCampeaoPaulista = "também é o Corinthians.";
		System.out.println("O maior campeão paulista " + maiorCampeaoPaulista);
		
		callGlobalVariable();

	}
	
	public static void callGlobalVariable () {
		System.out.println("O último sulamericano a conquistar o mundo e o único brasileiro reconhecidamente bicampeão mundial pela FIFA é o " + biCampeaoMundial);
	}
}
