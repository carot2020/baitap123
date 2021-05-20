package vn.edu.csc.bt_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LogoDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LogoDetailFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ImageView imageViewDetail;
    TextView textViewName, textViewDescription;
    Logo logoDetail;


    public LogoDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LogoDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LogoDetailFragment newInstance(String param1, String param2) {
        LogoDetailFragment fragment = new LogoDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public static LogoDetailFragment newInstance(Logo logo){
        LogoDetailFragment fragment = new LogoDetailFragment();
        Bundle args = new Bundle();
        args.putString("name", logo.name);
        args.putString("des", logo.description);
        args.putInt("image", logo.image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            logoDetail = new Logo(getArguments().getString("name"),
                                  getArguments().getString("des"),
                                  getArguments().getInt("image", 0) );

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_logo_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageViewDetail = view.findViewById(R.id.imageViewDetail);
        textViewName = view.findViewById(R.id.textViewName);
        textViewDescription = view.findViewById(R.id.textViewDescription);

        imageViewDetail.setImageResource(logoDetail.image);
        textViewName.setText(logoDetail.name);
        textViewDescription.setText(logoDetail.description);
    }
}