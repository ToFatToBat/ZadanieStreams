package pl.javastart.exercise.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> notEvenNumbers = numberList.stream()
                .filter(this::isNotEven)
                .collect(Collectors.toList());
        return notEvenNumbers;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> lowerNumbersThan20 = numberList.stream()
                .sorted()
                .filter(this::isLowerThen20)
                .collect(Collectors.toList());
        return lowerNumbersThan20;
    }

    public List<Book> convertToBooks(List<String> titles) {




        return null;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return null;
    }


    private boolean isNotEven(Integer number) {
        return (number % 2 != 0);
    }

    private boolean isLowerThen20 (Integer number) {
        return (number < 20);
    }
}




