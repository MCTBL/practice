package parctice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;
import java.util.HashMap;

import javax.net.ssl.HttpsURLConnection;

public class test18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String url="https://www.ceve-market.org/api/searchname/%E6%B4%9B%E5%9F%BA%E7%BA%A7";
//		
//		URL eve=new URL(url);
//		HttpsURLConnection a=(HttpsURLConnection)eve.openConnection();
//		BufferedReader z=new BufferedReader(new InputStreamReader(a.getInputStream(),"utf-8"));
//		String temp;
//		while((temp=z.readLine())!=null) {
//			System.out.println(temp);
//		}
		
		
		HashMap<Integer, Integer> a=new HashMap<Integer,Integer>();
		a.put(1, 1);
		System.out.println(a.get(1));
		a.put(1, 1);
		System.out.println(a.get(1));
		a.put(1, 2);
		System.out.println(a.get(1));
		System.out.println(a.get(3)==null);
		
		
		
	}

}
