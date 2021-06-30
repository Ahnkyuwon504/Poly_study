package main;

import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;

public class Pearson {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double[] x = {5932288,
                6112339,
                6193380,
                6260055,
                6346559,
                6430331,
                6520381,
                6620051,
                6706665,
                6825939};
        double[] y = {2009,
                2010,
                2011,
                2012,
                2013,
                2014,
                2015,
                2016,
                2017,
                2018};
        
        double[] y2 = {4359467, 
                4527282,
                4579405,
                4639665,
                4712324,
                4786718,
                4885012,
                5003406,
                5131379,
                5306214,};
        
        double correlation = new PearsonsCorrelation().correlation(y, x);
        System.out.println("남성의 숫자와 총 인구수의 상관 관계 : " + correlation);
        
        double correlation2 = new PearsonsCorrelation().correlation(y2, x);
        System.out.println("연도의 증가(2009 ~ 2018)와 총 인구수의 상관 관계 : " + correlation2);

    }

}
