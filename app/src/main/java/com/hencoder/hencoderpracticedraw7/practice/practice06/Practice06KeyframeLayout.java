package com.hencoder.hencoderpracticedraw7.practice.practice06;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw7.R;

public class Practice06KeyframeLayout extends RelativeLayout {
    Practice06KeyframeView view;
    Button animateBt;

    public Practice06KeyframeLayout(Context context) {
        super(context);
    }

    public Practice06KeyframeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice06KeyframeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        view = (Practice06KeyframeView) findViewById(R.id.objectAnimatorView);
        animateBt = (Button) findViewById(R.id.animateBt);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //还得加一个起点0,0  否则会直接从value值开始
                Keyframe keyframe00 = Keyframe.ofFloat(0, 0);
                Keyframe keyframe01 = Keyframe.ofFloat(0.9f, 100);
                Keyframe keyframe02 = Keyframe.ofFloat(1, 80);
                PropertyValuesHolder holder = PropertyValuesHolder.ofKeyframe("progress", keyframe00, keyframe01,keyframe02);
                ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(view, holder);
                animator.setDuration(2333);
                animator.start();
            }
        });
    }
}
