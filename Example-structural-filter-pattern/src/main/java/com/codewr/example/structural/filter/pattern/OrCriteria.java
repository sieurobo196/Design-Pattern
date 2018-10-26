package com.codewr.example.structural.filter.pattern;

import java.util.List;

/**
 *
 * @author codewr
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> getList(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.getList(persons);
        List<Person> otherCriteriaItems = otherCriteria.getList(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
