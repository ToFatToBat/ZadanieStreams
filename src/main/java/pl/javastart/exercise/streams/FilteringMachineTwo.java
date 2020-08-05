package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {

        List<String> notAdult = ppl.stream()
                .filter(this::isKid)
                .map(Person::getName)
                .collect(Collectors.toList());
        return notAdult;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> usersList = people.stream()
                .map(this::convertPersonToUser)
                .collect(Collectors.toList());
        return usersList;
    }

    private boolean isKid(Person person) {
        return person.getAge() < 18;
    }

    private User convertPersonToUser (Person person) {
        User user = new User(person.getName(), person.getAge(), null);
        return user;
    }
}
