package Utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.my_library.R;

public class IconFontTextView  extends android.support.v7.widget.AppCompatTextView {
    public IconFontTextView(Context context) {
        this(context, null);
    }

    public IconFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.IconFontTextView, 0, 0);
        String typefaceFile = null;
        try {
            typefaceFile = a.getString(R.styleable.IconFontTextView_typefaceFile);
        } finally {
            a.recycle();
        }

        if (typefaceFile != null) {
            setTypeface(Typefaces.get(context, typefaceFile));
        }
    }
}
