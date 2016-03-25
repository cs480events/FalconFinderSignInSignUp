/*
 * Use a WebView widget to display a web page.
 * Enter URL, click button or press Enter key.
 * 
 * If you click a link in WebView page, the link is opened in the default 
 * browser. Similarly, if WebView gets a redirect (HTTP/1.1 301) from the web server 
 * the default browser is used to open the web page. To prevent this
 * behavior and open the new web page in WebView, you need to intercept
 * URL loading and open in WebView.
 * 
 * This example uses the back key to navigate back to the previous web page.
 */
package com.course.example.widgets;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.course.example.widgets.R;

public class SignUp extends Activity {

    private EditText emailField;
    private EditText passwordField;
    private EditText enterFirstName;
    private EditText enterLastName;
    private Button buttonSignUp;
    private TextView firstName;
    private TextView lastName;
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

    }

}
