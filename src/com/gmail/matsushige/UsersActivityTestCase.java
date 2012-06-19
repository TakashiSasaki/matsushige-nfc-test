package com.gmail.matsushige;

import com.gmail.matsushige.R;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

/**
 * @author Takashi SASAKI
 */
public class UsersActivityTestCase extends
		ActivityInstrumentationTestCase2<com.gmail.matsushige.UsersActivity> {

	public UsersActivityTestCase() {
		super(UsersActivity.class);
	}// UsersActivityTestCase

	public void test1() {
		this.usersActivity.runOnUiThread(new Runnable() {

			@Override
			public void run() {
				UsersActivityTestCase.this.buttonResetUsers.requestFocus();
				getInstrumentation().waitForIdle(null);
			}
		});// runOnUiThread

	}// test1

	Activity usersActivity;
	Button buttonResetUsers;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		this.usersActivity = getActivity();
		//this.buttonResetUsers = (Button) this.usersActivity
		//		.findViewById(R.id.buttonResetUsers);
		super.setUp();
	}// setUp

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}// tearDown
}// UsersActivityTestCase

