package com.thoughtworks.basic;

public class SchemaL extends Schema {
    String order = "l";
    boolean value = false;

    public SchemaL(String order,String value){
        super(order,value);
        try {
            this.value = Boolean.getBoolean(value);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public String getOrder() {
        return order;
    }

    public boolean getValue() {
        return value;
    }

}
