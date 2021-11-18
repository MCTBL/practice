package parctice;
import java.io.*;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr=new FileReader("d:\\a.txt");
			FileWriter fw=new FileWriter("d:\\a.txt");
			BufferedReader br=new BufferedReader(fr);
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			fw.write(48);
//			System.out.println(br.readLine());
		}catch(IOException a) {
			System.out.println(a.getMessage());
		}finally {
			System.exit(-1);
		}
		
		
		
	}

}
