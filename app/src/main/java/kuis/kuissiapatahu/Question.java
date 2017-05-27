package kuis.kuissiapatahu;

/**
 * Created by Dhana on 5/9/2017.
 */

public class Question {

    public  String mQuestion[] = {
            "Setiap tanggal 1 Mei diperingati sebagai hari ?",
            "Siapakah champione dari liga spanyol tahun ini ?",
            "Mengapa daun berwarna hijau ?",
            "Gravitasi apakah yang paling berbahaya ?",
            "Benarkah Mandi setelah bergandang itu membahayakan ?",
            "Presiden Ke-empat Indonesia adalah ?",
            "Cara menggoreng tetapi tidak menyebabkan minyaknya hitam dengan diberikan ?",
            "Mengapa harga jual xiaomi sangat rendah dengan spek yang tinggi ?",
            "Planet apakah yang kita tinggali saat ini ?",
            "Hari Patah Hati nasional diperingati sejak ?"

    };

    private String mChoice [][]={
            {"Buruh","Kebangkitan Nasional","Lahir Pancasila","Bubarnya BPUPKI"},
            {"Barcelona","Atletico Madrid","Real Madrid","Real Sociedad"},
            {"Karena mengandung zat pewarna hijau","Sudah Takdirnya","Karena mengandung klorofil","Tidak ada yang benar"},
            {"Gravitasi Bumi","Gravitasi Kasur","Gravitasi Bulan","Gravitasi Asteroid"},
            {"Tidak","Iya","Bisa jadi","Tidak ada yang benar"},
            {"Bj Habibie","Megawati","Gus Dur","Soeharto"},
            {"Laos","Ketumbar","Kunyit","Jahe"},
            {"Tidak ada biaya periklanan","Karna dari china","Tidak ada biaya maintenance","Tidak ada yang benar"},
            {"Pluto","Venus","Bumi","Saturnus"},
            {"Mimi Peri X Suho","Dijah Yellow X EXO","Raisa X Hamish Daud","Elly Sugigi X Brondong"}
    };

    private String mCorrectAnswers[] = {
            "Buruh","Real Madrid", "Karena mengandung klorofil", "Gravitasi Kasur", "Tidak", "Gus Dur", "Kunyit", "Tidak ada biaya periklanan", "Bumi","Raisa X Hamish Daud"
    };

    public  String getQuestion (int a){
        String question = mQuestion[a];
        return  question;
    }

    public  String getChoice1 (int a){
        String choice = mChoice[a][0];
        return choice;
    }
    public  String getChoice2 (int a){
        String choice = mChoice[a][1];
        return choice;
    }
    public  String getChoice3 (int a){
        String choice = mChoice[a][2];
        return choice;
    }
    public  String getChoice4 (int a){
        String choice = mChoice[a][3];
        return choice;
    }
    public String getCorrectAnswer (int a){
        String answer = mCorrectAnswers[a];
        return  answer;
    }
}
