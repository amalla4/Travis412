package travis_ci_tutorial_java;

public class SimpleCalculator {
	
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}

	public int multiply(int a, int b){
		return a*b;
	}

	//add divide method considering divide by zero
	public int divide(int a, int b){
		if(b == 0){
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return a/b;
	}
}
