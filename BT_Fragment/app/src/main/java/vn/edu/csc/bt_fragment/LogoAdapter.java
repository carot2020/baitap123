package vn.edu.csc.bt_fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LogoAdapter extends RecyclerView.Adapter<LogoAdapter.LogoVH> {

    ArrayList<Logo> logos;
    OnItemClickListener listener;

    public LogoAdapter(ArrayList<Logo> logos,OnItemClickListener listener) {
        this.logos = logos;
        this.listener = listener;
    }

    interface OnItemClickListener{
        void setOnItemClickListener(Logo lg);
    }


    @NonNull
    @Override
    public LogoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View convertView = layoutInflater.inflate(R.layout.layout_cell,
                parent, false);
        return new LogoVH(convertView);
    }

    @Override
    public void onBindViewHolder(@NonNull LogoVH holder, int position) {
        Logo logo = logos.get(position);
        holder.imageView.setImageResource(logo.image);
        holder.textView.setText(logo.name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.setOnItemClickListener(logo);
            }
        });
    }

    @Override
    public int getItemCount() {
        return logos.size();
    }

    class LogoVH extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public LogoVH(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
