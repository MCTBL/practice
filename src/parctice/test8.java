package parctice;

public class test8 {
	public static void main(String[] args) {
		String nWord[]= {"ɵ��","�Բ�","������","������","������","ȥ����","ɵȱ"};
		String temp="���ɵ�ƣ������裬��������������";
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
