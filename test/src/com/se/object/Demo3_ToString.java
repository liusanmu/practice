package  com.se.object;

public class Demo3_ToString {

	/**
	 * @param args
	 * com.heima.bean.Student@bcda2d
	 * public Stirng toString() {
			return  getClass().getName() + "@" + Integer.toHexString(hashCode()) 
		}
		��� ������
		�м䣺@
		�ұߣ�hashCode��ʮ����Ʊ�����ʽ
		��ôдû��ʲôʵ�����塣
		toString����������:���Ը�����ʾ����ֵ��
		getXxx������Ϊ�˻�ȡֵ��������ʾҲ���Ը�ֵ���������������
	 */
	public static void main(String[] args) {
		Student s = new Student("����", 23);
//		String str = s.toString();
//		System.out.println(str);
		System.out.println(s.toString());
		System.out.println(s);
		System.out.println("�ҵ������ǣ�" + s.getName() + ",�ҵ������ǣ�"+ s.getAge());
	}

}
