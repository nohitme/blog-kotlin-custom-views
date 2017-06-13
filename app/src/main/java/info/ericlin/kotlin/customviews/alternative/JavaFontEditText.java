package info.ericlin.kotlin.customviews.alternative;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class JavaFontEditText extends AppCompatEditText {

    public JavaFontEditText(Context context) {
        this(context, null);
    }

    public JavaFontEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public JavaFontEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        final Typeface typeface = CustomFontUtils.readTypeFace(context, attrs);
        setTypeface(typeface);
    }
}
