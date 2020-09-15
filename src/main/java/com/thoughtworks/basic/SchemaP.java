package com.thoughtworks.basic;

public class SchemaP extends Schema {
    public SchemaP(String order,String value)throws Exception {
        super(order,value);
        try {
            Integer.parseInt(value);
        }catch (Exception e){
            throw new Exception("p的value类型为整数");
        }

    }


}
