package singleton.solutionEager;

public class ScheduleTest {
    public static void main(String[] args) {
        // Solution Eager
        // The objective is now a singleton and will always have only one memory. Because it is eager, it will always be in memory.

        fillDay("Monday");
        fillDay("Saturday");
    }

    public static void fillDay(String day){
        Schedule schedule = Schedule.getInstance();
        schedule.fillSchedule(day);
        System.out.println(schedule.getAvailableDays());
    }
}
