package LittleGame;

public class Card {
	int point[]=null;
	int no;
	int sum;
	
	Card(){
		this.point=new int[10];
		this.no=0;
		this.sum=0;
	}
	
	void getCard() {
		point[no]=(int)(Math.random()*13)+1;
		sum+=point[no];
		System.out.println("��鵽��"+this.point[no]);
		System.out.println("Ŀǰ�ܵ���Ϊ"+this.sum);
		no++;
	}
	
	void showCard() {
		System.out.println("��Ŀǰ�еĿ�����");
		for(int temp=0;temp<this.point.length;temp++) {
			if(this.point[temp]==0) {
				break;
			}
			System.out.print(this.point[temp]+" ");
		}
		System.out.println();
		System.out.println("�ܼ�"+this.sum);
		if(this.sum>21) {
			System.out.println("�ܿ�ϧ���Ѿ�������");
		}
	}
	
	void compare() {
		
	}
}
