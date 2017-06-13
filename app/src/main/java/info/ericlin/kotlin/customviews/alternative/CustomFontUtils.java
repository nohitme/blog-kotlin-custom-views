package info.ericlin.kotlin.customviews.alternative;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import info.ericlin.kotlin.customviews.R;

/**
 * Util class for custom font views
 * <p>
 * Created by nohitme on 6/12/17.
 */
public class CustomFontUtils {

    @Nullable
    public static Typeface readTypeFace(@NonNull Context context, @Nullable AttributeSet attrs) {
        if (attrs == null) {
            return null;
        }

        final TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomFont, 0, 0);
        try {
            final String fontName = a.getString(R.styleable.CustomFont_font_name);
            return fontName != null ? Typeface.createFromAsset(context.getAssets(), fontName) : null;
        } catch (Exception e) {
            return null;
        } finally {
            a.recycle();
        }
    }

    private CustomFontUtils() {
        //no instance
    }
}
