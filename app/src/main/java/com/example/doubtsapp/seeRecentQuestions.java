package com.example.doubtsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link seeRecentQuestions#newInstance} factory method to
 * create an instance of this fragment.
 */
public class seeRecentQuestions extends androidx.fragment.app.Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Button dbmsRecent;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public seeRecentQuestions() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment seeRecentQuestions.
     */
    // TODO: Rename and change types and number of parameters
    public static seeRecentQuestions newInstance(String param1, String param2) {
        seeRecentQuestions fragment = new seeRecentQuestions();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_see_recent_questions, container, false);
        dbmsRecent= (Button) view.findViewById(R.id.dbmsRecent);
        dbmsRecent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRecentPost(v);
            }
        });



        return view;
    }

    private void goToRecentPost(View v) {

        Intent intent = new Intent(getContext(),seeRecentActivity.class);
        startActivity(intent);


    }
}