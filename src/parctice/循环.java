package parctice;

import java.util.Scanner;

public class ѭ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;//1
				i<=10;//2
				i++){//3
				System.out.println(i);//4
			}
			
			int z=0;
			while(z<=10){
				System.out.println(z);
				z++;
			}
			
			int p=0;
			do{
				System.out.println(p);
				p++;
			}while(p<10);
			
			Scanner r= new Scanner(System.in); 
			int a=r.nextInt();
			//ifΪ�ж����
			if(0<=a&&a<=100){
				if (a<=60){
					System.out.println("������");
				}
				else if(60<a&&a<80){
					System.out.println("�е�");
				}
				else if(80<a&&a<=100){
					System.out.println("����");
				}
			}
			else{
				System.out.println("��TM�ĳɼ���");
			}
			r.close();
	}

}
/*for��1243243ѭ��
while���ж���ִ��
dowhile����ִ�к��ж�
*/
