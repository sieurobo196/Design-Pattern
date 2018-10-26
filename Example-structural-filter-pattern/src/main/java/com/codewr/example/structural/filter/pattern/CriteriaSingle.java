package com.codewr.example.structural.filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> getList(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
