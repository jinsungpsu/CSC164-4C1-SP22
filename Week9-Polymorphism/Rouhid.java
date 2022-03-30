public class Rouhid {
    private int num;
    private String word;

    public Rouhid() {

    }

    public Rouhid(Rouhid anotherObj) {
        this.num = anotherObj.num;
    }

    public Rouhid(int num) {
        this.num = num;
    }

    public Rouhid(int num, String word) {
        this.num = num;
        this.word = word;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
