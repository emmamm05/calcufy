package tec.moviles.calcufy;

public class LogicaAritmetica {
	public native float sumar( float op1 ,float op2 );
	public native float restar( float op1, float op2);
	public native float multiplicar( float op1, float op2 );
	public native float dividir( float op1, float op2 );
	
	static{
		System.loadLibrary("AritmeticaBasica");
	}
}
