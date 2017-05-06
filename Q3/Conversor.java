import java.lang.Exception;

public class Conversor{

	private double temperature;
	private char scale;

	public Conversor(double temperature, char scale) throws TempException{
		this.temperature = temperature;
		this.scale = scale;
		if(temperature <= -459.67 && scale == 'F'){
			throw new FahException();
		}else if(temperature <= -273.15 && scale == 'C'){
			throw new FahException();
		}
	}

	public void converter(){
		if(scale == 'F'){
			System.out.println("Temperatura em Celsius: " + ((5*(temperature-32))/9) + "\n");
		}else if(scale == 'C'){
			System.out.println("Temperatura em Fahrenheit: " + ((temperature*1.8)+32) + "\n");
		}
	}
}