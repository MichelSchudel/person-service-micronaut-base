package person.service.micronaut.base;

import java.util.ArrayList;
import java.util.List;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/")
public class PersonController {

    private List<Person> persons = new ArrayList<>();

    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello, Devoxx!";
    }

    @Get("/persons")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPersons() {
        return this.persons;
    }

    @Post("/persons")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createPerson(Person person) {
        this.persons.add(person);
    }

}