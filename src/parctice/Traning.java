/**
 * 
 */
package parctice;//����ȫСд

/**
 * @author Jackie-zhong
 *
 */
public class Traning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass first;//��ջ���½�һ����Ϊfirst�����ã�������ֵ
		first=new StudentClass(10);//�ڶ����½�һ�����󣬲������ý���first
		System.out.println(first);
		first=null;//ʹfirst������ֵ��Ϊnull
		System.out.println(first);
	}

}
class StudentClass{//�࣬�ӿ������շ�
	int studentNo;//������С�շ�
	final  int STUDENTNUMBER=20;//����ȫ��д
	
	void setStudentNo(int No){//������С�շ�
		this.studentNo=No;
	}
	
	StudentClass(int studentNo) {//���췽��
		this.studentNo=studentNo;
	}
	
}