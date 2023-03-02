package PR1.KA4und5.A11_Kaffeemaschine;

public class Rezept {

    String name;

    double wasserM;
    double kaffeeM;
    double kakaoM;
    double zuckerM;
    double milchM;

    public Rezept(String name, double wasserM, double kaffeeM, double kakaoM, double zuckerM, double milchM) {
        this.name = name;
        this.wasserM = wasserM;
        this.kaffeeM = kaffeeM;
        this.kakaoM = kakaoM;
        this.zuckerM = zuckerM;
        this.milchM = milchM;
    }
    public void getInfo(){
        System.out.println(this.name+" "+ this.wasserM +" "+ this.kaffeeM +" "+ this.kakaoM +" "+ this.zuckerM +" "+ this.milchM);
    }

    public void machen(){
        KaffeeMaschine.wasser.entfernen(wasserM);
        KaffeeMaschine.kaffee.entfernen(kaffeeM);
        KaffeeMaschine.kakao.entfernen(kakaoM);
        KaffeeMaschine.zucker.entfernen(zuckerM);
        KaffeeMaschine.milch.entfernen(milchM);

        KaffeeMaschine.abfall.fuell(kaffeeM);
    }
}
