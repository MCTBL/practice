/**
 * 
 */
package parctice;

/**
 * @author Jackie-zhong
 *
 */
public class ���ָ�ʽ�� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String�����format�����������ָ�ʽ��
		for(int i=0;i<=100;i++) {
			System.out.println(String.format(i+"��ʮ�������б�ʾΪ%X",i));
		}
		//��ʽ���Ʒ�������б�ֵ�ĸ����������,��ʽ���Ʒ�֮����Բ���
		System.out.println(String.format("%d����%x����%Xxixi",5,3,6));
		//%d���߱�Ŀ��Ʒ��в���","��Ϊ����ǧ��λ��ʾ
		System.out.println(String.format("%,f", 100032323.1648));
		
		
	}

}
