package com.codewr.example.structural.filter.pattern;

import java.util.List;

/**
 *
 * @author codewr
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> getList(List<Person> persons) {

        List<Person> firstCriteriaPersons = criteria.getList(persons);
        return otherCriteria.getList(firstCriteriaPersons);
    }
}
