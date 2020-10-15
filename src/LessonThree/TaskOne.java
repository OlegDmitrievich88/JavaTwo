package LessonThree;

import java.util.*;

public class TaskOne {

    public static void main(String[] args){
        String[] string = {"cat","dog","snake","pig","shark","cow","beef","bull","bigdod","littledog","human","animal","cat","dog","snake","pig","shark","cow","beef","bull","bigdod","littledog","human","animal"};

        HashSet<String> text = new HashSet<>();
        Collections.addAll(text,string);
        System.out.println(text);

        HashMap<String,Integer> text1 = new HashMap<>();
        for(int i = 0 ; i < string.length; i++)
        {
            text1.put(string[i],i);
        }
        System.out.println(text1);
        for (String key: text1.keySet()){
            System.out.printf("{k=%s,v=%d}",key,text1.get(key));
        }

        //Iterator<Map.Entry<String, Integer>> itertext = text1.entrySet().iterator();
        //System.out.println(itertext);
        }
     
    }



