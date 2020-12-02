package com.example.finalproject.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.finalproject.R;
import com.example.finalproject.RegisterActivity;
import com.example.finalproject.ui.login.LoginActivity;

public class MainContactFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainContactFragment newInstance() {
        return new MainContactFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
      View view=   inflater.inflate(R.layout.main_fragment, container, false);
      Button btnlogin = view.findViewById(R.id.btnlogin);
//      Button btnregister = view.findViewById(R.id.btnregister);

      btnlogin.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(getContext(), LoginActivity.class ));

          }
      });

      return  view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}