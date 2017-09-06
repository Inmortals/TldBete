package tld.app.tldbeta.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import tld.app.tldbeta.R;
import tld.app.tldbeta.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        Log.i("","");
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initdata() {

    }
}
