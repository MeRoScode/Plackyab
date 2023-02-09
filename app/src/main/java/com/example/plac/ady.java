package com.example.plac;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;

public class ady extends Fragment implements View.OnClickListener {


    private Button edt_txt2;
    private TextView edt_txt0;
    private EditText edt_txt4;
    private TextView txt_view;
    private TextView txt_secend;
    private TextView txt_serd;
    private TextView txt_fore;
    private TextView txt_secend1;
    private TextView txt_serd1;
    private TextView txt_fore1;
    private Button btn_find;
    private String sh = " شهرستان ";
    private String os = " از استان ";

    public static ady instense() {
        ady fragment = new ady();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ady, container, false);
        interviews(view);
        return view;
    }


    private void interviews(View view) {
        edt_txt2 = view.findViewById(R.id.edt_txt2);
        edt_txt4 = view.findViewById(R.id.edt_txt4);
        btn_find = view.findViewById(R.id.btn_find);
        txt_view = view.findViewById(R.id.txt_view);
        txt_secend = view.findViewById(R.id.txt_secend);
        txt_serd = view.findViewById(R.id.txt_serd);
        txt_fore = view.findViewById(R.id.txt_fore);
        txt_serd1 = view.findViewById(R.id.txt_serd1);
        txt_secend1 = view.findViewById(R.id.txt_secend1);
        txt_fore1 = view.findViewById(R.id.txt_fore1);

        edt_txt2.setTypeface(fonts.getTypeface(getContext(), "fonts/1_5186128406684631051.ttf"));
        edt_txt4.setTypeface(fonts.getTypeface(getContext(), "fonts/1_5186128406684631051.ttf"));


        btn_find.setOnClickListener(this);
        edt_txt2.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_find:
                anim();
                inter();
                padding();
                edt_txt4.setText("");
                edt_txt2.setText("");
                onpadding();
                break;
            case R.id.edt_txt2:
                edt_text(view);
        }
    }

    private void padding() {

        if (!txt_view.getText().equals("")) {
            txt_view.setPadding(11, 11, 11, 11);
            txt_view.setWidth(7300);
        }
        if (!txt_secend.getText().equals("")) {
            txt_secend.setPadding(11, 11, 11, 11);
            txt_secend.setWidth(7300);
        }
        if (!txt_serd.getText().equals("")) {
            txt_serd.setPadding(11, 11, 11, 11);
            txt_serd.setWidth(7300);
        }
        if (!txt_fore.getText().equals("")) {
            txt_fore.setPadding(11, 11, 11, 11);
            txt_fore.setWidth(7300);
        }
        if (!txt_fore1.getText().equals("")) {
            txt_fore1.setPadding(11, 11, 11, 11);
            txt_fore1.setWidth(7300);
        }
        if (!txt_secend1.getText().equals("")) {
            txt_secend1.setPadding(11, 11, 11, 11);
            txt_secend1.setWidth(7300);
        }
        if (!txt_serd1.getText().equals("")) {
            txt_serd1.setPadding(11, 11, 11, 11);
            txt_serd1.setWidth(7300);
        }
    }

    private void onpadding() {

        if (txt_view.getText().equals("")) {
            txt_view.setPadding(0, 0, 0, 0);
            txt_view.setWidth(0);
            txt_view.setHeight(0);

        }
        if (txt_secend.getText().equals("")) {
            txt_secend.setPadding(0, 0, 0, 0);
            txt_secend.setWidth(0);
            txt_secend.setHeight(0);
        }
        if (txt_serd.getText().equals("")) {
            txt_serd.setPadding(0, 0, 0, 0);
            txt_serd.setWidth(0);
            txt_serd.setHeight(0);
        }
        if (txt_fore.getText().equals("")) {
            txt_fore.setPadding(0, 0, 0, 0);
            txt_fore.setWidth(0);
            txt_fore.setHeight(0);
        }
        if (txt_fore1.getText().equals("")) {
            txt_fore1.setPadding(0, 0, 0, 0);
            txt_fore1.setWidth(0);
            txt_fore1.setHeight(0);
        }
        if (txt_secend1.getText().equals("")) {
            txt_secend1.setPadding(0, 0, 0, 0);
            txt_secend1.setWidth(0);
            txt_secend1.setHeight(0);
        }
        if (txt_serd1.getText().equals("")) {
            txt_serd1.setPadding(0, 0, 0, 0);
            txt_serd1.setWidth(0);
            txt_serd1.setHeight(0);
        }
    }

    private void anim() {
        startanim(btn_find, R.anim.zoom_out);
        startanim(txt_view, R.anim.in_from_right);
        startanim(txt_secend, R.anim.in_from_right);
        startanim(txt_serd, R.anim.in_from_right);
        startanim(txt_fore, R.anim.in_from_right);
        startanim(txt_secend1, R.anim.in_from_right);
        startanim(txt_serd1, R.anim.in_from_right);
        startanim(txt_fore1, R.anim.in_from_right);
    }

    private void startanim(View view, int animid) {
        Animation animation = AnimationUtils.loadAnimation(getContext(), animid);
        view.startAnimation(animation);
    }


    public void inter() {
        String txt2 = edt_txt2.getText().toString();
        String txt4 = edt_txt4.getText().toString().trim();

            /*شهریار،ملارد،قدس*/
            if (txt4.trim().equals("78") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + "  ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }

            if (txt4.trim().equals("78") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }

            if (txt4.trim().equals("21") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("21") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("21") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("21") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("38") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("38") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("38") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("30") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("30") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("30") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " شهریار " + os + "تهران");
                txt_secend.setText(sh + " ملارد " + os + "تهران");
                txt_serd.setText(sh + " قدس " + os + "تهران");
            }
            if (txt4.trim().equals("83") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "آباده" + os + "فارس");
                txt_secend.setText(sh + "بوانات" + os + "فارس");
            }
            if (txt4.trim().equals("93") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText(sh + "کازرون" + os + "فارس");
            }
            if (txt4.trim().equals("43") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "تیران" + os + "اصفهان");
                txt_secend.setText(sh + "کرون" + os + "اصفهان");
            }
            if (txt4.trim().equals("67") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "لنجان" + os + "اصفهان");
                txt_secend.setText(sh + "فلاورجان" + os + "اصفهان");
            }
            if (txt4.trim().equals("23") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "کاشان" + os + "اصفهان");
                txt_secend.setText(sh + "خوانسار" + os + "اصفهان");
            }
            if (txt4.trim().equals("42") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "گناباد" + os + "خراسان رضوی");
                txt_secend.setText(sh + "رشتخوار" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("32") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "تربت حیدریه" + os + "خراسان رضوی");
                txt_secend.setText(sh + "قائن " + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("42") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "تربت حیدریه" + os + "خراسان رضوی");
                txt_secend.setText(sh + "کلات" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("42") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "سبزوار" + os + "خراسان رضوی");
                txt_secend.setText(sh + "جاجرم" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("32") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "نیشابور" + os + "خراسان رضوی");
                txt_secend.setText(sh + "نهبندان" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("32") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText(sh + "فردوس" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("93") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText(sh + "کازرون" + os + "فارس");
                txt_serd.setText(sh + "مرودشت" + os + "فارس");
                txt_fore.setText(sh + "فیروزآباد" + os + "فارس");
            }
            if (txt4.trim().equals("83") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText(sh + "کازرون" + os + "فارس");
                txt_serd.setText(sh + "مرودشت" + os + "فارس");
                txt_fore.setText(sh + "فیروزآباد" + os + "فارس");
                txt_secend1.setText(sh + "ارسنجان" + os + "فارس");
            }
            if (txt4.trim().equals("83") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText(sh + "کازرون" + os + "فارس");
                txt_serd.setText(sh + "مرودشت" + os + "فارس");
                txt_secend1.setText(sh + "ارسنجان" + os + "فارس");
                txt_serd1.setText(sh + "زرین دشت" + os + "فارس");
                txt_fore.setText(sh + "فیروزآباد" + os + "فارس");
            }
            if (txt4.trim().equals("83") && txt2.trim().equals("ط")) {
                txt_view.setText("شیراز و کازرون و مرودشت و فیروزآباد و ارسنجان و زرین دشت  و خرمبید مشترک");
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText(sh + "کازرون" + os + "فارس");
                txt_serd.setText(sh + "مرودشت" + os + "فارس");
                txt_fore.setText(sh + "فیروزآباد" + os + "فارس");
                txt_secend1.setText(sh + "کازرون" + os + "فارس");
                txt_serd1.setText(sh + "مرودشت" + os + "فارس");
                txt_fore1.setText(sh + "فیروزآباد" + os + "فارس");
            }
            if (txt4.trim().equals("42") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText(sh + "سربیشه" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("42") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText(sh + "مانه" + os + "خراسان رضوی");
                txt_serd.setText(sh + "سملقان" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("42") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText(sh + "اسفراین" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("42") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText(sh + "شیروان" + os + "خراسان رضوی");
            }
            if (txt4.trim().equals("83") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "داراب" + os + "فارس");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " ورزقان" + os + "آذربایجان شرقی");
                txt_secend.setText(sh + " بناب" + os + "آذربایجان شرقی");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " عجب شير" + os + "آذربایجان شرقی");
                txt_secend.setText(sh + " بناب" + os + "آذربایجان شرقی");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText(sh + " چاراویماق" + os + "آذربایجان شرقی");
            }
            if (txt4.trim().equals("34") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "شوش" + os + "خوزستان");
                txt_secend.setText(sh + "باغملک" + os + "خوزستان");
            }
            if (txt4.trim().equals("34") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "اندیمشک" + os + "خوزستان");
                txt_secend.setText(sh + "لالی" + os + "خوزستان");
            }
            if (txt4.trim().equals("24") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "آبادان" + os + "خوزستان");
                txt_secend.setText(sh + "دشت آزادگان" + os + "خوزستان");
            }
            if (txt4.trim().equals("24") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "ماهشهر" + os + "خوزستان");
                txt_secend.setText(sh + "شادگان" + os + "خوزستان");
            }
            if (txt4.trim().equals("34") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "خرمشهر" + os + "خوزستان");
                txt_secend.setText(sh + "هندیجان" + os + "خوزستان");
            }
            if (txt4.trim().equals("91") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "مشکین شهر" + os + "اردبیل");
                txt_secend.setText(sh + "نمین" + os + "اردبیل");
            }
            if (txt4.trim().equals("91") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "اردبیل" + os + "اردبیل");
                txt_secend.setText(sh + "پارس آباد" + os + "اردبیل");
            }
            if (txt4.trim().equals("91") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "اردبیل" + os + "اردبیل");
                txt_secend.setText(sh + "پارس آباد" + os + "اردبیل");
                txt_serd.setText(sh + "کوثر" + os + "اردبیل");
            }
            if (txt4.trim().equals("91") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "اردبیل" + os + "اردبیل");
                txt_secend.setText(sh + "پارس آباد " + os + "اردبیل");
                txt_serd.setText(sh + "کوثر" + os + "اردبیل");
                txt_fore.setText(sh + "نیر" + os + "اردبیل");
            }
            if (txt4.trim().equals("41") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "دورود" + os + "لرستان");
                txt_secend.setText(sh + "کوهدشت" + os + "لرستان");
            }
            if (txt4.trim().equals("72") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "نور" + os + "مازندران");
                txt_secend.setText(sh + "جویبار" + os + "مازندران");
            }
            if (txt4.trim().equals("30") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " ورامین " + os + "تهران");
                txt_secend.setText(sh + " پاکدشت " + os + "تهران");
            }
            if (txt4.trim().equals("78") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "ساوجبلاغ(هشتگرد)" + os + "البرز");
                txt_secend.setText(sh + "طالقان" + os + "البرز");
                txt_serd.setText(sh + "نظر آباد" + os + "البرز");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " ورزقان" + os + "آذربایجان شرقی");
                txt_secend.setText(sh + " بناب" + os + "آذربایجان شرقی");
            } else {
                txt_secend.setText("");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " عجب شير" + os + "آذربایجان شرقی");
                txt_secend.setText(sh + " بناب" + os + "آذربایجان شرقی");
            } else {
                txt_secend.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "مهریز" + os + "یزد");
                txt_secend.setText(sh + "بهاباد" + os + "یزد");
            }

            if (txt4.trim().equals("11") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("11") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("11") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("11") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/

            if (txt4.trim().equals("22") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("22") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("33") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/

            if (txt4.trim().equals("44") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("44") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("س")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " تهران " + os + "تهران");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("55") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/

            if (txt4.trim().equals("66") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("د")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " تهران " + os + "تهران");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("م")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " تهران " + os + "تهران");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("66") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("77") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/

            if (txt4.trim().equals("88") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("م")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " تهران " + os + "تهران");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("88") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("99") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*تهران بزرگ*/
            if (txt4.trim().equals("10") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/

            if (txt4.trim().equals("20") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("20") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("20") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("ب")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " تهران " + os + "تهران");
            }
            if (txt4.trim().equals("40") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*تهران بزرگ*/
            if (txt4.trim().equals("40") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تهران " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*رباط کریم*/
            if (txt4.trim().equals("78") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " رباط کریم " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*رباط کریم*/
            if (txt4.trim().equals("78") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " رباط کریم " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*رباط کریم*/
            if (txt4.trim().equals("21") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " رباط کریم " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*رباط کریم*/
            if (txt4.trim().equals("21") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " رباط کریم " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*رباط کریم*/
            if (txt4.trim().equals("38") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " رباط کریم " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*رباط کریم*/
            if (txt4.trim().equals("30") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " رباط کریم" + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*رباط کریم*/
            if (txt4.trim().equals("30") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " رباط کریم" + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ورامین*/
            if (txt4.trim().equals("78") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " ورامین " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*ورامین*/
            if (txt4.trim().equals("21") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " ورامین " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*ورامین*/
            if (txt4.trim().equals("21") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " ورامین " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*ورامین*/
            if (txt4.trim().equals("38") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " ورامین " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*ورامین*/
            /*اسلام شهر*/
            if (txt4.trim().equals("78") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " اسلام شهر " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*اسلام شهر*/
            if (txt4.trim().equals("21") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " اسلام شهر " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*اسلام شهر*/
            if (txt4.trim().equals("38") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " اسلام شهر " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*اسلام شهر*/
            if (txt4.trim().equals("30") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " اسلام شهر " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*اسلام شهر*/
            if (txt4.trim().equals("78") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " اسلام شهر " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*پاکدشت*/
            if (txt4.trim().equals("21") && txt2.trim().equals("ن")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " پاکدشت " + os + "تهران");
            }/*پاکدشت*/
            if (txt4.trim().equals("78") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " پاکدشت " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دماوند*/
            if (txt4.trim().equals("21") && txt2.trim().equals("ی")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " دماوند " + os + "تهران");
            }/*دماوند*/
            if (txt4.trim().equals("30") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " دماوند " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*دماوند*/
            if (txt4.trim().equals("78") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " دماوند " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فیروزکوه*/
            if (txt4.trim().equals("78") && txt2.trim().equals("ق")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " فیروزکوه " + os + "تهران");
            }
            /*ری*/
            if (txt4.trim().equals("78") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " ری " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شمیرانات*/
            if (txt4.trim().equals("78") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " شمیرانات " + os + "تهران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }



            /*مشهد*/
            if (txt4.trim().equals("12") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("12") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            } /*مشهد*/
            if (txt4.trim().equals("12") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("36") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("36") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("36") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            if (txt4.trim().equals("74") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("36") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }/*مشهد*//*مشهد*/
            if (txt4.trim().equals("36") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("36") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("36") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("36") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "مشهد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*نیشابور*/
            if (txt4.trim().equals("32") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "نیشابور" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            if (txt4.trim().equals("36") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "نیشابور" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("74") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "نیشابور" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*سبزوار*/
            if (txt4.trim().equals("32") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "سبزوار" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سبزوار*/
            if (txt4.trim().equals("36") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "سبزوار" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سبزوار*/
            if (txt4.trim().equals("74") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "سبزوار" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*تربت حیدریه*/
            if (txt4.trim().equals("32") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "تربت حیدریه" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تربت حیدریه*/
            /*تربت حیدریه*/
            if (txt4.trim().equals("36") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "تربت حیدریه" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تربت حیدریه*/

            /*تربت جام*/
            if (txt4.trim().equals("36") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "تربت جام" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تربت جام*/
            if (txt4.trim().equals("32") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "تربت جام" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کاشمر*/
            if (txt4.trim().equals("32") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "کاشمر" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کاشمر*/
            if (txt4.trim().equals("36") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کاشمر" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*قوچان*/
            if (txt4.trim().equals("32") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "قوچان" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قوچان*/
            if (txt4.trim().equals("74") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "قوچان" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*گناباد*/
            if (txt4.trim().equals("32") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "گناباد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گناباد*/

            /*تایباد*/
            if (txt4.trim().equals("32") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "تایباد" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فریمان*/
            if (txt4.trim().equals("42") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "فریمان" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سرخس*/
            if (txt4.trim().equals("42") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "سرخس" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*درگز*/
            if (txt4.trim().equals("42") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "درگز" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خواف*/
            if (txt4.trim().equals("42") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "خواف" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*چناران*/
            if (txt4.trim().equals("42") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "چناران" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بردسکن*/
            if (txt4.trim().equals("42") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "بردسکن" + os + "خراسان رضوی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ن")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("13") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ب")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اصفهان*/
            if (txt4.trim().equals("67") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "اصفهان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*شاهین شهر*/
            if (txt4.trim().equals("43") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "شاهین شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شاهین شهر*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "شاهین شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شاهین شهر*/
            if (txt4.trim().equals("53") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "شاهین شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شاهین شهر*/
            if (txt4.trim().equals("67") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "شاهین شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*نجف آباد*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "نجف آباد" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نجف آباد*/
            if (txt4.trim().equals("43") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "نجف آباد" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نجف آباد*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "نجف آباد" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نجف آباد*/
            if (txt4.trim().equals("67") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "نجف آباد" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کاشان*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "کاشان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کاشان*/
            if (txt4.trim().equals("43") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "کاشان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کاشان*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "کاشان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کاشان*/

            /*خمینی شهر*/
            if (txt4.trim().equals("23") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "خمینی شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*خمینی شهر*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "خمینی شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خمینی شهر*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "خمینی شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*لنجان*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "لنجان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لنجان*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "لنجان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لنجان*/

            /*فلاور جان*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "فلاورجان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فلاور جان*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "فلاورجان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*شهررضا*/
            if (txt4.trim().equals("23") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "شهررضا" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شهررضا*/
            if (txt4.trim().equals("53") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "شهررضا" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*مبارکه*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "مبارکه" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مبارکه*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "مبارکه" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*گلپایگان*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "گلپایگان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نطنز*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "اردستان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اردستان*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "اردستان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نائین*/
            if (txt4.trim().equals("23") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "نائین" + os + "اصفهان");
            }
            /*سمیرم*/
            if (txt4.trim().equals("23") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "سمیرم" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فریدون شهر*/
            if (txt4.trim().equals("23") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "فریدون شهر" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آران وبیدگل*/
            if (txt4.trim().equals("43") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "آران وبیدگل" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فریدون*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "فریدون" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*دهاقان*/
            if (txt4.trim().equals("43") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "دهاقان" + os + "اصفهان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("63") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ج")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "شیراز" + os + "فارس");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "شیراز" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شیراز*/
            /*کازرون*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ص")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "کازرون" + os + "فارس");
            }
            /*کازرون*/
            if (txt4.trim().equals("83") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "کازرون" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*مرودشت*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "مرودشت" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مرودشت*/
            if (txt4.trim().equals("83") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "مرودشت" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*فیروزآباد*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "فیروزآباد" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*لارستان*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "لارستان" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لارستان*/
            if (txt4.trim().equals("83") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "لارستان" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لارستان*/
            if (txt4.trim().equals("93") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "لارستان" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*جهرم*/
            if (txt4.trim().equals("83") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "جهرم" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جهرم*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "جهرم" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*فسا*/
            if (txt4.trim().equals("73") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "فسا" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فسا*/
            if (txt4.trim().equals("83") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "فسا" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*داراب*/
            if (txt4.trim().equals("73") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "داراب" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آباده*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "آباده" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نورآباد ممسنی*/
            if (txt4.trim().equals("83") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "نورآباد ممسنی" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*لامرد*/
            if (txt4.trim().equals("73") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "لامرد" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نی ریز*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "استهبان" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استهبان*/
            if (txt4.trim().equals("73") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "استهبان" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اقلید*/
            if (txt4.trim().equals("73") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "اقلید" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قیر و کارزین*/
            if (txt4.trim().equals("83") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "قیر و کارزین" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فراشبند*/
            if (txt4.trim().equals("83") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "فراشبند" + os + "فارس");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("68") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرج*/
            if (txt4.trim().equals("21") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "کرج" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*هشتگرد*/
            /*هشتگرد*/
            if (txt4.trim().equals("21") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "هشتگرد" + os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("38") && txt2.trim().equals("ب")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*استان البرز*/
            if (txt4.trim().equals("38") && txt2.trim().equals("د")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("38") && txt2.trim().equals("س")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("38") && txt2.trim().equals("م")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("38") && txt2.trim().equals("ن")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("38") && txt2.trim().equals("ه")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("38") && txt2.trim().equals("ی")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("30") && txt2.trim().equals("د")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("30") && txt2.trim().equals("س")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("30") && txt2.trim().equals("ل")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان البرز*/
            if (txt4.trim().equals("30") && txt2.trim().equals("م")) {
                txt_view.setText(os + "البرز");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("14") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهوار*/
            if (txt4.trim().equals("34") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "اهواز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دزفول*/
            if (txt4.trim().equals("24") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "دزفول" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دزفول*/
            if (txt4.trim().equals("34") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "دزفول" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دزفول*/
            if (txt4.trim().equals("34") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "دزفول" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ماهشهر*/
            if (txt4.trim().equals("24") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "ماهشهر" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ماهشهر*/


            /*ماهشهر*/
            if (txt4.trim().equals("34") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "ماهشهر" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آبادان*/
            if (txt4.trim().equals("24") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "آبادان" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آبادان*/
            /*آبادان*/
            if (txt4.trim().equals("34") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "آبادان" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بهبهان*/
            if (txt4.trim().equals("24") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "بهبهان" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بهبهان*/
            if (txt4.trim().equals("34") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "بهبهان" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شوشتر*/
            if (txt4.trim().equals("24") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "شوشتر" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شوشتر*/
            if (txt4.trim().equals("34") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "شوشتر" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اندیمشک*/
            if (txt4.trim().equals("24") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "اندیمشک" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اندیمشک*/
            /*شوش*/
            if (txt4.trim().equals("24") && txt2.trim().equals("و")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "شوش" + os + "خوزستان");
            }
            /*شوش*/
            /*خرمشهر*/
            if (txt4.trim().equals("24") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "خرمشهر" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خرمشهر*/
            /*مسجدسلیمان*/
            if (txt4.trim().equals("24") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "مسجدسلیمان" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رامهرمز*/
            if (txt4.trim().equals("24") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "رامهرمز" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ایذه*/
            if (txt4.trim().equals("24") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "ایذه" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*امیدیه*/
            if (txt4.trim().equals("34") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "امیدیه" + os + "خوزستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ل")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("م")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ن")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("و")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ه")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ب")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ج")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("د")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("س")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ص")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ط")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*استان قم*/
            if (txt4.trim().equals("16") && txt2.trim().equals("ق")) {
                txt_view.setText("استان قم");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*تاکستان*/
            if (txt4.trim().equals("89") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "تاکستان" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تاکستان*/
            if (txt4.trim().equals("89") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "تاکستان" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بویین ژهرا*/
            if (txt4.trim().equals("89") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بویین ژهرا" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آبیک*/
            if (txt4.trim().equals("89") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "آبیک" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }



            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
            }
            sor();
        }

    public void sor () {

            String txt2 = edt_txt2.getText().toString().trim();
            String txt4 = edt_txt4.getText().toString().trim();


            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*همدان*/
            if (txt4.trim().equals("18") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*ملایر*/
            if (txt4.trim().equals("28") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "همدان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ملایر*/
            if (txt4.trim().equals("28") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "ملایر" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ملایر*/
            if (txt4.trim().equals("28") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "ملایر" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نهاوند*/
            if (txt4.trim().equals("28") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "نهاوند" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نهاوند*/
            if (txt4.trim().equals("28") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "نهاوند" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تویسرکان*/
            if (txt4.trim().equals("28") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "تویسرکان" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کبودرآهنگ*/
            if (txt4.trim().equals("28") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "کبودرآهنگ" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رزن*/
            if (txt4.trim().equals("28") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "رزن" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بهار*/
            if (txt4.trim().equals("28") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "بهار" + os + "همدان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسدآباد*/
            if (txt4.trim().equals("28") && txt2.trim().equals("ق")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "اسدآباد" + os + "همدان");
            }
            /*اراک*/
            if (txt4.trim().equals("47") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "اراک" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*اراک*/
            if (txt4.trim().equals("47") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "اراک" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اراک*/
            if (txt4.trim().equals("47") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "اراک" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اراک*/
            if (txt4.trim().equals("47") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "اراک" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اراک*/
            if (txt4.trim().equals("47") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "اراک" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اراک*/
            if (txt4.trim().equals("47") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "اراک" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                /*اراک*/
            }
            if (txt4.trim().equals("47") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اراک" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*ساوه*/
            if (txt4.trim().equals("57") && txt2.trim().equals("ب")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "ساوه" + os + "مرکزی");
            }
            /*ساوه*/
            if (txt4.trim().equals("57") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "ساوه" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ساوه*/
            if (txt4.trim().equals("57") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "ساوه" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                /*خمین*/
            }
            if (txt4.trim().equals("57") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "خمین" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شازند*/
            if (txt4.trim().equals("57") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "شازند" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*محلات*/
            if (txt4.trim().equals("57") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "محلات" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تفرش*/
            if (txt4.trim().equals("57") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "تفرش" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دلیجان*/
            if (txt4.trim().equals("57") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "دلیجان" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آشتیان*/
            if (txt4.trim().equals("57") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "آشتیان" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زرندیه*/
            if (txt4.trim().equals("57") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "زرندیه" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کمیجان*/
            if (txt4.trim().equals("57") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "کمیجان" + os + "مرکزی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*بندرعباس*/
            if (txt4.trim().equals("84") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بندرعباس" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بندرعباس*/
            if (txt4.trim().equals("84") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "بندرعباس" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بندرعباس*/
            if (txt4.trim().equals("84") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "بندرعباس" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بندرعباس*/
            if (txt4.trim().equals("84") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "بندرعباس" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بندرعباس*/
            if (txt4.trim().equals("84") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "بندرعباس" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بندرعباس*/
            if (txt4.trim().equals("84") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "بندرعباس" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بندرعباس*/
            if (txt4.trim().equals("84") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "بندرعباس" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*میناب*/
            if (txt4.trim().equals("94") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "میناب" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*میناب*/
            if (txt4.trim().equals("94") && txt2.trim().equals("م")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "میناب" + os + "هرمزگان");
            }
            /*لنگه*/
            if (txt4.trim().equals("94") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "لنگه" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لنگه*/
            if (txt4.trim().equals("94") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "لنگه" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رودان*/
            if (txt4.trim().equals("94") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "رودان" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ابوموسی*/
            if (txt4.trim().equals("94") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "ابوموسی" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جاسک*/
            if (txt4.trim().equals("94") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "جاسک" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بستک*/
            if (txt4.trim().equals("94") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "بستک" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*حاجی آباد*/
            if (txt4.trim().equals("94") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "حاجی آباد" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قشم*/
            if (txt4.trim().equals("94") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "قشم" + os + "هرمزگان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*اردبیل*/
            if (txt4.trim().equals("91") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اردبیل" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اردبیل*/
            if (txt4.trim().equals("91") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "اردبیل" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اردبیل*/
            if (txt4.trim().equals("91") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "اردبیل" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اردبیل*/
            if (txt4.trim().equals("91") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "اردبیل" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اردبیل*/

            /*پارس آباد*/
            if (txt4.trim().equals("91") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "پارس آباد" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مشکین شهر*/
            if (txt4.trim().equals("91") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "مشکین شهر" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مشکین شهر*/
            /*خلخالی*/
            if (txt4.trim().equals("91") && txt2.trim().equals("ص")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "خلخالی" + os + "اردبیل");
            }
            /*گرمی*/
            if (txt4.trim().equals("91") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "گرمی" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بیله سوار*/
            if (txt4.trim().equals("91") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "بیله سوار" + os + "اردبیل");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*ساری*/
            if (txt4.trim().equals("62") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "ساری" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ساری*/
            if (txt4.trim().equals("62") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "ساری" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ساری*/
            if (txt4.trim().equals("62") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "ساری" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ساری*/
            if (txt4.trim().equals("62") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "ساری" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ساری*/
            if (txt4.trim().equals("62") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "ساری" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ساری*/
            if (txt4.trim().equals("62") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "ساری" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*بابل*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بابل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بابل*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "ساری" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بابل*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "بابل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بابل*/
            if (txt4.trim().equals("82") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "بابل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بابل*/
            if (txt4.trim().equals("92") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بابل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بابل*/
            if (txt4.trim().equals("92") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "بابل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آمل*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ب")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "آمل" + os + "مازندران");
            }
            /*آمل*/
            if (txt4.trim().equals("82") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "آمل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آمل*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "آمل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آمل*/
            if (txt4.trim().equals("92") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "آمل" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قائمشهر*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "قائمشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قائمشهر*/
            if (txt4.trim().equals("82") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "قائمشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قائمشهر*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "قائمشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قائمشهر*/
            if (txt4.trim().equals("92") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "قائمشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تنکابن*/
            if (txt4.trim().equals("72") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "تنکابن" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تنکابن*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "تنکابن" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تنکابن*/
            if (txt4.trim().equals("92") && txt2.trim().equals("د")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "تنکابن" + os + "مازندران");
            }
            /*بابلسر*/
            if (txt4.trim().equals("72") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "بابلسر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بابلسر*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "بابلسر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*چالوس*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "چالوس" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*چالوس*/
            if (txt4.trim().equals("82") && txt2.trim().equals("و")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "چالوس" + os + "مازندران");
            }
            /*بهشهر*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "بهشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بهشهر*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "بهشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نوشهر*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "نوشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نوشهر*/
            if (txt4.trim().equals("82") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "نوشهر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نور*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "نور" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نور*/
            /*رامسر*/
            if (txt4.trim().equals("72") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "رامسر" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*محمودآباد*/
            if (txt4.trim().equals("72") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "محمودآباد" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نکا*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "نکا" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سوادکوه*/
            if (txt4.trim().equals("72") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "سوادکوه" + os + "مازندران");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*زاهدان*/
            if (txt4.trim().equals("85") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "زاهدان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زاهدان*/
            if (txt4.trim().equals("85") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "زاهدان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زاهدان*/
            if (txt4.trim().equals("85") && txt2.trim().equals("د")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "زاهدان" + os + "سیستان و بلوچستان");
            }
            /*زاهدان*/
            if (txt4.trim().equals("85") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "زاهدان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زاهدان*/
            if (txt4.trim().equals("85") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "زاهدان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زاهدان*/
            if (txt4.trim().equals("85") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "زاهدان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*زابل*/
            if (txt4.trim().equals("95") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "زابل" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زابل*/
            if (txt4.trim().equals("95") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "زاهدان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زابل*/
            if (txt4.trim().equals("95") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "زابل" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*ایرانشهر*/
            if (txt4.trim().equals("95") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "ایرانشهر" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ایرانشهر*/
            if (txt4.trim().equals("95") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "ایرانشهر" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*سراوان*/
            if (txt4.trim().equals("95") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "سراوان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سراوان*/
            if (txt4.trim().equals("95") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "سراوان" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*نیکشهر*/
            if (txt4.trim().equals("95") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "نیکشهر" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خاش*/
            if (txt4.trim().equals("95") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "خاش" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سرباز*/
            if (txt4.trim().equals("95") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "سرباز" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*چابهار*/
            if (txt4.trim().equals("95") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "چابهار" + os + "سیستان و بلوچستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*زنجان*/
            if (txt4.trim().equals("87") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "زنجان" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زنجان*/
            if (txt4.trim().equals("87") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "زنجان" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زنجان*/
            if (txt4.trim().equals("87") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "زنجان" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زنجان*/
            if (txt4.trim().equals("87") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "زنجان" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زنجان*/
            if (txt4.trim().equals("87") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "زنجان" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زنجان*/
            if (txt4.trim().equals("87") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "زنجان" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ابهر*/
            if (txt4.trim().equals("97") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "ابهر" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ابهر*/
            if (txt4.trim().equals("97") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "ابهر" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*خدابنده*/
            if (txt4.trim().equals("97") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "خدابنده" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خرمدره*/
            if (txt4.trim().equals("97") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "خرمدره" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ایجرود*/
            if (txt4.trim().equals("97") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "ایجرود" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*طارم*/
            if (txt4.trim().equals("97") && txt2.trim().equals("ص")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "طارم" + os + "زنجان");
            }
            /*ماه نشان*/
            if (txt4.trim().equals("97") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "ماه نشان" + os + "زنجان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*سنندج*/
            if (txt4.trim().equals("51") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "سنندج" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سنندج*/
            if (txt4.trim().equals("51") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "سنندج" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سنندج*/
            if (txt4.trim().equals("51") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "سنندج" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سنندج*/
            if (txt4.trim().equals("51") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "سنندج" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سنندج*/
            if (txt4.trim().equals("51") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "سنندج" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*سقز*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "سقز" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سقز*/
            if (txt4.trim().equals("61") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "سقز" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*قروه*/
            if (txt4.trim().equals("61") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "قروه" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قروه*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "قروه" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مریوان*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "مریوان" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مریوان*/
            if (txt4.trim().equals("61") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "مریوان" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بانه*/
            if (txt4.trim().equals("61") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "بانه" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بانه*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "بانه" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بیجار*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بیجار" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دیواندره*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "دیواندره" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کامیاران*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کامیاران" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سروآباد*/
            if (txt4.trim().equals("61") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "سروآباد" + os + "کردستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*خرم آباد*/
            if (txt4.trim().equals("31") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "خرم آّباد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خرم آباد*/
            if (txt4.trim().equals("31") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "خرم آّباد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خرم آباد*/
            if (txt4.trim().equals("31") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "خرم آّباد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خرم آباد*/
            if (txt4.trim().equals("31") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "خرم آّباد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خرم آباد*/
            if (txt4.trim().equals("31") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "خرم آّباد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*بروجرد*/
            if (txt4.trim().equals("41") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "بروجرد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بروجرد*/
            if (txt4.trim().equals("41") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "بروجرد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بروجرد*/
            if (txt4.trim().equals("41") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "بروجرد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دورود*/
            if (txt4.trim().equals("41") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "دورود" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دورود*/
            if (txt4.trim().equals("41") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "الیگودرز" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دلفان*/
            if (txt4.trim().equals("41") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "دلفان" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ازنا*/
            if (txt4.trim().equals("41") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "ازنا" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*پل دختر*/
            if (txt4.trim().equals("41") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "پل دختر" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سلسله*/
            if (txt4.trim().equals("41") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "سلسله" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کوه دشت*/
            if (txt4.trim().equals("41") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "خرم آّباد" + os + "لرستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*گرگان*/
            if (txt4.trim().equals("59") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "گرگان" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گرگان*/
            if (txt4.trim().equals("59") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "گرگان" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گرگان*/
            if (txt4.trim().equals("59") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "گرگان" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گرگان*/
            if (txt4.trim().equals("59") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "گرگان" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گرگان*/
            if (txt4.trim().equals("59") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "گرگان" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*گنبدکاووس*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "گنبدکاووس" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گنبدکاووس*/
            if (txt4.trim().equals("69") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "گنبدکاووس" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گنبدکاووس*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "گنبدکاووس" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*بندر ترکمن*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بندر ترکمن" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کردکوی*/
            if (txt4.trim().equals("69") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "کردکوی" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*علی آباد*/
            if (txt4.trim().equals("69") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "علی آباد" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آزادشهر*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "آزادشهر" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مینودشت*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "مینودشت" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بندر گز*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "بندر گز" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رامیان*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "رامیان" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آق قلا*/
            if (txt4.trim().equals("69") && txt2.trim().equals("م")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "آق قلا" + os + "گلستان");
            }
            /*کلاله*/
            if (txt4.trim().equals("69") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "کلاله" + os + "گلستان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*شهرکرد*/
            if (txt4.trim().equals("71") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شهرکرد*/
            if (txt4.trim().equals("71") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شهرکرد*/
            if (txt4.trim().equals("71") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شهرکرد*/
            if (txt4.trim().equals("71") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شهرکرد*/
            if (txt4.trim().equals("71") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*بروجن*/
            if (txt4.trim().equals("81") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "بروجن" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بروجن*/
            if (txt4.trim().equals("81") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "بروجن" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اردل*/
            if (txt4.trim().equals("81") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "اردل" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فارسان*/
            if (txt4.trim().equals("81") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "فارسان" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لردگان*/
            if (txt4.trim().equals("81") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "لردگان" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کوهرنگ*/
            if (txt4.trim().equals("81") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "کوهرنگ" + os + "چهارمحال و بختیاری");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*بوشهر*/
            if (txt4.trim().equals("48") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "بوشهر" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بوشهر*/
            if (txt4.trim().equals("48") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بوشهر" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بوشهر*/
            if (txt4.trim().equals("48") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "بوشهر" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بوشهر*/
            if (txt4.trim().equals("48") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "بوشهر" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دشتستان*/
            if (txt4.trim().equals("58") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "دشتستان" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دشتستان*/
            if (txt4.trim().equals("58") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "دشتستان" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گناوه*/
            if (txt4.trim().equals("58") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "گناوه" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کنگان*/
            if (txt4.trim().equals("58") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "کنگان" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تنگستان*/
            if (txt4.trim().equals("58") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "تنگستان" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دشتی*/
            if (txt4.trim().equals("58") && txt2.trim().equals("ص")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "دشتی" + os + "بوشهر");
            }
            /*دیر*/
            if (txt4.trim().equals("58") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "دیر" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دیلم*/
            if (txt4.trim().equals("58") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "دیلم" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جم*/
            if (txt4.trim().equals("58") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "جم" + os + "بوشهر");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*بجنورد*/
            if (txt4.trim().equals("26") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "بجنورد" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بجنورد*/
            if (txt4.trim().equals("26") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بجنورد" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بجنورد*/
            if (txt4.trim().equals("26") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "بجنورد" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بجنورد*/
            if (txt4.trim().equals("32") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "بجنورد" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*شیروان*/
            if (txt4.trim().equals("26") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "شیروان" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسفراین*/
            if (txt4.trim().equals("26") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "اسفراین" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جاجرم*/
            if (txt4.trim().equals("26") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "جاجرم" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مانه و سلمقان*/
            if (txt4.trim().equals("26") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "مانه و سلمقان" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فاروج*/
            if (txt4.trim().equals("26") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "فاروج" + os + "خراسان شمالی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*بیرجند*/
            if (txt4.trim().equals("52") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "بیرجند" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بیرجند*/
            if (txt4.trim().equals("52") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بیرجند" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بیرجند*/
            if (txt4.trim().equals("52") && txt2.trim().equals("د")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + "بیرجند" + os + "خراسان جنوبی");
            }
            /*بیرجند*/
            if (txt4.trim().equals("32") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "بیرجند" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*قائنات*/
            if (txt4.trim().equals("52") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "قائنات" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فردوس*/
            if (txt4.trim().equals("52") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "فردوس" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نهبندان*/
            if (txt4.trim().equals("52") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "نهبندان" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سربیشه*/
            if (txt4.trim().equals("52") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "سربیشه" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*طبس*/
            if (txt4.trim().equals("64") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "طبس" + os + "خراسان جنوبی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*سمنان*/
            if (txt4.trim().equals("86") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "سمنان" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سمنان*/
            if (txt4.trim().equals("86") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "سمنان" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سمنان*/
            if (txt4.trim().equals("86") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "سمنان" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*شاهرود*/
            if (txt4.trim().equals("96") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "شاهرود" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شاهرود*/
            if (txt4.trim().equals("96") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "شاهرود" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شاهرود*/
            if (txt4.trim().equals("96") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "شاهرود" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دامغان*/
            if (txt4.trim().equals("96") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "دامغان" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گرمسار*/
            if (txt4.trim().equals("96") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "گرمسار" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مهدی شهر*/
            if (txt4.trim().equals("96") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "مهدی شهر" + os + "سمنان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*ایلام*/
            if (txt4.trim().equals("98") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "ایلام" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ایلام*/
            if (txt4.trim().equals("98") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "ایلام" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ایلام*/
            if (txt4.trim().equals("98") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "ایلام" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*مهران*/
            if (txt4.trim().equals("98") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "مهران" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*داره شهر*/
            if (txt4.trim().equals("98") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "داره شهر" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دهلران*/
            if (txt4.trim().equals("98") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "دهلران" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سیروان*/
            if (txt4.trim().equals("98") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "سیروان" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ایوان*/
            if (txt4.trim().equals("98") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "ایوان" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آبدانان*/
            if (txt4.trim().equals("98") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "آبدانان" + os + "ایلام");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*یاسوج*/
            if (txt4.trim().equals("49") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "یاسوج" + os + "کهگیلوبه و بویراحد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*یاسوج*/
            if (txt4.trim().equals("49") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "یاسوج" + os + "کهگیلوبه و بویراحد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*یاسوج*/
            if (txt4.trim().equals("49") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "یاسوج" + os + "کهگیلوبه و بویراحد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*گچساران*/
            if (txt4.trim().equals("49") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "گچساران" + os + "کهگیلوبه و بویراحد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گچساران*/
            if (txt4.trim().equals("49") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "گچساران" + os + "کهگیلوبه و بویراحد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*دهدشت*/
            if (txt4.trim().equals("49") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "دهدشت" + os + "کهگیلوبه و بویراحد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سی سخت*/
            if (txt4.trim().equals("49") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "سی سخت" + os + "کهگیلوبه و بویراحد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            if (txt4.trim().equals("15") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " تبريز" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("و")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("15") && txt2.trim().equals("ي")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("35") && txt2.trim().equals("ی")) {
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_view.setText(sh + " تبريز " + os + "آذربایجان شرقی");
            }

            /* مراغه*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " مراغه " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مرند*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " مرند " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ميانه*/
            if (txt4.trim().equals("25") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " میانه " + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اهر*/
            if (txt4.trim().equals("25") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " اهر" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سراب*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " سراب" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جلفا*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " جلفا" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*هشترود*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " هشترود" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بناب*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " بناب" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بستان آباد*/
            if (txt4.trim().equals("25") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " بستان آباد" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شبستر*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " شبستر" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کلييبر*/
            if (txt4.trim().equals("25") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " کلييبر" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*هريس*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " هريس" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آذرشهر*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ي")) {
                txt_view.setText(sh + " آذرشهر" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسکو*/
            if (txt4.trim().equals("35") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " اسکو" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ملکان*/
            if (txt4.trim().equals("35") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " ملکان" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }



            /*اروميه*/
            if (txt4.trim().equals("17") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            if (txt4.trim().equals("17") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");

            }
            if (txt4.trim().equals("17") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بوکان*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " بوکان" + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " بوکان " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مهاباد*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " مهاباد " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " مهاباد " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سردشت*/
            if (txt4.trim().equals("27") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " سردشت " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خوي*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " خوي " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " خوي " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " خوي " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سلماس*/
            if (txt4.trim().equals("27") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " سلماس " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " سلماس " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نقده*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " نقده " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " نقده " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مياندوآب*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " مياندوآب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " مياندوآب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " مياندوآب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*پيرانشهر*/
            if (txt4.trim().equals("27") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " پيرانشهر " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اشنويه*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ي")) {
                txt_view.setText(sh + " اشنويه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شاهين دژ*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " شاهين دژ " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ماکو*/
            if (txt4.trim().equals("27") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " ماکو " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " ماکو " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تکاب*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تکاب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*چالدران*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " چالدران " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسلام آباد غرب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "اسلام آباد غرب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسلام آباد غرب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اسلام آباد غرب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گیلان غرب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "گیلان غرب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سرپل ذهاب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "سرپل ذهاب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*پاوه*/
            if (txt4.trim().equals("29") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "پاوه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کنگاور*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "کنگاور" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قصر شیرین*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "قصر شیرین" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سنقر*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "سنقر" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جوانرود*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "ر" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*صحنه*/
            if (txt4.trim().equals("29") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "صحنه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*هرسین*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "هرسین" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ثلاث باباجانی*/
            if (txt4.trim().equals("29") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "ثلاث باباجانی" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }



            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کلييبر*/
            if (txt4.trim().equals("25") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " کلييبر" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*هريس*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " هريس" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آذرشهر*/
            if (txt4.trim().equals("25") && txt2.trim().equals("ي")) {
                txt_view.setText(sh + " آذرشهر" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسکو*/
            if (txt4.trim().equals("35") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " اسکو" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ورزقان*/

            if (txt4.trim().equals("35") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " ملکان" + os + "آذربایجان شرقی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }



            /*اروميه*/
            if (txt4.trim().equals("17") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("17") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " اروميه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بوکان*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " بوکا ن" + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " بوکان " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مهاباد*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " مهاباد " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " مهاباد " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سردشت*/
            if (txt4.trim().equals("27") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " سردشت " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*خوي*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " خوي " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " خوي " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " خوي " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سلماس*/
            if (txt4.trim().equals("27") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " سلماس " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " سلماس " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*نقده*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " نقده " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " نقده " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*مياندوآب*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " مياندوآب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " مياندوآب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " مياندوآب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*پيرانشهر*/
            if (txt4.trim().equals("27") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " پيرانشهر " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اشنويه*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ي")) {
                txt_view.setText(sh + " اشنويه " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شاهين دژ*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " شاهين دژ " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ماکو*/
            if (txt4.trim().equals("27") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " ماکو " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("37") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " ماکو " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تکاب*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " تکاب " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*چالدران*/
            if (txt4.trim().equals("27") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " چالدران " + os + "آذربایجان غربی");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمانشاه*/
            if (txt4.trim().equals("19") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "کرمانشاه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسلام آباد غرب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "اسلام آباد غرب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*اسلام آباد غرب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اسلام آباد غرب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*گیلان غرب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "گیلان غرب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سرپل ذهاب*/
            if (txt4.trim().equals("29") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "سرپل ذهاب" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*پاوه*/
            if (txt4.trim().equals("29") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "پاوه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کنگاور*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "کنگاور" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*قصر شیرین*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "قصر شیرین" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سنقر*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "سنقر" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جوانرود*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "ر" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*صحنه*/
            if (txt4.trim().equals("29") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "صحنه" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*هرسین*/
            if (txt4.trim().equals("29") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "هرسین" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ثلاث باباجانی*/
            if (txt4.trim().equals("29") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "ثلاث باباجانی" + os + "کرمانشاه");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }



            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رشت*/
            if (txt4.trim().equals("46") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " رشت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لاهیجان*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " لاهیجان" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لاهیجان*/
            if (txt4.trim().equals("76") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " لاهیجان" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*انزلی*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " انزلی" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*انزلی*/
            if (txt4.trim().equals("76س") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " انزلی" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لنگرود*/
            if (txt4.trim().equals("56") && txt2.trim().equals("م")) {
                txt_view.setText(sh + " لنگرود" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*لنگرود*/
            if (txt4.trim().equals("76") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " لنگرود" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تالش*/
            if (txt4.trim().equals("56") && txt2.trim().equals("س")) {
                txt_view.setText(sh + " تالش" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*تالش*/
            if (txt4.trim().equals("76") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " تالش" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رودسر*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + " رودسر" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رودسر*/
            if (txt4.trim().equals("76") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + " ر" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*آستارا*/
            if (txt4.trim().equals("56") && txt2.trim().equals("د")) {
                txt_view.setText(sh + " آستارا" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رودبار*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + " رودبار" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*صومعه سرا*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "صومعه سرا" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*فومن*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + " فومن" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رضوانشهر*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + " رضوانشهر" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*املش*/
            if (txt4.trim().equals("56") && txt2.trim().equals("و")) {
                txt_view.setText(sh + " املش" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*ماسال*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + " ماسال" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شفت*/
            if (txt4.trim().equals("56") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + " شفت" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سیاهکل*/
            if (txt4.trim().equals("76") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + " سیاهکل" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*آستانه اشرفیه*/
            if (txt4.trim().equals("76") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + " آستانه اشرفیه" + os + "گیلان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کرمان*/
            if (txt4.trim().equals("45") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "کرمان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*رفسنجان*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "رفسنجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رفسنجان*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ی")) {
                txt_view.setText(sh + "رفسنجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رفسنجان*/
            if (txt4.trim().equals("75") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "رفسنجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*رفسنجان*/
            if (txt4.trim().equals("75") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "رفسنجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*سیرجان*/
            if (txt4.trim().equals("65") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "سیرجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سیرجان*/
            if (txt4.trim().equals("75") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "سیرجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سیرجان*/
            if (txt4.trim().equals("75") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "سیرجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*سیرجان*/
            if (txt4.trim().equals("75") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "سیرجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*بم*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بم" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بم*/
            if (txt4.trim().equals("75") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "بم" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*جیرفت*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "جیرفت" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*جیرفت*/
            if (txt4.trim().equals("75") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "جیرفت" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*زرند*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "زرند" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*زرند*/
            if (txt4.trim().equals("75") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "زرند" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*کهنوج*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کهنوج" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*کهنوج*/
            if (txt4.trim().equals("75") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "کهنوج" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }

            /*بافت*/
            if (txt4.trim().equals("65") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "بافت" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*شهر بابک*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "شهر بابک" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*بردسیر*/
            if (txt4.trim().equals("65") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "بردسیر" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*منوجان*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ن")) {
                txt_view.setText(sh + "منوجان" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*عنبرآباد*/
            if (txt4.trim().equals("65") && txt2.trim().equals("و")) {
                txt_view.setText(sh + "عنبرآباد" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*راور*/
            if (txt4.trim().equals("65") && txt2.trim().equals("ه")) {
                txt_view.setText(sh + "راور" + os + "کرمان");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }


            /*یزد*/
            if (txt4.trim().equals("54") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*یزد*/
            if (txt4.trim().equals("54") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            /*یزد*/
            if (txt4.trim().equals("54") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("54") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("54") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("54") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("54") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("54") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("54") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "یزد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "اغردکان" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "تفت" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "میبد" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "مهریز" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "ابرکوه" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "خاتم" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("64") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "اشکذر" + os + "یزد");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("ل")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("م")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("ج")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("د")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("س")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("ص")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("ط")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("ق")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("79") && txt2.trim().equals("ب")) {
                txt_view.setText(sh + "قزوین" + os + "قزوین");
                txt_secend.setText("");
                txt_secend1.setText("");
                txt_serd.setText("");
                txt_serd1.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
            }
            if (txt4.trim().equals("") && txt2.trim().equals("")) {
                txt_view.setText("");
                txt_secend.setText("");
                txt_serd.setText("");
                txt_fore.setText("");
                txt_fore1.setText("");
                txt_secend1.setText("");
                txt_serd1.setText("");
            }

        }

    private void edt_text (View vi){
            PopupMenu pop = new PopupMenu(getContext(), vi);
            pop.getMenuInflater().inflate(R.menu.menu1, pop.getMenu());
            pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case R.id.item1:
                            edt_txt2.setText("ب");
                            break;
                        case R.id.item2:
                            edt_txt2.setText("د");
                            break;
                        case R.id.item3:
                            edt_txt2.setText("س");
                            break;
                        case R.id.item4:
                            edt_txt2.setText("ص");
                            break;
                        case R.id.item5:
                            edt_txt2.setText("ج");
                            break;
                        case R.id.item6:
                            edt_txt2.setText("ط");
                            break;
                        case R.id.item7:
                            edt_txt2.setText("ق");
                            break;
                        case R.id.item8:
                            edt_txt2.setText("ل");
                            break;
                        case R.id.item9:
                            edt_txt2.setText("م");
                            break;
                        case R.id.item10:
                            edt_txt2.setText("ن");
                            break;
                        case R.id.item11:
                            edt_txt2.setText("ه");
                            break;
                        case R.id.item12:
                            edt_txt2.setText("و");
                            break;
                        case R.id.item13:
                            edt_txt2.setText("ی");
                    }
                    return false;
                }
            });
            pop.show();
        }


    }