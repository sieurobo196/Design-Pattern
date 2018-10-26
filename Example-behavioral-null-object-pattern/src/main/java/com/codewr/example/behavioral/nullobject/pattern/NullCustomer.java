package com.codewr.example.behavioral.nullobject.pattern;

/**
 *
 * @author codewr
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
