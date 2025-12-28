package main.java. com.humeyra.calorietracker.ai;

public class BmrCalculator {

    public static double calculate(UserProfile profile) {

        if (profile.isMale()) {
            return 88.36
                    + (13.4 * profile.getWeight())
                    + (4.8 * profile.getHeight())
                    - (5.7 * profile.getAge());
        } else {
            return 447.6
                    + (9.2 * profile.getWeight())
                    + (3.1 * profile.getHeight())
                    - (4.3 * profile.getAge());
        }
    }
}
