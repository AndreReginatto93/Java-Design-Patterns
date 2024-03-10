package singleton.problem;

import java.util.HashMap;

public class Schedule {
    private HashMap<String, Boolean> availableDays = new HashMap<String, Boolean>();

    public Schedule(){
        availableDays.put("Sunday", true);
        availableDays.put("Monday", true);
        availableDays.put("Tuesday", true);
        availableDays.put("Wednesday", true);
        availableDays.put("Thursday", true);
        availableDays.put("Friday", true);
        availableDays.put("Saturday", true);
    }

    public HashMap<String, Boolean> getAvailableDays(){
        return availableDays;
    }

    public void fillSchedule(String day){
        availableDays.replace(day, false);
    }
}