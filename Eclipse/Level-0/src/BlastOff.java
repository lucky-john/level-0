import java.io.IOException;

public class BlastOff {
	public static void main(String[] args) {

		for (int i = 10; i > 0; i = i - 1) {
			try {
				Runtime.getRuntime().exec("say " + i).waitFor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		try {
			Runtime.getRuntime().exec("say " + "BLASTOFF").waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
