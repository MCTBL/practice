package mariao;

public class Coor {
	int x=1,y=1;
	void Move(int a) {
		if(a==8) {
			y--;
		}else if(a==4) {
			x--;
		}else if(a==6) {
			x++;
		}else if(a==2) {
			y++;
		}
	}
	void Print() {
		for(int a=1;a<=5;a++) {//�ڼ���
			for(int b=1;b<=10;b++) {//�ڼ���
				if(b==this.x&&a==this.y) {
					System.out.print("@");
				}else{
					System.out.print("*");
				}
				if(b==10) {
					System.out.println();
				}
			}
		}
	}
	boolean PanDuan() {
		if(this.x<=0||this.x>10||this.y<=0||this.y>5) {
			System.out.println("���ܳ�ȥ��");
			return false;
		}else {
			return true;
		}
	}
}
