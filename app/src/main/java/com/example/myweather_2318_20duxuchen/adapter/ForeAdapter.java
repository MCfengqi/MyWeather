package com.example.myweather_2318_20duxuchen.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myweather_2318_20duxuchen.R;
import com.example.myweather_2318_20duxuchen.bean.ForeCast;

import java.util.ArrayList;
import java.util.List;

public class ForeAdapter extends RecyclerView.Adapter<ForeAdapter.MyViewHolder> {
    private List<ForeCast.DailyBean> dailyList = new ArrayList<>();

    public void setData(List<ForeCast.DailyBean> dailyList) {
        this.dailyList = dailyList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_forecast_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ForeCast.DailyBean dailyDTO = dailyList.get(position);
        holder.tvDate.setText(dailyDTO.getFxDate());
        holder.tvInfo.setText(dailyDTO.getTextDay());
        holder.tvMax.setText(dailyDTO.getTempMax());
        holder.tvMin.setText(dailyDTO.getTempMin());
    }

    @Override
    public int getItemCount() {
        return dailyList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDate;
        private TextView tvInfo;
        private TextView tvMax;
        private TextView tvMin;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = (TextView) itemView.findViewById(R.id.tvDate);
            tvInfo = (TextView) itemView.findViewById(R.id.tvFtext);
            tvMax = (TextView) itemView.findViewById(R.id.tvMax);
            tvMin = (TextView) itemView.findViewById(R.id.tvMin);
        }

    }
}