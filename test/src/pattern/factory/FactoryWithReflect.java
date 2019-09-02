package pattern.factory;
/**  
 * @Description: FactoryWithReflect.java
 * @author: liusen
 * @date:   2019年4月23日 上午9:20:44   
 */
public class FactoryWithReflect {

	public static void main(String[] args) {
		Rectangle rectangle = ShapeFactory1.getInstnce("pattern.factory.Rectangle");
		rectangle.draw();
		Square square = ShapeFactory1.getInstnce("pattern.factory.Square");
		square.draw();
	}

}

class ShapeFactory1{
	private ShapeFactory1() {}//工厂类的构造方法为私有
	public static <T>T getInstnce(String classname) {
		T obj=null;
		try {
			obj=(T)Class.forName(classname).newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}

