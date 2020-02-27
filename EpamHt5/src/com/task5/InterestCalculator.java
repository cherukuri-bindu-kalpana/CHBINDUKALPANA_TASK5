package com.task5;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.util.*;
public class InterestCalculator 
{
	static final Logger logger = Logger.getLogger(InterestCalculator.class);
	public static void simpleinterest (int p,int t,int r)
	{
		int si=(p*t*r)/100;
		logger.debug("Simple Interest for given ammount is"+" "+si);
	}
	public static void compoundinterest(int p,int t,int r)
	{
		double rate=Math.pow(1+(float)r/100,t);
		double ci=(p*rate);
		logger.debug("Compound Interest for given amount is"+" "+(int)ci);
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		BasicConfigurator.configure();
		logger.info("Enter the principal amount");
		int p=in.nextInt();
		logger.info("Enter the time period");
		int t=in.nextInt();
		logger.info("Enter the rate of interest");
		int r=in.nextInt();
		simpleinterest(p,t,r);
		compoundinterest(p,t,r);
	}

}
