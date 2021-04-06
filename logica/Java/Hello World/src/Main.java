import com.dankicurso.utilities.Utils;

public class Main {
	
	public static void myName(String string) {
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		Utils utils1 = new Utils();
		utils1.number = 50;
		myName("André Aguiar");
		utils1.printHello();
		System.out.println("Obj 1, " + utils1.number);
		
		Utils utils2 = new Utils();
		utils2.number = 20;
		myName("André Gomes");
		utils2.printHello();
		System.out.println("Obj 2, " + utils2.number);
		
		Utils original = new Utils();
		System.out.println("Obj original, " + original.number);
		
	}

}
