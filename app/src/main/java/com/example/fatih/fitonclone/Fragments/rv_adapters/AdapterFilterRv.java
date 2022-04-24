package com.example.fatih.fitonclone.Fragments.rv_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fatih.fitonclone.databinding.WorkoutExercisesRvBinding;
import com.example.fatih.fitonclone.databinding.WorkoutFilterRvBinding;

import java.util.List;

public class AdapterFilterRv extends RecyclerView.Adapter<AdapterFilterRv.ViewHolder> {
    private Context mContext;
    List<Week>weekList;

    public AdapterFilterRv(Context mContext, List<Week> weekList) {
        this.mContext = mContext;
        this.weekList = weekList;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private WorkoutFilterRvBinding binding;

        public ViewHolder( WorkoutFilterRvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        WorkoutFilterRvBinding binding=WorkoutFilterRvBinding.inflate(layoutInflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Week weekData=weekList.get(position);
        WorkoutFilterRvBinding b=holder.binding;
        b.txvWeekSlicer.setText(weekData.getWeek());
    }

    @Override
    public int getItemCount() {
        return weekList.size();
    }

}
