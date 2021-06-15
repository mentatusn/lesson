package keyone.keytwo.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomCalendarView calendarView = findViewById(R.id.calendar);
        Log.d("mylogs", "onResume" +calendarView.getDate());
        Log.d("mylogs", "onResume" +calendarView.getMyDate());
    }

}