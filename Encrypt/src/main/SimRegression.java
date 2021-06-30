package main;

import org.apache.commons.math3.stat.regression.SimpleRegression;

public class SimRegression {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SimpleRegression simpleRegression = new SimpleRegression (true);
        simpleRegression.addData(new double[][] {
            {2009,    4359467.0},
            {2010,    4527282.0},
            {2011 ,   4579405.0},
            {2012  ,  4639665.0},
            {2013   , 4712324.0},
            {2014    ,4786718.0},
            {2015    ,4885012.0},
            {2016   , 5003406.0},
            {2017   , 5131379.0},
            {2018   , 5306214.0}

        });
        
        double N = 2020.0;
        System.out.println("Intercept = " + simpleRegression.getIntercept());
        System.out.println("Prediction for " + N + " = " + simpleRegression.predict(N));
        System.out.println("R square = " + simpleRegression.getRSquare());
        System.out.println("Significance Level " + simpleRegression.getSignificance());
    }
}
