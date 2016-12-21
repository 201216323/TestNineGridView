package bruce.chang.testninegridview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: BruceChang
 * Date on : 2016/12/15.
 * Time on: 18:02
 * Progect_Name:TestNineGridView
 * Source Github：
 * Description:
 */

public class DataUtils {

    public static String[] mStrings = {
            "http://p2.so.qhmsg.com/bdr/_240_/t01ffcdaedde9bcb74c.jpg",
            "http://http://pic1.desk.chinaz.com/file/201201/4/jxipbz8_p.jpg",
            "http://img.article.pchome.net/00/56/35/09/pic_lib/wm/fengjing1.jpg",
            "http://p1.so.qhmsg.com/bdr/_240_/t0189a38410d9b1a6db.jpg",
            "http://p3.so.qhmsg.com/bdr/_240_/t0118233347354d0838.jpg",
            "http://www.1tong.com/uploads/allimg/131217/1-13121G14R70-L.jpg",
            "http://ww1.sinaimg.cn/mw690/b0d9a523jw1fasfnzuyj1j20760760t2.jpg",
            "http://p1.so.qhmsg.com/bdr/_240_/t01ffd622bffeabb5e1.jpg",
            "http://p4.so.qhmsg.com/bdr/_240_/t01956d7d9ed4a92064.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/f778b46711474fe9b312ea9386ab2d2b.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/cb7a48787b71450f8ea941aeef95a5f9.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/6690ce1ec57e47cd98d08c2eb6d1c382.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/60c9a63daf7e4a2ab2f765857fa639a1.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/488bbab516b84af89b60170ef299b4f1.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/bc9bc6cbc59a483397ca05f09cbe26b6.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/972c13f79ea74aa09d7742af3c81d00c.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/e192b9612a5d4f508255c149771f4e10.jpg"
    };

    public static String[] mStringTou = {
            "http://img1.touxiang.cn/uploads/20120428/28-022030_432.jpg",
            "http://img1.touxiang.cn/uploads/20120522/22-090423_51.jpg",
            "http://img1.3lian.com/gif/more/11/201210/39d748262806114587696d5c2226003c.jpg",};

    public static List<EvaluationItem> getData() {
        List<EvaluationItem> itemList = new ArrayList<>();

//        List<String> mPics6 = new ArrayList<>();
//        mPics6.add(mStrings[1]);
//        EvaluationItem one = new EvaluationItem(mStrings[0], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics6);
//        itemList.add(one);
        List<String> mPics0 = new ArrayList<>();
        mPics0.add(mStrings[2]);
        EvaluationItem one0 = new EvaluationItem(mStringTou[1], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics0);
        itemList.add(one0);

        List<String> mPics1 = new ArrayList<>();
        mPics1.add(mStrings[2]);
        mPics1.add(mStrings[3]);
        EvaluationItem one1 = new EvaluationItem(mStringTou[1], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics1);
        itemList.add(one1);

        List<String> mPics2 = new ArrayList<>();
        mPics2.add(mStrings[4]);
        mPics2.add(mStrings[5]);
        mPics2.add(mStrings[6]);
        EvaluationItem one2 = new EvaluationItem(mStringTou[2], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics2);
        itemList.add(one2);

        List<String> mPics3 = new ArrayList<>();
        mPics3.add(mStrings[7]);
        mPics3.add(mStrings[8]);
        mPics3.add(mStrings[9]);
        mPics3.add(mStrings[2]);
        EvaluationItem one3 = new EvaluationItem(mStringTou[0], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics3);
        itemList.add(one3);

        List<String> mPics4 = new ArrayList<>();
        mPics4.add(mStrings[10]);
        mPics4.add(mStrings[11]);
        mPics4.add(mStrings[12]);
        mPics4.add(mStrings[13]);
        mPics4.add(mStrings[2]);
        EvaluationItem one4 = new EvaluationItem(mStringTou[1], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics4);
        itemList.add(one4);

        List<String> mPics5 = new ArrayList<>();
        mPics5.add(mStrings[2]);
        mPics5.add(mStrings[3]);
        mPics5.add(mStrings[9]);
        mPics5.add(mStrings[7]);
        mPics5.add(mStrings[8]);
        mPics5.add(mStrings[0]);
        EvaluationItem one5 = new EvaluationItem(mStringTou[2], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics5);
        itemList.add(one5);

        List<String> mPics6 = new ArrayList<>();
        mPics6.add(mStrings[3]);
        mPics6.add(mStrings[5]);
        mPics6.add(mStrings[7]);
        mPics6.add(mStrings[8]);
        mPics6.add(mStrings[0]);
        mPics6.add(mStrings[10]);
        mPics5.add(mStrings[9]);
        EvaluationItem one6 = new EvaluationItem(mStringTou[2], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics6);
        itemList.add(one6);

        List<String> mPics7 = new ArrayList<>();
        mPics7.add(mStrings[15]);
        mPics7.add(mStrings[12]);
        mPics7.add(mStrings[12]);
        mPics7.add(mStrings[12]);
        mPics7.add(mStrings[11]);
        mPics7.add(mStrings[10]);
        mPics7.add(mStrings[0]);
        mPics6.add(mStrings[3]);
        EvaluationItem one7 = new EvaluationItem(mStringTou[1], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics7);
        itemList.add(one7);


        List<String> mPics8 = new ArrayList<>();
        mPics8.add(mStrings[2]);
        mPics8.add(mStrings[3]);
        mPics8.add(mStrings[9]);
        mPics8.add(mStrings[12]);
        mPics8.add(mStrings[11]);
        mPics8.add(mStrings[10]);
        mPics8.add(mStrings[7]);
        mPics8.add(mStrings[8]);
        mPics8.add(mStrings[9]);
        EvaluationItem one8 = new EvaluationItem(mStringTou[0], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics8);
        itemList.add(one8);

        List<String> mPics9 = new ArrayList<>();
        mPics9.add(mStrings[1]);
        mPics9.add(mStrings[2]);
        mPics9.add(mStrings[3]);
        mPics9.add(mStrings[4]);
        mPics9.add(mStrings[5]);
        mPics9.add(mStrings[6]);
        mPics9.add(mStrings[7]);
        mPics9.add(mStrings[8]);
        mPics9.add(mStrings[9]);
        mPics9.add(mStrings[10]);
        mPics9.add(mStrings[11]);

        EvaluationItem one9 = new EvaluationItem(mStringTou[0], "张无忌", 5, "明教第三十二代教主", "2016-12-16 10:47", mPics9);
        itemList.add(one9);
        return itemList;
    }
}
