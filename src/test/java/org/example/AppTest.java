package org.example;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.stream.Location;
import java.util.*;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void getNames() {
        Assignment4 aa = new Assignment4();
        Set<String> actualSet = Assignment4.getNames();
        aa.setEX("Shane");
        assertEquals("We are expecting Sage",
                "Sage","Sage");
        Assignment4.getNames();
    }

    @Test
    public void getLocation() {
        Assignment4 oop = new Assignment4();
        oop.MapEX("Asia");
        Assert.assertEquals("We are expecting Asia",
                "Asia=Beijing", "USA=New York");
        Assignment4.getArea();
    }

}
