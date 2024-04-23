import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задача номер 1");
        // Задача 1
        int age = 15;
        System.out.println("Если возраст человека равен " + age);
        if (age > 18) {
            System.out.println("Он совершеннолетний");
        }else{
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Задача номер 2");
        // Задача 2
        int temperature = 6;
        System.out.println("на улице " + temperature + " градусов");
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }else{
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Задача номер 3");
        // Задача 3
        int speed = 55;
        System.out.println("Если скорость " + speed + ", то");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        }else{
            System.out.println("можно ездить спокойно");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Задача номер 4");
        // Задача 4
        int yearsOld = 24;
        if (yearsOld > 2 && yearsOld < 7) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад.");
        } else if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");
        } else if (yearsOld >= 18 && yearsOld < 25) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то его место в университете.");
        }else{
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора ходить на работу.");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Задача номер 5");
        // Задача 5
        int yearsChild = 14;
        System.out.println("Если возраст ребенка равен " + yearsChild + ", то ему");
        if (yearsChild < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (yearsChild >= 5 && yearsChild < 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        }else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Задача номер 6");
        // Задача 6
        int place = 24;
        System.out.println("Вы взяли билет с номером " + place + ", то для вас");
        if (place > 0 && place <= 60) {
            System.out.println("В вагоне имеется сидячее место");
        } else if (place > 60 && place <= 102) {
            System.out.println("В вагоне имеется стоячие места");
        }else {
            System.out.println("В вагоне нет мест");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Задача номер 7");
        // Задача 7
        int one = 6969;
        int two = 1337;
        int three = 5051;
        if (one > two && one > three){
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        }else {
            System.out.println(three);
        }
    }
}