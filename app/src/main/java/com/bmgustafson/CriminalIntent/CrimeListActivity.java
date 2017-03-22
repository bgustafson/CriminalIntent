package com.bmgustafson.CriminalIntent;

import android.support.v4.app.Fragment;
import com.bmgustafson.CriminalIntent.fragments.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
