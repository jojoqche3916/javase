package person3static;

import person2.botanicalgarden;
import person2.planttwo;

public class getobjectutil {

    public static planttwo getplanttwo(){
        return new planttwo();
    }

    public static planttwo getplanttwostep(String plantname,String plantflower,botanicalgarden botanicalgarden){

        return new planttwo(plantname, plantflower,botanicalgarden);
    }
}
