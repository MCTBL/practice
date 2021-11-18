package parctice;

import java.io.*;

public class test9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("log.txt",true));
		bw.write("wuhu");
		bw.flush();
		
	}

}
