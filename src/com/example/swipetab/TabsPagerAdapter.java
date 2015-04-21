package com.example.swipetab;

import com.example.swipetab.PhotosFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			return new PhotosFragment();

		case 1:
			return new SongsFragment();

		case 2:
			return new VideosFragment();

		}
		return null;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
