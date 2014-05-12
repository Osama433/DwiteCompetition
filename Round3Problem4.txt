import java.io.*;
import java.util.*;
//Problem: http://dwite.ca/questions/ABCA_maze.html
//Test: http://dwite.ca/home/testcase/216
//Quick solution to get part marks for the question
public class Problem4 {

	public static void main(String[] args) throws IOException {

		Scanner br = new Scanner(
				new BufferedReader(new FileReader("DATA4.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter("OUT4.txt"));

		for (int x = 0; x < 5; ++x) {
			int g = br.nextInt();
			int h = br.nextInt();
			int counter = 0;
			for (int j = 0; j < g; ++j) {
				String line = br.next();
				for (int o = 0; o < h - 1; ++o) {
					if (line.substring(o, o + 1).contains(".")) {
						counter++;
					}
				}

			}
			counter = (counter + 2) * 2;
			bw.write(Integer.toString(counter));
			bw.newLine();
		}
		bw.close();
	}

}
