package ViewElements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import com.example.pirat.lrry.Activity.ScreenResolution;

/**
 * Created by pirat on 3/5/2017.
 */

public class ActionBArText extends View {
    public ActionBArText(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pp = new Paint(Color.parseColor("#FF4081"));
        pp.setTextSize(100);
        canvas.drawText("EASY NOTES", ScreenResolution.percent_of_width(7),ScreenResolution.percent_of_height(9),pp);


    }
}
