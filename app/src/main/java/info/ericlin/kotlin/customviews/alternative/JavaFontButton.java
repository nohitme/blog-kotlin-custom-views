package info.ericlin.kotlin.customviews.alternative;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class JavaFontButton extends AppCompatButton {

    public JavaFontButton(Context context) {
        this(context, null);
    }

    public JavaFontButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public JavaFontButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        final Typeface typeface = CustomFontUtils.readTypeFace(context, attrs);
        setTypeface(typeface);
    }
}
