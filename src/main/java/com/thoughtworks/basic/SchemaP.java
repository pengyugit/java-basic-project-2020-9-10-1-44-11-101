package com.thoughtworks.basic;

public class SchemaP extends Schema {
    String order = "P";
    int value = 0;

    public SchemaP(String order,String value){
        super(order,value);
        try {
            this.value = Integer.parseInt(value);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public String getOrder() {
        return order;
    }

    public int getValue() {
        return value;
    }

}
