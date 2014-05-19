package pl.mjasion.groovy.examples

import pl.mjasion.groovy.domain.Person

import static pl.mjasion.groovy.examples.PersonFactory.createPerson

class Lists {
    static List emptyList = []
    static List<Person> personsList = [createPerson(), createPerson()]
    static Set personsSet = [createPerson(), createPerson()] as Set
    static List secondPersonsList = []
    static List joined = personsList + personsSet

    public static void main(String[] args) {
        addingElements()
        listMethods()
        multidimensionalLists()
    }

    static void addingElements() {
        secondPersonsList.add createPerson()
        secondPersonsList + createPerson()
        secondPersonsList << createPerson()
        def addToSecondPersonsList = secondPersonsList.&add
        addToSecondPersonsList createPerson()
    }

    static void listMethods() {
        personsList.each { println it.firstName }
        personsList.each { person -> println person.firstName }
        List<String> firstNameLists = personsList.collect { it.firstName }
        List<Person> unique = personsList.unique(false) { it.firstName }
    }

    static void multidimensionalLists() {
        List<String> langs = ['JS', ['C', 'C++',], ['Java', 'Groovy', 'Scala',],]
        List<String> flatten = langs.flatten()
    }
}
