package com.thoughtworks.basic;

public class SchemaP extends Schema {
    String order = "P";
    int value = 0;

    public SchemaP(String order,String value)throws Exception {
        super(order,value);
        try {
            Integer.parseInt(value);
        }catch (Exception e){
            throw new Exception("p的value类型为整数");
        }

    }

    public String getOrder() {
        return order;
    }

    public int getValue() {
        return value;
    }

}
