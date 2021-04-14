package com.example.medicationremind.ui.remindlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.medicationremind.R;

public class RemindlistFragment extends Fragment {

    private RemindlistViewModel remindlistViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        remindlistViewModel =
                ViewModelProviders.of(this).get(RemindlistViewModel.class);
        View root = inflater.inflate(R.layout.fragment_remindlist, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        remindlistViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
