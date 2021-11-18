package parctice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pattern m=Pattern.compile("\"temperature\":\"([0-9]+)\""),n=Pattern.compile("\"humidity\":\"([0-9.]+)\""),l=Pattern.compile("\"weather_day\":\"([\\S]+?)\",");
		Matcher b;
		
		
		URL name = new URL("http://weathernew.pae.baidu.com/weathernew/pc?query=%E5%B9%BF%E4%B8%9C%E5%B9%BF%E5%B7%9E%E5%A4%A9%E6%B0%94&srcid=4982&city_name=%E5%B9%BF%E5%B7%9E&province_name=%E5%B9%BF%E4%B8%9C");
		HttpURLConnection x=(HttpURLConnection) name.openConnection();
		BufferedReader a=new BufferedReader(new InputStreamReader(x.getInputStream()));
		String c="";
		ArrayList<String> p=new ArrayList<String>();
		while((c=a.readLine())!=null) {
			p.add(c);
		}
		for(String u:p) {
			if(u.contains("data[\"longDayForecast\"]")) {
				b=l.matcher(u);
				b.find();
				System.out.print("天气:");
				String d=b.group(1);
				String t[]=d.split("\\\\u");
				for(String i:t) {
					if(i.equals("")) {
						continue;
					}
					System.out.print((char)Integer.parseInt(i,16));
				}
				System.out.println();
			}
			
			if(u.contains("data[\"weather\"]")) {
				b=m.matcher(u);
				b.find();
				System.out.println("目前气温"+b.group(1)+"°C");
				b=n.matcher(u);
				b.find();
				System.out.println("目前湿度"+b.group(1)+"%");
			}
		}
		
		
		
		
		
	}

}
