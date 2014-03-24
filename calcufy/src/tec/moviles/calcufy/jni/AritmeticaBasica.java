package tec.moviles.calcufy.jni;

public class AritmeticaBasica {
	public native double sumar( double op1 ,double op2 );
	public native double restar( double op1, double op2);
	public native double multiplicar( double op1, double op2 );
	public native double dividir( double op1, double op2 );
	
	public enum OPERACION{
		SUMA, RESTA, MULTIPLICACION, DIVISION
	}
	
	private double mOp1 = 0;
	private double mOp2 = 0;
	private OPERACION mOperacion = OPERACION.SUMA;
	
	
	static{
		System.loadLibrary("AritmeticaBasica");
	}
	
	public void setOp1(double pOp1){
		mOp1 = pOp1;
	}
	
	public void setOp2(double pOp2){
		mOp2 = pOp2;
	}
	
	public void clear(){
		mOp1 = 0;
		mOp2 = 0;
	}
	public OPERACION getOperacion() {
		return mOperacion;
	}
	public void setOperacion(OPERACION mOperacion) {
		this.mOperacion = mOperacion;
	}
	public double getOp1() {
		return mOp1;
	}
	public double getOp2() {
		return mOp2;
	}
	
	

}
