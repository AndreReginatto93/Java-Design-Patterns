package singleton.solutionLazy;

public class ScheduleTest {
    public static void main(String[] args) {
        // Solution Lazy
        // The objective is now a singleton and will always have only one memory. Because it is lazy, it will only be in memory when called.

        fillDay("Monday");
        fillDay("Saturday");
    }

    public static void fillDay(String day){
        Schedule schedule = Schedule.getInstance();
        schedule.fillSchedule(day);
        System.out.println(schedule.getAvailableDays());
    }
}
