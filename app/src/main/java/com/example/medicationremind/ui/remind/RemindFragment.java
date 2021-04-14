package com.example.medicationremind.ui.remind;

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

public class RemindFragment extends Fragment {

    private RemindViewModel remindViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        remindViewModel =
                ViewModelProviders.of(this).get(RemindViewModel.class);
        View root = inflater.inflate(R.layout.fragment_remind, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        remindViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
