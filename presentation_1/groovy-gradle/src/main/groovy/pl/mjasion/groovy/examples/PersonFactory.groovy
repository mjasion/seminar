package pl.mjasion.groovy.examples

import groovy.transform.EqualsAndHashCode
import pl.mjasion.groovy.domain.City
import pl.mjasion.groovy.domain.Person

@EqualsAndHashCode
class PersonFactory {
    static Person createPerson(Map params = [:]) {
        new Person([
                firstName: 'Marcin',
                lastName: 'Jasion',
                city: new City([name: 'Legionowo', postalCode: '05-120']),
        ] + params)
    }

    public static void main(String[] args) {
        Person mj = createPerson()
        println "${mj.firstName} ${mj.lastName} lives in ${mj.city.name}"

        Person jk = createPerson([
                firstName: 'Jan',
                lastName: 'Kowalski',
        ])
        println "${jk.firstName} ${jk.lastName} lives in ${jk.city.name}"
    }
}

