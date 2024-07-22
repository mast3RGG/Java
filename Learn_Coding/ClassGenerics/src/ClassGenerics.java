class Ex<T>
{
	T obj ;
	public Ex(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	public void show() {
		System.out.println(obj.getClass().getName());
	}
	}
public class ClassGenerics {
	public static void main(String[] args) {
		Ex<Integer> i1 = new Ex<Integer>(10);
		i1.show();
		System.out.println(i1.getObj());
	}
}