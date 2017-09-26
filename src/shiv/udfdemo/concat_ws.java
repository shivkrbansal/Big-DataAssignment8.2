package shiv.udfdemo;


import java.util.ArrayList;

import org.apache.hadoop.hive.ql.exec.UDF;
public class concat_ws extends UDF{
public String evaluate(String sep,ArrayList<String>list){
    	
    	StringBuilder sb = new StringBuilder();
    	
    		
    		for(int i=0;i<list.size()-1;i++){
    			
    			sb.append(list.get(i)).append(sep);
    		}
    		
    		sb.append(list.get(list.size()-1));
    		return sb.toString();

}
}

