package com.android.androidcalendar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MonthCalendarAdapter extends FragmentStateAdapter {
    private static int NUM_ITEMS = 100;
    public MonthCalendarAdapter(@NonNull Fragment fragment, String fragname) {
        super(fragment);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int year = position;
        int month = position+1;
        return MonthCalendarFrament.newInstance(year, month);
    }

    @Override
    public int getItemCount() {
        return NUM_ITEMS;
    }
}
