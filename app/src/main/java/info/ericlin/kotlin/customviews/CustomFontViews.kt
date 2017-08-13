package info.ericlin.kotlin.customviews

import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.AppCompatButton
import android.support.v7.widget.AppCompatEditText
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

/**
 * Your custom logic to read custom typefaces or attributes
 */
private fun readTypeFace(context: Context, attrs: AttributeSet?): Typeface? {
    attrs ?: return null
    val a = context.theme.obtainStyledAttributes(attrs, R.styleable.CustomFont, 0, 0)
    return try {
        val fontName = a.getString(R.styleable.CustomFont_font_name) ?: return null
        Typeface.createFromAsset(context.assets, fontName)
    } catch(e: Exception) {
        null
    } finally {
        a?.recycle()
    }
}

class CustomFontTextView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = android.R.attr.textViewStyle
) : AppCompatTextView(context, attrs, defStyleAttr) {
    init {
        typeface = readTypeFace(context, attrs)
    }
}

class CustomFontButton @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = android.support.v7.appcompat.R.attr.buttonStyle
) : AppCompatButton(context, attrs, defStyleAttr) {
    init {
        typeface = readTypeFace(context, attrs)
    }
}

class CustomFontEditText @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = R.attr.editTextStyle
) : AppCompatEditText(context, attrs, defStyleAttr) {
    init {
        typeface = readTypeFace(context, attrs)
    }
}