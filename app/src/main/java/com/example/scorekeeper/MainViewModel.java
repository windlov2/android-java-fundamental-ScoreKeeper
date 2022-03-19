package com.example.scorekeeper;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private static final String TAG = MainViewModel.class.getSimpleName();

    public MutableLiveData<Integer> score1 = new MutableLiveData<Integer>();
//    public LiveData<Integer> getMutableScore1() {
//        if (score1 == null) {
//            score1 = new MutableLiveData<Integer>();
//        }
//        return score1;
//    }

    public MutableLiveData<Integer> score2 = new MutableLiveData<Integer>();
//    public LiveData<Integer> getMutableScore2() {
//        if (score2 == null) {
//            score2 = new MutableLiveData<Integer>();
//        }
//        return score2;
//    }

    public MainViewModel() {
        score1.setValue(0);
        score2.setValue(0);
    }

    public void increaseScore(View view) {
        try {
            int id = view.getId();
            Log.d(TAG, "increaseScore(), view.getId() = " + id);

            if (id == R.id.increaseTeam1) {
                score1.setValue(score1.getValue() + 1);
            } else if (id == R.id.increaseTeam2) {
                score2.setValue(score2.getValue() + 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void decreaseScore(View view) {
        try {
            int id = view.getId();
            Log.d(TAG, "decreaseScore(), view.getId() = " + id);

            if (id == R.id.decreaseTeam1) {
                score1.setValue(score1.getValue() - 1);
            } else if (id == R.id.decreaseTeam2) {
                score2.setValue(score2.getValue() - 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
