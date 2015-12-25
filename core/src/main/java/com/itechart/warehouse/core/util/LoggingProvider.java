package com.itechart.warehouse.core.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingProvider {

    final static Logger logger = LoggerFactory.getLogger(LoggingProvider.class);

    public static void info(String message, Object... parameters){
        if(parameters != null) {
            logger.info(message, parameters);
        }else{
            logger.info(message);
        }
    }

    public static void debug(String message, Object... parameters){
        if(parameters!=null) {
            logger.debug(message, parameters);
        }else{
            logger.debug(message);
        }
    }

    public static void error(String message, Object... parameters) {
        if(parameters!=null) {
            logger.error(message, parameters);
        }else{
            logger.error(message);
        }
    }
}