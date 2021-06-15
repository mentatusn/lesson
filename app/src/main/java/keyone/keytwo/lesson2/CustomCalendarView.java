package keyone.keytwo.lesson2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Date;

public class CustomCalendarView extends CalendarView {

    public String getMyDate(){
        Date test = new Date(getDate());
        return test.toString();
    }

    public CustomCalendarView(@NonNull Context context) {
        super(context);
    }

    public CustomCalendarView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomCalendarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomCalendarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
