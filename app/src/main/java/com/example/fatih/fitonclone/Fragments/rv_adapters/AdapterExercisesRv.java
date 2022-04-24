package com.example.fatih.fitonclone.Fragments.rv_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.fatih.fitonclone.Fragments.WorkoutFragment;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fatih.fitonclone.WorkoutModel;
import com.example.fatih.fitonclone.databinding.WorkoutExercisesRvBinding;

import java.util.List;

public class AdapterExercisesRv extends RecyclerView.Adapter<AdapterExercisesRv.ViewHolder> {
    private Context mContext;
    List<WorkoutModel>workoutModelList;

    public AdapterExercisesRv() {
    }

    public AdapterExercisesRv(Context mContext, List<WorkoutModel> workoutModelList) {
        this.mContext = mContext;
        this.workoutModelList = workoutModelList;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
       private WorkoutExercisesRvBinding binding;

        public ViewHolder(WorkoutExercisesRvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        WorkoutExercisesRvBinding binding=WorkoutExercisesRvBinding.inflate(layoutInflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WorkoutModel workoutModel=workoutModelList.get(position);
        WorkoutExercisesRvBinding b=holder.binding;


        b.imgItem.setImageResource(workoutModel.getImageResourceId());
        b.txvItemName.setText(workoutModel.getItemName());
        String fullTime=String.valueOf(workoutModel.getItemTime()+" min");
        b.txvItemTime.setText(fullTime);
        b.txvItemIntensity.setText(String.valueOf(workoutModel.getItemIntensity()));



        //Çizgi kısmı düzenlemesi
        if(position==0){
            b.lineTop.setVisibility(View.INVISIBLE);
        }else{
            b.lineTop.setVisibility(View.VISIBLE);
        }
        if(position==(workoutModelList.size()-1)){
            b.lineBottom.setVisibility(View.INVISIBLE);
        }else{
            b.lineBottom.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return workoutModelList.size();
    }


}