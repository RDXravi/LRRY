package ViewElements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import com.example.pirat.lrry.Activity.ScreenResolution;

/**
 * Created by pirat on 3/5/2017.
 */

public class DrawBorder extends View {

    public DrawBorder(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pp = new Paint();
        pp.setColor(Color.parseColor("#FF4081"));
        Rect vertical_line = new Rect(ScreenResolution.percent_of_width(6),0,ScreenResolution.percent_of_width(7),ScreenResolution.getHeight());
        canvas.drawRect(vertical_line,pp);
        Rect horizontal_line = new Rect(0,ScreenResolution.percent_of_height(10),ScreenResolution.getWidth(),ScreenResolution.percent_of_height(11));
        canvas.drawRect(horizontal_line,pp);



/*        canvas.drawLine(ScreenResolution.getWidth_5(),0, ScreenResolution.getWidth_5(),ScreenResolution.getHeight(),pp);
        canvas.drawLine(ScreenResolution.getWidth_5()+3,0, ScreenResolution.getWidth_5()+3,ScreenResolution.getHeight(),pp);
        canvas.drawLine(0,ScreenResolution.getHeight_5(), ScreenResolution.getWidth(),ScreenResolution.getHeight_5(),pp);
        canvas.drawLine(0,ScreenResolution.getHeight_5()+3, ScreenResolution.getWidth(),ScreenResolution.getHeight_5()+3,pp);
  */  }
}
