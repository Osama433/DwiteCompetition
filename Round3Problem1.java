import java.io.*;
import java.util.*;
//Problem: http://dwite.ca/questions/weighted_presents.html
//Test Cases: http://dwite.ca/home/testcase/213

public class Problem1 {

	public static void main(String[] args) throws IOException {

		Scanner br = new Scanner(new BufferedReader(new FileReader("DATA1.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter("OUT1.txt"));
		
		String item[] = new String[4];
		int mass[] = new int[4];
		int diff = 999999999;
		int a=0;
		String closest = null;
		for (int j = 0; j < 5; j++) {
			closest = null;
			a = br.nextInt();
			diff = 999999999;
			for (int x = 0; x < 4; x++) {
				item[x] = br.next();
				mass[x] = br.nextInt();
				if (Math.abs((mass[x] - a)) < diff)
				{
					closest = item[x];
					diff = Math.abs(mass[x] - a);
				}if (Math.abs((mass[x] - a)) <= diff &&(mass[x]>( diff+ a)))
				{
					closest = item[x];
					diff = Math.abs(mass[x] - a);
				}
				
			}
			bw.write(closest);
			bw.newLine();
		}
		bw.close();

	}

}
