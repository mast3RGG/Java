import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyClass{
	int age() default 15;
	String name() default "Maxim";
}
//@MyClass(age = 17 , name = "Alin")
@MyClass // Both can me made
class TestAnotations {
	String pipi;
	String kiki;
	public void setKiki(String kiki) {
		this.kiki = kiki;
	}
	public void setPipi(String pipi) {
		this.pipi = pipi;
	}
	public String getKiki() {
		return kiki;
	}
	public String getPipi() {
		return pipi;
	}
}
class Anontations {
	public static void main(String[] args) {
		TestAnotations TA = new TestAnotations();
		TA.setKiki("Kiki");
		TA.setPipi("Lola");
		Class a = TA.getClass();
		Annotation annotation = a.getAnnotation(MyClass.class);
		MyClass myAnotation = (MyClass) annotation;
		int age = myAnotation.age();
		String name = myAnotation.name();
		System.out.println(age + " " + name);
	}
}
