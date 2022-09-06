package br.com.etecia.testefragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    MoreFragment moreFragment = new MoreFragment();
    ProfileFragment profileFragment = new ProfileFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.btnNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.ic_cachorro:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, homeFragment).commit();
                        return true;
                    case R.id.ic_gato:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, moreFragment).commit();
                        return true;
                    case R.id.ic_peixe:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, profileFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }
}