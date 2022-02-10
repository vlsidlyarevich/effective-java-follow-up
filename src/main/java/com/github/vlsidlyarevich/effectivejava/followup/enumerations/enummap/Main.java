package com.github.vlsidlyarevich.effectivejava.followup.enumerations.enummap;

import java.time.Month;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

/**
 * Main
 *
 * @author Vladislav Sidlyarevich <vlsidlyarevich@gmail.com>
 * Created on 2/10/22.
 */
public class Main {

    public static void main(String[] args) {

        Kitten barsikTheFrozen = new Kitten("Barsik", Month.DECEMBER);
        Kitten murzikTheChristmasBreaker = new Kitten("Murzik", Month.DECEMBER);
        Kitten leoTheSun = new Kitten("Leo", Month.AUGUST);

        List<Kitten> cats = List.of(barsikTheFrozen, murzikTheChristmasBreaker, leoTheSun);

        Map<Month, Set<Kitten>> kittensByMonth = new EnumMap<>(Month.class);

        cats.forEach(cat -> kittensByMonth.merge(cat.getBirthdayMonth(),
                new HashSet<>(List.of(cat)),
                (s1, s2) -> {
                    s1.addAll(s2);
                    return s1;
                }));
        System.out.println(kittensByMonth);

        // stream api way
        System.out.println(cats.stream().collect(groupingBy(Kitten::getBirthdayMonth)));

        // correct stream api way
        System.out.println(cats
                .stream()
                .collect(groupingBy(Kitten::getBirthdayMonth, () -> new EnumMap<>(Month.class), toSet())));
    }
}
