package com.sivaram.session7assignment2;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Declare Views to Reference
    Button btnViewContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find View from XML And Set Reference
        btnViewContacts = (Button)findViewById(R.id.btnViewContactsPage);

        // Set On Click Action Listener To Display Contacts Page
        btnViewContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create An Intent And Reference Action View With Contacts URI
                Intent contactListIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));

                // Show Contact Page Activity with Initialized intent
                startActivity(contactListIntent);
            }
        });

    }
}
