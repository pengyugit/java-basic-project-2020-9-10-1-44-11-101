package com.thoughtworks.basic;

public class SchemaD extends Schema {
    String order = "d";
    String value = "";

    public SchemaD(String order,String value) throws Exception {
        super(order,value);
        try {
            String.valueOf(value);
        }catch (Exception e){
            throw new Exception("d的value类型为string");
        }
    }

    public String getOrder() {
        return order;
    }

    public String getValue() {
        return value;
    }

}
