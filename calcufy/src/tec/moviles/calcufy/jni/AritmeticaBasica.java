package tec.moviles.calcufy.jni;

public class AritmeticaBasica {
	public native double sumar( double op1 ,double op2 );
	public native double restar( double op1, double op2);
	public native double multiplicar( double op1, double op2 );
	public native double dividir( double op1, double op2 );
	
	
	static{
		System.loadLibrary("AritmeticaBasica");
	}

}
