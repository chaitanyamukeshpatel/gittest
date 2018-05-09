package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature c = new Celsius(super.getValue());
		return c;
    }

    @Override
    public Temperature toFahrenheit() {
		Temperature f = new Fahrenheit((super.getValue())*((float)9/(float)5)+32);
		return f;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ("" + super.getValue() + " C");
    }
}



