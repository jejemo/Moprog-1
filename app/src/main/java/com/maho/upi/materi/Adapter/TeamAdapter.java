package com.maho.upi.materi.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
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

import java.util.List;

@SuppressWarnings("ALL")
public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.myViewHolder> {

	Context mCtx;
	List<TeamModel> mTeam;
	private Dialog mydialog;
	private TextView dialogTeam, dialogDeskripsi;
	private ImageView dialogImgTeam;

	public TeamAdapter(Context mCtx, List<TeamModel> mTeam) {
		this.mCtx = mCtx;
		this.mTeam = mTeam;
	}

	@NonNull
	@Override
	public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view;
		view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listteam, parent, false);
		final myViewHolder viewHolder = new myViewHolder(view);

		mydialog = new Dialog(mCtx);
		mydialog.setContentView(R.layout.detailteam);
		mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

		viewHolder.listTeam.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dialogTeam = (TextView) mydialog.findViewById(R.id.txtTeam);
				dialogDeskripsi = (TextView) mydialog.findViewById(R.id.txtDeskripsi);
				dialogImgTeam = (ImageView) mydialog.findViewById(R.id.imgTeam);

				dialogTeam.setText(mTeam.get(viewHolder.getAdapterPosition()).getNama());
				dialogDeskripsi.setText(mTeam.get(viewHolder.getAdapterPosition()).getDeskripsi());
				String ikon = new String(""+ mTeam.get(viewHolder.getAdapterPosition()).getImage());
				Glide.with(mCtx)
						.load(ikon)
						.into(dialogImgTeam);
			}
		});

		return viewHolder;
	}

	@Override
	public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
		TeamModel team = mTeam.get(position);

		holder.listTeam.setText(team.getNama());
		String ikon = new String(""+ team.getIkon());
		Glide.with(mCtx)
				.load(ikon)
				.into(holder.listIkonTeam);
	}

	@Override
	public int getItemCount() {
		return mTeam.size();
	}


	public static class myViewHolder extends RecyclerView.ViewHolder{
		LinearLayout detailitem;
		private TextView listTeam;
		private ImageView listIkonTeam;

		public myViewHolder(View itemView) {
			super(itemView);

			listTeam = (TextView) itemView.findViewById(R.id.txtNama);
			listIkonTeam = (ImageView) itemView.findViewById(R.id.imgIkon);
			detailitem = (LinearLayout) itemView.findViewById(R.id.detaiItem);
		}
	}

}
