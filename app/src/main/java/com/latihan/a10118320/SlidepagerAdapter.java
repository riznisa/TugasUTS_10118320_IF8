package com.latihan.a10118320;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SlidepagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    public SlidepagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
//05/06/2021_10118320_Raden Rizka M Nisa_IF8
