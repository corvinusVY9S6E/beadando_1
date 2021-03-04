package beadando_1;

import java.io.*;



public class titkosito {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("adat.txt"));
		PrintWriter pw = new PrintWriter("eredmeny.txt");
		String input=bf.readLine();
		String output = "";
		while(input != null) {
			for (char c : input.toCharArray()) {
				   output += Character.toString((((c - 'a' + 1) % 26) + 'a'));
				}
			pw.println(output);
			output="";
			input=bf.readLine();
		}
		pw.flush();
		pw.close();
		bf.close();
	}

}
