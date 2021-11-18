package parctice;

import java.util.Scanner;

public class 循环 {

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
			//if为判断语句
			if(0<=a&&a<=100){
				if (a<=60){
					System.out.println("不及格");
				}
				else if(60<a&&a<80){
					System.out.println("中等");
				}
				else if(80<a&&a<=100){
					System.out.println("优秀");
				}
			}
			else{
				System.out.println("你TM改成绩？");
			}
			r.close();
	}

}
/*for是1243243循环
while先判断再执行
dowhile是先执行后判断
*/
