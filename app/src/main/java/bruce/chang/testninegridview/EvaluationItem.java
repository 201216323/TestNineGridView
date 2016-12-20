package bruce.chang.testninegridview;

import java.io.Serializable;
import java.util.List;

/**
 * 评论列表
 */
public class EvaluationItem implements Serializable {
    public String headLogo; // 评论图片列表
    public String userName;
    public int grade;                       // 评分
    public String content;                  // 内容信息
    public String creatTime;                // 评论时间
    public List<String> mPic;

    public EvaluationItem(String headLogo, String userName, int grade, String content, String creatTime, List<String> pic) {
        this.headLogo = headLogo;
        this.userName = userName;
        this.grade = grade;
        this.content = content;
        this.creatTime = creatTime;
        mPic = pic;
    }

    public String getHeadLogo() {
        return headLogo;
    }

    public void setHeadLogo(String headLogo) {
        this.headLogo = headLogo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public List<String> getPic() {
        return mPic;
    }

    public void setPic(List<String> pic) {
        mPic = pic;
    }
}
