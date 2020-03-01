/**
 * 
 */
package com.example.ff4jflipper.service;

import org.springframework.stereotype.Component;

/**
 * @author venkatasuryasasikala
 *
 */
@Component("caluculationServiceDecimal")
public class CaluculationServiceDecimalImpl implements CalculationsService
{

    /*
     * (non-Javadoc)
     * 
     * @see com.sasip.service.CalculationsService#addNumbers(int, int)
     */
    @Override
    public String addNumbers(int numOne, int numTwo)
    {
        return Integer.toString(numOne + numTwo);
    }

}
