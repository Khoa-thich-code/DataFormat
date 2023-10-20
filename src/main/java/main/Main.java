package main;

import controller.DataFomat;
import model.Data;

public class Main {

    public static void main(String[] args) {   
        Data d = new Data();
        new DataFomat(d).run();
    }
    
}