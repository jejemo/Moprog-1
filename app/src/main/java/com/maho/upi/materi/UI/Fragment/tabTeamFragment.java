package com.maho.upi.materi.UI.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maho.upi.materi.Adapter.TeamAdapter;
import com.maho.upi.materi.Adapter.TeamRecyclerViewAdapter;
import com.maho.upi.materi.Model.TeamModel;
import com.maho.upi.materi.R;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class tabTeamFragment extends Fragment {

	private View v;
	private RecyclerView recyclerView;
	private TeamAdapter adapter;
	private List<TeamModel> listTeam;
	//private ArrayList<TeamModel> listTeam;

	public tabTeamFragment() {
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.tab_team_fragment, container, false);

		recyclerView = (RecyclerView) v.findViewById(R.id.teamsRecyclerView);
		adapter = new TeamAdapter(getContext(),listTeam);
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		recyclerView.setAdapter(adapter);

		/*recyclerView = (RecyclerView) v.findViewById(R.id.teamsRecyclerView);

		adapter = new TeamRecyclerViewAdapter(listTeam);
		recyclerView.setAdapter(adapter);*/

		return v;
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		listTeam = new ArrayList<>();

		listTeam.add(new TeamModel("Real Madrid",
				"Real Madrid di musim 2018/19 ini memang terlihat sedang mengalami banyak masalah. Akan tetapi, melihat Los Blancos yang berhasil menjuarai empat Champions League dari lima musim terakhir, membuat skuat asuhan Santiago Solari masih berada di peringkat teratas klub terbaik versi UEFA ini.",
				"https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/150px-Real_Madrid_CF.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/real-madrid-celebrate-after-victory-in-the-champions-league-final-against-liverpool-5c28fd5bfc664a5977000035.jpg"));
		listTeam.add(new TeamModel("Bayern Munchen",
				"Tak hanya jago kandang dengan mendominasi kompetisi Bundesliga selama enam musim secara beruntun, Bayern Munchen juga selalu bisa bersaing dalam gelaran Champions League.",
				"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg/220px-FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/fc-bayern-muenchen-v-vfb-stuttgart-bundesliga-5c28fd8e828797b1e4000002.jpg"));
		listTeam.add(new TeamModel("Barcelona",
				"Salah satu tim yang paling lapar untuk menjadi nomor satu di Eropa ialah Barcelona. Klub yang sepertinya sudah mempunyai 'DNA' Eropa ini, tak begitu puas jika hanya bisa menjuarai kompetisi La Liga, dan Copa Del Rey saja.",
				"https://upload.wikimedia.org/wikipedia/en/thumb/4/47/FC_Barcelona_%28crest%29.svg/220px-FC_Barcelona_%28crest%29.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/barcelona-v-real-madrid-la-liga-5c28fde2fc664a6f45000017.jpg"));
		listTeam.add(new TeamModel("Atletico Madrid",
				"Atletico Madrid bisa memperbaiki nasib buruknya di kompetisi Champions League 2017/18, dengan berhasil meraih gelar Europa League ketika mampu mengalahkan Olympique Marseille di laga final.",
				"https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Atletico_Madrid_2017_logo.svg/170px-Atletico_Madrid_2017_logo.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/olympique-de-marseille-v-club-atletico-de-madrid-uefa-europa-league-final-5c28fe068287976bed000001.jpg"));
		listTeam.add(new TeamModel("Juventus",
				"Apabila Paris Saint-Germain bisa mendominasi kompetisi Ligue 1, maka Juventus  juga melakukan dominasi yang sama di Serie A dengan berhasil meraih gelar juara sebanyak tujuh kali secara beruntun. Bahkan, Bianconeri juga kembali bisa mempertahankan trofi Serie A di musim 2018/19, setelah melihat penampilan positif yang terus ditunjukkan skuat asuhan Massimilano Allegri.",
				"https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Juventus_FC_2017_logo.svg/110px-Juventus_FC_2017_logo.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/juventus-v-spal-serie-a-5c28fe2a8287975e81000001.jpg"));
		listTeam.add(new TeamModel("Paris Saint-Germain",
				"Paris Saint-Germain berhasil membuat Ligue 1 seolah menjadi panggungnya sendiri, lantaran bisa meninggalkan posisi kedua Lille sebanyak 13 poin  di musim 2018/19 ini. Di kompetisi domestik, PSG juga dengan mudahnya meraih gelar-gelar seperti Coupe de France, Coupe de Ligue, dan Trophee des Champions.",
				"https://upload.wikimedia.org/wikipedia/en/thumb/a/a7/Paris_Saint-Germain_F.C..svg/200px-Paris_Saint-Germain_F.C..svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/fbl-fra-ligue1-psg-lyon-5c28fe63e437138157000001.jpg"));
		listTeam.add(new TeamModel("Manchester City",
				"Setelah bisa meraih berbagai gelar di level domestik seperti Premier League, dan League Cup di musim 2017/18 lalu, kini misi Pep Guardiola adalah bisa membawa The Citizens meraih gelar Champions League untuk pertama kalinya.",
				"https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/200px-Manchester_City_FC_badge.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/leganes-v-sevilla-la-liga-santander-5c28feb9e437134ef7000001.jpg"));
		listTeam.add(new TeamModel("Sevilla",
				"Raja Europa League yakni Sevilla, bisa membuat kejutan di kompetisi Champions League  2017/18 lalu kala mengalahkan Manchester United di babak 16 besar. Meski pada akhirnya harus kandas oleh Bayern Munchen saat babak delapan besar, momen itu sepertinya akan selalu dikenang oleh para pemain Los Palanganas.",
				"https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/Sevilla_FC_logo.svg/200px-Sevilla_FC_logo.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/leganes-v-sevilla-la-liga-santander-5c28feb9e437134ef7000001.jpg"));
		listTeam.add(new TeamModel("FC Porto",
				"Juara bertahan Primeira Liga, FC Porto memang tidak boleh dipandang sebelah mata ketika bermain di ajang Champions League. Sebab skuat asuhan Sergio Conceicao konsisten bisa lolos ke babak 16 besar (2016/17, 2017/18 dan 2018/19).",
				"https://upload.wikimedia.org/wikipedia/en/thumb/f/f1/FC_Porto.svg/170px-FC_Porto.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/uefa-champions-league-galatasaray-as-v-fc-porto-5c28fefc828797708e000001.jpg"));
		listTeam.add(new TeamModel("Arsenal",
				"Musim 2018/19 ini, untuk kedua kalinya secara beruntun bagi Arsenal  harus bermain di kompetisi Europa League. Pada musim 2017/18 lalu, sebenarnya The Gunners  yang kala itu masih dilatih Arsene Wenger mempunyai peluang untuk meraih gelar Europa League, akan tapi harapan tersebut harus pupus karena dikalahkan Atletico Madrid di semifinal.",
				"https://upload.wikimedia.org/wikipedia/en/thumb/5/53/Arsenal_FC.svg/180px-Arsenal_FC.svg.png",
				"https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/arsenal-fc-v-burnley-fc-premier-league-5c28ff1de43713f843000012.jpg"));
	}



}
