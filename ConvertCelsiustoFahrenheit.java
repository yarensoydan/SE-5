package se2;

public class ConvertCelsiustoFahrenheit implements Command {

private Conversions_SE conversion;
public ConvertCelsiustoFahrenheit(Conversions_SE conversion) {this.conversion = conversion;}

public ConvertCelsiustoFahrenheit() {
	// TODO Auto-generated constructor stub
}

public void execute() {
      conversion.TemperatureConverter();
   }


}
