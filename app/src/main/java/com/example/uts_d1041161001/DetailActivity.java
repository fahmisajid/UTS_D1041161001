package com.example.uts_d1041161001;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_CODE ="extra_code";
    public static final String EXTRA_LINK ="extra_link";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvName = findViewById(R.id.komponenname);
        TextView tvDetail = findViewById(R.id.komponendeskripsi);
        TextView tvCode = findViewById(R.id.komponenecode);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String code = getIntent().getStringExtra(EXTRA_CODE);

        final String link = getIntent().getStringExtra(EXTRA_LINK);

        tvName.setText(name);
        tvDetail.setText(detail);
        tvCode.setText(code);

        findViewById(R.id.more).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clikLink(link);
            }
        });
    }
    public void clikLink(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
