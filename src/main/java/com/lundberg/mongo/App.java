package com.lundberg.mongo;

import com.lundberg.mongo.config.MongoConfig;
import com.lundberg.mongo.domain.Person;
import com.lundberg.mongo.repository.PersonRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {

    public static void main(String... args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);

        PersonRepository repo = ctx.getBean(PersonRepository.class);

        for (Person person : repo.findAll()) {
            System.out.println(person.getId() + ":" + person.getFirstName());
        }
    }

}
