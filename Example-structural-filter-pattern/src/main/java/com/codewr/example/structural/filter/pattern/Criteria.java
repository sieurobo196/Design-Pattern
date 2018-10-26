package com.codewr.example.structural.filter.pattern;

import java.util.List;

/**
 *
 * @author codewr
 */
public interface Criteria {

    public List<Person> getList(List<Person> persons);
}
