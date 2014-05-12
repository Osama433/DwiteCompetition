import java.io.*;
import java.util.*;
//Problem :http://dwite.ca/questions/crossword_count.html
//Test Cases: http://dwite.ca/home/testcase/218

public class Problem1 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner br = new Scanner(
				new BufferedReader(new FileReader("DATA1.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter("OUT1.Txt"));
		for (int x = 0; x < 5; x++) {
			int length = br.nextInt();
			int width = br.nextInt();
			int aword = 0;
			int across = 0;
			int down = 0;
			String row = null;
			String grid[][] = new String[length][width];
			for (int r = 0; r < length; r++) {
				row = br.next();
				for (int c = 0; c < width; c++) {
					grid[r][c] = row.substring(c, c + 1);
					if (grid[r][c].equals(".")) {
						aword++;
					}
					if (grid[r][c].equals("#")) {
						aword = 0;
					}
					if (aword == 2) {
						across++;
					}
				}
				aword = 0;
			}
			for (int c = 0; c < width; c++) {
				for (int r = 0; r < length; r++) {
					if (grid[r][c].equals(".")) {
						aword++;
					}
					if (grid[r][c].equals("#")) {
						aword = 0;
					}
					if (aword == 2) {
						down++;
					}
				}
				aword = 0;
			}
			String a = Integer.toString(across);
			String b = Integer.toString(down);
			bw.write(a + " " + b);
			bw.newLine();
		}
		bw.close();

	}
}
