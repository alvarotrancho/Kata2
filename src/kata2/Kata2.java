package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        Integer[] data = {2, 4, 5, 2, 7, 4, 4, 8, 8, 5, 2, 6, 5, 7, 2};
        String [] data2 = {"Facundo","Ana","Pedro","Pepe","Maria","Pepe","Maria","Jesus","Pepe"};

        //Histogram meta_histogram = new Histogram(data);
        Histogram meta_histogram = new Histogram(data2);
        
        Map<Integer,Integer> histogram =  meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println(entry.getKey() + " ==> " +entry.getValue());
        }
    }
    
}
