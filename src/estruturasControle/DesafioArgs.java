package estruturasControle;

public class DesafioArgs {
	public static void main(String[] args) {
		int total =0;
		for (int i = 0; i < args.length; i++) {
			String argumento = args[i];
			System.out.println(argumento);
			
			
			total += Integer.parseInt(args[i]);
		}
		System.out.println(total);
	}
}
