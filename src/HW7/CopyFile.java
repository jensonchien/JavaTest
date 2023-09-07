package HW7;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		String sourcePath = "C:\\THA103_Workspace\\JavaHW\\src\\HW7\\source.txt";
		String destinationPath = "C:\\THA103_Workspace\\JavaHW\\src\\HW7\\destination.txt";
		copyFile(sourcePath, destinationPath);

	}

	public static void copyFile(String sourcePath, String destinationPath) throws IOException {
		File inputFile = new File(sourcePath);
		File outputFile = new File(destinationPath);
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
			// System.out.print((char) c);
			System.out.flush();
		}

		out.close();
		in.close();

	}

}
