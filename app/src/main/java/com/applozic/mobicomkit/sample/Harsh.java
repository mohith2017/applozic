package  com.applozic.mobicomkit.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Harsh extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harsh);
    }

    public void onClickSignIn(View view)
    {
        Intent intent=new Intent(this,ItemsActivity.class);
        startActivity(intent);
    }

    public void onClickSignUp(View view)
    {
        Intent intent=new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
}
