package com.example.sarah.labb1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;
import java.net.URI;

import static android.graphics.BitmapFactory.decodeFile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout 1
        //Create linear layout
        LinearLayout myLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);

        //Create two separate parameters for all the views
        LinearLayout.LayoutParams paramsW = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams paramsM = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        //Create button
        Button myButton = new Button(this);
        myButton.setText("KNAPP");
        myLayout.addView(myButton);

        //Add edit text
        EditText text = new EditText(this);
        text.setText("Text fält");
        myLayout.addView(text);

        //Create rating stars
        RatingBar rating = new RatingBar(this);
        rating.setNumStars(5);
        paramsW.gravity= Gravity.CENTER;
        //Add specified parameter
        rating.setLayoutParams(paramsW);
        myLayout.addView(rating);

        //Add second edit text.
        EditText text2 = new EditText(this);
        text2.setText("Text fält");
        //Makes it possible to write multiple lines.
        text2.setSingleLine(false);
        myLayout.addView(text2);

        //Layout 2
        LinearLayout myLayout2 = new LinearLayout(this);
        myLayout2.setOrientation(LinearLayout.VERTICAL);

        //Name
        LinearLayout myLayout2a = new LinearLayout(this);
        myLayout2a.setOrientation(LinearLayout.HORIZONTAL);
        TextView name = new TextView(this);
        name.setText("Namn");
        EditText editName = new EditText(this);
        editName.setSingleLine(true);
        name.setLayoutParams(paramsW);
        editName.setLayoutParams(paramsM);
        myLayout2a.addView(name);
        myLayout2a.addView(editName);
        myLayout2.addView(myLayout2a);

        //Password
        LinearLayout myLayout2b = new LinearLayout(this);
        myLayout2b.setOrientation(LinearLayout.HORIZONTAL);
        TextView password = new TextView(this);
        password.setText("Lösenord");
        EditText editPassword = new EditText(this);
        //Hides password, both numbers and letters
        editPassword.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        editPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        editPassword.setLayoutParams(paramsM);
        password.setLayoutParams(paramsW);
        myLayout2b.addView(password);
        myLayout2b.addView(editPassword);
        myLayout2.addView(myLayout2b);

        //Email
        LinearLayout myLayout2c = new LinearLayout(this);
        myLayout2c.setOrientation(LinearLayout.HORIZONTAL);
        TextView email = new TextView(this);
        email.setText("Epost");
        EditText editEmail = new EditText(this);
        editEmail.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        email.setLayoutParams(paramsW);
        editEmail.setLayoutParams(paramsM);
        myLayout2c.addView(email);
        myLayout2c.addView(editEmail);
        myLayout2.addView(myLayout2c);

        //Age
        LinearLayout myLayout2d = new LinearLayout(this);
        myLayout2d.setOrientation(LinearLayout.HORIZONTAL);
        TextView age = new TextView(this);
        age.setText("Ålder");
        SeekBar editAge = new SeekBar(this);
        age.setLayoutParams(paramsW);
        editAge.setLayoutParams(paramsM);
        myLayout2d.addView(age);
        myLayout2d.addView(editAge);
        myLayout2.addView(myLayout2d);

        //Layout 3
        LinearLayout myLayout3 = new LinearLayout(this);
        myLayout3.setOrientation(LinearLayout.VERTICAL);

        //Text 1
        TextView text1 = new TextView(this);
        text1.setText("Hur trivs du på LIU?");
        text1.setGravity(Gravity.CENTER);
        myLayout3.addView(text1);

        //Checkbox
        LinearLayout myLayout3a = new LinearLayout(this);
        myLayout3a.setOrientation(LinearLayout.HORIZONTAL);
        CheckBox alt1 = new CheckBox(this);
        alt1.setText("Bra");
        CheckBox alt2 = new CheckBox(this);
        alt2.setText("Mycket bra");
        CheckBox alt3 = new CheckBox(this);
        alt3.setText("Jättebra");
        myLayout3a.addView(alt1);
        myLayout3a.addView(alt2);
        myLayout3a.addView(alt3);
        myLayout3.addView(myLayout3a);

        //Text 3
        TextView text3 = new TextView(this);
        text3.setText("Läser du på LITH?");
        text3.setGravity(Gravity.CENTER);
        myLayout3.addView(text3);

        //Checkbox
        LinearLayout myLayout3b = new LinearLayout(this);
        myLayout3b.setOrientation(LinearLayout.HORIZONTAL);
        CheckBox yes = new CheckBox(this);
        yes.setText("Ja");
        CheckBox no = new CheckBox(this);
        no.setText("Nej");
        myLayout3b.addView(yes);
        myLayout3b.addView(no);
        myLayout3.addView(myLayout3b);

        //Image from drawable in /res
        LinearLayout myLayout3e = new LinearLayout(this);
        myLayout3e.setOrientation(LinearLayout.HORIZONTAL);
        ImageView liu = new ImageView(this);
        liu.setImageDrawable(getDrawable(R.drawable.logo));
        liu.setLayoutParams(paramsW);
        paramsW.gravity= Gravity.CENTER;
        myLayout3.addView(liu);

        //Text4
        TextView text4 = new TextView(this);
        text4.setText("Är detta LIUs logotyp?");
        text4.setGravity(Gravity.CENTER);
        myLayout3.addView(text4);

        //Checkbox
        LinearLayout myLayout3c = new LinearLayout(this);
        myLayout3c.setOrientation(LinearLayout.HORIZONTAL);
        CheckBox yes2 = new CheckBox(this);
        yes2.setText("Ja");
        CheckBox no2 = new CheckBox(this);
        no2.setText("Nej");
        myLayout3c.addView(yes2);
        myLayout3c.addView(no2);
        myLayout3.addView(myLayout3c);
        Button myButton2 = new Button(this);
        myButton2.setText("Skicka in");
        myLayout3.addView(myButton2);

        //myLayout, myLayout2, myLayout3
        setContentView(myLayout3);
    }

}
