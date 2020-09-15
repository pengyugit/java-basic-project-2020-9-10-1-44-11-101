package com.thoughtworks.basic;

public class SchemaL extends Schema {
    private boolean value;

    public SchemaL(String order,Object value) throws Exception {
        super(order,value);
        try {
            this.value = Boolean.getBoolean((String) value);
        }catch (Exception e){
            throw new Exception("l的value类型为boolean");
        }

    }

}
