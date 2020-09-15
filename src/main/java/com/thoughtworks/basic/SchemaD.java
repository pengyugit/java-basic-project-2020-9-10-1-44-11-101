package com.thoughtworks.basic;

public class SchemaD extends Schema {
    private String value;

    public SchemaD(String order,String value) throws Exception {
        super(order,value);
        try {
            this.value = String.valueOf(value);
        }catch (Exception e){
            throw new Exception("d的value类型为string");
        }
    }
}
