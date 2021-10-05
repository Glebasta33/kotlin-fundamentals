package jv;

public class Main {
    public static void main(String[] args) {
        String month = "Октябрь";
        String season;
        switch (month) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                season = "Зима";
                break;
            case "Март":
            case "Апрель":
            case "Май":
                season = "Весна";
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                season = "Лето";
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                season = "Осень";
                break;
            default:
                season = "Такого месяца нет";
        }
        System.out.println(season);
    }
}
