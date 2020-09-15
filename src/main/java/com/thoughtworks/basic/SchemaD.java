package com.thoughtworks.basic;

public class SchemaD extends Schema {
    public SchemaD(String order,String value) throws Exception {
        super(order,value);
        try {
            String.valueOf(value);
        }catch (Exception e){
            throw new Exception("d的value类型为string");
        }
    }
}
