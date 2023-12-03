package ru.seepa.basic.homeworks.homework4;

public class hw4 {
    public static void main(String[] args) {

        User[] arrUser = new User[10];
        arrUser[0] = new User("Ivan", "Azovski", "Sregeevith", 1996, "ivanAS@gmail.com");
        arrUser[1] = new User("Sergey", "Abramovith", "Alecsandrov", 1973, "sergeyAA@gmail.com");
        arrUser[2] = new User("Aleksandr", "Zazovski", "Vitalievitch", 1964, "AleckAV@gmail.com");
        arrUser[3] = new User("Olga", "Nicolaevna", "Leonovna", 1985, "olgaNL@gmail.com");
        arrUser[4] = new User("Oleg", "Ditakov", "Nazarovith", 1977, "OlegDN@gmail.com");
        arrUser[5] = new User("Artur", "Spirin", "Olegovith", 1989, "ArturSO@gmail.com");
        arrUser[6] = new User("Nicolai", "Pilepenco", "Konstantinovith", 1975, "NikolaiPK@gmail.com");
        arrUser[7] = new User("Kiril", "Fofanov", "Sergeevith", 1985, "KirillFS@gmail.com");
        arrUser[8] = new User("Dmitrii", "Gorkovenko", "Kirilovith", 1992, "DmitriiGK@gmail.com");
        arrUser[9] = new User("Daniil", "Barabanov", "Dmitrievith", 2001, "DAniilBD@gmail.com");

        for (int i = 0; i < arrUser.length; i ++){
            if (2023 - arrUser[i].getYearOfBirth() >= 40){
                arrUser[i].info();
            }
        }

    }
}
