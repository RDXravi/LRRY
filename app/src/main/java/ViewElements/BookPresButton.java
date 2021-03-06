package ViewElements;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;

import com.example.pirat.lrry.Activity.ScreenResolution;
import com.example.pirat.lrry.R;

/**
 * Created by pirat on 3/8/2017.
 */

public class BookPresButton extends View implements View.OnClickListener {

    public static Bitmap image;

    public BookPresButton(Context context){
        super(context);

        image = BitmapFactory.decodeResource(getResources(),R.drawable.book);

    }

    private Rect dst1;
    private Rect dst2;
    private Rect dst3;
    private Rect dst4;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        Rect src  = new Rect(0,0,image.getWidth()-1,image.getHeight()-1);
        dst1 = new Rect(ScreenResolution.percent_of_width(15),ScreenResolution.percent_of_height(50), ScreenResolution.percent_of_width(50),ScreenResolution.percent_of_height(70));
        dst2 = new Rect(ScreenResolution.percent_of_width(55),ScreenResolution.percent_of_height(50), ScreenResolution.percent_of_width(90),ScreenResolution.percent_of_height(70));
        dst3 = new Rect(ScreenResolution.percent_of_width(15),ScreenResolution.percent_of_height(75), ScreenResolution.percent_of_width(50),ScreenResolution.percent_of_height(95));
        dst4 = new Rect(ScreenResolution.percent_of_width(55),ScreenResolution.percent_of_height(75), ScreenResolution.percent_of_width(90),ScreenResolution.percent_of_height(95));
       // canvas.drawBitmap(image,0,0,p);

        canvas.drawBitmap(image,src,dst1,p);
        canvas.drawBitmap(image,src,dst2,p);
        canvas.drawBitmap(image,src,dst3,p);
        canvas.drawBitmap(image,src,dst4,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x =(int) event.getX();
        int y = (int) event.getY();
        if(dst1.contains(x,y)|| dst2.contains(x,y)||dst3.contains(x,y)||dst4.contains(x,y)){
            getRootView().playSoundEffect(SoundEffectConstants.CLICK);
            Log.d("rr","sdvnsdkvjnsdkuvhdslv");
        }

        return false;

    }

    @Override
    public void onClick(View v) {


            Log.d("rr","sdvnsdkvjnsdkuvhdslv");


    }






}
