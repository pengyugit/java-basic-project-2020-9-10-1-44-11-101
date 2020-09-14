package com.thoughtworks.basic;

public class SchemaD extends Schema {
    String order = "d";
    String value = "";

    public SchemaD(String order,String value){
        super(order,value);
        try {
            this.value = value;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getOrder() {
        return order;
    }

    public String getValue() {
        return value;
    }

}
