package com.example.uts_d1041161001;

import java.util.ArrayList;

public class KomponenData {
    private static String[] komponenNames ={
            "Activity","Service","Broadcast Receivers","Content Providers"
    };
    private static String[] komponenDetails={
            "Sebuah Activity akan menampilkan antarmuka aplikasi di layar, sebagai contoh ketika kita membuka sebuah aplikasi maka akan muncul tampilan dari aplikasi tersebut. ",
            "Service adalah komponen yang berjalan di latar belakang. Sebagai contoh, Service bisa memainkan musik di latar belakang saat pengguna berada dalam aplikasi yang berbeda, atau mungkin mengambil data melalui jaringan tanpa menghalangi interaksi pengguna dengan aktivitas",
            "Broadcast Receiver berfungsi menerima pesan intent dari aplikasi lain atau dari sistem. Sebagai contoh, suatu aplikasi mengirim pesan berisi perintah tertentu untuk aplikasi lain bahwa beberapa data telah diunduh ke perangkat dan tersedia bagi mereka untuk menggunakan apklikasi tersebut, jadi Broadcast Receiver inilah yang akan menangani komunikasi ini dan akan melakukan tindakan yang tepat.",
            "ContentProvider adalah penyedia konten dari satu aplikasi ke aplikasi lain atas perintah tertentu. Perintah tersebut ditangani oleh sebuah method dari class ContentResolver. Data dapat disimpan dalam sistem file, database atau di tempat lainnya."
    };
    private static String[] komponenCode={
            "public class MainActivity extends Activity {\n" +
                    ".....\n" +
                    "}",
            "public class MyService extends Service {\n" +
                    "\n" +
                    "}",
            "public class MyReceiver  extends  BroadcastReceiver {\n" +
                    "   \n" +
                    "   public void onReceive(context,intent){}\n" +
                    "\n" +
                    "}",
            "public class MyContentProvider extends  ContentProvider {\n" +
                    "   \n" +
                    "   public void onCreate(){}\n" +
                    "\n" +
                    "}"

    };
    private static String[] komponenLink={
            "https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/index.html?index=..%2F..android-training#0",
            "https://medium.com/easyread/konsep-service-pada-android-4b37b2402a9e",
            "https://codelabs.developers.google.com/codelabs/android-training-broadcast-receivers/index.html?index=..%2F..android-training#0",
            "https://www.tutlane.com/tutorial/android/android-content-providers-with-examples"
    };

    static ArrayList<Komponen> getListData(){
        ArrayList<Komponen> list = new ArrayList<>();
        for (int position = 0; position < komponenNames.length; position++){
            Komponen komponen = new Komponen();
            komponen.setName(komponenNames[position]);
            komponen.setDetail(komponenDetails[position]);
            komponen.setCode(komponenCode[position]);
            komponen.setLink(komponenLink[position]);
            list.add(komponen);
        }
        return list;
    }
}
