package com.mobileapp.task11_whatsappusingfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    FrameLayout framelayout;
    Button chats, status, calls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        chats = findViewById(R.id.chats);
        status = findViewById(R.id.status);
        calls = findViewById(R.id.calls);

//phele se ek fragment jo visible hoga wo ye hai
        FragmentChange(new HomeFragment(), 0);
        chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ye button pr click krne pr aaega
                FragmentChange(new HomeFragment(),1);
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentChange(new StoryFragment(),1);
            }
        });
        calls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentChange(new CallsFragment(),1);
            }
        });
    }

//    method bhar islie bnaya hai k code ko bar bar use krskein hr button pr
    public void FragmentChange(Fragment fragment, int count){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(count == 0){
            ft.add(R.id.framelayout, fragment);
        } else{
            ft.replace(R.id.framelayout, fragment);
        }
        ft.commit();
    }

}