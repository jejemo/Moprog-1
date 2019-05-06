package com.maho.upi.materi.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maho.upi.materi.Model.TeamModel;
import com.maho.upi.materi.R;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class TeamRecyclerViewAdapter extends RecyclerView.Adapter<TeamRecyclerViewAdapter.ViewHolder> {

	private Context context;
	private ArrayList<TeamModel> teamArrayList;
	private Dialog mydialog;
	private TextView dialogTeam, dialogDeskripsi;
	private ImageView dialogImgTeam;

	public TeamRecyclerViewAdapter(ArrayList<TeamModel> teams) {
		this.context = context;
		this.teamArrayList = teamArrayList;
	}

	public TeamRecyclerViewAdapter(FragmentActivity activity, ArrayList<TeamModel> listTeam) {

	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listteam, parent, false);
		final ViewHolder viewHolder = new ViewHolder(view);

		mydialog = new Dialog(context);
		mydialog.setContentView(R.layout.detailteam);
		mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

		viewHolder.listTeam.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dialogTeam = (TextView) mydialog.findViewById(R.id.txtTeam);
				dialogDeskripsi = (TextView) mydialog.findViewById(R.id.txtDeskripsi);
				dialogImgTeam = (ImageView) mydialog.findViewById(R.id.imgTeam);

				dialogTeam.setText(teamArrayList.get(viewHolder.getAdapterPosition()).getNama());
				dialogDeskripsi.setText(teamArrayList.get(viewHolder.getAdapterPosition()).getDeskripsi());
				String ikon = new String(""+ teamArrayList.get(viewHolder.getAdapterPosition()).getImage());
				Glide.with(context)
						.load(ikon)
						.into(dialogImgTeam);
			}
		});

		return viewHolder;
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		TeamModel team = teamArrayList.get(position);

		holder.listTeam.setText(team.getNama());
		String ikon = new String(""+ team.getIkon());
		Glide.with(context)
				.load(ikon)
				.into(holder.imgIkon);
	}

	@Override
	public int getItemCount() {
		if (teamArrayList != null){
			return teamArrayList.size();
		}else {
			return 0;
		}
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		LinearLayout detailitem;
		TextView listTeam;
		ImageView imgIkon;
		public ViewHolder(View itemView) {
			super(itemView);
			listTeam = (TextView) itemView.findViewById(R.id.txtNama);
			imgIkon = (ImageView) itemView.findViewById(R.id.imgIkon);
			detailitem = (LinearLayout) itemView.findViewById(R.id.detaiItem);

		}
	}


}
