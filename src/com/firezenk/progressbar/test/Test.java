package com.firezenk.progressbar.test;

import com.firezenk.progressbar.test.R;
import com.firezenk.progressbar.FZProgressBar;
import com.firezenk.progressbar.FZProgressBar.Mode;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Retrieve the first progress bar
        final FZProgressBar mBar1 = (FZProgressBar) findViewById(R.id.fancyBar1);
        
        //Configure the first progress bar
        mBar1.animation_config(2, 10);
        int[] colors1 = {Color.RED, Color.TRANSPARENT};
        mBar1.bar_config(1, 0, 0, Color.TRANSPARENT, colors1);
        
        //Retrieve the second progress bar
        final FZProgressBar mBar2 = (FZProgressBar) findViewById(R.id.fancyBar2);
        
        //Configure the second progress bar
        mBar2.animation_config(2, 5);
        int[] colors2 = {Color.MAGENTA, Color.CYAN};
        mBar2.bar_config(10, 0, 10, Color.BLACK, colors2);
        
        //Retrieve the third progress bar
        final FZProgressBar mBar3 = (FZProgressBar) findViewById(R.id.fancyBar3);
        
        //Configure the third progress bar
        mBar3.animation_config(10, 2);
        int[] colors3 = {Color.GREEN, Color.TRANSPARENT};
        mBar3.bar_config(40, 0, 20, Color.GRAY, colors3);
        
        //Retrieve the third progress bar
        final FZProgressBar mBar4 = (FZProgressBar) findViewById(R.id.fancyBar4);
        
        //Configure the third progress bar
        mBar4.animation_config(2, 5);
        int[] colors4 = {Color.BLACK, Color.TRANSPARENT};
        mBar4.bar_config(40, 120, 0, Color.LTGRAY, colors4);
        
        //Retrieve the third progress bar
        final FZProgressBar mBar5 = (FZProgressBar) findViewById(R.id.fancyBar5);
        
        //Configure the third progress bar
        mBar5.animation_config(5, 10);
        int[] colors5 = {Color.YELLOW, Color.TRANSPARENT};
        mBar5.bar_config(40, 260, 0, Color.GRAY, colors5);
        
        //Retrieve the third progress bar
        final FZProgressBar mBar6 = (FZProgressBar) findViewById(R.id.fancyBar6);
        
        //Configure the third progress bar
        mBar6.animation_config(2, 5);
        int[] colors6 = {Color.CYAN, Color.TRANSPARENT};
        mBar6.bar_config(40, 160, 0, Color.LTGRAY, colors6);
        
        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Start the animation of the progress bars assigning them their mode
				mBar1.animation_start(Mode.INDETERMINATE);
				mBar2.animation_start(Mode.DETERMINATE);
				mBar3.animation_start(Mode.DETERMINATE);
				mBar4.animation_start(Mode.INDETERMINATE);
				mBar5.animation_start(Mode.INDETERMINATE);
				mBar6.animation_start(Mode.INDETERMINATE);
			}
		});
        
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Stop the animation of progress bars
				mBar1.animation_stop();
				mBar2.animation_stop();
				mBar3.animation_stop();
				mBar4.animation_stop();
				mBar5.animation_stop();
				mBar6.animation_stop();
			}
		});
    }
    
}