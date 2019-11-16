package com.venus.camera2demo.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.venus.camera2demo.R;

public class CameraParamsSettingsDialog extends Dialog implements View.OnClickListener{
	private static String TAG = CameraParamsSettingsDialog.class.getSimpleName();
	private Context mContext;

	public CameraParamsSettingsDialog(Context context, int theme) {
		super(context, theme);
		this.mContext = context;
	}

	@Override
	protected void onStart() {
		super.onStart();
		hideNavigationBar();
	}

	private void hideNavigationBar(){
		//hide navigation bar
		Window window = this.getWindow();
		window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
				| View.SYSTEM_UI_FLAG_LAYOUT_STABLE
				| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
				| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
				| View.SYSTEM_UI_FLAG_IMMERSIVE
				| View.SYSTEM_UI_FLAG_FULLSCREEN;


		window.getDecorView().setSystemUiVisibility(uiOptions);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.camera_params_settings_layout);
		setCanceledOnTouchOutside(true);

		initView();
	}

	private void initView() {

	}

	@Override
	public void show() {
		super.show();

		WindowManager wm = (WindowManager) getContext().getSystemService(
				Context.WINDOW_SERVICE);
		Point size = new Point();
		wm.getDefaultDisplay().getSize(size);

		int height = (int)(size.y * 0.7);
		getWindow().setLayout(size.x, height);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onKeyUp(int i, KeyEvent keyEvent) {
		return false;
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()){
			default:
				break;
		}
	}

	@Override
	public void dismiss() {
		super.dismiss();
		hideNavigationBar();
	}

	@Override
	public void onDetachedFromWindow() {
		super.onDetachedFromWindow();
	}
}
