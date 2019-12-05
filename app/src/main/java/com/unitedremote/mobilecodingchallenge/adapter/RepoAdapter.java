package com.unitedremote.mobilecodingchallenge.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.unitedremote.mobilecodingchallenge.R;
import com.unitedremote.mobilecodingchallenge.model.Repository;
import java.text.DecimalFormat;
import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Repository> repositories;

    public RepoAdapter(List<Repository> repositories) {
        this.repositories = repositories;
    }

    @NonNull
    @Override
    public RepositoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, parent, false);

        return new RepositoryViewHolder(view);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        final RepositoryViewHolder RepositoryVH = (RepositoryViewHolder) holder;
        RepositoryVH.name.setText(repositories.get(position).getmName());
        RepositoryVH.description.setText(repositories.get(position).getmDescription());
        float starsNumber = repositories.get(position).getmStarsNumber(); // return the number of stars devided by 1000
        if (starsNumber > 1000) starsNumber /= 1000;
        repositories.get(position).setmStarsNumber(starsNumber);
        // get only the first digit afrer comma and then append the value with 'k'
        RepositoryVH.stars.setText(new DecimalFormat("##.#").format(starsNumber) + "k");
        RepositoryVH.username.setText(repositories.get(position).getOwner().getLogin());
        Picasso.with(holder.itemView.getContext()).load(repositories.get(position).getOwner()
                .getAvatar_url()).resize(200, 200).centerCrop().onlyScaleDown()
                .into(RepositoryVH.avatar);

    }

    @Override
    public int getItemCount() {
        return repositories.size();
    }


    public static class RepositoryViewHolder extends  RecyclerView.ViewHolder {
        TextView name,description,username,stars;
        ImageView avatar;

        private RepositoryViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            username = itemView.findViewById(R.id.username);
            avatar = itemView.findViewById(R.id.avatar);
            stars = itemView.findViewById(R.id.stars);
        }
    }


}