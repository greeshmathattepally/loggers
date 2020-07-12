package com.epam3.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	private static Logger LOGGER = LogManager.getLogger(App.class);
	int costUsingStandardMaterials(int area) {
		LOGGER.info("cost using standard materials");
  	  return 1200*area;
    }
    int costUsingAboveStandardMaterials(int area) {
    	LOGGER.info("cost using above standard materials");
  	  return 1500*area;
    }
    int costUsingHightStandardMaterials(int area) {
    	LOGGER.info("cost using high standard materials");
  	  return 1800*area;
    }
    int costUsingHighStandardMaterialsandFullyAutomated(int area) {
    	LOGGER.info("cost using high standard materials and fully automated");
  	  return 2500*area;
    }
}
