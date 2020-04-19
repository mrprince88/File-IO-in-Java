import java.io.*;
import java.util.*;

class Main {

	static private final String INPUT = "input.txt";
	static private final String OUTPUT = "output.txt";

	public static void main(String[] args) {

		long startTime = System.nanoTime() / 1000000000;
		FileInputStream instream = null;
		PrintStream outstream = null;

		try {
			instream = new FileInputStream(INPUT);
			outstream = new PrintStream(new FileOutputStream(OUTPUT));
			System.setIn(instream);
			System.setOut(outstream);
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner s = new Scanner(System.in);


		double endTime   = System.nanoTime() / 1000000000;
		double totalTime = endTime - startTime;
		System.err.format("%.8f\n", totalTime);
		return;
	}
}