package com.latihan.a10118320;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.latihan.a10118320.fragments.PageFragment1;
import com.latihan.a10118320.fragments.PageFragment2;
import com.latihan.a10118320.fragments.PageFragment3;

import java.util.ArrayList;
import java.util.List;

public class FragmentViewpager extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_viewpager,container, false);

    }
}
//05/06/2021_10118320_Raden Rizka M Nisa_IF8