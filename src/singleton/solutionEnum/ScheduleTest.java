package singleton.solutionEnum;

public class ScheduleTest {
    public static void main(String[] args) {
        // Solution Enum
        // The objective is now a singleton and will always have only one memory.
        // The correct thing is to be an enum so as not to have a reflection code and create several instances even though it is a singleton.

        fillDay("Monday");
        fillDay("Saturday");
    }

    public static void fillDay(String day){
        Schedule schedule = Schedule.getInstance();
        schedule.fillSchedule(day);
        System.out.println(schedule.getAvailableDays());
    }
}
