package ua.mk.berkut.hellospring.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    public String calc(int mark) {
        return switch (mark) {
            case 1, 2, 3 -> "Начальный";
            case 4, 5, 6 -> "Удовлетворительный";
            case 7, 8, 9 -> "Достаточный";
            case 10, 11, 12 -> "Высокий";
            default -> "Error";
        };
    }
}
