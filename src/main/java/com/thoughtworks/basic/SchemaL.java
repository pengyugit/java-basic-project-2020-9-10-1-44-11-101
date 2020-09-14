package com.thoughtworks.basic;

public class SchemaL extends Schema {
    String order = "l";
    boolean value = false;

    public SchemaL(String order,String value) throws Exception {
        super(order,value);
        try {
            Boolean.getBoolean(value);
        }catch (Exception e){
            throw new Exception("l的value类型为boolean");
        }

    }

    public String getOrder() {
        return order;
    }

    public boolean getValue() {
        return value;
    }

}
