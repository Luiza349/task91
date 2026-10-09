package ru.netology.hw.principles;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444№444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthdate = new FormDate();
        post.birthdate.day = 13;
        post.birthdate.month = 6;
        post.birthdate.year = 1999;

        System.out.println();
        System.out.println("Имя: " + post.name);
        System.out.println();
        System.out.println("Дата: " + post.birthdate.day);
        System.out.println("Месяц: " + post.birthdate.month);
        System.out.println("Год: " + post.birthdate.year);


    }
}