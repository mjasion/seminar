package pl.mjasion.groovy.examples

import pl.mjasion.groovy.domain.Person

import static pl.mjasion.groovy.examples.PersonFactory.createPerson

class Strings {
    Person person = createPerson()
    String normal = 'Normal String' // or "Normal String"
    String gString = "${person.firstName} ${person.lastName}  lives in ${person.city.name}"
    String xml = '''
            <book id="987" >
                <title>Groovy Recipes</title>
                <author>Scott Davis</author>
            </book>
        '''
}
