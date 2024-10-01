/** class that implements the UnitConversion interface
 * @author      Ariana Adame
 */

class UnitConverter implements UnitConversion {
    
    /**This class would benefit from some instance variables
     * val stores the unconverted value
     * conFac stores the multiplier/conversion factor to be used on val
     */
    private double val;
    private double conFac;
    
    /** Parameterized constructor */
    public UnitConverter(double val, double conFac) {
        this.val = val;
        this.conFac = conFac;
    } 
    
    /** Non-parameterized constructor */
    public UnitConverter() {
        val = 1.00;
        conFac = 1.00;
    } 
    
    /**
     * Multiplies a number by a given value
     * @return      result of value times factor
     */
    public double convert(double value, double factor) {
        return value * factor;
    }

    /**
     * Sets conFac to a new value
     * @return      the new conFac value
     */
    public double setConversionFactor(double factor) {
        conFac = factor;
        return conFac;
    }
    
    /** I believe the interface would benefit from this method */
    public void setValue(double newVal) {
        val = newVal;
    }
    
    /** I believe the interface would benefit from this method */
    public double getValue() {
        return val;
    }
    
    /** Get conFac
     * @return      conFac
     */
    public double getConversionFactor() {
        return conFac;
    }
    
    /** Sets conFac to 0.0 */
    public void resetConversionFactor() {
        conFac = 0.0;
        System.out.println("Conversion factor reset to 0.00.");
    }
    
    /** Prints the result of the covert() method */
    public void showConversion() {
        System.out.println(convert(val, conFac));
    }
    
}
