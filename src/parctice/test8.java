package parctice;

public class test8 {
	public static void main(String[] args) {
		String nWord[]= {"傻逼","脑残","日你妈","干你娘","草泥马","去你妈","傻缺"};
		String temp="你个傻逼，日你妈，我真的是想干你娘";
		int z=0,tempi=0;
		String temps="X";
		int len;
		
		for (String i : nWord) {
			len = i.length();
			temp = temp.replace(i, temps.repeat(len));
		}
		System.out.println(temp);
	}
}
