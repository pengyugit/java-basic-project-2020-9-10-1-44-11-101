package com.thoughtworks.basic;

public class SchemaP extends Schema {
    private int value;

    public SchemaP(String order,Object value)throws Exception {
        super(order,value);
        try {
            this.value = Integer.parseInt((String) value);
        }catch (Exception e){
            throw new Exception("p的value类型为整数");
        }
    }


}
