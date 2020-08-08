package pl.javastart.exercise.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return  numberList.stream()
                .filter(this::isNotEven)
                .collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return numberList.stream()
                .sorted()
                .filter(this::isGreaterThen20)
                .collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        return titles.stream()
                .map(Book::new)
                .collect(Collectors.toList());
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return titles.stream()
                .map(Book::new)
//                .allMatch(book -> book.getTitle().contains("Gra"));
                .filter(book -> book.getTitle().contains("Gra"))
                .collect(Collectors.toList());
    }


    private boolean isNotEven(Integer number) {
        return (number % 2 == 0);
    }

    private boolean isGreaterThen20(Integer number) {
        return (number >= 20);
    }
}




