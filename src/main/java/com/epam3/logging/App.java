package com.epam3.logging;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        Interest interest=new Interest();
        LOGGER.info("Enter Principal Amount, Time in Years, Rate of Interest");
        int prinicipalAmount=sc.nextInt();
        int timeInYears=sc.nextInt();
        double rateOfInterest=sc.nextDouble();
        LOGGER.info("Select Option\n1)Simple Interest\n2)Compound Interest\n");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1: LOGGER.info(interest.calculateSimpleInterest(prinicipalAmount, timeInYears, rateOfInterest));
                break;
        case 2:         
        	LOGGER.info(interest.calculateCompoundInterest(prinicipalAmount, timeInYears, rateOfInterest));
        	   break;
        }
        
        LOGGER.info("Select type of materials and if required select fully automated from below options\n1)Standard Materials\n2)Above Standard Materials\n3)High Standard Materials\n4)High Standard and Fully Automated");
        ch=sc.nextInt();
        ConstructionCost cost=new ConstructionCost();
        LOGGER.info("Enter area of house");
        int area =sc.nextInt();
        switch(ch)
        {
        case 1: LOGGER.info(cost.costUsingStandardMaterials(area));
                break;
        case 2: LOGGER.info(cost.costUsingAboveStandardMaterials(area));
                break;
        case 3: LOGGER.info(cost.costUsingHightStandardMaterials(area));
                break;
        case 4: LOGGER.info(cost.costUsingHighStandardMaterialsandFullyAutomated(area));
                break;
        }
        
    }
}
