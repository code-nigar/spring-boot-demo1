package com.example1.demo1.model;

import org.springframework.lang.NonNull;

public class Employee {
    //@NotNull(message = "Name is required")
    //@Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    @NonNull
    private String id;
    private String name;
    private String department;
    private int age;

    public Employee(String id, String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}

