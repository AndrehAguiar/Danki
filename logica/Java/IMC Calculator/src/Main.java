import com.dankicurso.imc_calculator.Utils;

public class Main {
	
	public static void main(String[] args) {
		Utils utils = new Utils("Andre", 1.72, 82.0, 39);
		System.out.println(utils.getName() + " " + utils.result);

		Utils utils1 = new Utils("Alexandre", 1.71, 88.0, 41);
		System.out.println(utils1.getName() + " " + utils1.result);
	}

}
