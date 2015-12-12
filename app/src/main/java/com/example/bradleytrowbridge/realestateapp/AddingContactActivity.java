package com.example.bradleytrowbridge.realestateapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Bradley Trowbridge on 12/10/2015.
 */
public class AddingContactActivity extends AppCompatActivity {

    ContactListAdapter myContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_new_contact);

        Bundle bundle = getIntent().getExtras();
        myContacts = (ContactListAdapter) bundle.get("Contacts");
        AddButtonListeners();
    }
    public void AddButtonListeners(){

        Button btn = (Button)findViewById(R.id.addContact);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddContact();
            }
        });
    }
    public void AddContact(){
        Person newContact = new Person();
        EditText textbox =(EditText) findViewById(R.id.FName);
        String FName = textbox.getText().toString();
        EditText textbox2 =(EditText) findViewById(R.id.LName);
        String LName = textbox2.getText().toString();
        newContact.setFname(FName);
        newContact.setLname(LName);

        myContacts.ContactList.add(newContact);




        //change activities
        //add Contacts to intent
        Intent intent = new Intent(this, ContactsActivity.class);
        intent.putExtra("Contacts",myContacts);
        startActivity(intent);

    }
}
