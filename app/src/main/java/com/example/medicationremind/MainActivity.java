package com.example.medicationremind;

import android.os.Bundle;
import android.view.Window;

import com.robotemi.sdk.Robot;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import org.litepal.tablemanager.Connector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        this.getSupportActionBar().hide();
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_remind, R.id.navigation_remindlist, R.id.navigation_medicine)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        将App bar与NavController绑定：
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

//        在使用 Robot 开发包的时候，就这样用 Robot.Companion.getInstance().xxx函
        Robot.Companion.getInstance().showTopBar();
//        Robot.Companion.
        NavigationUI.setupWithNavController(navView, navController);
        Connector.getDatabase();
        Medicine medicine = new Medicine();
        medicine.setName("阿莫西林");
        medicine.setRemarks("无");
        medicine.save();
    }

}
