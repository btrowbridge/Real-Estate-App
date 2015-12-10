package com.example.bradleytrowbridge.realestateapp;


        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        addButtonClickEventListener();

    }

    public void addButtonClickEventListener(){

        Button btn = (Button)findViewById(R.id.ContactsButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toContacts();
            }
        });
    }
    /** Called when the user clicks the button */
    public void toContacts () {
        Intent intent = new Intent(this, ContactsActivity.class);
        startActivity(intent);
    }
}
