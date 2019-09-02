package it.ex6_map;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/*@Override
	public boolean equals(Object obj) {
		System.out.println("ִ������");
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
	@Override
	public int hashCode() {
		final int NUM = 38;
		return name.hashCode() * NUM + age;
	}*/
	
	/*
	 * Ϊʲô��31?
	 * 1,31��һ������,�������ܱ�1���Լ�����������
	 * 2,31�����Ȳ���Ҳ��С
	 * 3,31��������,2����η�-1,2�����ƶ�5λ
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)						//���õĶ���ʹ���Ķ�����ͬһ������
			return true;						//ֱ�ӷ���true
		if (obj == null)						//����Ķ���Ϊnull
			return false;						//����false
		if (getClass() != obj.getClass())		//�ж����������Ӧ���ֽ����ļ��Ƿ���ͬһ���ֽ���
			return false;						//�����ֱ�ӷ���false
		Person other = (Person) obj;			//����ת��
		if (age != other.age)					//���ö�������䲻���ڴ�����������
			return false;						//����false
		if (name == null) {						//���ö��������Ϊnull
			if (other.name != null)				//������������Ϊnull
				return false;					//����false
		} else if (!name.equals(other.name))	//���ö����������ڴ�����������
			return false;						//����false
		return true;							//����true
	}
	/*@Override
	//������������
	public int compareTo(Person o) {
		int num = this.age - o.age;				//�����ǱȽϵ���Ҫ����
		return num == 0 ? this.name.compareTo(o.name) : num;//�����ǱȽϵĴ�Ҫ����
	}*/
	/*@Override
	//������������
	public int compareTo(Person o) {
		int num = this.name.compareTo(o.name);		//��������Ҫ����
		return num == 0 ? this.age - o.age : num;	//�����Ǵ�Ҫ����
	}*/
	/*
	 * aaa
	 * bbb
	 */
	public int compareTo(Person o) {
		int length = this.name.length() - o.name.length();				//�Ƚϳ���Ϊ��Ҫ����
		int num = length == 0 ? this.name.compareTo(o.name) : length;	//�Ƚ�����Ϊ��Ҫ����
		return num == 0 ? this.age - o.age : num;						//�Ƚ�����Ϊ��Ҫ����
	}
	
}
