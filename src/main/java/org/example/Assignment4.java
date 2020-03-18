package org.example;

import java.util.*;

public class Assignment4 {

    private static List<Integer> addNum;
    private static Map area;
    private static Set names;
    private TreeSet sort;

    public void ListEX(){
        addNum = new ArrayList();
        addNum.add(0,8);
        addNum.add(1, 25);
        addNum.add(2, 35);
        System.out.print(addNum);
        Collections.sort(addNum);
    }
    //
    public void MapEX(String Asia){
        Assignment4 oop = new Assignment4();
        area = new HashMap();
        area.put("Asia","Beijing");
        area.put("Russia","Moscow");
        area.put("USA","New York");
        System.out.print(area);

    }
    public void setEX(String s){
        names = new HashSet();
        names.add("Lauren");
        names.add("Sage");
        names.add("Leah");
        System.out.print(names);
        sort = new TreeSet(names);
    }

    public static List<Integer> getAddNum() {
        return addNum;
    }

    public static Map <String, String> getArea() {
        return area;
    }

    public static Set<String> getNames() {
        return names;
    }


}
