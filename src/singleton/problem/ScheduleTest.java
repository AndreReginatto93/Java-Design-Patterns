package singleton.problem;

public class ScheduleTest {
    public static void main(String[] args) {
        // Problem
        // Whenever you call fillDay it will create another instance, meaning that we never access the same object.

        fillDay("Monday");
        fillDay("Saturday");
    }

    public static void fillDay(String day){
        Schedule schedule = new Schedule();
        schedule.fillSchedule(day);
        System.out.println(schedule.getAvailableDays());
    }
}
