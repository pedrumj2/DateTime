package DateTime; /**
 * Created by Pedrum on 2/14/2017.
 */

import java.sql.Timestamp;
import java.util.Calendar;


public class DateTime {
    Calendar __calendar;
    public DateTime(Timestamp __timeStamp){
        __calendar = Calendar.getInstance();
        __calendar.setTime(__timeStamp);
    }

    public DateTime(DateTime __dateTime){
        __calendar = Calendar.getInstance();
        __calendar.set(__dateTime.year(), __dateTime.month(), __dateTime.day(),
                        __dateTime.hour(), __dateTime.minute(), __dateTime.seconds());
    }

    public Calendar get(){
        return __calendar;
    }
    public int year(){
        return __calendar.get(Calendar.YEAR);
    }
    public int month(){
        return __calendar.get(Calendar.MONTH);
    }
    public int day(){
        return __calendar.get(Calendar.DATE );
    }
    public int hour(){
        return __calendar.get(Calendar.HOUR_OF_DAY);
    }
    public int minute(){
        return __calendar.get(Calendar.MINUTE   );
    }
    public int seconds(){
        return __calendar.get(Calendar.SECOND);
    }
    //adds a certain number of seconds to the current date time
    public void add(int __value){
        __calendar.set(year(), month(), day(), hour(), minute(), seconds()+__value);
    }

    //determines if the current date time is bigger than the input date time.
    public boolean  isBigger( DateTime __dateTime){
        if (__dateTime.year()> year()){
            return false;
        }
        else if (__dateTime.month()>month()){
            return false;
        }
        else if(__dateTime.day() > day()){
            return false;
        }
        else if (__dateTime.hour() > hour()){
            return false;
        }
        else if(__dateTime.minute() > minute()){
            return false;
        }
        else if (__dateTime.seconds() > seconds()){
            return false;
        }
        return true;
    }

    public String toString(){
        String _output = "";
        _output += year() + "-";
        _output += month() + "-";
        _output += day() + " ";
        _output += hour() + ":";
        _output += minute() + ":";
        _output += seconds();
        return _output;
    }
}
