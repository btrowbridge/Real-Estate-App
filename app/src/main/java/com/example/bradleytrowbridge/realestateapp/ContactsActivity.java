package com.example.bradleytrowbridge.realestateapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Bradley Trowbridge on 12/10/2015.
 */
public class ContactsActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);

        setUpButtonListeners();
        loadContacts();
        }
        public void setUpButtonListeners(){

                ImageButton btn = (ImageButton)findViewById(R.id.toAddContact);
                btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                toAddContact();
                        }
                });
                ImageButton backbtn = (ImageButton)findViewById(R.id.back);
                backbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                goBack();
                        }
                });
        }
        public void toAddContact(){

                Intent intent = new Intent(this, AddingContactActivity.class);
                startActivity(intent);
        }
        public void goBack(){

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
        public void loadContacts(){


                // The name of the file to open.
                String fileName = "Contacts.txt";

                LinearLayout list = (LinearLayout) findViewById(R.id.List);
                // This will reference one line at a time
                String contact = " ";
                String line = null;
                try {
                        // FileReader reads text files in the default encoding.
                        FileReader fileReader =
                                new FileReader(fileName);

                        // Always wrap FileReader in BufferedReader.
                        BufferedReader bufferedReader =
                                new BufferedReader(fileReader);
                        line = bufferedReader.readLine();
                        System.out.print(line);
                        while((line = bufferedReader.readLine()) != null)
                        {

                            System.out.println("While loop");
                            contact += line;

/*                               Button contactCard = new Button(this);
                                contactCard.setText(line);
                                contactCard.setBackgroundColor(Color.parseColor("#0096fb"));
                                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                                layout.gravity = Gravity.CENTER;
                                layout.weight = 0.07f;
                                contactCard.setLayoutParams(layout);
                                list.addView(contactCard);*/
                        }


                        // Always close files.
                        bufferedReader.close();
                }
                catch(FileNotFoundException ex) {
                        System.out.println(
                                "Unable to open file '" +
                                        fileName + "'");
                }
                catch(IOException ex) {
                        System.out.println(
                                "Error reading file '"
                                        + fileName + "'");
                        // Or we could just do this:
                        // ex.printStackTrace();
                }



                Button contactCard = new Button(this);
                contactCard.setText(contact);
                contactCard.setBackgroundColor(Color.parseColor("#0096fb"));
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
                layout.weight = 0.07f;
                contactCard.setLayoutParams(layout);


                list.addView(contactCard);
        }
}
