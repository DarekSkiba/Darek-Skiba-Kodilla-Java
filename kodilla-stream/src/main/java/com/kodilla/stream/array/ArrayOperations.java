package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length).map(n -> numbers[n]).forEach(System.out::println);
        return IntStream.range(0, numbers.length).map(n -> numbers[n]).average().orElse(Double.NaN);
    }
}

//W katalogu src/main/java utwórz pakiet com.kodilla.stream.array,
// a w nim interfejs ArrayOperations z jedną metodą statyczną - getAverage(int[] numbers).
//Metoda getAverage(int[] numbers) powinna:
//- przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
// wyświetlić kolejne elementy tablicy, a następnie:
//- przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
// a także kolektora average() obliczyć średnią. Na końcu metoda powinna zwracać średnią jako wynik typu double.