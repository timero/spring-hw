package com.epam.alpar_zsolt_timar.spring_hw;

public class MatrixRealm extends Realm {

    public MatrixRealm(String name) {
        super(name);
    }
    
    
    public void init(){
        System.out.println("init method: " + this.toString());
    }

}
