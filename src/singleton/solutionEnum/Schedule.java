package singleton.solutionEnum;

import java.util.HashMap;

public enum Schedule {

    INSTANCE;
    private HashMap<String, Boolean> availableDays = new HashMap<String, Boolean>();

    private Schedule(){
        availableDays.put("Sunday", true);
        availableDays.put("Monday", true);
        availableDays.put("Tuesday", true);
        availableDays.put("Wednesday", true);
        availableDays.put("Thursday", true);
        availableDays.put("Friday", true);
        availableDays.put("Saturday", true);
    }

    public static Schedule getInstance(){
        return INSTANCE;
    }

    public HashMap<String, Boolean> getAvailableDays(){
        return availableDays;
    }

    public void fillSchedule(String day){
        availableDays.replace(day, false);
    }
}
