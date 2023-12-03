package ru.seepa.basic.homeworks.homework4;

public class User {
    private String name;
    private String lastName;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public User (String name, String lastName, String patronymic, int yearOfBirth, String email){
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void info(){
        System.out.println("ФИО - " + lastName + " " + name + " " + patronymic);
        System.out.println("Год рождения - " + yearOfBirth);
        System.out.println("e-mail - " + email);
    }
}
