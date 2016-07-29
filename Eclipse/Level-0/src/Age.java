
public class Age {
	public static void main(String[] args) {

		for (int i = 0; i < 2003; i = i + 1) {
			Runtime.getRuntime().exec("say"+i).waitFor();
			System.out.println(i);
		}
		
	}

}