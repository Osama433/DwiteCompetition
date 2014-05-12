import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Problem:

public class Round5_Problem1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(new BufferedReader(new FileReader("DATA1.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter("OUT1.txt"));
		int setday=27;
		int setmonth=10;
		int setyear=1997;
		for (int x=0; x<5; x++)
		{
			int day=s.nextInt();
			int month= s.nextInt();
			int year= s.nextInt();
			if((setyear-year<0))
			{
				bw.write("too young");
			}else if((setmonth-month<0)&& (setyear==year))
			{
				bw.write("too young");
			}else if ((setmonth==month && setyear==year) && setday-day<0)
			{
				bw.write("too young");
			}
			else
			{
				bw.write("old enough");
			}
			bw.newLine();
		}
		bw.close();
	}
}
