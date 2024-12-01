package com.mobileapp.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton toolbar;
    NavigationView navigation;
    FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        DBManager dbmanager = new DBManager(this);
//        dbmanager.addNotes("Study MAD", "Today, i'll goiing to study fragments and SQLite");

        drawerLayout = findViewById(R.id.main);
        toolbar = findViewById(R.id.btn);
        navigation = findViewById(R.id.navigation_view);
        fragmentContainerView = findViewById(R.id.fcv);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                drawerLayout.openDrawer(androidx.core.view.GravityCompat.START);
                drawerLayout.open();
            }
        });


        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                drawerLayout.close();

                FragmentManager frg =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = frg.beginTransaction();
                fragmentTransaction.add(R.id.fcv,Addnotes.class,null);
                fragmentTransaction.commit();
                if (id == R.id.home){
                    frg.beginTransaction().replace(R.id.fcv, home.class,null).addToBackStack("name").commit();
                }
                if (id == R.id.add){
                    frg.beginTransaction().replace(R.id.fcv,Addnotes.class,null).addToBackStack("name").commit();
                }
                if (id == R.id.del){
                    frg.beginTransaction().replace(R.id.fcv,DeleteNotes.class,null).addToBackStack("name").commit();
                }
                if (id == R.id.settings){
                    frg.beginTransaction().replace(R.id.fcv,Settings.class,null).addToBackStack("name").commit();
                }


                Toast.makeText(getApplicationContext(),id, Toast.LENGTH_SHORT);
                return false;
            }
        });
    }
}