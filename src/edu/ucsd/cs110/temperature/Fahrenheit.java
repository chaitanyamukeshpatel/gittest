package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
		Temperature c = new Celsius((super.getValue()-32)*((float)5/(float)9));
		return c;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature f = new Fahrenheit(super.getValue());
		return f;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ("" + super.getValue() + " F");
    }
}



