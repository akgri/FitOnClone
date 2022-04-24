package com.example.fatih.fitonclone.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.fatih.fitonclone.Fragments.rv_adapters.AdapterExercisesRv;
import com.example.fatih.fitonclone.Fragments.rv_adapters.AdapterFilterRv;
import com.example.fatih.fitonclone.Fragments.rv_adapters.Week;
import com.example.fatih.fitonclone.R;
import com.example.fatih.fitonclone.WorkoutModel;
import com.example.fatih.fitonclone.databinding.FragmentWorkoutBinding;

import java.util.ArrayList;


public class WorkoutFragment extends Fragment {

    private FragmentWorkoutBinding binding;
    AdapterExercisesRv adapterExercisesRv;
    public WorkoutFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding= FragmentWorkoutBinding.inflate(inflater, container, false);
        binding.rvExercise.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<WorkoutModel>workoutModelArrayList=new ArrayList<>();
        WorkoutModel w1=new WorkoutModel(R.drawable.toned_arms_back,"Toned Arms & back",23,2,"Week 5");
        WorkoutModel w2=new WorkoutModel(R.drawable.bootybuilder,"Booty Builder",21,2,"Week 5");
        WorkoutModel w3=new WorkoutModel(R.drawable.balance,"Balance & Focus",23,2,"Week 5");
        WorkoutModel w4=new WorkoutModel(R.drawable.dance_cardio,"Dance Cardio",18,3,"Week 5");

        workoutModelArrayList.add(w1);
        workoutModelArrayList.add(w2);
        workoutModelArrayList.add(w3);
        workoutModelArrayList.add(w4);

        AdapterExercisesRv adapter=new AdapterExercisesRv(requireContext(),workoutModelArrayList);
        binding.rvExercise.setAdapter(adapter);

        binding.rvWeekSlicer.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        ArrayList<Week>weekArrayList=new ArrayList<>();
        Week v1=new Week("Week1");
        Week v2=new Week("Week2");
        Week v3=new Week("Week3");
        Week v4=new Week("Week4");
        Week v5=new Week("Week5");

        weekArrayList.add(v1);
        weekArrayList.add(v2);
        weekArrayList.add(v3);
        weekArrayList.add(v4);
        weekArrayList.add(v5);

        AdapterFilterRv adapterFilter=new AdapterFilterRv(requireContext(),weekArrayList);
        binding.rvWeekSlicer.setAdapter(adapterFilter);
        return(binding.getRoot());

    }
}




// binding.toolbarMain.setTitle("test");
// binding.toolbarMain.setTitleTextColor(getResources().getColor(R.color.white));
// ((AppCompatActivity)getActivity()).setSupportActionBar(binding.toolbarMain);