/**
  * This interface establishes methods that will be set in other classes, there should be three classes total [convertTime, convertTemp, and convertLength]
  * 
  * @author Evelyn Ibarra
 */
 
public interface UnitConversion{
 /**
  * Converts value parameter to a different unit using factor parameter.
  *
  * @param value of unconverted unit
  * @param the amount used to convert value
  * @return the amount converted 
 */
    double convert(double value, double factor);
 /**
  * Sets factor of conversion.
  *
  * @param value to use when converting from one unit to another.
 */
    double setConversionFactor(double factor);
 /**
  * gets conversion factor
 */
    double getConversionFactor();
 /**
  *Resets conversion factor. 
 */
    void resetConversionFactor();
  /**
  * Shows the completed conversion.  
 */
    void showConversion();

}
