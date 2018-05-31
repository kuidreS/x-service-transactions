package vitalii.serdiuk.test.statistics;

import vitalii.serdiuk.test.model.User;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class UserStatistics {

    public long getAdultUserAmount(List<User> userList) {
//        long counter = userList.stream().filter(user -> {
//            Date currentDate = new Date(new java.util.Date().getTime());
//            Calendar a = getCalendar(currentDate);
//            Calendar b = getCalendar(user.getBirthday());
//            int diff = a.get(Calendar.YEAR) - b.get(Calendar.YEAR);
//            return diff >= 21;
//        }).count();
        long counter = 0l;
        for (User user : userList) {
            Date currentDate = new Date(new java.util.Date().getTime());
            Calendar a = getCalendar(currentDate);
            Calendar b = getCalendar(user.getBirthday());
            int diff = a.get(Calendar.YEAR) - b.get(Calendar.YEAR);
            if (diff >= 21) {
                counter++;
            }
        }
        return counter;
    }

    private Calendar getCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(Locale.GERMANY);
        calendar.setTime(date);
        return calendar;
    }

}
