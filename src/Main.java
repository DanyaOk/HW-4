public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

int degrees = 7;
        if (degrees <= 5) {
            System.out.println("На улице "+degrees+" градусов, нужно надеть шапку");
        }
else {
            System.out.println("На улице "+degrees+" градусов, можно идти без шапки");
        }

int speed = 61;
if (speed > 60) {
    System.out.println("Если скорость "+speed+", то придется заплатить штраф");
} else {
    System.out.println("Если скорость "+speed+", то можно ездить спокойно");
}

int agePerson = 27;
if (agePerson > 2 && agePerson < 6) {
    System.out.println("Если возраст человека равен "+agePerson+",то ему нужно ходить в детский сад");
}
else if (agePerson > 7 && agePerson < 17) {
    System.out.println("Если возраст человека равен "+agePerson+",то ему нужно ходить в школу");
}
else if (agePerson >= 18 && agePerson <= 24) {
    System.out.println("Если возраст человека равен "+agePerson+",то ему нужно ходить в университет");
}
else  {
    System.out.println("Если возраст человека равен "+agePerson+",то ему нажно ходить на работу");
}

int ageChildren = 17;
if (ageChildren < 5) {
    System.out.println("Если возраст ребенка равен "+ageChildren+", то ему нельзя кататься на аттракционе");
} else if (ageChildren >= 5 && ageChildren < 14) {
    System.out.println("Если возраст ребенка равен "+ageChildren+", то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
 }else  {
            System.out.println("Если возраст ребенка равен "+ageChildren+", то он может кататься без сопровождения взрослого");
        }

int passengers = 80;
int allPlaces=102;
int seat=60;
int stand=allPlaces-seat;
        int standFree=allPlaces-seat-(allPlaces-passengers)-stand;
        int seatFree=seat-passengers;
        int freePlaces=allPlaces-passengers;

if (passengers > 60 && passengers <= 102) {
    System.out.println(standFree+" стоячих мест осталось");
} else if (passengers <= 60) {
    System.out.println(seatFree+" сидячих мест осталось, "+stand+" стоячих мест осталось");}
else {
    System.out.println("Свободных мест нет");
}

int one=66;
        int two=42;
        int three=12;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else  {
            System.out.println(three);
        }
}
    }
