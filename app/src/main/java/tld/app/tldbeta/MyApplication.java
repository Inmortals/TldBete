package tld.app.tldbeta;

import android.app.Application;
import android.content.Context;


public class MyApplication extends Application {


    //public LocationService locationService;
    private static MyApplication INSTANCE = null;
    private static Context context;

    public static String latitude;// 纬度

    public static String longitude;//经度

    public static String city;//城市


    public static String areaVersion = "";



    public static String DUID = "";// 设备唯一码
    public static int widthPixels = 321;// 屏幕宽度
    public static int heightPixels = 481;//屏幕高度

    public static final Context getAppContext() {
        return context;
    }

    ;

    public static MyApplication getInstance() {
        return INSTANCE;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        INSTANCE = this;

        //       locationService = new LocationService(context);
//        CrashHandler crashHandler = CrashHandler.getInstance();
//        crashHandler.init(context);

    }
}
