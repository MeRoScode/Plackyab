package com.example.plac;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.plac.View.fonts;

public class Speciall_Placks extends Fragment implements View.OnClickListener {

    private TextView txt_view;
    private Button btn_find, btn_word;
    private ImageView imageView;
    LinearLayout linearlayout;


    public static Speciall_Placks instense() {
        Speciall_Placks fragment = new Speciall_Placks();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.speciall_placks, container, false);
        interviews(view);
        return view;


    }


    @SuppressLint("ClickableViewAccessibility")
    private void interviews(View view) {
        btn_word = view.findViewById(R.id.btn_word);
        btn_find = view.findViewById(R.id.btn_find);
        txt_view = view.findViewById(R.id.txt_view);
        imageView = view.findViewById(R.id.imageView);
        linearlayout = view.findViewById(R.id.linearlayout);

        btn_find.setOnClickListener(this);
        btn_word.setOnClickListener(this);

        btn_word.setTypeface(fonts.getTypeface(getContext(), "fonts/1_5186128406684631051.ttf"));
        txt_view.setTypeface(fonts.getTypeface(getContext(), "fonts/1_5186128406684631051.ttf"));

        txt_view.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getId() == R.id.txt_view) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
                        case MotionEvent.ACTION_UP:
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                            break;
                    }
                }
                return false;

            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_find:
                if (btn_word.getText().toString().length() > 0) {
                    startanim(linearlayout, R.anim.in_from_left);
                    startanim(btn_find, R.anim.zoom_out);
                    inter();
                    linearlayout.setVisibility(View.VISIBLE);
                } else {
                    linearlayout.setVisibility(View.GONE);
                    Toast.makeText(getContext(), "اطلاعات را وارد کنید", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_word:
                edt_text(view);
                break;

        }
    }

    private void startanim(View view, int animid) {
        Animation animation = AnimationUtils.loadAnimation(getContext(), animid);
        view.startAnimation(animation);
    }

    @SuppressLint("SetTextI18n")
    private void inter() {
        if (btn_word.getText() != null) {

            if (btn_word.getText().equals("ف")) {
                txt_view.setText("پلاک های آبی با حرف (ف) متعلق به ستاد کل نیرو های مسلح جمهوری اسلامی ایران است");
            }
            if (btn_word.getText().equals("ژ")) {
                txt_view.setText("پلاک ویژه معلولین و جانبازا" +
                        "این پلاک معمولا بدون حروف بوده و فقط روی آن عارم مخصوص  معلولین را میزنند اما در اطلاعات کامپیوتری آن را با حرف (ژ) نشانت میدهند . دلیل طراحی این پلاک این است که اگر این اشخاص در جایی پارک کنند معلوم می شود . و قابل توجه است که این افراد بنزین و همچنین درمان ساماندهی را دارند . و در آخر که پلاک این ماشین ها سفید می باشد .");
            }
            if (btn_word.getText().equals("الف")) {
                txt_view.setText("پلاک های قرمز با حرف (الف) خودرو های انحصاری دولت اند و به ندرت در خیابان دیده میشوند");
            }
            if (btn_word.getText().equals("ت")) {
                txt_view.setText("پلاک های زرد با حرف (ت) متعلق به تاکسی ها است و همینطور به زبان لاتین و به کوچکی نیز روی حروف پلاک کلمه تاکسی نوشته شده است ");
            }
            if (btn_word.getText().equals("پ")) {
                txt_view.setText("پلاک های سبز با حرف (پ) متعلق به نیروی انتظامی،پلیس آگاهی و راهنمایی و رانندگی است");
            }
            if (btn_word.getText().equals("گ")) {
                txt_view.setPadding(0, 0, 0, 300);
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
            } else {
                txt_view.setPadding(0, 0, 0, 0);
            }

            if (btn_word.getText().equals("ث")) {
                txt_view.setText("پلاک های سبز با حرف (ث) متعلق به سپاه پاسداران است");
            }
            if (btn_word.getText().equals("ع")) {
                txt_view.setText("پلاک های زرد با حرف (ع) متعلق به خودرو های حمل و نقل عمومی است");
            }
            if (btn_word.getText().equals("ش")) {
                txt_view.setText("پلاک های آبی با حرف (ش) متعلق به خودرو های ارتشی(نیروی دریایی و هوایی) است " +
                        "پلاک های خاکی یا کرم رنگ با حرف (ش) متعلق به نیروی زمینی ارتش است");
            }
            if (btn_word.getText().equals("ز")) {
                txt_view.setText("پلاک های آبی با حرف (ز) متعلق به وزارت دفاع است");

            }
            if (btn_word.getText().equals("ک")) {
                txt_view.setText("پلاک های زرد با حرف (ک) متعلق ادوات کشاورزی است");

            }
            if (btn_word.getText().equals("S")) {
                txt_view.setText("پلاک های آبی با حرف (S) متعلق به خودرو های سفارت خانه ها است");

            }
            if (btn_word.getText().equals("D")) {
                txt_view.setText("پلاک های آبی با حرف (D) متعلق به خودرو های سیاسی و دیپلمات ها است");

            }
            if (btn_word.getText().equals("تشریفات" +
                    "" +
                    " Protocol ")) {
                txt_view.setText("پلاک های قرمز با حرف (تشریفات) متعلق به خودرو های تشریفات دولتی است");

            }
        }
    }

    private void edt_text(View vi) {
        PopupMenu pop = new PopupMenu(getContext(), vi);
        pop.getMenuInflater().inflate(R.menu.speciall_placks_menu, pop.getMenu());
        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item1:
                        btn_word.setText("ف");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item2:
                        btn_word.setText("ژ");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item3:
                        btn_word.setText("الف");
                        btn_word.setTextSize(40);
                        break;
                    case R.id.item4:
                        btn_word.setText("ت");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item5:
                        btn_word.setText("پ");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item7:
                        btn_word.setText("گ");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item8:
                        btn_word.setText("ث");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item9:
                        btn_word.setText("ع");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item10:
                        btn_word.setText("ش");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item11:
                        btn_word.setText("ز");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item12:
                        btn_word.setText("ک");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item13:
                        btn_word.setText("S");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item14:
                        btn_word.setText("D");
                        btn_word.setTextSize(50);
                        break;
                    case R.id.item16:
                        btn_word.setText("تشریفات" +
                                " Protocol ");
                        btn_word.setTextSize(11);
                }
                return false;
            }
        });
        pop.show();
    }
}