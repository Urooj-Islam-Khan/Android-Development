package com.mobileapp.instagram;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Hide the ActionBar in your MainActivity.java
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        bottomNavigationView = findViewById(R.id.bnv);
        frameLayout = findViewById(R.id.framelayout);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                // Load the fragment based on the selected item
                if (itemId == R.id.navhome) {
                    LoadFragment(new HomeFragment(), 1);
                } else if (itemId == R.id.navsearch) {
                    LoadFragment(new SearchFragment(), 1);
                } else if (itemId == R.id.navaddpost) {
                    LoadFragment(new AddPostFragment(), 1);
                } else if (itemId == R.id.navreels) {
                    LoadFragment(new ReelsFragment(), 1);
                } else if (itemId == R.id.navprofile) {
                    LoadFragment(new ProfileFragment(), 1);
                }

                return true;
            }
        });



        // Load default fragment (Home)
        LoadFragment(new HomeFragment(), 1);
    }

    private void LoadFragment(Fragment fragment, int flag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (flag == 0) {
            fragmentTransaction.add(R.id.framelayout, fragment);
        } else {
            fragmentTransaction.replace(R.id.framelayout, fragment);
        }

        fragmentTransaction.commit();
    }
}
