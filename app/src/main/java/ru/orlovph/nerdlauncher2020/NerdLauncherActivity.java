package ru.orlovph.nerdlauncher2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }

}
