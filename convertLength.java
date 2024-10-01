/**
 * Class to convert centimeters, inches, and feet to each other
 * @author      Ariana Adame
 */
 
class convertLength extends UnitConverter {
    
    /** Constructor */
    public convertLength(double val, double conFac) {
        super();
    }
    
    /** Prints a converted value in length to a different value in length according to the conversion factor */
    public void conLen() {
        double conVal;
        /** centimeters to inches */
        if (getConversionFactor() == 0.00) {
            conVal = getValue() * 0.3;
            System.out.println("" + getValue() + " CENTIMETERS is converted into " + conVal + " INCHES");
        }
        /** centimeters to feet */
        else if (getConversionFactor() == 1.00) {
            conVal = getValue() * 0.0328;
            System.out.println("" + getValue() + " CENTIMETERS is converted into " + conVal + " FEET");
        }
        /** inches to centimeters */
        else if (getConversionFactor() == 2.00) {
            conVal = getValue() * 3;
            System.out.println("" + getValue() + " INCHES is converted into " + conVal + " CENTIMETERS");
        }
        /** inches to feet */
        else if (getConversionFactor() == 3.00) {
            conVal = getValue() * 0.0833;
            System.out.println("" + getValue() + " INCHES is converted into " + conVal + " FEET");
        }
        /** feet to centimeters */
        else if (getConversionFactor() == 4.00) {
            conVal = getValue() * 30.48;
            System.out.println("" + getValue() + " FEET is converted into " + conVal + " CENTIMETERS");
        }
        /** feet to inches */
        else if (getConversionFactor() == 5.00) {
            conVal = getValue() * 12;
            System.out.println("" + getValue() + " FEET is converted into " + conVal + " INCHES");
        }
    }
}
