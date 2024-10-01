/**
 * Class to convert fahrenheit, celcius, and kelvin to each other
 * @author      Ariana Adame
 */

class convertTemp extends UnitConverter {
    
    /** Constructor */
    public convertTemp(double val, double conFac) {
        super();
    }
    
    /** Prints a converted value in temperature to a different value in temperature according to the conversion factor */
    public void conTemp() {
        double conVal;
        /** fahrenheit to celcius */
        if (getConversionFactor() == 0.00) {
            conVal = (getValue() - 32) * 5/9;
            System.out.println("" + getValue() + " FAHRENHEIT is converted into " + conVal + " CELCIUS");
        }
        /** fahrenheit to kelvin */
        else if (getConversionFactor() == 1.00) {
            conVal = (getValue() - 32) * 5/9 + 273.15;
            System.out.println("" + getValue() + " FAHRENHEIT is converted into " + conVal + " KELVIN");
        }
        /** celcius to fahrenheit */
        else if (getConversionFactor() == 2.00) {
            conVal = getValue() * (9/5) + 32;
            System.out.println("" + getValue() + " CELCIUS is converted into " + conVal + " FAHRENHEIT");
        }
        /** celcius to kelvin */
        else if (getConversionFactor() == 3.00) {
            conVal = getValue() * 3;
            System.out.println("" + getValue() + " CELCIUS is converted into " + conVal + " KELVIN");
        }
        /** kelvin to fahrenheit */
        else if (getConversionFactor() == 4.00) {
            conVal = getValue() * (9/5) + 32;
            System.out.println("" + getValue() + " KELVIN is converted into " + conVal + " FAHRENHEIT");
        }
        /** kelvin to celcius */
        else if (getConversionFactor() == 5.00) {
            conVal = getValue() + 273.15;
            System.out.println("" + getValue() + " KELVIN is converted into " + conVal + " CELCIUS");
        }
    }
    
}
