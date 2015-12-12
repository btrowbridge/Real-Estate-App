package com.example.bradleytrowbridge.realestateapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bradley Trowbridge on 12/11/2015.
 */

//Construct for a later test
//Adapter is serializeable and can be passed between activities
public class ContactListAdapter extends BaseAdapter implements Serializable {

    public ArrayList<Person> ContactList;

    public ContactListAdapter(ArrayList<Person> contactList) {
        ContactList = contactList;
    }

    @Override
    public int getCount() {
        return ContactList.size();
    }

    @Override
    public Object getItem(int position) {
        return ContactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Person entry = ContactList.get(position);

        return null;
    }
}
