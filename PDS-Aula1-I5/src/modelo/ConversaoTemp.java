package modelo;

public class ConversaoTemp {
	
	public float conversaoTemp (float TempF) {
		float tempConvertida = (TempF -32f)*5f/9f;
		return tempConvertida; 
	}

}
