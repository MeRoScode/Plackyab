package com.example.plac;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.plac.View.fonts;

import java.util.ArrayList;

public class Normal_Placks extends Fragment implements View.OnClickListener {


    private EditText edt_number;
    private RecyclerView recyclerView;
    private TextView btn_find, btn_word;
    private String sh = " شهرستان ";
    private String os = " از استان ";
    ArrayList<String> list = new ArrayList<>();

    public static Normal_Placks instense() {
        Normal_Placks fragment = new Normal_Placks();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.normal_placks, container, false);
        interviews(view);
        return view;
    }


    private void interviews(View view) {
        btn_word = view.findViewById(R.id.btn_word);
        edt_number = view.findViewById(R.id.edt_number);
        btn_find = view.findViewById(R.id.btn_find);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        btn_word.setTypeface(fonts.getTypeface(getContext(), "fonts/1_5186128406684631051.ttf"));
        edt_number.setTypeface(fonts.getTypeface(getContext(), "fonts/1_5186128406684631051.ttf"));

        btn_find.setOnClickListener(this);
        btn_word.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_find:
                if (btn_word.getText().toString().length() > 0 && edt_number.getText().toString().length() > 1) {
                    new MyTask().execute();
                } else {
                    Toast.makeText(getContext(), "پلاک را به درستی وارد کنید", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.btn_word:
                edt_text(view);
        }
    }


    public void inter() {
        String txt2 = btn_word.getText().toString();
        String txt4 = edt_number.getText().toString().trim();

        /*شهریار،ملارد،قدس*/
        if (txt4.trim().equals("78") && txt2.trim().equals("د")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + "  ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }

        if (txt4.trim().equals("78") && txt2.trim().equals("ه")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }

        if (txt4.trim().equals("21") && txt2.trim().equals("د")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("21") && txt2.trim().equals("ط")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("21") && txt2.trim().equals("ل")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("21") && txt2.trim().equals("ه")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("38") && txt2.trim().equals("ط")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("38") && txt2.trim().equals("ج")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("38") && txt2.trim().equals("و")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("30") && txt2.trim().equals("ب")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("30") && txt2.trim().equals("ق")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("30") && txt2.trim().equals("ن")) {
            list.add(sh + " شهریار " + os + "تهران");
            list.add(sh + " ملارد " + os + "تهران");
            list.add(sh + " قدس " + os + "تهران");
        }
        if (txt4.trim().equals("83") && txt2.trim().equals("ق")) {
            list.add(sh + "آباده" + os + "فارس");
            list.add(sh + "بوانات" + os + "فارس");
        }
        if (txt4.trim().equals("93") && txt2.trim().equals("ی")) {
            list.add(sh + "شیراز" + os + "فارس");
            list.add(sh + "کازرون" + os + "فارس");
        }
        if (txt4.trim().equals("43") && txt2.trim().equals("ص")) {
            list.add(sh + "تیران" + os + "اصفهان");
            list.add(sh + "کرون" + os + "اصفهان");
        }
        if (txt4.trim().equals("67") && txt2.trim().equals("ص")) {
            list.add(sh + "لنجان" + os + "اصفهان");
            list.add(sh + "فلاورجان" + os + "اصفهان");
        }
        if (txt4.trim().equals("23") && txt2.trim().equals("ل")) {
            list.add(sh + "کاشان" + os + "اصفهان");
            list.add(sh + "خوانسار" + os + "اصفهان");
        }
        if (txt4.trim().equals("42") && txt2.trim().equals("م")) {
            list.add(sh + "گناباد" + os + "خراسان رضوی");
            list.add(sh + "رشتخوار" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("32") && txt2.trim().equals("ن")) {
            list.add(sh + "تربت حیدریه" + os + "خراسان رضوی");
            list.add(sh + "قائن " + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("42") && txt2.trim().equals("ی")) {
            list.add(sh + "تربت حیدریه" + os + "خراسان رضوی");
            list.add(sh + "کلات" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("42") && txt2.trim().equals("ن")) {
            list.add(sh + "سبزوار" + os + "خراسان رضوی");
            list.add(sh + "جاجرم" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("32") && txt2.trim().equals("ی")) {
            list.add(sh + "نیشابور" + os + "خراسان رضوی");
            list.add(sh + "نهبندان" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("32") && txt2.trim().equals("و")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
            list.add(sh + "فردوس" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("93") && txt2.trim().equals("و")) {
            list.add(sh + "شیراز" + os + "فارس");
            list.add(sh + "کازرون" + os + "فارس");
            list.add(sh + "مرودشت" + os + "فارس");
            list.add(sh + "فیروزآباد" + os + "فارس");
        }
        if (txt4.trim().equals("83") && txt2.trim().equals("ص")) {
            list.add(sh + "شیراز" + os + "فارس");
            list.add(sh + "کازرون" + os + "فارس");
            list.add(sh + "مرودشت" + os + "فارس");
            list.add(sh + "فیروزآباد" + os + "فارس");
            list.add(sh + "ارسنجان" + os + "فارس");
        }
        if (txt4.trim().equals("83") && txt2.trim().equals("ج")) {
            list.add(sh + "شیراز" + os + "فارس");
            list.add(sh + "کازرون" + os + "فارس");
            list.add(sh + "مرودشت" + os + "فارس");
            list.add(sh + "ارسنجان" + os + "فارس");
            list.add(sh + "زرین دشت" + os + "فارس");
            list.add(sh + "فیروزآباد" + os + "فارس");
        }
        if (txt4.trim().equals("83") && txt2.trim().equals("ط")) {
            list.add("شیراز و کازرون و مرودشت و فیروزآباد و ارسنجان و زرین دشت  و خرمبید مشترک");
            list.add(sh + "شیراز" + os + "فارس");
            list.add(sh + "کازرون" + os + "فارس");
            list.add(sh + "مرودشت" + os + "فارس");
            list.add(sh + "فیروزآباد" + os + "فارس");
            list.add(sh + "کازرون" + os + "فارس");
            list.add(sh + "مرودشت" + os + "فارس");
            list.add(sh + "فیروزآباد" + os + "فارس");
        }
        if (txt4.trim().equals("42") && txt2.trim().equals("ه")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
            list.add(sh + "سربیشه" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("42") && txt2.trim().equals("و")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
            list.add(sh + "مانه" + os + "خراسان رضوی");
            list.add(sh + "سملقان" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("42") && txt2.trim().equals("ق")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
            list.add(sh + "اسفراین" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("42") && txt2.trim().equals("ج")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
            list.add(sh + "شیروان" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("83") && txt2.trim().equals("س")) {
            list.add(sh + "داراب" + os + "فارس");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("ج")) {
            list.add(sh + " ورزقان" + os + "آذربایجان شرقی");
            list.add(sh + " بناب" + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("د")) {
            list.add(sh + " عجب شير" + os + "آذربایجان شرقی");
            list.add(sh + " بناب" + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("س")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
            list.add(sh + " چاراویماق" + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("34") && txt2.trim().equals("ب")) {
            list.add(sh + "شوش" + os + "خوزستان");
            list.add(sh + "باغملک" + os + "خوزستان");
        }
        if (txt4.trim().equals("34") && txt2.trim().equals("س")) {
            list.add(sh + "اندیمشک" + os + "خوزستان");
            list.add(sh + "لالی" + os + "خوزستان");
        }
        if (txt4.trim().equals("24") && txt2.trim().equals("ق")) {
            list.add(sh + "آبادان" + os + "خوزستان");
            list.add(sh + "دشت آزادگان" + os + "خوزستان");
        }
        if (txt4.trim().equals("24") && txt2.trim().equals("ه")) {
            list.add(sh + "ماهشهر" + os + "خوزستان");
            list.add(sh + "شادگان" + os + "خوزستان");
        }
        if (txt4.trim().equals("34") && txt2.trim().equals("د")) {
            list.add(sh + "خرمشهر" + os + "خوزستان");
            list.add(sh + "هندیجان" + os + "خوزستان");
        }
        if (txt4.trim().equals("91") && txt2.trim().equals("ن")) {
            list.add(sh + "مشکین شهر" + os + "اردبیل");
            list.add(sh + "نمین" + os + "اردبیل");
        }
        if (txt4.trim().equals("91") && txt2.trim().equals("ی")) {
            list.add(sh + "اردبیل" + os + "اردبیل");
            list.add(sh + "پارس آباد" + os + "اردبیل");
        }
        if (txt4.trim().equals("91") && txt2.trim().equals("و")) {
            list.add(sh + "اردبیل" + os + "اردبیل");
            list.add(sh + "پارس آباد" + os + "اردبیل");
            list.add(sh + "کوثر" + os + "اردبیل");
        }
        if (txt4.trim().equals("91") && txt2.trim().equals("م")) {
            list.add(sh + "اردبیل" + os + "اردبیل");
            list.add(sh + "پارس آباد " + os + "اردبیل");
            list.add(sh + "کوثر" + os + "اردبیل");
            list.add(sh + "نیر" + os + "اردبیل");
        }
        if (txt4.trim().equals("41") && txt2.trim().equals("و")) {
            list.add(sh + "دورود" + os + "لرستان");
            list.add(sh + "کوهدشت" + os + "لرستان");
        }
        if (txt4.trim().equals("72") && txt2.trim().equals("ی")) {
            list.add(sh + "نور" + os + "مازندران");
            list.add(sh + "جویبار" + os + "مازندران");
        }
        if (txt4.trim().equals("30") && txt2.trim().equals("ط")) {
            list.add(sh + " ورامین " + os + "تهران");
            list.add(sh + " پاکدشت " + os + "تهران");
        }
        if (txt4.trim().equals("78") && txt2.trim().equals("ط")) {
            list.add(sh + "ساوجبلاغ(هشتگرد)" + os + "البرز");
            list.add(sh + "طالقان" + os + "البرز");
            list.add(sh + "نظر آباد" + os + "البرز");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("ج")) {
            list.add(sh + " ورزقان" + os + "آذربایجان شرقی");
            list.add(sh + " بناب" + os + "آذربایجان شرقی");
        } else {
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("د")) {
            list.add(sh + " عجب شير" + os + "آذربایجان شرقی");
            list.add(sh + " بناب" + os + "آذربایجان شرقی");
        } else {
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("س")) {
            list.add(sh + "مهریز" + os + "یزد");
            list.add(sh + "بهاباد" + os + "یزد");
        }

        if (txt4.trim().equals("11") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        }
        if (txt4.trim().equals("11") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        }
        if (txt4.trim().equals("11") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("11") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/

        if (txt4.trim().equals("22") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("22") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("33") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/

        if (txt4.trim().equals("44") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("44") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("55") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/

        if (txt4.trim().equals("66") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("66") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("77") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/

        if (txt4.trim().equals("88") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("88") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("99") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }/*تهران بزرگ*/
        if (txt4.trim().equals("10") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/

        if (txt4.trim().equals("20") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("ن")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("و")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("ی")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("20") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }
        if (txt4.trim().equals("20") && txt2.trim().equals("ه")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("ب")) {
            list.add(sh + " تهران " + os + "تهران");
        }
        if (txt4.trim().equals("40") && txt2.trim().equals("ج")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("د")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("س")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("ص")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("ط")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("ق")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("ل")) {
            list.add(sh + " تهران " + os + "تهران");
        } /*تهران بزرگ*/
        if (txt4.trim().equals("40") && txt2.trim().equals("م")) {
            list.add(sh + " تهران " + os + "تهران");
        }

        /*رباط کریم*/
        if (txt4.trim().equals("78") && txt2.trim().equals("ج")) {
            list.add(sh + " رباط کریم " + os + "تهران");
        }/*رباط کریم*/
        if (txt4.trim().equals("78") && txt2.trim().equals("م")) {
            list.add(sh + " رباط کریم " + os + "تهران");
        }/*رباط کریم*/
        if (txt4.trim().equals("21") && txt2.trim().equals("ج")) {
            list.add(sh + " رباط کریم " + os + "تهران");
        }/*رباط کریم*/
        if (txt4.trim().equals("21") && txt2.trim().equals("ق")) {
            list.add(sh + " رباط کریم " + os + "تهران");
        }/*رباط کریم*/
        if (txt4.trim().equals("38") && txt2.trim().equals("ل")) {
            list.add(sh + " رباط کریم " + os + "تهران");
        }/*رباط کریم*/
        if (txt4.trim().equals("30") && txt2.trim().equals("ج")) {
            list.add(sh + " رباط کریم" + os + "تهران");
        }/*رباط کریم*/
        if (txt4.trim().equals("30") && txt2.trim().equals("و")) {
            list.add(sh + " رباط کریم" + os + "تهران");
        }
        /*ورامین*/
        if (txt4.trim().equals("78") && txt2.trim().equals("س")) {
            list.add(sh + " ورامین " + os + "تهران");
        }/*ورامین*/
        if (txt4.trim().equals("21") && txt2.trim().equals("س")) {
            list.add(sh + " ورامین " + os + "تهران");
        }/*ورامین*/
        if (txt4.trim().equals("21") && txt2.trim().equals("م")) {
            list.add(sh + " ورامین " + os + "تهران");
        }/*ورامین*/
        if (txt4.trim().equals("38") && txt2.trim().equals("ص")) {
            list.add(sh + " ورامین " + os + "تهران");
        }/*ورامین*/
        /*اسلام شهر*/
        if (txt4.trim().equals("78") && txt2.trim().equals("ب")) {
            list.add(sh + " اسلام شهر " + os + "تهران");
        }/*اسلام شهر*/
        if (txt4.trim().equals("21") && txt2.trim().equals("ب")) {
            list.add(sh + " اسلام شهر " + os + "تهران");
        }/*اسلام شهر*/
        if (txt4.trim().equals("38") && txt2.trim().equals("ق")) {
            list.add(sh + " اسلام شهر " + os + "تهران");
        }/*اسلام شهر*/
        if (txt4.trim().equals("30") && txt2.trim().equals("ص")) {
            list.add(sh + " اسلام شهر " + os + "تهران");
        }/*اسلام شهر*/
        if (txt4.trim().equals("78") && txt2.trim().equals("ی")) {
            list.add(sh + " اسلام شهر " + os + "تهران");
        }
        /*پاکدشت*/
        if (txt4.trim().equals("21") && txt2.trim().equals("ن")) {
            list.add(sh + " پاکدشت " + os + "تهران");
        }/*پاکدشت*/
        if (txt4.trim().equals("78") && txt2.trim().equals("ل")) {
            list.add(sh + " پاکدشت " + os + "تهران");
        }
        /*دماوند*/
        if (txt4.trim().equals("21") && txt2.trim().equals("ی")) {
            list.add(sh + " دماوند " + os + "تهران");
        }/*دماوند*/
        if (txt4.trim().equals("30") && txt2.trim().equals("ه")) {
            list.add(sh + " دماوند " + os + "تهران");
        }/*دماوند*/
        if (txt4.trim().equals("78") && txt2.trim().equals("ص")) {
            list.add(sh + " دماوند " + os + "تهران");
        }
        /*فیروزکوه*/
        if (txt4.trim().equals("78") && txt2.trim().equals("ق")) {
            list.add(sh + " فیروزکوه " + os + "تهران");
        }
        /*ری*/
        if (txt4.trim().equals("78") && txt2.trim().equals("ن")) {
            list.add(sh + " ری " + os + "تهران");
        }
        /*شمیرانات*/
        if (txt4.trim().equals("78") && txt2.trim().equals("و")) {
            list.add(sh + " شمیرانات " + os + "تهران");
        }



        /*مشهد*/
        if (txt4.trim().equals("12") && txt2.trim().equals("ل")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("و")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("ن")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("م")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("ی")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("ه")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("ق")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("ط")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("ص")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("س")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("12") && txt2.trim().equals("د")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        } /*مشهد*/
        if (txt4.trim().equals("12") && txt2.trim().equals("ج")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("36") && txt2.trim().equals("ج")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("36") && txt2.trim().equals("ب")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("36") && txt2.trim().equals("ه")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }

        if (txt4.trim().equals("74") && txt2.trim().equals("م")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("و")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("ن")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("ص")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("س")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("د")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("ی")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("ب")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("ه")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("ق")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("36") && txt2.trim().equals("و")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }/*مشهد*//*مشهد*/
        if (txt4.trim().equals("36") && txt2.trim().equals("ط")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("36") && txt2.trim().equals("ص")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("36") && txt2.trim().equals("د")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("36") && txt2.trim().equals("س")) {
            list.add(sh + "مشهد" + os + "خراسان رضوی");
        }

        /*نیشابور*/
        if (txt4.trim().equals("32") && txt2.trim().equals("ب")) {
            list.add(sh + "نیشابور" + os + "خراسان رضوی");
        }

        if (txt4.trim().equals("36") && txt2.trim().equals("ل")) {
            list.add(sh + "نیشابور" + os + "خراسان رضوی");
        }
        if (txt4.trim().equals("74") && txt2.trim().equals("ط")) {
            list.add(sh + "نیشابور" + os + "خراسان رضوی");
        }

        /*سبزوار*/
        if (txt4.trim().equals("32") && txt2.trim().equals("ج")) {
            list.add(sh + "سبزوار" + os + "خراسان رضوی");
        }
        /*سبزوار*/
        if (txt4.trim().equals("36") && txt2.trim().equals("م")) {
            list.add(sh + "سبزوار" + os + "خراسان رضوی");
        }
        /*سبزوار*/
        if (txt4.trim().equals("74") && txt2.trim().equals("ل")) {
            list.add(sh + "سبزوار" + os + "خراسان رضوی");
        }

        /*تربت حیدریه*/
        if (txt4.trim().equals("32") && txt2.trim().equals("ل")) {
            list.add(sh + "تربت حیدریه" + os + "خراسان رضوی");
        }
        /*تربت حیدریه*/
        /*تربت حیدریه*/
        if (txt4.trim().equals("36") && txt2.trim().equals("ن")) {
            list.add(sh + "تربت حیدریه" + os + "خراسان رضوی");
        }
        /*تربت حیدریه*/

        /*تربت جام*/
        if (txt4.trim().equals("36") && txt2.trim().equals("ی")) {
            list.add(sh + "تربت جام" + os + "خراسان رضوی");
        }
        /*تربت جام*/
        if (txt4.trim().equals("32") && txt2.trim().equals("ص")) {
            list.add(sh + "تربت جام" + os + "خراسان رضوی");
        }

        /*کاشمر*/
        if (txt4.trim().equals("32") && txt2.trim().equals("م")) {
            list.add(sh + "کاشمر" + os + "خراسان رضوی");
        }
        /*کاشمر*/
        if (txt4.trim().equals("36") && txt2.trim().equals("ق")) {
            list.add(sh + "کاشمر" + os + "خراسان رضوی");
        }

        /*قوچان*/
        if (txt4.trim().equals("32") && txt2.trim().equals("ط")) {
            list.add(sh + "قوچان" + os + "خراسان رضوی");
        }
        /*قوچان*/
        if (txt4.trim().equals("74") && txt2.trim().equals("ج")) {
            list.add(sh + "قوچان" + os + "خراسان رضوی");
        }

        /*گناباد*/
        if (txt4.trim().equals("32") && txt2.trim().equals("ق")) {
            list.add(sh + "گناباد" + os + "خراسان رضوی");
        }
        /*گناباد*/

        /*تایباد*/
        if (txt4.trim().equals("32") && txt2.trim().equals("ه")) {
            list.add(sh + "تایباد" + os + "خراسان رضوی");
        }
        /*فریمان*/
        if (txt4.trim().equals("42") && txt2.trim().equals("ب")) {
            list.add(sh + "فریمان" + os + "خراسان رضوی");
        }
        /*سرخس*/
        if (txt4.trim().equals("42") && txt2.trim().equals("د")) {
            list.add(sh + "سرخس" + os + "خراسان رضوی");
        }
        /*درگز*/
        if (txt4.trim().equals("42") && txt2.trim().equals("س")) {
            list.add(sh + "درگز" + os + "خراسان رضوی");
        }
        /*خواف*/
        if (txt4.trim().equals("42") && txt2.trim().equals("ص")) {
            list.add(sh + "خواف" + os + "خراسان رضوی");
        }
        /*چناران*/
        if (txt4.trim().equals("42") && txt2.trim().equals("ط")) {
            list.add(sh + "چناران" + os + "خراسان رضوی");
        }
        /*بردسکن*/
        if (txt4.trim().equals("42") && txt2.trim().equals("ل")) {
            list.add(sh + "بردسکن" + os + "خراسان رضوی");
        }


        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ب")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ل")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("م")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ن")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("و")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ه")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ی")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ج")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("د")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("س")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ص")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ط")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("13") && txt2.trim().equals("ق")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ب")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ج")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("د")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ق")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("س")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ص")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ل")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("و")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("ب")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("ج")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("د")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("ن")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("س")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("ط")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("ل")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }
        /*اصفهان*/
        if (txt4.trim().equals("67") && txt2.trim().equals("و")) {
            list.add(sh + "اصفهان" + os + "اصفهان");
        }

        /*شاهین شهر*/
        if (txt4.trim().equals("43") && txt2.trim().equals("د")) {
            list.add(sh + "شاهین شهر" + os + "اصفهان");
        }
        /*شاهین شهر*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ل")) {
            list.add(sh + "شاهین شهر" + os + "اصفهان");
        }
        /*شاهین شهر*/
        if (txt4.trim().equals("53") && txt2.trim().equals("م")) {
            list.add(sh + "شاهین شهر" + os + "اصفهان");
        }
        /*شاهین شهر*/
        if (txt4.trim().equals("67") && txt2.trim().equals("ق")) {
            list.add(sh + "شاهین شهر" + os + "اصفهان");
        }

        /*نجف آباد*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ج")) {
            list.add(sh + "نجف آباد" + os + "اصفهان");
        }
        /*نجف آباد*/
        if (txt4.trim().equals("43") && txt2.trim().equals("م")) {
            list.add(sh + "نجف آباد" + os + "اصفهان");
        }
        /*نجف آباد*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ن")) {
            list.add(sh + "نجف آباد" + os + "اصفهان");
        }
        /*نجف آباد*/
        if (txt4.trim().equals("67") && txt2.trim().equals("م")) {
            list.add(sh + "نجف آباد" + os + "اصفهان");
        }

        /*کاشان*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ب")) {
            list.add(sh + "کاشان" + os + "اصفهان");
        }
        /*کاشان*/
        if (txt4.trim().equals("43") && txt2.trim().equals("و")) {
            list.add(sh + "کاشان" + os + "اصفهان");
        }
        /*کاشان*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ه")) {
            list.add(sh + "کاشان" + os + "اصفهان");
        }
        /*کاشان*/

        /*خمینی شهر*/
        if (txt4.trim().equals("23") && txt2.trim().equals("س")) {
            list.add(sh + "خمینی شهر" + os + "اصفهان");
        }

        /*خمینی شهر*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ن")) {
            list.add(sh + "خمینی شهر" + os + "اصفهان");
        }
        /*خمینی شهر*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ی")) {
            list.add(sh + "خمینی شهر" + os + "اصفهان");
        }

        /*لنجان*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ی")) {
            list.add(sh + "لنجان" + os + "اصفهان");
        }
        /*لنجان*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ه")) {
            list.add(sh + "لنجان" + os + "اصفهان");
        }
        /*لنجان*/

        /*فلاور جان*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ی")) {
            list.add(sh + "فلاورجان" + os + "اصفهان");
        }
        /*فلاور جان*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ه")) {
            list.add(sh + "فلاورجان" + os + "اصفهان");
        }

        /*شهررضا*/
        if (txt4.trim().equals("23") && txt2.trim().equals("د")) {
            list.add(sh + "شهررضا" + os + "اصفهان");
        }
        /*شهررضا*/
        if (txt4.trim().equals("53") && txt2.trim().equals("ط")) {
            list.add(sh + "شهررضا" + os + "اصفهان");
        }

        /*مبارکه*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ج")) {
            list.add(sh + "مبارکه" + os + "اصفهان");
        }
        /*مبارکه*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ط")) {
            list.add(sh + "مبارکه" + os + "اصفهان");
        }

        /*گلپایگان*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ص")) {
            list.add(sh + "گلپایگان" + os + "اصفهان");
        }
        /*نطنز*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ط")) {
            list.add(sh + "اردستان" + os + "اصفهان");
        }
        /*اردستان*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ق")) {
            list.add(sh + "اردستان" + os + "اصفهان");
        }
        /*نائین*/
        if (txt4.trim().equals("23") && txt2.trim().equals("م")) {
            list.add(sh + "نائین" + os + "اصفهان");
        }
        /*سمیرم*/
        if (txt4.trim().equals("23") && txt2.trim().equals("ن")) {
            list.add(sh + "سمیرم" + os + "اصفهان");
        }
        /*فریدون شهر*/
        if (txt4.trim().equals("23") && txt2.trim().equals("و")) {
            list.add(sh + "فریدون شهر" + os + "اصفهان");
        }
        /*آران وبیدگل*/
        if (txt4.trim().equals("43") && txt2.trim().equals("س")) {
            list.add(sh + "آران وبیدگل" + os + "اصفهان");
        }
        /*فریدون*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ب")) {
            list.add(sh + "فریدون" + os + "اصفهان");
        }


        /*دهاقان*/
        if (txt4.trim().equals("43") && txt2.trim().equals("ق")) {
            list.add(sh + "دهاقان" + os + "اصفهان");
        }


        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ب")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ل")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("م")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ن")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("و")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ه")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ی")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ج")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("د")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("س")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ص")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ط")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("63") && txt2.trim().equals("ق")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ب")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ج")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("د")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("س")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ص")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ط")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ق")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("م")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ن")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ه")) {
            list.add(sh + "شیراز" + os + "فارس");
        }
        /*شیراز*/
        /*کازرون*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ص")) {
            list.add(sh + "کازرون" + os + "فارس");
        }
        /*کازرون*/
        if (txt4.trim().equals("83") && txt2.trim().equals("ن")) {
            list.add(sh + "کازرون" + os + "فارس");
        }

        /*مرودشت*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ل")) {
            list.add(sh + "مرودشت" + os + "فارس");
        }
        /*مرودشت*/
        if (txt4.trim().equals("83") && txt2.trim().equals("و")) {
            list.add(sh + "مرودشت" + os + "فارس");
        }

        /*فیروزآباد*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ط")) {
            list.add(sh + "فیروزآباد" + os + "فارس");
        }

        /*لارستان*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ج")) {
            list.add(sh + "لارستان" + os + "فارس");
        }
        /*لارستان*/
        if (txt4.trim().equals("83") && txt2.trim().equals("م")) {
            list.add(sh + "لارستان" + os + "فارس");
        }
        /*لارستان*/
        if (txt4.trim().equals("93") && txt2.trim().equals("ل")) {
            list.add(sh + "لارستان" + os + "فارس");
        }

        /*جهرم*/
        if (txt4.trim().equals("83") && txt2.trim().equals("ه")) {
            list.add(sh + "جهرم" + os + "فارس");
        }
        /*جهرم*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ب")) {
            list.add(sh + "جهرم" + os + "فارس");
        }

        /*فسا*/
        if (txt4.trim().equals("73") && txt2.trim().equals("س")) {
            list.add(sh + "فسا" + os + "فارس");
        }
        /*فسا*/
        if (txt4.trim().equals("83") && txt2.trim().equals("ی")) {
            list.add(sh + "فسا" + os + "فارس");
        }

        /*داراب*/
        if (txt4.trim().equals("73") && txt2.trim().equals("د")) {
            list.add(sh + "داراب" + os + "فارس");
        }
        /*آباده*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ق")) {
            list.add(sh + "آباده" + os + "فارس");
        }
        /*نورآباد ممسنی*/
        if (txt4.trim().equals("83") && txt2.trim().equals("ب")) {
            list.add(sh + "نورآباد ممسنی" + os + "فارس");
        }

        /*لامرد*/
        if (txt4.trim().equals("73") && txt2.trim().equals("م")) {
            list.add(sh + "لامرد" + os + "فارس");
        }
        /*نی ریز*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ن")) {
            list.add(sh + "استهبان" + os + "فارس");
        }
        /*استهبان*/
        if (txt4.trim().equals("73") && txt2.trim().equals("و")) {
            list.add(sh + "استهبان" + os + "فارس");
        }
        /*اقلید*/
        if (txt4.trim().equals("73") && txt2.trim().equals("ه")) {
            list.add(sh + "اقلید" + os + "فارس");
        }
        /*قیر و کارزین*/
        if (txt4.trim().equals("83") && txt2.trim().equals("د")) {
            list.add(sh + "قیر و کارزین" + os + "فارس");
        }
        /*فراشبند*/
        if (txt4.trim().equals("83") && txt2.trim().equals("ل")) {
            list.add(sh + "فراشبند" + os + "فارس");
        }

        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ل")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("م")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ن")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("و")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ه")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ی")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ج")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("د")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("س")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ص")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ط")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ق")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("68") && txt2.trim().equals("ب")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*کرج*/
        if (txt4.trim().equals("21") && txt2.trim().equals("و")) {
            list.add(sh + "کرج" + os + "البرز");
        }
        /*هشتگرد*/
        /*هشتگرد*/
        if (txt4.trim().equals("21") && txt2.trim().equals("ص")) {
            list.add(sh + "هشتگرد" + os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("38") && txt2.trim().equals("ب")) {
            list.add(os + "البرز");
        }

        /*استان البرز*/
        if (txt4.trim().equals("38") && txt2.trim().equals("د")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("38") && txt2.trim().equals("س")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("38") && txt2.trim().equals("م")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("38") && txt2.trim().equals("ن")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("38") && txt2.trim().equals("ه")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("38") && txt2.trim().equals("ی")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("30") && txt2.trim().equals("د")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("30") && txt2.trim().equals("س")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("30") && txt2.trim().equals("ل")) {
            list.add(os + "البرز");
        }
        /*استان البرز*/
        if (txt4.trim().equals("30") && txt2.trim().equals("م")) {
            list.add(os + "البرز");
        }

        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ل")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("م")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ن")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("و")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ه")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ی")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ج")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("د")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("س")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ص")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ط")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ق")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("14") && txt2.trim().equals("ب")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*اهوار*/
        if (txt4.trim().equals("34") && txt2.trim().equals("ی")) {
            list.add(sh + "اهواز" + os + "خوزستان");
        }
        /*دزفول*/
        if (txt4.trim().equals("24") && txt2.trim().equals("د")) {
            list.add(sh + "دزفول" + os + "خوزستان");
        }
        /*دزفول*/
        if (txt4.trim().equals("34") && txt2.trim().equals("ص")) {
            list.add(sh + "دزفول" + os + "خوزستان");
        }
        /*دزفول*/
        if (txt4.trim().equals("34") && txt2.trim().equals("و")) {
            list.add(sh + "دزفول" + os + "خوزستان");
        }
        /*ماهشهر*/
        if (txt4.trim().equals("24") && txt2.trim().equals("ط")) {
            list.add(sh + "ماهشهر" + os + "خوزستان");
        }
        /*ماهشهر*/


        /*ماهشهر*/
        if (txt4.trim().equals("34") && txt2.trim().equals("ط")) {
            list.add(sh + "ماهشهر" + os + "خوزستان");
        }
        /*آبادان*/
        if (txt4.trim().equals("24") && txt2.trim().equals("ب")) {
            list.add(sh + "آبادان" + os + "خوزستان");
        }
        /*آبادان*/
        /*آبادان*/
        if (txt4.trim().equals("34") && txt2.trim().equals("ق")) {
            list.add(sh + "آبادان" + os + "خوزستان");
        }
        /*بهبهان*/
        if (txt4.trim().equals("24") && txt2.trim().equals("س")) {
            list.add(sh + "بهبهان" + os + "خوزستان");
        }
        /*بهبهان*/
        if (txt4.trim().equals("34") && txt2.trim().equals("ن")) {
            list.add(sh + "بهبهان" + os + "خوزستان");
        }
        /*شوشتر*/
        if (txt4.trim().equals("24") && txt2.trim().equals("ن")) {
            list.add(sh + "شوشتر" + os + "خوزستان");
        }
        /*شوشتر*/
        if (txt4.trim().equals("34") && txt2.trim().equals("ه")) {
            list.add(sh + "شوشتر" + os + "خوزستان");
        }
        /*اندیمشک*/
        if (txt4.trim().equals("24") && txt2.trim().equals("م")) {
            list.add(sh + "اندیمشک" + os + "خوزستان");
        }
        /*اندیمشک*/
        /*شوش*/
        if (txt4.trim().equals("24") && txt2.trim().equals("و")) {
            list.add(sh + "شوش" + os + "خوزستان");
        }
        /*شوش*/
        /*خرمشهر*/
        if (txt4.trim().equals("24") && txt2.trim().equals("ج")) {
            list.add(sh + "خرمشهر" + os + "خوزستان");
        }
        /*خرمشهر*/
        /*مسجدسلیمان*/
        if (txt4.trim().equals("24") && txt2.trim().equals("ص")) {
            list.add(sh + "مسجدسلیمان" + os + "خوزستان");
        }
        /*رامهرمز*/
        if (txt4.trim().equals("24") && txt2.trim().equals("ل")) {
            list.add(sh + "رامهرمز" + os + "خوزستان");
        }
        /*ایذه*/
        if (txt4.trim().equals("24") && txt2.trim().equals("ی")) {
            list.add(sh + "ایذه" + os + "خوزستان");
        }
        /*امیدیه*/
        if (txt4.trim().equals("34") && txt2.trim().equals("ج")) {
            list.add(sh + "امیدیه" + os + "خوزستان");
        }

        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ل")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("م")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ن")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("و")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ه")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ب")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ج")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("د")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("س")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ص")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ط")) {
            list.add("استان قم");
        }
        /*استان قم*/
        if (txt4.trim().equals("16") && txt2.trim().equals("ق")) {
            list.add("استان قم");
        }


        /*تاکستان*/
        if (txt4.trim().equals("89") && txt2.trim().equals("ب")) {
            list.add(sh + "تاکستان" + os + "قزوین");
        }
        /*تاکستان*/
        if (txt4.trim().equals("89") && txt2.trim().equals("س")) {
            list.add(sh + "تاکستان" + os + "قزوین");
        }
        /*بویین ژهرا*/
        if (txt4.trim().equals("89") && txt2.trim().equals("ج")) {
            list.add(sh + "بویین ژهرا" + os + "قزوین");
        }
        /*آبیک*/
        if (txt4.trim().equals("89") && txt2.trim().equals("د")) {
            list.add(sh + "آبیک" + os + "قزوین");
        }



        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("ل")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("ج")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("د")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("س")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("ص")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("ط")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        sor();
    }

    public void sor() {

        String txt2 = btn_word.getText().toString().trim();
        String txt4 = edt_number.getText().toString().trim();


        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("ق")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        /*همدان*/
        if (txt4.trim().equals("18") && txt2.trim().equals("ب")) {
            list.add(sh + "همدان" + os + "همدان");
        }

        /*ملایر*/
        if (txt4.trim().equals("28") && txt2.trim().equals("ج")) {
            list.add(sh + "همدان" + os + "همدان");
        }
        /*ملایر*/
        if (txt4.trim().equals("28") && txt2.trim().equals("ل")) {
            list.add(sh + "ملایر" + os + "همدان");
        }
        /*ملایر*/
        if (txt4.trim().equals("28") && txt2.trim().equals("ن")) {
            list.add(sh + "ملایر" + os + "همدان");
        }
        /*نهاوند*/
        if (txt4.trim().equals("28") && txt2.trim().equals("ب")) {
            list.add(sh + "نهاوند" + os + "همدان");
        }
        /*نهاوند*/
        if (txt4.trim().equals("28") && txt2.trim().equals("م")) {
            list.add(sh + "نهاوند" + os + "همدان");
        }
        /*تویسرکان*/
        if (txt4.trim().equals("28") && txt2.trim().equals("د")) {
            list.add(sh + "تویسرکان" + os + "همدان");
        }
        /*کبودرآهنگ*/
        if (txt4.trim().equals("28") && txt2.trim().equals("س")) {
            list.add(sh + "کبودرآهنگ" + os + "همدان");
        }
        /*رزن*/
        if (txt4.trim().equals("28") && txt2.trim().equals("ص")) {
            list.add(sh + "رزن" + os + "همدان");
        }
        /*بهار*/
        if (txt4.trim().equals("28") && txt2.trim().equals("ط")) {
            list.add(sh + "بهار" + os + "همدان");
        }
        /*اسدآباد*/
        if (txt4.trim().equals("28") && txt2.trim().equals("ق")) {
            list.add(sh + "اسدآباد" + os + "همدان");
        }
        /*اراک*/
        if (txt4.trim().equals("47") && txt2.trim().equals("ج")) {
            list.add(sh + "اراک" + os + "مرکزی");
        }

        /*اراک*/
        if (txt4.trim().equals("47") && txt2.trim().equals("د")) {
            list.add(sh + "اراک" + os + "مرکزی");
        }
        /*اراک*/
        if (txt4.trim().equals("47") && txt2.trim().equals("س")) {
            list.add(sh + "اراک" + os + "مرکزی");
        }
        /*اراک*/
        if (txt4.trim().equals("47") && txt2.trim().equals("ص")) {
            list.add(sh + "اراک" + os + "مرکزی");
        }
        /*اراک*/
        if (txt4.trim().equals("47") && txt2.trim().equals("ط")) {
            list.add(sh + "اراک" + os + "مرکزی");
        }
        /*اراک*/
        if (txt4.trim().equals("47") && txt2.trim().equals("ق")) {
            list.add(sh + "اراک" + os + "مرکزی");
            /*اراک*/
        }
        if (txt4.trim().equals("47") && txt2.trim().equals("ب")) {
            list.add(sh + "اراک" + os + "مرکزی");
        }

        /*ساوه*/
        if (txt4.trim().equals("57") && txt2.trim().equals("ب")) {
            list.add(sh + "ساوه" + os + "مرکزی");
        }
        /*ساوه*/
        if (txt4.trim().equals("57") && txt2.trim().equals("و")) {
            list.add(sh + "ساوه" + os + "مرکزی");
        }
        /*ساوه*/
        if (txt4.trim().equals("57") && txt2.trim().equals("ه")) {
            list.add(sh + "ساوه" + os + "مرکزی");
            /*خمین*/
        }
        if (txt4.trim().equals("57") && txt2.trim().equals("ج")) {
            list.add(sh + "خمین" + os + "مرکزی");
        }
        /*شازند*/
        if (txt4.trim().equals("57") && txt2.trim().equals("ق")) {
            list.add(sh + "شازند" + os + "مرکزی");
        }
        /*محلات*/
        if (txt4.trim().equals("57") && txt2.trim().equals("د")) {
            list.add(sh + "محلات" + os + "مرکزی");
        }
        /*تفرش*/
        if (txt4.trim().equals("57") && txt2.trim().equals("س")) {
            list.add(sh + "تفرش" + os + "مرکزی");
        }
        /*دلیجان*/
        if (txt4.trim().equals("57") && txt2.trim().equals("ص")) {
            list.add(sh + "دلیجان" + os + "مرکزی");
        }
        /*آشتیان*/
        if (txt4.trim().equals("57") && txt2.trim().equals("ط")) {
            list.add(sh + "آشتیان" + os + "مرکزی");
        }
        /*زرندیه*/
        if (txt4.trim().equals("57") && txt2.trim().equals("ل")) {
            list.add(sh + "زرندیه" + os + "مرکزی");
        }
        /*کمیجان*/
        if (txt4.trim().equals("57") && txt2.trim().equals("ن")) {
            list.add(sh + "کمیجان" + os + "مرکزی");
        }

        /*بندرعباس*/
        if (txt4.trim().equals("84") && txt2.trim().equals("ج")) {
            list.add(sh + "بندرعباس" + os + "هرمزگان");
        }
        /*بندرعباس*/
        if (txt4.trim().equals("84") && txt2.trim().equals("د")) {
            list.add(sh + "بندرعباس" + os + "هرمزگان");
        }
        /*بندرعباس*/
        if (txt4.trim().equals("84") && txt2.trim().equals("س")) {
            list.add(sh + "بندرعباس" + os + "هرمزگان");
        }
        /*بندرعباس*/
        if (txt4.trim().equals("84") && txt2.trim().equals("ص")) {
            list.add(sh + "بندرعباس" + os + "هرمزگان");
        }
        /*بندرعباس*/
        if (txt4.trim().equals("84") && txt2.trim().equals("ط")) {
            list.add(sh + "بندرعباس" + os + "هرمزگان");
        }
        /*بندرعباس*/
        if (txt4.trim().equals("84") && txt2.trim().equals("ق")) {
            list.add(sh + "بندرعباس" + os + "هرمزگان");
        }
        /*بندرعباس*/
        if (txt4.trim().equals("84") && txt2.trim().equals("ب")) {
            list.add(sh + "بندرعباس" + os + "هرمزگان");
        }

        /*میناب*/
        if (txt4.trim().equals("94") && txt2.trim().equals("ب")) {
            list.add(sh + "میناب" + os + "هرمزگان");
        }
        /*میناب*/
        if (txt4.trim().equals("94") && txt2.trim().equals("م")) {
            list.add(sh + "میناب" + os + "هرمزگان");
        }
        /*لنگه*/
        if (txt4.trim().equals("94") && txt2.trim().equals("ج")) {
            list.add(sh + "لنگه" + os + "هرمزگان");
        }
        /*لنگه*/
        if (txt4.trim().equals("94") && txt2.trim().equals("ن")) {
            list.add(sh + "لنگه" + os + "هرمزگان");
        }
        /*رودان*/
        if (txt4.trim().equals("94") && txt2.trim().equals("د")) {
            list.add(sh + "رودان" + os + "هرمزگان");
        }
        /*ابوموسی*/
        if (txt4.trim().equals("94") && txt2.trim().equals("س")) {
            list.add(sh + "ابوموسی" + os + "هرمزگان");
        }
        /*جاسک*/
        if (txt4.trim().equals("94") && txt2.trim().equals("ص")) {
            list.add(sh + "جاسک" + os + "هرمزگان");
        }
        /*بستک*/
        if (txt4.trim().equals("94") && txt2.trim().equals("ط")) {
            list.add(sh + "بستک" + os + "هرمزگان");
        }
        /*حاجی آباد*/
        if (txt4.trim().equals("94") && txt2.trim().equals("ق")) {
            list.add(sh + "حاجی آباد" + os + "هرمزگان");
        }
        /*قشم*/
        if (txt4.trim().equals("94") && txt2.trim().equals("ل")) {
            list.add(sh + "قشم" + os + "هرمزگان");
        }


        /*اردبیل*/
        if (txt4.trim().equals("91") && txt2.trim().equals("ب")) {
            list.add(sh + "اردبیل" + os + "اردبیل");
        }
        /*اردبیل*/
        if (txt4.trim().equals("91") && txt2.trim().equals("ج")) {
            list.add(sh + "اردبیل" + os + "اردبیل");
        }
        /*اردبیل*/
        if (txt4.trim().equals("91") && txt2.trim().equals("د")) {
            list.add(sh + "اردبیل" + os + "اردبیل");
        }
        /*اردبیل*/
        if (txt4.trim().equals("91") && txt2.trim().equals("ه")) {
            list.add(sh + "اردبیل" + os + "اردبیل");
        }
        /*اردبیل*/

        /*پارس آباد*/
        if (txt4.trim().equals("91") && txt2.trim().equals("س")) {
            list.add(sh + "پارس آباد" + os + "اردبیل");
        }
        /*مشکین شهر*/
        if (txt4.trim().equals("91") && txt2.trim().equals("ق")) {
            list.add(sh + "مشکین شهر" + os + "اردبیل");
        }
        /*مشکین شهر*/
        /*خلخالی*/
        if (txt4.trim().equals("91") && txt2.trim().equals("ص")) {
            list.add(sh + "خلخالی" + os + "اردبیل");
        }
        /*گرمی*/
        if (txt4.trim().equals("91") && txt2.trim().equals("ط")) {
            list.add(sh + "گرمی" + os + "اردبیل");
        }
        /*بیله سوار*/
        if (txt4.trim().equals("91") && txt2.trim().equals("ل")) {
            list.add(sh + "بیله سوار" + os + "اردبیل");
        }


        /*ساری*/
        if (txt4.trim().equals("62") && txt2.trim().equals("ب")) {
            list.add(sh + "ساری" + os + "مازندران");
        }
        /*ساری*/
        if (txt4.trim().equals("62") && txt2.trim().equals("ج")) {
            list.add(sh + "ساری" + os + "مازندران");
        }
        /*ساری*/
        if (txt4.trim().equals("62") && txt2.trim().equals("د")) {
            list.add(sh + "ساری" + os + "مازندران");
        }
        /*ساری*/
        if (txt4.trim().equals("62") && txt2.trim().equals("س")) {
            list.add(sh + "ساری" + os + "مازندران");
        }
        /*ساری*/
        if (txt4.trim().equals("62") && txt2.trim().equals("ص")) {
            list.add(sh + "ساری" + os + "مازندران");
        }
        /*ساری*/
        if (txt4.trim().equals("62") && txt2.trim().equals("ط")) {
            list.add(sh + "ساری" + os + "مازندران");
        }

        /*بابل*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ج")) {
            list.add(sh + "بابل" + os + "مازندران");
        }
        /*بابل*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ج")) {
            list.add(sh + "ساری" + os + "مازندران");
        }
        /*بابل*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ص")) {
            list.add(sh + "بابل" + os + "مازندران");
        }
        /*بابل*/
        if (txt4.trim().equals("82") && txt2.trim().equals("م")) {
            list.add(sh + "بابل" + os + "مازندران");
        }
        /*بابل*/
        if (txt4.trim().equals("92") && txt2.trim().equals("ج")) {
            list.add(sh + "بابل" + os + "مازندران");
        }
        /*بابل*/
        if (txt4.trim().equals("92") && txt2.trim().equals("ص")) {
            list.add(sh + "بابل" + os + "مازندران");
        }
        /*آمل*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ب")) {
            list.add(sh + "آمل" + os + "مازندران");
        }
        /*آمل*/
        if (txt4.trim().equals("82") && txt2.trim().equals("د")) {
            list.add(sh + "آمل" + os + "مازندران");
        }
        /*آمل*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ق")) {
            list.add(sh + "آمل" + os + "مازندران");
        }
        /*آمل*/
        if (txt4.trim().equals("92") && txt2.trim().equals("ب")) {
            list.add(sh + "آمل" + os + "مازندران");
        }
        /*قائمشهر*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ل")) {
            list.add(sh + "قائمشهر" + os + "مازندران");
        }
        /*قائمشهر*/
        if (txt4.trim().equals("82") && txt2.trim().equals("س")) {
            list.add(sh + "قائمشهر" + os + "مازندران");
        }
        /*قائمشهر*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ن")) {
            list.add(sh + "قائمشهر" + os + "مازندران");
        }
        /*قائمشهر*/
        if (txt4.trim().equals("92") && txt2.trim().equals("س")) {
            list.add(sh + "قائمشهر" + os + "مازندران");
        }
        /*تنکابن*/
        if (txt4.trim().equals("72") && txt2.trim().equals("د")) {
            list.add(sh + "تنکابن" + os + "مازندران");
        }
        /*تنکابن*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ط")) {
            list.add(sh + "تنکابن" + os + "مازندران");
        }
        /*تنکابن*/
        if (txt4.trim().equals("92") && txt2.trim().equals("د")) {
            list.add(sh + "تنکابن" + os + "مازندران");
        }
        /*بابلسر*/
        if (txt4.trim().equals("72") && txt2.trim().equals("م")) {
            list.add(sh + "بابلسر" + os + "مازندران");
        }
        /*بابلسر*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ل")) {
            list.add(sh + "بابلسر" + os + "مازندران");
        }

        /*چالوس*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ن")) {
            list.add(sh + "چالوس" + os + "مازندران");
        }
        /*چالوس*/
        if (txt4.trim().equals("82") && txt2.trim().equals("و")) {
            list.add(sh + "چالوس" + os + "مازندران");
        }
        /*بهشهر*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ق")) {
            list.add(sh + "بهشهر" + os + "مازندران");
        }
        /*بهشهر*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ه")) {
            list.add(sh + "بهشهر" + os + "مازندران");
        }
        /*نوشهر*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ص")) {
            list.add(sh + "نوشهر" + os + "مازندران");
        }
        /*نوشهر*/
        if (txt4.trim().equals("82") && txt2.trim().equals("ی")) {
            list.add(sh + "نوشهر" + os + "مازندران");
        }
        /*نور*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ط")) {
            list.add(sh + "نور" + os + "مازندران");
        }
        /*نور*/
        /*رامسر*/
        if (txt4.trim().equals("72") && txt2.trim().equals("س")) {
            list.add(sh + "رامسر" + os + "مازندران");
        }
        /*محمودآباد*/
        if (txt4.trim().equals("72") && txt2.trim().equals("و")) {
            list.add(sh + "محمودآباد" + os + "مازندران");
        }
        /*نکا*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ه")) {
            list.add(sh + "نکا" + os + "مازندران");
        }
        /*سوادکوه*/
        if (txt4.trim().equals("72") && txt2.trim().equals("ب")) {
            list.add(sh + "سوادکوه" + os + "مازندران");
        }

        /*زاهدان*/
        if (txt4.trim().equals("85") && txt2.trim().equals("ب")) {
            list.add(sh + "زاهدان" + os + "سیستان و بلوچستان");
        }
        /*زاهدان*/
        if (txt4.trim().equals("85") && txt2.trim().equals("ج")) {
            list.add(sh + "زاهدان" + os + "سیستان و بلوچستان");
        }
        /*زاهدان*/
        if (txt4.trim().equals("85") && txt2.trim().equals("د")) {
            list.add(sh + "زاهدان" + os + "سیستان و بلوچستان");
        }
        /*زاهدان*/
        if (txt4.trim().equals("85") && txt2.trim().equals("س")) {
            list.add(sh + "زاهدان" + os + "سیستان و بلوچستان");
        }
        /*زاهدان*/
        if (txt4.trim().equals("85") && txt2.trim().equals("ص")) {
            list.add(sh + "زاهدان" + os + "سیستان و بلوچستان");
        }
        /*زاهدان*/
        if (txt4.trim().equals("85") && txt2.trim().equals("ط")) {
            list.add(sh + "زاهدان" + os + "سیستان و بلوچستان");
        }

        /*زابل*/
        if (txt4.trim().equals("95") && txt2.trim().equals("ب")) {
            list.add(sh + "زابل" + os + "سیستان و بلوچستان");
        }
        /*زابل*/
        if (txt4.trim().equals("95") && txt2.trim().equals("ل")) {
            list.add(sh + "زاهدان" + os + "سیستان و بلوچستان");
        }
        /*زابل*/
        if (txt4.trim().equals("95") && txt2.trim().equals("و")) {
            list.add(sh + "زابل" + os + "سیستان و بلوچستان");
        }

        /*ایرانشهر*/
        if (txt4.trim().equals("95") && txt2.trim().equals("ج")) {
            list.add(sh + "ایرانشهر" + os + "سیستان و بلوچستان");
        }
        /*ایرانشهر*/
        if (txt4.trim().equals("95") && txt2.trim().equals("م")) {
            list.add(sh + "ایرانشهر" + os + "سیستان و بلوچستان");
        }

        /*سراوان*/
        if (txt4.trim().equals("95") && txt2.trim().equals("س")) {
            list.add(sh + "سراوان" + os + "سیستان و بلوچستان");
        }
        /*سراوان*/
        if (txt4.trim().equals("95") && txt2.trim().equals("ن")) {
            list.add(sh + "سراوان" + os + "سیستان و بلوچستان");
        }

        /*نیکشهر*/
        if (txt4.trim().equals("95") && txt2.trim().equals("ص")) {
            list.add(sh + "نیکشهر" + os + "سیستان و بلوچستان");
        }
        /*خاش*/
        if (txt4.trim().equals("95") && txt2.trim().equals("د")) {
            list.add(sh + "خاش" + os + "سیستان و بلوچستان");
        }
        /*سرباز*/
        if (txt4.trim().equals("95") && txt2.trim().equals("ط")) {
            list.add(sh + "سرباز" + os + "سیستان و بلوچستان");
        }
        /*چابهار*/
        if (txt4.trim().equals("95") && txt2.trim().equals("ق")) {
            list.add(sh + "چابهار" + os + "سیستان و بلوچستان");
        }


        /*زنجان*/
        if (txt4.trim().equals("87") && txt2.trim().equals("ب")) {
            list.add(sh + "زنجان" + os + "زنجان");
        }
        /*زنجان*/
        if (txt4.trim().equals("87") && txt2.trim().equals("ج")) {
            list.add(sh + "زنجان" + os + "زنجان");
        }
        /*زنجان*/
        if (txt4.trim().equals("87") && txt2.trim().equals("د")) {
            list.add(sh + "زنجان" + os + "زنجان");
        }
        /*زنجان*/
        if (txt4.trim().equals("87") && txt2.trim().equals("س")) {
            list.add(sh + "زنجان" + os + "زنجان");
        }
        /*زنجان*/
        if (txt4.trim().equals("87") && txt2.trim().equals("ص")) {
            list.add(sh + "زنجان" + os + "زنجان");
        }
        /*زنجان*/
        if (txt4.trim().equals("87") && txt2.trim().equals("ط")) {
            list.add(sh + "زنجان" + os + "زنجان");
        }
        /*ابهر*/
        if (txt4.trim().equals("97") && txt2.trim().equals("ب")) {
            list.add(sh + "ابهر" + os + "زنجان");
        }
        /*ابهر*/
        if (txt4.trim().equals("97") && txt2.trim().equals("ق")) {
            list.add(sh + "ابهر" + os + "زنجان");
        }


        /*خدابنده*/
        if (txt4.trim().equals("97") && txt2.trim().equals("ج")) {
            list.add(sh + "خدابنده" + os + "زنجان");
        }
        /*خرمدره*/
        if (txt4.trim().equals("97") && txt2.trim().equals("د")) {
            list.add(sh + "خرمدره" + os + "زنجان");
        }
        /*ایجرود*/
        if (txt4.trim().equals("97") && txt2.trim().equals("س")) {
            list.add(sh + "ایجرود" + os + "زنجان");
        }
        /*طارم*/
        if (txt4.trim().equals("97") && txt2.trim().equals("ص")) {
            list.add(sh + "طارم" + os + "زنجان");
        }
        /*ماه نشان*/
        if (txt4.trim().equals("97") && txt2.trim().equals("ط")) {
            list.add(sh + "ماه نشان" + os + "زنجان");
        }


        /*سنندج*/
        if (txt4.trim().equals("51") && txt2.trim().equals("ب")) {
            list.add(sh + "سنندج" + os + "کردستان");
        }
        /*سنندج*/
        if (txt4.trim().equals("51") && txt2.trim().equals("ج")) {
            list.add(sh + "سنندج" + os + "کردستان");
        }
        /*سنندج*/
        if (txt4.trim().equals("51") && txt2.trim().equals("د")) {
            list.add(sh + "سنندج" + os + "کردستان");
        }
        /*سنندج*/
        if (txt4.trim().equals("51") && txt2.trim().equals("س")) {
            list.add(sh + "سنندج" + os + "کردستان");
        }
        /*سنندج*/
        if (txt4.trim().equals("51") && txt2.trim().equals("ص")) {
            list.add(sh + "سنندج" + os + "کردستان");
        }

        /*سقز*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ب")) {
            list.add(sh + "سقز" + os + "کردستان");
        }
        /*سقز*/
        if (txt4.trim().equals("61") && txt2.trim().equals("م")) {
            list.add(sh + "سقز" + os + "کردستان");
        }

        /*قروه*/
        if (txt4.trim().equals("61") && txt2.trim().equals("س")) {
            list.add(sh + "قروه" + os + "کردستان");
        }
        /*قروه*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ن")) {
            list.add(sh + "قروه" + os + "کردستان");
        }
        /*مریوان*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ص")) {
            list.add(sh + "مریوان" + os + "کردستان");
        }
        /*مریوان*/
        if (txt4.trim().equals("61") && txt2.trim().equals("و")) {
            list.add(sh + "مریوان" + os + "کردستان");
        }
        /*بانه*/
        if (txt4.trim().equals("61") && txt2.trim().equals("د")) {
            list.add(sh + "بانه" + os + "کردستان");
        }
        /*بانه*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ه")) {
            list.add(sh + "بانه" + os + "کردستان");
        }
        /*بیجار*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ج")) {
            list.add(sh + "بیجار" + os + "کردستان");
        }
        /*دیواندره*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ط")) {
            list.add(sh + "دیواندره" + os + "کردستان");
        }
        /*کامیاران*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ق")) {
            list.add(sh + "کامیاران" + os + "کردستان");
        }
        /*سروآباد*/
        if (txt4.trim().equals("61") && txt2.trim().equals("ل")) {
            list.add(sh + "سروآباد" + os + "کردستان");
        }

        /*خرم آباد*/
        if (txt4.trim().equals("31") && txt2.trim().equals("ب")) {
            list.add(sh + "خرم آّباد" + os + "لرستان");
        }
        /*خرم آباد*/
        if (txt4.trim().equals("31") && txt2.trim().equals("ج")) {
            list.add(sh + "خرم آّباد" + os + "لرستان");
        }
        /*خرم آباد*/
        if (txt4.trim().equals("31") && txt2.trim().equals("د")) {
            list.add(sh + "خرم آّباد" + os + "لرستان");
        }
        /*خرم آباد*/
        if (txt4.trim().equals("31") && txt2.trim().equals("س")) {
            list.add(sh + "خرم آّباد" + os + "لرستان");
        }
        /*خرم آباد*/
        if (txt4.trim().equals("31") && txt2.trim().equals("ص")) {
            list.add(sh + "خرم آّباد" + os + "لرستان");
        }

        /*بروجرد*/
        if (txt4.trim().equals("41") && txt2.trim().equals("ب")) {
            list.add(sh + "بروجرد" + os + "لرستان");
        }
        /*بروجرد*/
        if (txt4.trim().equals("41") && txt2.trim().equals("م")) {
            list.add(sh + "بروجرد" + os + "لرستان");
        }
        /*بروجرد*/
        if (txt4.trim().equals("41") && txt2.trim().equals("ن")) {
            list.add(sh + "بروجرد" + os + "لرستان");
        }
        /*دورود*/
        if (txt4.trim().equals("41") && txt2.trim().equals("د")) {
            list.add(sh + "دورود" + os + "لرستان");
        }
        /*دورود*/
        if (txt4.trim().equals("41") && txt2.trim().equals("ج")) {
            list.add(sh + "الیگودرز" + os + "لرستان");
        }
        /*دلفان*/
        if (txt4.trim().equals("41") && txt2.trim().equals("ص")) {
            list.add(sh + "دلفان" + os + "لرستان");
        }
        /*ازنا*/
        if (txt4.trim().equals("41") && txt2.trim().equals("ط")) {
            list.add(sh + "ازنا" + os + "لرستان");
        }
        /*پل دختر*/
        if (txt4.trim().equals("41") && txt2.trim().equals("ق")) {
            list.add(sh + "پل دختر" + os + "لرستان");
        }
        /*سلسله*/
        if (txt4.trim().equals("41") && txt2.trim().equals("ل")) {
            list.add(sh + "سلسله" + os + "لرستان");
        }
        /*کوه دشت*/
        if (txt4.trim().equals("41") && txt2.trim().equals("س")) {
            list.add(sh + "خرم آّباد" + os + "لرستان");
        }

        /*گرگان*/
        if (txt4.trim().equals("59") && txt2.trim().equals("ب")) {
            list.add(sh + "گرگان" + os + "گلستان");
        }
        /*گرگان*/
        if (txt4.trim().equals("59") && txt2.trim().equals("ج")) {
            list.add(sh + "گرگان" + os + "گلستان");
        }
        /*گرگان*/
        if (txt4.trim().equals("59") && txt2.trim().equals("د")) {
            list.add(sh + "گرگان" + os + "گلستان");
        }
        /*گرگان*/
        if (txt4.trim().equals("59") && txt2.trim().equals("س")) {
            list.add(sh + "گرگان" + os + "گلستان");
        }
        /*گرگان*/
        if (txt4.trim().equals("59") && txt2.trim().equals("ص")) {
            list.add(sh + "گرگان" + os + "گلستان");
        }

        /*گنبدکاووس*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ب")) {
            list.add(sh + "گنبدکاووس" + os + "گلستان");
        }
        /*گنبدکاووس*/
        if (txt4.trim().equals("69") && txt2.trim().equals("و")) {
            list.add(sh + "گنبدکاووس" + os + "گلستان");
        }
        /*گنبدکاووس*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ه")) {
            list.add(sh + "گنبدکاووس" + os + "گلستان");
        }

        /*بندر ترکمن*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ج")) {
            list.add(sh + "بندر ترکمن" + os + "گلستان");
        }
        /*کردکوی*/
        if (txt4.trim().equals("69") && txt2.trim().equals("د")) {
            list.add(sh + "کردکوی" + os + "گلستان");
        }
        /*علی آباد*/
        if (txt4.trim().equals("69") && txt2.trim().equals("س")) {
            list.add(sh + "علی آباد" + os + "گلستان");
        }
        /*آزادشهر*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ص")) {
            list.add(sh + "آزادشهر" + os + "گلستان");
        }
        /*مینودشت*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ط")) {
            list.add(sh + "مینودشت" + os + "گلستان");
        }
        /*بندر گز*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ق")) {
            list.add(sh + "بندر گز" + os + "گلستان");
        }
        /*رامیان*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ل")) {
            list.add(sh + "رامیان" + os + "گلستان");
        }
        /*آق قلا*/
        if (txt4.trim().equals("69") && txt2.trim().equals("م")) {
            list.add(sh + "آق قلا" + os + "گلستان");
        }
        /*کلاله*/
        if (txt4.trim().equals("69") && txt2.trim().equals("ن")) {
            list.add(sh + "کلاله" + os + "گلستان");
        }


        /*شهرکرد*/
        if (txt4.trim().equals("71") && txt2.trim().equals("ب")) {
            list.add(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
        }
        /*شهرکرد*/
        if (txt4.trim().equals("71") && txt2.trim().equals("ج")) {
            list.add(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
        }
        /*شهرکرد*/
        if (txt4.trim().equals("71") && txt2.trim().equals("د")) {
            list.add(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
        }
        /*شهرکرد*/
        if (txt4.trim().equals("71") && txt2.trim().equals("س")) {
            list.add(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
        }
        /*شهرکرد*/
        if (txt4.trim().equals("71") && txt2.trim().equals("ص")) {
            list.add(sh + "شهرکرد" + os + "چهارمحال و بختیاری");
        }

        /*بروجن*/
        if (txt4.trim().equals("81") && txt2.trim().equals("ب")) {
            list.add(sh + "بروجن" + os + "چهارمحال و بختیاری");
        }
        /*بروجن*/
        if (txt4.trim().equals("81") && txt2.trim().equals("ق")) {
            list.add(sh + "بروجن" + os + "چهارمحال و بختیاری");
        }
        /*اردل*/
        if (txt4.trim().equals("81") && txt2.trim().equals("ج")) {
            list.add(sh + "اردل" + os + "چهارمحال و بختیاری");
        }
        /*فارسان*/
        if (txt4.trim().equals("81") && txt2.trim().equals("د")) {
            list.add(sh + "فارسان" + os + "چهارمحال و بختیاری");
        }
        /*لردگان*/
        if (txt4.trim().equals("81") && txt2.trim().equals("س")) {
            list.add(sh + "لردگان" + os + "چهارمحال و بختیاری");
        }
        /*کوهرنگ*/
        if (txt4.trim().equals("81") && txt2.trim().equals("ص")) {
            list.add(sh + "کوهرنگ" + os + "چهارمحال و بختیاری");
        }


        /*بوشهر*/
        if (txt4.trim().equals("48") && txt2.trim().equals("ب")) {
            list.add(sh + "بوشهر" + os + "بوشهر");
        }
        /*بوشهر*/
        if (txt4.trim().equals("48") && txt2.trim().equals("ج")) {
            list.add(sh + "بوشهر" + os + "بوشهر");
        }
        /*بوشهر*/
        if (txt4.trim().equals("48") && txt2.trim().equals("د")) {
            list.add(sh + "بوشهر" + os + "بوشهر");
        }
        /*بوشهر*/
        if (txt4.trim().equals("48") && txt2.trim().equals("س")) {
            list.add(sh + "بوشهر" + os + "بوشهر");
        }
        /*دشتستان*/
        if (txt4.trim().equals("58") && txt2.trim().equals("ب")) {
            list.add(sh + "دشتستان" + os + "بوشهر");
        }
        /*دشتستان*/
        if (txt4.trim().equals("58") && txt2.trim().equals("م")) {
            list.add(sh + "دشتستان" + os + "بوشهر");
        }
        /*گناوه*/
        if (txt4.trim().equals("58") && txt2.trim().equals("ج")) {
            list.add(sh + "گناوه" + os + "بوشهر");
        }
        /*کنگان*/
        if (txt4.trim().equals("58") && txt2.trim().equals("د")) {
            list.add(sh + "کنگان" + os + "بوشهر");
        }
        /*تنگستان*/
        if (txt4.trim().equals("58") && txt2.trim().equals("س")) {
            list.add(sh + "تنگستان" + os + "بوشهر");
        }
        /*دشتی*/
        if (txt4.trim().equals("58") && txt2.trim().equals("ص")) {
            list.add(sh + "دشتی" + os + "بوشهر");
        }
        /*دیر*/
        if (txt4.trim().equals("58") && txt2.trim().equals("ط")) {
            list.add(sh + "دیر" + os + "بوشهر");
        }
        /*دیلم*/
        if (txt4.trim().equals("58") && txt2.trim().equals("ق")) {
            list.add(sh + "دیلم" + os + "بوشهر");
        }
        /*جم*/
        if (txt4.trim().equals("58") && txt2.trim().equals("ل")) {
            list.add(sh + "جم" + os + "بوشهر");
        }


        /*بجنورد*/
        if (txt4.trim().equals("26") && txt2.trim().equals("ب")) {
            list.add(sh + "بجنورد" + os + "خراسان شمالی");
        }
        /*بجنورد*/
        if (txt4.trim().equals("26") && txt2.trim().equals("ج")) {
            list.add(sh + "بجنورد" + os + "خراسان شمالی");
        }
        /*بجنورد*/
        if (txt4.trim().equals("26") && txt2.trim().equals("د")) {
            list.add(sh + "بجنورد" + os + "خراسان شمالی");
        }
        /*بجنورد*/
        if (txt4.trim().equals("32") && txt2.trim().equals("س")) {
            list.add(sh + "بجنورد" + os + "خراسان شمالی");
        }

        /*شیروان*/
        if (txt4.trim().equals("26") && txt2.trim().equals("ص")) {
            list.add(sh + "شیروان" + os + "خراسان شمالی");
        }
        /*اسفراین*/
        if (txt4.trim().equals("26") && txt2.trim().equals("ط")) {
            list.add(sh + "اسفراین" + os + "خراسان شمالی");
        }
        /*جاجرم*/
        if (txt4.trim().equals("26") && txt2.trim().equals("ق")) {
            list.add(sh + "جاجرم" + os + "خراسان شمالی");
        }
        /*مانه و سلمقان*/
        if (txt4.trim().equals("26") && txt2.trim().equals("ل")) {
            list.add(sh + "مانه و سلمقان" + os + "خراسان شمالی");
        }
        /*فاروج*/
        if (txt4.trim().equals("26") && txt2.trim().equals("م")) {
            list.add(sh + "فاروج" + os + "خراسان شمالی");
        }


        /*بیرجند*/
        if (txt4.trim().equals("52") && txt2.trim().equals("ب")) {
            list.add(sh + "بیرجند" + os + "خراسان جنوبی");
        }
        /*بیرجند*/
        if (txt4.trim().equals("52") && txt2.trim().equals("ج")) {
            list.add(sh + "بیرجند" + os + "خراسان جنوبی");
        }
        /*بیرجند*/
        if (txt4.trim().equals("52") && txt2.trim().equals("د")) {
            list.add(sh + "بیرجند" + os + "خراسان جنوبی");
        }
        /*بیرجند*/
        if (txt4.trim().equals("32") && txt2.trim().equals("د")) {
            list.add(sh + "بیرجند" + os + "خراسان جنوبی");
        }

        /*قائنات*/
        if (txt4.trim().equals("52") && txt2.trim().equals("ص")) {
            list.add(sh + "قائنات" + os + "خراسان جنوبی");
        }
        /*فردوس*/
        if (txt4.trim().equals("52") && txt2.trim().equals("ط")) {
            list.add(sh + "فردوس" + os + "خراسان جنوبی");
        }
        /*نهبندان*/
        if (txt4.trim().equals("52") && txt2.trim().equals("ق")) {
            list.add(sh + "نهبندان" + os + "خراسان جنوبی");
        }
        /*سربیشه*/
        if (txt4.trim().equals("52") && txt2.trim().equals("ل")) {
            list.add(sh + "سربیشه" + os + "خراسان جنوبی");
        }
        /*طبس*/
        if (txt4.trim().equals("64") && txt2.trim().equals("ق")) {
            list.add(sh + "طبس" + os + "خراسان جنوبی");
        }


        /*سمنان*/
        if (txt4.trim().equals("86") && txt2.trim().equals("ب")) {
            list.add(sh + "سمنان" + os + "سمنان");
        }
        /*سمنان*/
        if (txt4.trim().equals("86") && txt2.trim().equals("ج")) {
            list.add(sh + "سمنان" + os + "سمنان");
        }
        /*سمنان*/
        if (txt4.trim().equals("86") && txt2.trim().equals("د")) {
            list.add(sh + "سمنان" + os + "سمنان");
        }

        /*شاهرود*/
        if (txt4.trim().equals("96") && txt2.trim().equals("ج")) {
            list.add(sh + "شاهرود" + os + "سمنان");
        }
        /*شاهرود*/
        if (txt4.trim().equals("96") && txt2.trim().equals("ص")) {
            list.add(sh + "شاهرود" + os + "سمنان");
        }
        /*شاهرود*/
        if (txt4.trim().equals("96") && txt2.trim().equals("ط")) {
            list.add(sh + "شاهرود" + os + "سمنان");
        }
        /*دامغان*/
        if (txt4.trim().equals("96") && txt2.trim().equals("ب")) {
            list.add(sh + "دامغان" + os + "سمنان");
        }
        /*گرمسار*/
        if (txt4.trim().equals("96") && txt2.trim().equals("د")) {
            list.add(sh + "گرمسار" + os + "سمنان");
        }
        /*مهدی شهر*/
        if (txt4.trim().equals("96") && txt2.trim().equals("س")) {
            list.add(sh + "مهدی شهر" + os + "سمنان");
        }


        /*ایلام*/
        if (txt4.trim().equals("98") && txt2.trim().equals("ب")) {
            list.add(sh + "ایلام" + os + "ایلام");
        }
        /*ایلام*/
        if (txt4.trim().equals("98") && txt2.trim().equals("ج")) {
            list.add(sh + "ایلام" + os + "ایلام");
        }
        /*ایلام*/
        if (txt4.trim().equals("98") && txt2.trim().equals("د")) {
            list.add(sh + "ایلام" + os + "ایلام");
        }

        /*مهران*/
        if (txt4.trim().equals("98") && txt2.trim().equals("ص")) {
            list.add(sh + "مهران" + os + "ایلام");
        }
        /*داره شهر*/
        if (txt4.trim().equals("98") && txt2.trim().equals("ط")) {
            list.add(sh + "داره شهر" + os + "ایلام");
        }
        /*دهلران*/
        if (txt4.trim().equals("98") && txt2.trim().equals("ق")) {
            list.add(sh + "دهلران" + os + "ایلام");
        }
        /*سیروان*/
        if (txt4.trim().equals("98") && txt2.trim().equals("ل")) {
            list.add(sh + "سیروان" + os + "ایلام");
        }
        /*ایوان*/
        if (txt4.trim().equals("98") && txt2.trim().equals("م")) {
            list.add(sh + "ایوان" + os + "ایلام");
        }
        /*آبدانان*/
        if (txt4.trim().equals("98") && txt2.trim().equals("ن")) {
            list.add(sh + "آبدانان" + os + "ایلام");
        }


        /*یاسوج*/
        if (txt4.trim().equals("49") && txt2.trim().equals("ب")) {
            list.add(sh + "یاسوج" + os + "کهگیلوبه و بویراحد");
        }
        /*یاسوج*/
        if (txt4.trim().equals("49") && txt2.trim().equals("ج")) {
            list.add(sh + "یاسوج" + os + "کهگیلوبه و بویراحد");
        }
        /*یاسوج*/
        if (txt4.trim().equals("49") && txt2.trim().equals("د")) {
            list.add(sh + "یاسوج" + os + "کهگیلوبه و بویراحد");
        }

        /*گچساران*/
        if (txt4.trim().equals("49") && txt2.trim().equals("ص")) {
            list.add(sh + "گچساران" + os + "کهگیلوبه و بویراحد");
        }
        /*گچساران*/
        if (txt4.trim().equals("49") && txt2.trim().equals("ل")) {
            list.add(sh + "گچساران" + os + "کهگیلوبه و بویراحد");
        }
        /*دهدشت*/
        if (txt4.trim().equals("49") && txt2.trim().equals("ط")) {
            list.add(sh + "دهدشت" + os + "کهگیلوبه و بویراحد");
        }
        /*سی سخت*/
        if (txt4.trim().equals("49") && txt2.trim().equals("ق")) {
            list.add(sh + "سی سخت" + os + "کهگیلوبه و بویراحد");
        }

        if (txt4.trim().equals("15") && txt2.trim().equals("ب")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ج")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("د")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("س")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ص")) {
            list.add(sh + " تبريز" + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ط")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ق")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ل")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("م")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ن")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("و")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ه")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("15") && txt2.trim().equals("ي")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("ل")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("م")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("ه")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }
        if (txt4.trim().equals("35") && txt2.trim().equals("ی")) {
            list.add(sh + " تبريز " + os + "آذربایجان شرقی");
        }

        /* مراغه*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ب")) {
            list.add(sh + " مراغه " + os + "آذربایجان شرقی");
        }
        /*مرند*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ج")) {
            list.add(sh + " مرند " + os + "آذربایجان شرقی");
        }
        /*ميانه*/
        if (txt4.trim().equals("25") && txt2.trim().equals("د")) {
            list.add(sh + " میانه " + os + "آذربایجان شرقی");
        }
        /*اهر*/
        if (txt4.trim().equals("25") && txt2.trim().equals("س")) {
            list.add(sh + " اهر" + os + "آذربایجان شرقی");
        }
        /*سراب*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ص")) {
            list.add(sh + " سراب" + os + "آذربایجان شرقی");
        }
        /*جلفا*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ط")) {
            list.add(sh + " جلفا" + os + "آذربایجان شرقی");
        }
        /*هشترود*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ق")) {
            list.add(sh + " هشترود" + os + "آذربایجان شرقی");
        }
        /*بناب*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ل")) {
            list.add(sh + " بناب" + os + "آذربایجان شرقی");
        }
        /*بستان آباد*/
        if (txt4.trim().equals("25") && txt2.trim().equals("م")) {
            list.add(sh + " بستان آباد" + os + "آذربایجان شرقی");
        }
        /*شبستر*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ن")) {
            list.add(sh + " شبستر" + os + "آذربایجان شرقی");
        }
        /*کلييبر*/
        if (txt4.trim().equals("25") && txt2.trim().equals("و")) {
            list.add(sh + " کلييبر" + os + "آذربایجان شرقی");
        }
        /*هريس*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ه")) {
            list.add(sh + " هريس" + os + "آذربایجان شرقی");
        }
        /*آذرشهر*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ي")) {
            list.add(sh + " آذرشهر" + os + "آذربایجان شرقی");
        }
        /*اسکو*/
        if (txt4.trim().equals("35") && txt2.trim().equals("ب")) {
            list.add(sh + " اسکو" + os + "آذربایجان شرقی");
        }
        /*ملکان*/
        if (txt4.trim().equals("35") && txt2.trim().equals("ص")) {
            list.add(sh + " ملکان" + os + "آذربایجان شرقی");
        }



        /*اروميه*/
        if (txt4.trim().equals("17") && txt2.trim().equals("ب")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ج")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("د")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("س")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ص")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ط")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ق")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }

        if (txt4.trim().equals("17") && txt2.trim().equals("ل")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");

        }
        if (txt4.trim().equals("17") && txt2.trim().equals("م")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ن")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("و")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ه")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        /*بوکان*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ن")) {
            list.add(sh + " بوکان" + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ط")) {
            list.add(sh + " بوکان " + os + "آذربایجان غربی");
        }
        /*مهاباد*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ج")) {
            list.add(sh + " مهاباد " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ص")) {
            list.add(sh + " مهاباد " + os + "آذربایجان غربی");
        }
        /*سردشت*/
        if (txt4.trim().equals("27") && txt2.trim().equals("م")) {
            list.add(sh + " سردشت " + os + "آذربایجان غربی");
        }
        /*خوي*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ب")) {
            list.add(sh + " خوي " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ب")) {
            list.add(sh + " خوي " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("م")) {
            list.add(sh + " خوي " + os + "آذربایجان غربی");
        }
        /*سلماس*/
        if (txt4.trim().equals("27") && txt2.trim().equals("س")) {
            list.add(sh + " سلماس " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ق")) {
            list.add(sh + " سلماس " + os + "آذربایجان غربی");
        }
        /*نقده*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ص")) {
            list.add(sh + " نقده " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("د")) {
            list.add(sh + " نقده " + os + "آذربایجان غربی");
        }
        /*مياندوآب*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ط")) {
            list.add(sh + " مياندوآب " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ج")) {
            list.add(sh + " مياندوآب " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ن")) {
            list.add(sh + " مياندوآب " + os + "آذربایجان غربی");
        }
        /*پيرانشهر*/
        if (txt4.trim().equals("27") && txt2.trim().equals("و")) {
            list.add(sh + " پيرانشهر " + os + "آذربایجان غربی");
        }
        /*اشنويه*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ي")) {
            list.add(sh + " اشنويه " + os + "آذربایجان غربی");
        }
        /*شاهين دژ*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ل")) {
            list.add(sh + " شاهين دژ " + os + "آذربایجان غربی");
        }
        /*ماکو*/
        if (txt4.trim().equals("27") && txt2.trim().equals("د")) {
            list.add(sh + " ماکو " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ل")) {
            list.add(sh + " ماکو " + os + "آذربایجان غربی");
        }
        /*تکاب*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ق")) {
            list.add(sh + " تکاب " + os + "آذربایجان غربی");
        }
        /*چالدران*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ه")) {
            list.add(sh + " چالدران " + os + "آذربایجان غربی");
        }

        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ل")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("م")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ن")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("و")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ج")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("د")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("س")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ص")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ط")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ق")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }

        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ب")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*اسلام آباد غرب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ه")) {
            list.add(sh + "اسلام آباد غرب" + os + "کرمانشاه");
        }
        /*اسلام آباد غرب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ب")) {
            list.add(sh + "اسلام آباد غرب" + os + "کرمانشاه");
        }
        /*گیلان غرب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ج")) {
            list.add(sh + "گیلان غرب" + os + "کرمانشاه");
        }
        /*سرپل ذهاب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("د")) {
            list.add(sh + "سرپل ذهاب" + os + "کرمانشاه");
        }
        /*پاوه*/
        if (txt4.trim().equals("29") && txt2.trim().equals("س")) {
            list.add(sh + "پاوه" + os + "کرمانشاه");
        }
        /*کنگاور*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ص")) {
            list.add(sh + "کنگاور" + os + "کرمانشاه");
        }
        /*قصر شیرین*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ط")) {
            list.add(sh + "قصر شیرین" + os + "کرمانشاه");
        }
        /*سنقر*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ق")) {
            list.add(sh + "سنقر" + os + "کرمانشاه");
        }
        /*جوانرود*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ل")) {
            list.add(sh + "ر" + os + "کرمانشاه");
        }
        /*صحنه*/
        if (txt4.trim().equals("29") && txt2.trim().equals("م")) {
            list.add(sh + "صحنه" + os + "کرمانشاه");
        }
        /*هرسین*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ن")) {
            list.add(sh + "هرسین" + os + "کرمانشاه");
        }
        /*ثلاث باباجانی*/
        if (txt4.trim().equals("29") && txt2.trim().equals("و")) {
            list.add(sh + "ثلاث باباجانی" + os + "کرمانشاه");
        }



        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ل")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("م")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ن")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("و")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ج")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("د")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("س")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ص")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ط")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ق")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ب")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*کلييبر*/
        if (txt4.trim().equals("25") && txt2.trim().equals("و")) {
            list.add(sh + " کلييبر" + os + "آذربایجان شرقی");
        }
        /*هريس*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ه")) {
            list.add(sh + " هريس" + os + "آذربایجان شرقی");
        }
        /*آذرشهر*/
        if (txt4.trim().equals("25") && txt2.trim().equals("ي")) {
            list.add(sh + " آذرشهر" + os + "آذربایجان شرقی");
        }
        /*اسکو*/
        if (txt4.trim().equals("35") && txt2.trim().equals("ب")) {
            list.add(sh + " اسکو" + os + "آذربایجان شرقی");
        }
        /*ورزقان*/

        if (txt4.trim().equals("35") && txt2.trim().equals("ص")) {
            list.add(sh + " ملکان" + os + "آذربایجان شرقی");
        }



        /*اروميه*/
        if (txt4.trim().equals("17") && txt2.trim().equals("ب")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ج")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("د")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("س")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ص")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ط")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ق")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ل")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("م")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ن")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("و")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("17") && txt2.trim().equals("ه")) {
            list.add(sh + " اروميه " + os + "آذربایجان غربی");
        }
        /*بوکان*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ن")) {
            list.add(sh + " بوکا ن" + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ط")) {
            list.add(sh + " بوکان " + os + "آذربایجان غربی");
        }
        /*مهاباد*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ج")) {
            list.add(sh + " مهاباد " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ص")) {
            list.add(sh + " مهاباد " + os + "آذربایجان غربی");
        }
        /*سردشت*/
        if (txt4.trim().equals("27") && txt2.trim().equals("م")) {
            list.add(sh + " سردشت " + os + "آذربایجان غربی");
        }
        /*خوي*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ب")) {
            list.add(sh + " خوي " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ب")) {
            list.add(sh + " خوي " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("م")) {
            list.add(sh + " خوي " + os + "آذربایجان غربی");
        }
        /*سلماس*/
        if (txt4.trim().equals("27") && txt2.trim().equals("س")) {
            list.add(sh + " سلماس " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ق")) {
            list.add(sh + " سلماس " + os + "آذربایجان غربی");
        }
        /*نقده*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ص")) {
            list.add(sh + " نقده " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("د")) {
            list.add(sh + " نقده " + os + "آذربایجان غربی");
        }
        /*مياندوآب*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ط")) {
            list.add(sh + " مياندوآب " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ج")) {
            list.add(sh + " مياندوآب " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ن")) {
            list.add(sh + " مياندوآب " + os + "آذربایجان غربی");
        }
        /*پيرانشهر*/
        if (txt4.trim().equals("27") && txt2.trim().equals("و")) {
            list.add(sh + " پيرانشهر " + os + "آذربایجان غربی");
        }
        /*اشنويه*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ي")) {
            list.add(sh + " اشنويه " + os + "آذربایجان غربی");
        }
        /*شاهين دژ*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ل")) {
            list.add(sh + " شاهين دژ " + os + "آذربایجان غربی");
        }
        /*ماکو*/
        if (txt4.trim().equals("27") && txt2.trim().equals("د")) {
            list.add(sh + " ماکو " + os + "آذربایجان غربی");
        }
        if (txt4.trim().equals("37") && txt2.trim().equals("ل")) {
            list.add(sh + " ماکو " + os + "آذربایجان غربی");
        }
        /*تکاب*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ق")) {
            list.add(sh + " تکاب " + os + "آذربایجان غربی");
        }
        /*چالدران*/
        if (txt4.trim().equals("27") && txt2.trim().equals("ه")) {
            list.add(sh + " چالدران " + os + "آذربایجان غربی");
        }

        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ل")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("م")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ن")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("و")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ج")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("د")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("س")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ص")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ط")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ق")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*کرمانشاه*/
        if (txt4.trim().equals("19") && txt2.trim().equals("ب")) {
            list.add(sh + "کرمانشاه" + os + "کرمانشاه");
        }
        /*اسلام آباد غرب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ه")) {
            list.add(sh + "اسلام آباد غرب" + os + "کرمانشاه");
        }
        /*اسلام آباد غرب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ب")) {
            list.add(sh + "اسلام آباد غرب" + os + "کرمانشاه");
        }
        /*گیلان غرب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ج")) {
            list.add(sh + "گیلان غرب" + os + "کرمانشاه");
        }
        /*سرپل ذهاب*/
        if (txt4.trim().equals("29") && txt2.trim().equals("د")) {
            list.add(sh + "سرپل ذهاب" + os + "کرمانشاه");
        }
        /*پاوه*/
        if (txt4.trim().equals("29") && txt2.trim().equals("س")) {
            list.add(sh + "پاوه" + os + "کرمانشاه");
        }
        /*کنگاور*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ص")) {
            list.add(sh + "کنگاور" + os + "کرمانشاه");
        }
        /*قصر شیرین*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ط")) {
            list.add(sh + "قصر شیرین" + os + "کرمانشاه");
        }
        /*سنقر*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ق")) {
            list.add(sh + "سنقر" + os + "کرمانشاه");
        }
        /*جوانرود*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ل")) {
            list.add(sh + "ر" + os + "کرمانشاه");
        }
        /*صحنه*/
        if (txt4.trim().equals("29") && txt2.trim().equals("م")) {
            list.add(sh + "صحنه" + os + "کرمانشاه");
        }
        /*هرسین*/
        if (txt4.trim().equals("29") && txt2.trim().equals("ن")) {
            list.add(sh + "هرسین" + os + "کرمانشاه");
        }
        /*ثلاث باباجانی*/
        if (txt4.trim().equals("29") && txt2.trim().equals("و")) {
            list.add(sh + "ثلاث باباجانی" + os + "کرمانشاه");
        }



        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ل")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("م")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ن")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("و")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ج")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("د")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("س")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ص")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ط")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ق")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*رشت*/
        if (txt4.trim().equals("46") && txt2.trim().equals("ب")) {
            list.add(sh + " رشت" + os + "گیلان");
        }
        /*لاهیجان*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ج")) {
            list.add(sh + " لاهیجان" + os + "گیلان");
        }
        /*لاهیجان*/
        if (txt4.trim().equals("76") && txt2.trim().equals("د")) {
            list.add(sh + " لاهیجان" + os + "گیلان");
        }
        /*انزلی*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ب")) {
            list.add(sh + " انزلی" + os + "گیلان");
        }
        /*انزلی*/
        if (txt4.trim().equals("76س") && txt2.trim().equals("ج")) {
            list.add(sh + " انزلی" + os + "گیلان");
        }
        /*لنگرود*/
        if (txt4.trim().equals("56") && txt2.trim().equals("م")) {
            list.add(sh + " لنگرود" + os + "گیلان");
        }
        /*لنگرود*/
        if (txt4.trim().equals("76") && txt2.trim().equals("ص")) {
            list.add(sh + " لنگرود" + os + "گیلان");
        }
        /*تالش*/
        if (txt4.trim().equals("56") && txt2.trim().equals("س")) {
            list.add(sh + " تالش" + os + "گیلان");
        }
        /*تالش*/
        if (txt4.trim().equals("76") && txt2.trim().equals("ط")) {
            list.add(sh + " تالش" + os + "گیلان");
        }
        /*رودسر*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ص")) {
            list.add(sh + " رودسر" + os + "گیلان");
        }
        /*رودسر*/
        if (txt4.trim().equals("76") && txt2.trim().equals("ق")) {
            list.add(sh + " ر" + os + "گیلان");
        }

        /*آستارا*/
        if (txt4.trim().equals("56") && txt2.trim().equals("د")) {
            list.add(sh + " آستارا" + os + "گیلان");
        }
        /*رودبار*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ط")) {
            list.add(sh + " رودبار" + os + "گیلان");
        }
        /*صومعه سرا*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ق")) {
            list.add(sh + "صومعه سرا" + os + "گیلان");
        }
        /*فومن*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ل")) {
            list.add(sh + " فومن" + os + "گیلان");
        }
        /*رضوانشهر*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ن")) {
            list.add(sh + " رضوانشهر" + os + "گیلان");
        }
        /*املش*/
        if (txt4.trim().equals("56") && txt2.trim().equals("و")) {
            list.add(sh + " املش" + os + "گیلان");
        }
        /*ماسال*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ه")) {
            list.add(sh + " ماسال" + os + "گیلان");
        }
        /*شفت*/
        if (txt4.trim().equals("56") && txt2.trim().equals("ی")) {
            list.add(sh + " شفت" + os + "گیلان");
        }
        /*سیاهکل*/
        if (txt4.trim().equals("76") && txt2.trim().equals("ب")) {
            list.add(sh + " سیاهکل" + os + "گیلان");
        }
        /*آستانه اشرفیه*/
        if (txt4.trim().equals("76") && txt2.trim().equals("ج")) {
            list.add(sh + " آستانه اشرفیه" + os + "گیلان");
        }

        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("ل")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("م")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("ن")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("ج")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("د")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("س")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("ص")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("ط")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("ق")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }
        /*کرمان*/
        if (txt4.trim().equals("45") && txt2.trim().equals("ب")) {
            list.add(sh + "کرمان" + os + "کرمان");
        }

        /*رفسنجان*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ب")) {
            list.add(sh + "رفسنجان" + os + "کرمان");
        }
        /*رفسنجان*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ی")) {
            list.add(sh + "رفسنجان" + os + "کرمان");
        }
        /*رفسنجان*/
        if (txt4.trim().equals("75") && txt2.trim().equals("س")) {
            list.add(sh + "رفسنجان" + os + "کرمان");
        }
        /*رفسنجان*/
        if (txt4.trim().equals("75") && txt2.trim().equals("ل")) {
            list.add(sh + "رفسنجان" + os + "کرمان");
        }

        /*سیرجان*/
        if (txt4.trim().equals("65") && txt2.trim().equals("د")) {
            list.add(sh + "سیرجان" + os + "کرمان");
        }
        /*سیرجان*/
        if (txt4.trim().equals("75") && txt2.trim().equals("ب")) {
            list.add(sh + "سیرجان" + os + "کرمان");
        }
        /*سیرجان*/
        if (txt4.trim().equals("75") && txt2.trim().equals("ص")) {
            list.add(sh + "سیرجان" + os + "کرمان");
        }
        /*سیرجان*/
        if (txt4.trim().equals("75") && txt2.trim().equals("م")) {
            list.add(sh + "سیرجان" + os + "کرمان");
        }

        /*بم*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ج")) {
            list.add(sh + "بم" + os + "کرمان");
        }
        /*بم*/
        if (txt4.trim().equals("75") && txt2.trim().equals("ج")) {
            list.add(sh + "بم" + os + "کرمان");
        }

        /*جیرفت*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ص")) {
            list.add(sh + "جیرفت" + os + "کرمان");
        }
        /*جیرفت*/
        if (txt4.trim().equals("75") && txt2.trim().equals("د")) {
            list.add(sh + "جیرفت" + os + "کرمان");
        }

        /*زرند*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ط")) {
            list.add(sh + "زرند" + os + "کرمان");
        }
        /*زرند*/
        if (txt4.trim().equals("75") && txt2.trim().equals("ط")) {
            list.add(sh + "زرند" + os + "کرمان");
        }

        /*کهنوج*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ق")) {
            list.add(sh + "کهنوج" + os + "کرمان");
        }
        /*کهنوج*/
        if (txt4.trim().equals("75") && txt2.trim().equals("ق")) {
            list.add(sh + "کهنوج" + os + "کرمان");
        }

        /*بافت*/
        if (txt4.trim().equals("65") && txt2.trim().equals("س")) {
            list.add(sh + "بافت" + os + "کرمان");
        }
        /*شهر بابک*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ل")) {
            list.add(sh + "شهر بابک" + os + "کرمان");
        }
        /*بردسیر*/
        if (txt4.trim().equals("65") && txt2.trim().equals("م")) {
            list.add(sh + "بردسیر" + os + "کرمان");
        }
        /*منوجان*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ن")) {
            list.add(sh + "منوجان" + os + "کرمان");
        }
        /*عنبرآباد*/
        if (txt4.trim().equals("65") && txt2.trim().equals("و")) {
            list.add(sh + "عنبرآباد" + os + "کرمان");
        }
        /*راور*/
        if (txt4.trim().equals("65") && txt2.trim().equals("ه")) {
            list.add(sh + "راور" + os + "کرمان");
        }


        /*یزد*/
        if (txt4.trim().equals("54") && txt2.trim().equals("ل")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        /*یزد*/
        if (txt4.trim().equals("54") && txt2.trim().equals("م")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        /*یزد*/
        if (txt4.trim().equals("54") && txt2.trim().equals("ج")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        if (txt4.trim().equals("54") && txt2.trim().equals("د")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        if (txt4.trim().equals("54") && txt2.trim().equals("س")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        if (txt4.trim().equals("54") && txt2.trim().equals("ص")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        if (txt4.trim().equals("54") && txt2.trim().equals("ط")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        if (txt4.trim().equals("54") && txt2.trim().equals("ق")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        if (txt4.trim().equals("54") && txt2.trim().equals("ب")) {
            list.add(sh + "یزد" + os + "یزد");
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("ب")) {
            list.add(sh + "اغردکان" + os + "یزد");
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("ج")) {
            list.add(sh + "تفت" + os + "یزد");
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("د")) {
            list.add(sh + "میبد" + os + "یزد");
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("ص")) {
            list.add(sh + "مهریز" + os + "یزد");
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("ط")) {
            list.add(sh + "ابرکوه" + os + "یزد");
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("ل")) {
            list.add(sh + "خاتم" + os + "یزد");
        }
        if (txt4.trim().equals("64") && txt2.trim().equals("م")) {
            list.add(sh + "اشکذر" + os + "یزد");
        }
        if (txt4.trim().equals("79") && txt2.trim().equals("ل")) {
            list.add(sh + "قزوین" + os + "قزوین");
        }
        if (txt4.trim().equals("79") && txt2.trim().equals("م")) {
            list.add(sh + "قزوین" + os + "قزوین");

        }
        if (txt4.trim().equals("79") && txt2.trim().equals("ج")) {
            list.add(sh + "قزوین" + os + "قزوین");

        }
        if (txt4.trim().equals("79") && txt2.trim().equals("د")) {
            list.add(sh + "قزوین" + os + "قزوین");
        }
        if (txt4.trim().equals("79") && txt2.trim().equals("س")) {
            list.add(sh + "قزوین" + os + "قزوین");
        }
        if (txt4.trim().equals("79") && txt2.trim().equals("ص")) {
            list.add(sh + "قزوین" + os + "قزوین");
        }
        if (txt4.trim().equals("79") && txt2.trim().equals("ط")) {
            list.add(sh + "قزوین" + os + "قزوین");
        }
        if (txt4.trim().equals("79") && txt2.trim().equals("ق")) {
            list.add(sh + "قزوین" + os + "قزوین");
        }
        if (txt4.trim().equals("79") && txt2.trim().equals("ب")) {
            list.add(sh + "قزوین" + os + "قزوین");
        }


    }

    private void edt_text(View vi) {
        PopupMenu pop = new PopupMenu(getContext(), vi);
        pop.getMenuInflater().inflate(R.menu.normal_placks_menu, pop.getMenu());
        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item1:
                        btn_word.setText("ب");
                        break;
                    case R.id.item2:
                        btn_word.setText("د");
                        break;
                    case R.id.item3:
                        btn_word.setText("س");
                        break;
                    case R.id.item4:
                        btn_word.setText("ص");
                        break;
                    case R.id.item5:
                        btn_word.setText("ج");
                        break;
                    case R.id.item6:
                        btn_word.setText("ط");
                        break;
                    case R.id.item7:
                        btn_word.setText("ق");
                        break;
                    case R.id.item8:
                        btn_word.setText("ل");
                        break;
                    case R.id.item9:
                        btn_word.setText("م");
                        break;
                    case R.id.item10:
                        btn_word.setText("ن");
                        break;
                    case R.id.item11:
                        btn_word.setText("ه");
                        break;
                    case R.id.item12:
                        btn_word.setText("و");
                        break;
                    case R.id.item13:
                        btn_word.setText("ی");
                }
                return false;
            }
        });
        pop.show();
    }

    public class MyTask extends AsyncTask<ArrayList<String>, Void, ArrayList<String>> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            list = new ArrayList<>();
            list.clear();
        }

        @Override
        protected ArrayList<String> doInBackground(ArrayList<String>... arrayLists) {
            inter();
            return null;
        }


        @Override
        protected void onPostExecute(ArrayList<String> result) {
            if (list.size() == 0) {
                list.add("هیچ شهری پیدا نشد");
            }
            recyclerView.setAdapter(new Adapter_Placks(getContext(), list));
        }

    }

}