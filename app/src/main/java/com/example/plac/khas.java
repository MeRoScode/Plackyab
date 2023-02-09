package com.example.plac;

import static com.example.plac.R.drawable._0220214_153642;
import static com.example.plac.R.drawable.background;
import static com.example.plac.R.drawable.download;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class khas extends Fragment implements View.OnClickListener {

    private Button edt_txt2;
    private EditText edt_txt4;
    private TextView txt_view;
    private TextView txt_secend;
    private TextView txt_serd;
    private Button btn_find;
    private ImageView imageView;
    private String sh = " شهرستان " ;
    private String os = " از استان " ;

    public static khas instense(){
        khas fragment = new khas();
        return fragment ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.khas, container, false);
        interviews(view);
        return view ;


    }



    private void interviews(View view) {
        edt_txt2 = view.findViewById(R.id.edt_txt2);
        edt_txt4 = view.findViewById(R.id.edt_txt4);
        btn_find = view.findViewById(R.id.btn_find);
        txt_view = view.findViewById(R.id.txt_view);
        txt_secend = view.findViewById(R.id.txt_secend);
        txt_serd = view.findViewById(R.id.txt_serd);
        imageView = view.findViewById(R.id.imageView);

        btn_find.setOnClickListener(this);
        edt_txt2.setOnClickListener(this);

        edt_txt2.setTypeface(fonts.getTypeface(getContext(),"fonts/1_5186128406684631051.ttf"));
        txt_view.setTypeface(fonts.getTypeface(getContext(),"fonts/1_5186128406684631051.ttf"));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_find:
                startanim(txt_view,R.anim.in_from_left);
                startanim(btn_find,R.anim.zoom_out);
                inter();
                break;
            case R.id.edt_txt2:
                edt_text(view);
                break;

        }
    }

    private void startanim(View view , int animid){
        Animation animation = AnimationUtils.loadAnimation(getContext(),animid);
        view.startAnimation(animation);
    }

    @SuppressLint("SetTextI18n")
    private void inter(){
        if (edt_txt2.getText() != null) {

            if (edt_txt2.getText().equals("ف")) {
                txt_view.setText("پلاک های آبی با حرف (ف) متعلق به ستاد کل نیرو های مسلح جمهوری اسلامی ایران است");
            }
            if (edt_txt2.getText().equals("ژ")) {
                txt_view.setText("پلاک ویژه معلولین و جانبازا" +
                        "این پلاک معمولا بدون حروف بوده و فقط روی آن عارم مخصوص  معلولین را میزنند اما در اطلاعات کامپیوتری آن را با حرف (ژ) نشانت میدهند . دلیل طراحی این پلاک این است که اگر این اشخاص در جایی پارک کنند معلوم می شود . و قابل توجه است که این افراد بنزین و همچنین درمان ساماندهی را دارند . و در آخر که پلاک این ماشین ها سفید می باشد .");
            }
            if (edt_txt2.getText().equals("الف")) {
                txt_view.setText("پلاک های قرمز با حرف (الف) خودرو های انحصاری دولت اند و به ندرت در خیابان دیده میشوند");
            }
            if (edt_txt2.getText().equals("ت")) {
                txt_view.setText("پلاک های زرد با حرف (ت) متعلق به تاکسی ها است و همینطور به زبان لاتین و به کوچکی نیز روی حروف پلاک کلمه تاکسی نوشته شده است ");
            }
            if (edt_txt2.getText().equals("پ")) {
                txt_view.setText("پلاک های سبز با حرف (پ) متعلق به نیروی انتظامی،پلیس آگاهی و راهنمایی و رانندگی است");
            }
            if (edt_txt2.getText().equals("گ")) {
                txt_view.setPadding(0,0,0,300);
                txt_view.setText(" برخلاف تصور برخی مردم خودروی" +
                        " گذر موقت با خودروی منطقه ازاد متفاوت است چرا که خودروی دارای پلاک" +
                        " منطقه ازاد فقط می تواند در محدوده منطقه آزاد تردد کند و خودروی" +
                        " گذر موقت مانند یک خودروی دارای پلاک ایران در تمام جاده های ایران" +
                        " تردد کند. حداکثر مدت زمان قانونی تردد یک خودروی دارای پلاک گذر" +
                        " موقت 6 ماه است که البته بسته به نوع خودرو و مبدا خودرو این زمان " +
                        "متغییر است. خودروهایی که از مبدا کشورهای حاشیه خلیج فارس به ایران " +
                        "وارد می شوند معمولا دارای مجوز تردد 4 ماهه در ایران هستند که طبق " +
                        "اطلاعات خبرنگار ما، در حال حاضر عموما مجوز 3 ماهه صارد می شود. " +
                        "بر خلاف تصور عمومی مردم تشخیص مدت زمان مجاز تردد این خودروها از" +
                        " روی پلاک مقدور نیست. محدودیت های گذر موقت در حالی که واردکنندگان" +
                        " و فروشندگان خودروهای گذر موقت اعلام می کنند که محدودیتی برای " +
                        "این خودروها وجود ندارد امام پلیس نظری متفاوت در این خصوص دارد. " +
                        "البته پلیس تاکید می کند که این خودروهای وارداتی محدودیت هایی برای " +
                        "استفاده دارند، به طوری که به هیچ عنوان قابل واگذاری به غیر نیستند. " +
                        "طبق قانون راهنمایی و رانندگی، فقط مالک خودرو می تواند پشت فرمان " +
                        "این اتومبیل ها بنشیند و درصورت مشاهده تخلف، اتومبیل توقیف می شود" +
                        " (هرچند که در حال حاضر انجام این تخلفات به امری عادی تبدیل شده " +
                        "است!) چندی پیش سرهنگ علی رضا جهانگیری اعلام کرده بود : “رانندگی" +
                        " با خودروهای گذر موقت تنها برای وارد کننده یا شخصی که اسم او در" +
                        " هنگام ورود خودرو به عنوان راننده به گمرک داده شده، مجاز است. این" +
                        " خودروها به هیچ عنوان قابل واگذاری به غیر نیستند و رانندگی دیگران " +
                        "با آنها تخلف محسوب می شود بعد از اتمام مدت پلاک، مالک خودرو یک ماه " +
                        "فرصت دارد که اتومبیل را از کشور خارج کند و در این یک ماه به ازای " +
                        "هر روز دیرکرد باید مبلغ مشخصی را بابت جریمه پرداخت کند اما بعد از" +
                        " اتمام این فرصت یک ماهه اگر خودرو از کشور خارج نشده باشد به عنوان" +
                        " کالای قاچاق توقیف می شود. حال اگر بخواهید دوباره از خودروی موردنظر" +
                        " استفاده کنید باید بعد از خروج آن از کشور دوباره مراحل قانونی را " +
                        "طی کرده و پس از گذشت مدت زمانی مشخص برای واردات مجدد آن اقدام کنید ");
            }else {txt_view.setPadding(0,0,0,0);}

            if (edt_txt2.getText().equals("ث")) {
                txt_view.setText("پلاک های سبز با حرف (ث) متعلق به سپاه پاسداران است");
            }
            if (edt_txt2.getText().equals("ع")) {
                txt_view.setText("پلاک های زرد با حرف (ع) متعلق به خودرو های حمل و نقل عمومی است");
            }
            if (edt_txt2.getText().equals("ش")) {
                txt_view.setText("پلاک های آبی با حرف (ش) متعلق به خودرو های ارتشی(نیروی دریایی و هوایی) است " +
                        "پلاک های خاکی یا کرم رنگ با حرف (ش) متعلق به نیروی زمینی ارتش است");
            }
            if (edt_txt2.getText().equals("ز")) {
                txt_view.setText("پلاک های آبی با حرف (ز) متعلق به وزارت دفاع است");

            }
            if (edt_txt2.getText().equals("ک")) {
                txt_view.setText("پلاک های زرد با حرف (ک) متعلق ادوات کشاورزی است");

            }
            if (edt_txt2.getText().equals("S")) {
                txt_view.setText("پلاک های آبی با حرف (S) متعلق به خودرو های سفارت خانه ها است");

            }
            if (edt_txt2.getText().equals("D")) {
                txt_view.setText("پلاک های آبی با حرف (D) متعلق به خودرو های سیاسی و دیپلمات ها است");

            }
            if (edt_txt2.getText().equals("تشریفات" +
                    "" +
                    " Protocol ")) {
                txt_view.setText("پلاک های قرمز با حرف (تشریفات) متعلق به خودرو های تشریفات دولتی است");

            }
        }
    }

    private void edt_text(View vi) {
        PopupMenu pop = new PopupMenu(getContext(), vi);
        pop.getMenuInflater().inflate(R.menu.taxy, pop.getMenu());
        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item1:
                        edt_txt2.setText("ف");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item2:
                        edt_txt2.setText("ژ");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item3:
                        edt_txt2.setText("الف");
                        edt_txt2.setTextSize(40);
                        break;
                    case R.id.item4:
                        edt_txt2.setText("ت");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item5:
                        edt_txt2.setText("پ");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item7:
                        edt_txt2.setText("گ");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item8:
                        edt_txt2.setText("ث");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item9:
                        edt_txt2.setText("ع");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item10:
                        edt_txt2.setText("ش");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item11:
                        edt_txt2.setText("ز");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item12:
                        edt_txt2.setText("ک");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item13:
                        edt_txt2.setText("S");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item14:
                        edt_txt2.setText("D");
                        edt_txt2.setTextSize(50);
                        break;
                    case R.id.item16:
                        edt_txt2.setText("تشریفات" +
                                " Protocol ");
                        edt_txt2.setTextSize(11);
                }
                return false ;
            }
        });
        pop.show();
    }
}