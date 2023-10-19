package modelo;

public class Calculo {
	
	public float calculoPe(float altura, float base ) {
		
		float Perimetro =  2 * (altura + base);
		return Perimetro;
	}
	public float calculoA (float altura, float base) {
		
		float Area = base * altura;
		return Area; 
		
	}

}