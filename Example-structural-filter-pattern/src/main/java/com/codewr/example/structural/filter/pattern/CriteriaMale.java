package com.codewr.example.structural.filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> getList(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
