package parctice;

import java.io.*;
import java.net.*;
import java.text.DecimalFormat;
import java.util.regex.*;
import javax.net.ssl.HttpsURLConnection;

public class test17 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String regex="<price>([0-9.]+)";
		Pattern x=Pattern.compile(regex);
		Matcher m;
		String ore[]= {"���ɿ�","������ŵ��ʯ","��״ʯӢ����","�ྦྷ�彺��","����������","Ī��ʯ","���ѺϽ�","ͬλ�ۺ���"};
		double newPrice[]=new double[8],oldPrice[]=new double[8];
		File lastPrice=new File("lastPrice.txt");
		String temp="";
		DecimalFormat df = new DecimalFormat("#.#");
		
		URL eve=new URL("https://www.ceve-market.org/api/evemon");
		HttpsURLConnection con=(HttpsURLConnection) eve.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		BufferedReader fr=new BufferedReader(new FileReader(lastPrice));

		for(int i=0;i<8;i++) {
			double tempDo=Double.valueOf(fr.readLine());
			oldPrice[i]=tempDo;
		}
		temp=br.readLine();
		m=x.matcher(temp);
		int i=0;
		while(m.find()) {
			newPrice[i]=Double.valueOf(m.group(1));
			double tempdo=newPrice[i]-oldPrice[i];
			System.out.println(ore[i]+"    \t"+m.group(1)+"isk  \t"+(tempdo>=0?"������"+df.format(tempdo):"�½���"+df.format(-tempdo))+"isk");
			i++;
		}
		BufferedWriter fw=new BufferedWriter(new FileWriter(lastPrice));
		for(Double z:newPrice) {
			fw.write(z.toString());
			fw.newLine();
			fw.flush();
		}
		
		fw.close();
		fr.close();
		br.close();
	}
}
