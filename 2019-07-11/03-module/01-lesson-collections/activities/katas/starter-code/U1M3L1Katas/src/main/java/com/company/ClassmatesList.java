package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassmatesList {

    List<Classmate> info = new ArrayList<>();


        public List<Classmate>  add(Classmate name) {
            info.add(name);
            return info;
        }


    public List<Classmate>  get( int i) {
        for (i = 0; i < info.size(); i++)
            System.out.println(info.getName(i));
        //name.getName();
            return info;
        }


    public List<Classmate>  getAll(Classmate name) {
        for (int i = 0; i < info.size(); i++)
            System.out.println(info.get(i));
        return info;
    }
}


