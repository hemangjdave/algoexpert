package com.techrevolution.algorithms.veryhard.sortmapbykey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

/**
 * Created By Hemang Dave
 * Date: 15/09/22
 * Time: 2:57 pm
 */
@NoArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surName;
    private String age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(surName, student.surName) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
