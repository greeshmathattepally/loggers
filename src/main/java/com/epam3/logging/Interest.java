package com.epam3.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
	private static Logger LOGGER = LogManager.getLogger(App.class);
	double calculateSimpleInterest(int prinicipalAmount,int timeInYears,double rateOfInterest)
	{
		LOGGER.info("Calculating Simple Interest");
		return (int)(prinicipalAmount*timeInYears*rateOfInterest)/(100);
	}
	double calculateCompoundInterest(int prinicipalAmount,int timeInYears,double rateOfInterest)
	{
		LOGGER.info("Calculating Compound Interest");
		return (prinicipalAmount* (Math.pow( (1+(rateOfInterest/100)) ,timeInYears)) );
	}
}
