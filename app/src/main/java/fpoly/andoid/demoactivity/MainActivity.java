package fpoly.andoid.demoactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    //Để xem trạng thái hoạt động các bạn click vào phần "Logcat" trên thanh công cụ bên trái dưới cùng
    //Ở "Logcat" ô select thứ 3 từ trái sang click chọn "Error"
    //Sau đó "run" ứng dụng và kiểm tra
    
    private static final String TAG = "Trạng thái";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Activity được khởi chạy", "");
        Log.e(TAG, " onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity đang chạy", "");
        Log.e(TAG, " onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity được chạy", "");
        Log.e(TAG, " onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity bị đè", "");
        Log.e(TAG, " onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity bị dừng", "");
        Log.e(TAG, " onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Activity được khởi chạy lại", "");
        Log.e(TAG, " onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activity bị hủy", "");
        Log.e(TAG, " onDestroy");
    }

    public void click(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialog = builder.create();
        builder.setTitle("Chuyển activity");
        builder.setMessage("Bạn có muốn chuyển activity???");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}