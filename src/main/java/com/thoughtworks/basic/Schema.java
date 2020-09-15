package com.thoughtworks.basic;

public abstract class Schema {
    private String order;
    private Object value;

    public Schema(String order, Object value) {
        this.order = order;
        this.value = value;
    }


    public String toString(){
        return "Arg(\""+order+"\","+value+")";
    }
}
