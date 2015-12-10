package com.example.android.barbosa;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    static String grp = "IT 1" ;
    static String hostel = "Tilak" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onMess(View view) {
        setContentView(R.layout.mess_selector);
    }

    public void onTimeTable(View view) {
        setContentView(R.layout.grp_selector);
    }

    public void onMain(View view) {
        setContentView(R.layout.activity_main);
    }



    public void test(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Not Available";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void Tagore(View view) {
        hostel = "Tagore";
        setContentView(R.layout.mess);
    }

    public void Tilak(View view) {
        hostel = "Tilak";
        setContentView(R.layout.mess);
    }

    public void Patel(View view) {
        hostel = "Patel";
        setContentView(R.layout.mess);
    }

    public void SVBH(View view) {
        hostel = "SVBH";
        setContentView(R.layout.mess);
    }

    public void Raman(View view) {
        hostel = "Tagore";
        setContentView(R.layout.mess);
    }

    public void KNGH(View view) {
        hostel = "Raman";
        setContentView(R.layout.mess);
    }

    public void Malviya(View view) {
        hostel = "Malviya";
        setContentView(R.layout.mess);
    }

    public void Tandon(View view) {
        hostel = "Tandon";
        setContentView(R.layout.mess);
    }

    public void IT_1(View view) {
        grp = "IT 1";
        setContentView(R.layout.time_table);
    }

    public void IT_2(View view) {
        grp = "IT 2";
        setContentView(R.layout.time_table);
    }

    public void CS_1(View view) {
        grp = "CS 1";
        setContentView(R.layout.time_table);
    }

    public void CS_2(View view) {
        grp = "IT 1";
        setContentView(R.layout.time_table);
    }

    public void CS_3(View view) {
        grp = "CS 3";
        setContentView(R.layout.time_table);
    }

    public void CS_4(View view) {
        grp = "CS 4";
        setContentView(R.layout.time_table);
    }

    public void EC_1(View view) {
        grp = "EC 1";
        setContentView(R.layout.time_table);
    }

    public void EC_2(View view) {
        grp = "EC 2";
        setContentView(R.layout.time_table);
    }

    public void EC_3(View view) {
        grp = "EC 3";
        setContentView(R.layout.time_table);
    }

    public void EC_4(View view) {
        grp = "EC 4";
        setContentView(R.layout.time_table);
    }

    public void ME_1(View view) {
        grp = "ME 1";
        setContentView(R.layout.time_table);
    }

    public void ME_2(View view) {
        grp = "ME 2";
        setContentView(R.layout.time_table);
    }

    public void ME_3(View view) {
        grp = "ME 3";
        setContentView(R.layout.time_table);
    }

    public void ME_4(View view) {
        grp = "ME 4";
        setContentView(R.layout.time_table);
    }

    public void PIE_1(View view) {
        grp = "PIE 1";
        setContentView(R.layout.time_table);
    }

    public void PIE_2(View view) {
        grp = "PIE 2";
        setContentView(R.layout.time_table);
    }

    public void CE_1(View view) {
        grp = "CE 1";
        setContentView(R.layout.time_table);
    }

    public void CE_2(View view) {
        grp = "CE 2";
        setContentView(R.layout.time_table);
    }

    public void BioTech_1(View view) {
        grp = "Bio-Tech 1";
        setContentView(R.layout.time_table);
    }

    public void BioTech_2(View view) {
        grp = "Bio-Tech 2";
        setContentView(R.layout.time_table);
    }

    public void EE_1(View view) {
        grp = "EE 1";
        setContentView(R.layout.time_table);
    }

    public void EE_2(View view) {
        grp = "EE 2";
        setContentView(R.layout.time_table);
    }

    public void Mmon(View view) {
        if (hostel == "Tagore") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - Aloo Paratha, Cold Coffee, Pickle, Chutney\n" +
                    "Lunch - Rajma, Fried Rice, Brinjal, Roti\n" +
                    "Dinner - Rice, Ladyfinger, Roti, Arhar Dal";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tilak") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tandon") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Patel") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "SVBH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "KNGH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Raman") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Mtue(View view) {
        if (hostel == "Tagore") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - Poha, Tea\n" +
                    "Lunch - Aloo, Peas, Currey, Rice, Roti\n" +
                    "Dinner - Rice, Roti, Gourd, Sambhar, Custard";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tilak") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tandon") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Patel") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "SVBH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "KNGH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Raman") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Mwed(View view) {
        if (hostel == "Tagore") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - Sandwich, Tea, Milk\n" +
                    "Lunch - Soyabean, Masoor Dal, Rice, Roti\n" +
                    "Dinner - Paneer-peas, Jeera Rice, Puri, Papad, Fruit Salad";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tilak") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tandon") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Patel") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "SVBH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "KNGH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Raman") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Mthus(View view) {
        if (hostel == "Tagore") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - Chole-Samosa, Tea, Milk\n" +
                    "Lunch - Rice, Roti, Aloo-Spinach, Dal\n" +
                    "Dinner - Arhar Dal, Rice, Roti, Sewai";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tilak") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tandon") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Patel") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "SVBH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "KNGH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Raman") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Mfri(View view) {
        if (hostel == "Tagore") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - Burger\n" +
                    "Lunch - Chola, Rice ,Roti, Curd\n" +
                    "Dinner - Fried Rice, Chola, Aloo-matar, Cachori";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tilak") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tandon") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Patel") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "SVBH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "KNGH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Raman") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Msat(View view) {
        if (hostel == "Tagore") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - Sambhar Vada, Tea\n" +
                    "Lunch - Paneer, Fried Rice, Paratha, Papad\n" +
                    "Dinner - Fried Rice, Chutney, Raita";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tilak") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tandon") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Patel") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "SVBH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "KNGH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Raman") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Msun(View view) {
        if (hostel == "Tagore") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - Puri, Aloo Sabji, Tea, Milk\n" +
                    "Lunch - Aloo, Rice, Roti\n" +
                    "Dinner - Chana Dal, Rice, Roti";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tilak") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Tandon") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Patel") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "SVBH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "KNGH") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (hostel == "Raman") {
            Context context = getApplicationContext();
            CharSequence text = "Breakfast - \n" +
                    "Lunch - \n" +
                    "Dinner - ";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Tmon(View view) {
        if (grp == "IT 2") {
            Context context = getApplicationContext();
            CharSequence text = "9-10: MS1301\n" +
                    "10-11: CS1304\n" +
                    "11-1: CS1305\n" +
                    "3-4: EC1303\n" +
                    "4-6: CS1301";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "IT 1") {
            Context context = getApplicationContext();
            CharSequence text = "9-10: MS1301\n" +
                    "10-11: CS1304\n" +
                    "11-1: CS1305\n" +
                    "3-4: EC1303\n" +
                    "4-6: CS1301";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Ttue(View view) {
        if (grp == "IT 2") {
            Context context = getApplicationContext();
            CharSequence text = "12-1: CS1305\n" +
                    "2-4: CS1304\n" +
                    "4-5: EC1303";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "IT 1") {
            Context context = getApplicationContext();
            CharSequence text = "9-12: CS1351" +
                    "12-1: CS1305\n" +
                    "2-4: CS1304\n" +
                    "4-5: EC1303";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Twed(View view) {
        if (grp == "IT 2") {
            Context context = getApplicationContext();
            CharSequence text = "9-10: MS1301\n" +
                    "10-1: CS1351\n" +
                    "3-5: CS1301\n";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "IT 1") {
            Context context = getApplicationContext();
            CharSequence text = "9-10: MS1301\n" +
                    "3-5: CS1301\n";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Tthus(View view) {
        if (grp == "IT 2") {
            Context context = getApplicationContext();
            CharSequence text = "10-11: EC1303\n" +
                    "2-5: EC1353\n" +
                    "5-6: CS1304\n";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "IT 1") {
            Context context = getApplicationContext();
            CharSequence text = "10-11: EC1303\n" +
                    "2-5: CS1352\n" +
                    "5-6: CS1304\n";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Tfri(View view) {
        if (grp == "IT 2") {
            Context context = getApplicationContext();
            CharSequence text = "10-1: CS1352\n" +
                    "3-4: MS1301\n" +
                    "4-5: EC1303";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "IT 1") {
            Context context = getApplicationContext();
            CharSequence text = "10-1: EC1353\n" +
                    "3-4: MS1301\n" +
                    "4-5: EC1303";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CS 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EC 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "PIE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "EE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "Bio-tech 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "CE 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 1") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 2") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 3") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        if (grp == "ME 4") {
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    public void Tsat(View view) {
        Context context = getApplicationContext();
        CharSequence text = "NO Class";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void Tsun(View view) {
        Context context = getApplicationContext();
        CharSequence text = "NO Class";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

}