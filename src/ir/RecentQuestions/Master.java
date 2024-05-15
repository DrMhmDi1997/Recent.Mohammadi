package ir.RecentQuestions;

public class Master {

        public int id;

        public String name;

    public Master(int id, String name, String lastName, int hour, double payment) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.hour = hour;
        this.payment = payment;
    }

    public String lastName;

        public int hour;

        public double payment;


        public static double salary(int hour, double payment) {
            return hour * payment;
        }



}