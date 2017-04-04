package netsol.arithmeticlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import netsol.numericlib.Calculate;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = (TextView)findViewById(R.id.tv_text);
        calculateAndPrint();
    }


    private void calculateAndPrint() {
        ArrayList<Integer> numbers = getInteger();
        double mean = Calculate.arithmeticMean(numbers).doubleValue();
        String res = String.format("Numbers:\n\n%s",
                mean);
        tvResult.setText("Result : "+res);
    }

    private ArrayList<Integer> getInteger() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            numbers.add(r.nextInt(7) + 1);
        }
        return numbers;
    }
}
