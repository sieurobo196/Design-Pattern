package com.codewr.example.structural.filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> getList(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
