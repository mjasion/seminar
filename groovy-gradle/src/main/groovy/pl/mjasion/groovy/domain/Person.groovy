package pl.mjasion.groovy.domain

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Person {
    String firstName
    String lastName
    Date birthDate
    City city
}
