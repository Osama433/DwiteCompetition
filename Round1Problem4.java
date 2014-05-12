import java.io.*;
import java.util.*;
//Problem: http://dwite.ca/questions/c001_numbers.html
//Test Cases: http://dwite.ca/home/testcase/200

public class Problem4 {

	public static void main(String[] args) throws IOException {

		Scanner br = new Scanner ( new BufferedReader (new FileReader("DATA4.txt")));
		BufferedWriter bw = new BufferedWriter (new FileWriter("OUT4.txt"));
		int counter = 0;
			for (int x = 0; x < 5; x++){
				counter =0;
				int n = br.nextInt();
				
				for (int i =0; i <=n; i++){
					
					String line= Integer.toString(i);
					int length= line.length();
					
					for(int z =0; z<length; z++)
					{
						
						if(line.charAt(z)=='0'){
							counter ++;
						}
					}
						
					
				}
				bw.write(Integer.toString(counter));
				bw.newLine();
			}
			bw.close();			

		}
		
	
}

