package com.thoughtworks.basic;

public abstract class Schema {
    private String order;
    private String value;

    public Schema(String order, String value) {
        this.order = order;
        this.value = value;
    }


    public String toString(){
        return "(\""+order+"\","+value+")";
    }
}
