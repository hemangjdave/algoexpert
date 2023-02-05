package com.techrevolution.algorithms.veryhard.sortmapbykey;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.Map.Entry.comparingByKey;

/**
 * Created By Hemang Dave
 * Date: 15/09/22
 * Time: 2:56 pm
 */
@Slf4j
public class Program {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put(null, 31);
        log.info(String.valueOf(ageMap.get(null)));
        new Program().run();
        String name = "God";
        name = name.concat("Gifted");
        log.info(name);
    }

    private Student getStudent(Long id, String name, String surName, String age) {
        return Student.builder().id(id).name(name).surName(surName).age(age).build();
    }

    private Result getResult(String math, String science, String english) {
        return Result.builder().math(math).science(science).english(english).build();
    }

    public void run() throws RuntimeException {
        Map<Student, Result> studentResultMap = new HashMap<>();
        studentResultMap.put(
                getStudent(1L, "Hemang", "Dave", "31"),
                getResult("99", "87", "91")
        );
        studentResultMap.put(
                getStudent(2L, "Krutarth", "Dave", "27"),
                getResult("98", "82", "90")
        );
        studentResultMap.put(
                getStudent(3L, "Shiva", "Dave", "25"),
                getResult("99", "87", "91")
        );
        studentResultMap.put(
                getStudent(4L, "Nishit", "Kasani", "35"),
                getResult("90", "99", "99")
        );
        log.info(studentResultMap.toString());
        Comparator<Student> studentComparator = comparing(Student::getAge).reversed();
        studentResultMap.entrySet().stream().sorted(comparingByKey(studentComparator))
                .forEach((studentResultEntry -> log.info(studentResultEntry.getKey() + " :--" + studentResultEntry.getValue())));
    }

}
