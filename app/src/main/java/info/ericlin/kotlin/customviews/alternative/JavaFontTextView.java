package info.ericlin.kotlin.customviews.alternative;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class JavaFontTextView extends AppCompatTextView {

    public JavaFontTextView(Context context) {
        this(context, null);
    }

    public JavaFontTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public JavaFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        final Typeface typeface = CustomFontUtils.readTypeFace(context, attrs);
        setTypeface(typeface);
    }
}
