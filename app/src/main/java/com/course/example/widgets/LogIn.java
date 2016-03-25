/*
 * Enter dinner bill and a 20% tip is calculated.
 * This example uses a listener implemented by the Activity class.
 * Another alternative is using an anonymous class.
 */
package com.course.example.widgets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class LogIn extends Activity implements OnClickListener {

    private EditText emailField;
    private EditText passwordField;
    private Button buttonSignUp;
    private TextView email;
    private TextView password;
    private static final String tag = "Widgets";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);

        emailField = (EditText) findViewById(R.id.enterEmail);
        passwordField = (EditText) findViewById(R.id.enterPassword);

        email = (TextView) findViewById(R.id.email);
        password = (TextView) findViewById(R.id.password);


        buttonSignUp = (Button) findViewById(R.id.signup);
        buttonSignUp.setOnClickListener(this);

    }

    // Perform action on click
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.signup:
                Log.i(tag, "CLicked Sign Up");
                Intent i1 = new Intent(this, SignUp.class);
                startActivity(i1);

                break;
        }

    }
}
