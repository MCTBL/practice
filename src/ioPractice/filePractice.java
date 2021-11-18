package ioPractice;

import java.io.*;
import java.util.LinkedList;

public class filePractice {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//×Ö½Ú
		//InputStream
		//FileInputStream,PipedInputStream,ObjectInputStream,BufferedInputStream
		
		//OutputStream
		//FileOutputStream,PipedOutputStream,ObjectOutputStream,BufferedOutputStream
		
		//×Ö·û
		//Rader
		//InputStreamReader,FileReader,BufferedReader
		
		//Writer
		//OutputStreamWirter,FileWriter,BufferedWriter
		
//		LinkedList<Integer> a=new LinkedList<Integer>();
		LinkedList<Integer> a=null;
//		a.add(3);
//		a.add(5);
		File f=new File("wuhu.txt");
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
//		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
		
//		out.writeObject(a);
//		out.close();
		try {
			a=(LinkedList<Integer>) in.readObject();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("¶ÁÈ¡Íê±Ï");
		}
		
		System.out.println(a.get(0));
		
	}
}
