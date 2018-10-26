package com.codewr.example.structural.filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Rose", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Tom", "Male", "Single"));
        persons.add(new Person("Tom", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.getList(persons));

        System.out.println("\nFemales: ");
        printPersons(female.getList(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.getList(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.getList(persons));
    }

    public static void printPersons(List<Person> persons) {

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
