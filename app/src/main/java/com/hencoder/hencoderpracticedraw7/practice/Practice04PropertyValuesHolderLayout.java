package com.hencoder.hencoderpracticedraw7.practice;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw7.R;

public class Practice04PropertyValuesHolderLayout extends RelativeLayout {
    View view;
    Button animateBt;

    public Practice04PropertyValuesHolderLayout(Context context) {
        super(context);
    }

    public Practice04PropertyValuesHolderLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice04PropertyValuesHolderLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        view = findViewById(R.id.objectAnimatorView);
        animateBt = (Button) findViewById(R.id.animateBt);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                PropertyValuesHolder holder00 = PropertyValuesHolder.ofFloat("scaleX", 0,2);
                PropertyValuesHolder holder01 = PropertyValuesHolder.ofFloat("scaleY", 0,2);
                PropertyValuesHolder holder02 = PropertyValuesHolder.ofFloat("alpha", 0, 100);
                ValueAnimator animator = ObjectAnimator.ofPropertyValuesHolder(view,holder00, holder01,holder02);
                animator.setDuration(2333);
                animator.start();
            }
        });
    }
}
