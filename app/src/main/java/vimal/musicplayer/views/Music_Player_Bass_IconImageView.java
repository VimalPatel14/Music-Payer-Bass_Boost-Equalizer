package vimal.musicplayer.views;

import android.content.Context;
import android.graphics.PorterDuff;
import androidx.appcompat.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.kabouzeid.appthemehelper.util.ATHUtil;
import vimal.musicplayer.R;


public class Music_Player_Bass_IconImageView extends AppCompatImageView {
    public Music_Player_Bass_IconImageView(Context context) {
        super(context);
        init(context);
    }

    public Music_Player_Bass_IconImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Music_Player_Bass_IconImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        if (context == null) return;
        setColorFilter(ATHUtil.resolveColor(context, R.attr.iconColor), PorterDuff.Mode.SRC_IN);
    }
}
