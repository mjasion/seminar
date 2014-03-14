package pl.mjasion.groovy.examples

import static pl.mjasion.groovy.examples.PersonFactory.createPerson

class Maps {
    static Map emptyMap = [:]
    static Map studentMap = [
            first: createPerson(),
            second: createPerson()
    ]
}
